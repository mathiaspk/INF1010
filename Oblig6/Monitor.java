import java.io.*;

public class Monitor{
    String[] first;
    int wordCount;
    String outFile;
    long startTime;
    double time;
    //Tar i mot totalt antall ord og utfil
    Monitor(int wordCount, String outFile){
        this.wordCount = wordCount;
        this.outFile = outFile;
        startTime = System.nanoTime();
    }
    //Metode som lagrer et array i en "pool".
    //Neste array som mottas vil saa sendes videre til merging sammen med det som ligger i poolen
    public synchronized void addArray(String[] array){
        if(first == null){
            first = array;
        }else{
            new Merge(first, array, this).start();
            first = null;
        }
        //Sjekker om arrayet som mottas er det ferdig sorterte arrayet
        //Skriver til fil dersom det stemmer.
        if(array.length == wordCount){
            if(array[wordCount-1]==null){
                System.out.println("CRITICAL ERROR: Solved array is missing words");
                return;
            }
            time = (System.nanoTime()-startTime)/(double)1000000;
            System.out.println(timer());
            try{
                PrintWriter p = new PrintWriter(new FileWriter(outFile));
                p.println(array.length);
                for(int i = 0;i<wordCount;i++){
                    p.println(array[i]);
                }
                p.close();
            }catch(IOException e){
                System.out.println("Could not write to file");
            }   
        }
    }
    //Metode for aa skrive ut execution time
    public String timer(){
        if(time>=1000){
            return "" +time/1000 + " sek";
        }else{
            return "" + time + " ms";
        }

    }
}
