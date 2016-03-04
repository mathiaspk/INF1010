import java.util.*;
import java.io.*;

class FileParser{
    int wordCount;
    int threadCount;
    int i;
    String inFile;
    String outFile;
    String[] words;
    Monitor monitor;
    //Tar i mot argumenter fra main
    FileParser(String threadcnt, String in, String out){
        this.threadCount = Integer.parseInt(threadcnt);
        this.inFile = in;
        this.outFile = out;
    }
    //Leser fil og putter alle ordene inn i et array
    public void read(){
        try{
            Scanner read = new Scanner(new File(inFile));
            wordCount = read.nextInt();
            words = new String[wordCount];
            System.out.println("wordcount: " + wordCount);
            read.nextLine();
            while(read.hasNextLine()){
                //Sjekker antall ord mot angitt antall
                if(i==wordCount){
                    System.out.println("Number of words in file is greater than wordCount");
                    return;
                }
                if(i<wordCount){
                    words[i] = read.nextLine();
                    i++;
                }else{
                    break;
                }
            }
            read.close();
            //Sjekker antall ord mot angitt antall
            if(words[wordCount-1]==null){
                System.out.println("Number of words in file is less than wordCount");
                return;
            }
            //Oppretter monitor og hopper til "initiateThreads"
            monitor = new Monitor(wordCount, outFile);
            initiateThreads();
        }catch(IOException e){
            System.out.println("Could not read file");
        }
    }
    //Her opprettes traadene. 
    //De tildeles hver sin del av arrayet og sorterer individuelt
    public void initiateThreads(){
        int subWords = wordCount/threadCount;
        int current = 0;
        int end = 0;
        for(int i = 0;i<threadCount;i++){
            end += subWords;
            //Siste traaden faar gjenstaaende ord.
            if(i == threadCount-1){
                new Sort(words, current, wordCount, monitor).start();
                break;
            }
            new Sort(words, current, end, monitor).start();
            current += subWords;
        }
    }
}
