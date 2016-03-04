//Klassen som holder paa alle losningene for ett brett.

public class SudokuContainer{
    private int counter = 0;
    private int solCount = 0;
    private int[][] solArray;
    private int size;
    //Arrayet som holder paa losninger(max 750)
    private Solutions[] solutions = new Solutions[750];
    //I konstruktoren settes storrelsen paa losningsbrettet
    SudokuContainer(int size){
        this.size = size;
        solArray = new int[size][size];
    }
    //Metode for aa sette inn en losning
    public void insertSolution(Square[][] array, int size){
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                solArray[i][j] = array[i][j].getValue();
            }
            //Sjekker at losningene ikke overskrider 750
        }if(counter<750){
            solutions[counter++] = new Solutions(solArray, size);
        }else{
            counter++;
        }
    }
    //Metode som kaller paa utskrivingsmetode i Solutions
    public void getSolutions(){
        while(solCount <750 & solCount<counter){
            solutions[solCount++].getSolved(size);
        }
    }
    

    public int getSolutionCount(){
        return counter;
    }
    //Metode som brukes av GUIen. Den returnerer en losning slik at den kan tegnes.
    public Solutions getSolution(int i){
        return solutions[i];
    }
    //Metode som kaller paa lagringsmetode i Solutions
    public void saveToFile(String save){
        while(solCount<750 & solCount<counter){
            solutions[solCount++].saveSolved(size, save);
        }
    }
}

