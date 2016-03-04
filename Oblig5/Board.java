public class Board{
    protected int boardSize;
    protected Square[][] allSquares;
    protected int xCounter = 0;
    protected int yLine = 0;
    protected static int X;
    protected static int Y;
    protected SudokuContainer scon;

    //Konstruktoren tar i mot x og y verdiene for brettet
    Board(int x, int y){
        X = x;
        Y = y;
        boardSize = X * Y;
        allSquares = new Square[boardSize][boardSize];
        scon = new SudokuContainer(boardSize);

    }
    public int getBoardsize(){
        return boardSize;
    }
    public void getSolutions(){
        scon.getSolutions(); 
    }
    public void saveBoard(){
        scon.insertSolution(allSquares, boardSize); 
    }
    public void printSolutionCount(){
        System.out.println();
        System.out.println("Number of solutions: " + scon.getSolutionCount());
    }
    //Metode som setter en "Square" inn i arrayet "allSquares"
    //Den sjekker om den mottar en "filled" eller "empty" Square
    public void insertSquare(int i){
        if(i<1){
            EmptySquare es = new EmptySquare(i);
            allSquares[yLine][xCounter] = es;
            es.setBoard(this);
            
        }else{
            FilledSquare fs = new FilledSquare(i);
            allSquares[yLine][xCounter] = fs;
            fs.setBoard(this);
        }

        if(xCounter < boardSize-1){
            xCounter++;
        }else{
            yLine++;
            xCounter = 0;
        }
    }
    //Setter i gang den rekursive metoden for aa fylle brettet
    public void fillBoard(){
        allSquares[0][0].fillRemaining();
    }
    //Metode for aa skrive ut problemet(ulost brett)
    public void printBoard(){
        for(int i = 0;i<boardSize;i++){
            System.out.println();
            for(int j = 0;j<boardSize;j++){
                    System.out.print(Integer.toHexString(allSquares[i][j].getValue()).toUpperCase() + " ");
            }
        }
        System ;
    }
    //Metode som lager lenkeliste mellom alle Square i allSquares
    public void makeLinkedList(){
        first:
        for(int i = 0;i<boardSize;i++){
            second:
            for(int j= 0;j<boardSize;j++){
                if(j == boardSize-1){
                    if(i == boardSize-1){
                        allSquares[i][j].setNext(null);
                        break first;
                    }else{
                        allSquares[i][j].setNext(allSquares[i+1][0]);
                        break second;
                    }
                }
                allSquares[i][j].setNext(allSquares[i][j+1]);
            }
        }
        
    }
    //Metode som lager alle containers(Box, Column, Row)
    //og legger riktig Square i riktig Container
    public void makeContainers(){
        int counterX = 0;
        int counterY = 0;
        int counterTemp = 0;
        for(int i = 0;i<boardSize;i++){
            Row r = new Row(boardSize);
            Column c = new Column(boardSize); 
            Box box = new Box(boardSize);
            for(int j = 0;j<boardSize;j++){
                r.setSquares(allSquares[i][j]);
                allSquares[i][j].setRow(r);
                c.setSquares(allSquares[j][i]);
                allSquares[j][i].setColumn(c);
                box.setSquares(allSquares[counterY][counterX]);
                allSquares[counterY][counterX].setBox(box);
                counterX++;
                if(counterX==counterTemp+X){
                    counterX=counterTemp;
                    counterY++;
                    if(counterY==boardSize){
                        counterY = 0;
                        counterTemp+= X;
                        counterX = counterTemp;
                    }
                }
            }
        }
    }
}
