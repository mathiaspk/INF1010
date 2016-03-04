import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

//Mainmetoden til GUI
//Jeg valgte aa bruke MVC
public class Sudoku extends JFrame{
  
    public static void main(String[] args){
        Model model = new Model();
        View view = new View(model);
        Controller cont = new Controller(model, view);

        view.setVisible(true);
    }
}
//View klassen inneholder alt vi ser i GUIen
class View extends JFrame{
    String path;
    Model model;
    JFileChooser fileChooser;
    JLabel values[];
    int tmp;
    int i = 0;
    int currentSol;
    Container sudokuPanel = new JPanel();
    JPanel buttonPanel;
    JPanel textPanel;
    JPanel solutionPanel;
    JButton next;
    JLabel totalcount;
    JLabel currentcount;
    //I konstruktoren opprettes alle objekter av tekst, knapper, panel osv.
    //Aller forst kjores JileChooser slik at brukeren kan velge fil.
    View(Model m){
        model = m;
        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", "txt");
        fileChooser.setFileFilter(filter);

        int returnVal = fileChooser.showOpenDialog(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if(returnVal == JFileChooser.APPROVE_OPTION){
            path = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(path);
            fileChooser.getSelectedFile();
            model.parsePath(path);
            buildFirstBoard();
            JPanel mainPanel = new JPanel();
            textPanel = new JPanel();
            solutionPanel = new JPanel();
            next = new JButton("Next solution");
            GridLayout grid = new GridLayout(model.boardsize, 0, -1, -1);
            sudokuPanel.setLayout(grid);
        
            totalcount = new JLabel("Total solutions: " + model.board.scon.getSolutionCount());
            currentcount = new JLabel("Current solution: " + currentSol);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Sudokubrett: " + fileChooser.getSelectedFile().getName());
            this.setContentPane(mainPanel);
            mainPanel.add(totalcount);
            mainPanel.add(currentcount);
            mainPanel.add(sudokuPanel);
            mainPanel.add(next);
        

            this.pack();
        }else{
            System.out.println("null");
        }
    }
    //Metode som tegner ulost brett, fra filen som ble aapnet, til GUIen
    public void buildFirstBoard(){
        int x = 0;
        int y = 0;
        values = new JLabel[model.boardsize*model.boardsize];

        for(JLabel l: values){
            tmp = model.board.allSquares[y][x++].getValue();
            l = new JLabel("   " + Integer.toHexString(tmp) + "  ");
            Dimension d = l.getPreferredSize();
            l.setPreferredSize(new Dimension(d.width+27, d.height+23));
            if(tmp != 0){
                l.setForeground(Color.red);
            }
            l.setBorder(BorderFactory.createLineBorder(Color.black));
            l.setBackground(Color.lightGray);
            l.setOpaque(true);
            l.setFont(l.getFont().deriveFont(22.0f));
            if(x==model.boardsize){
                x = 0;
                y++;
            }
            values[i++] = l;
            sudokuPanel.add(l);
        }
    }
    //Her oppdateres tegningen av brettet ettersom man trykker paa "next solution"
    public void buildSolution(Solutions s){
        int x = 0;
        int y = 0;
        for(JLabel l: values){
            tmp = s.solved[y][x++];
            l.setText("   " + Integer.toHexString(tmp)+ "  ");
            if(x==model.boardsize){
                x = 0;
                y++;
            }
        }
    }
    //Metode for aa oppdatere "current solution"
    //slik at brukeren kan se hvilken losning som vises
    public void updateCurSol(int i){
        currentcount.setText("Current solution: " + i);
    }
    
    public void addListener(ActionListener nal){
        next.addActionListener(nal);
    }
}
//Klasse som opererer med interaksjonen mellom GUI og bruker.
class Controller{
    Model model;
    View view;
    int i;

    Controller(Model m, View v){
        model = m;
        view = v;
        view.addListener(new NextActionListener());
    }
    //En ActionListener som folger med paa om knappen blir trykket.
    //Dersom den blir trykket oppdateres current solution, og tegningen av brettet.
    class NextActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            i++;
            if(i<model.scon.getSolutionCount()){
                view.buildSolution(model.scon.getSolution(i));
                view.updateCurSol(i+1);
            }else{
                i = 0;
                view.updateCurSol(i+1);
                view.buildSolution(model.scon.getSolution(i));
            }
        }
    }
}
//Klasse som opererer med selve programfilene.
class Model{
    ReadFile rf;
    Board board;
    SudokuContainer scon;
    int boardsize;
    //Henter inn nodvendig info fra innlesing av filen, og klassen Board.
    public void parsePath(String path){
        rf = new ReadFile(path);
        board = rf.getBoard();
        scon = board.scon;
        boardsize = board.getBoardsize();
    }
    //Metode som henter ut det uloste brettet og sender det til tegning.
    public Square[][] getEmptyBoard(){
        return board.allSquares;
    }
}
