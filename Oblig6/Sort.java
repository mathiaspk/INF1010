public class Sort extends Thread{
    int start;
    int end;
    Monitor monitor;
    String[] allWords;
    String[] array;
    //Tar i mot arrayet som skal sorteres + start og sluttpunkt i arrayet.
    Sort(String[] allWords, int start, int end,  Monitor monitor){
        this.allWords = allWords;
        this.start = start;
        this.end = end;
        this.monitor = monitor;
        array = new String[end-start];
    }
    //Sorteringsmetoden. "Bubblesort".
    public void run(){
        boolean doMore = true;
        String temp;

        for(int i = 0;i<end-start;i++){
            array[i] = allWords[i+start];
        }
        //Invariant som etter hver gjennomgang sjekker om det trengs mer sortering.
        while(doMore){
            doMore = false;
            for(int i = 0; i<end-start-1; i++){
                //Invariant som ved hver iterering sjekker ordet den er paa med neste ord.
                //dersom dette ordet er "mindre" enn neste bytter de plass
                if(array[i].compareTo(array[i+1])>0){
                    temp = array[+i];
                    array[i] = array[+i+1];
                    array[i+1] = temp;
                    doMore = true;
                }
            }
        }
        //Sender sortert array til "mergepool"
        monitor.addArray(array);
    }
}
