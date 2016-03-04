import java.io.*;
import java.util.*;

public class ReadFile{
    int x;
    int y;
    char[] line;
    Scanner r;
    Board b;
    Square temp = null;

    //To ulike konstruktorer; en for skriving til fil, den andre til skjerm
    ReadFile(String s){
        read(s);
        b.makeLinkedList();
        b.makeContainers();
        b.fillBoard();
        b.getSolutions();
        b.printSolutionCount();
    }
    ReadFile(String read, String save){
        read(read);
        b.makeLinkedList();
        b.makeContainers();
        b.fillBoard();
        b.scon.saveToFile(save);
    }

    //metode som leser fil og kutter den opp i charArray.
    //Deretter blir hver char sent til "insertsquare" i Board
    public void read(String f){
	      try{
	          r = new Scanner(new File(f));
	          y = r.nextInt();
	          x = r.nextInt();
            r.nextLine();
            b = new Board(x, y);
	          while(r.hasNextLine()){
		            line = r.nextLine().toCharArray();
		            for(int i = 0;i<line.length;i++){
                    if(line[i] == '.'){
                        b.insertSquare(0);
                    }else{
                        b.insertSquare(Character.getNumericValue(line[i]));
                    }
		            }
	          }
	      }
	      catch(IOException e){
	          System.out.println("Kunne ikke lese fil");
	      }
    }
    public Board getBoard(){
        return b;
    }
}
