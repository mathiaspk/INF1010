import java.io.*;
//Denne klassen brukes som "losnings-objekter".
public class Solutions{
    protected int[][] solved; //Holder en losning

    //Konstruktor som tar i mot en losning og lagrer den
    Solutions(int[][] array, int size){
        solved = new int[size][size];
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                solved[i][j] = array[i][j];
            }
        }
    }
    //Metode som skriver losningen til skjerm
    public void getSolved(int boardSize){
        for(int i = 0;i<boardSize;i++){
            System.out.println();
            for(int j = 0;j<boardSize;j++){
                System.out.print(Integer.toHexString(solved[i][j]).toUpperCase() + " ");
            }
        }
        System.out.println();

    }
    //Metode som lagrer losningen til fil
    public void saveSolved(int boardSize, String save){
        try{
            PrintWriter f = new PrintWriter(new FileWriter(save, true));
            for(int i = 0;i<boardSize;i++){
                f.write("\n");
                for(int j = 0;j<boardSize;j++){
                    f.print(Integer.toHexString(solved[i][j]).toUpperCase());
                }
            }
            f.write("\n");
            f.close();
        }
          catch(IOException e){
            System.out.println("Could not write to file");
        }
    }
}
