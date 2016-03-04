public class Merge extends Thread{

    String[] a;
    String[] b;
    Monitor monitor;
    //Tar i mot arrayene som skal merges, pluss en peker til monitor.
    Merge(String[] a, String[] b, Monitor monitor){
        this.a = a;
        this.b = b;
        this.monitor = monitor;
    }
    public void run(){
        String[] result = new String[a.length + b.length];
        int i = 0;
        int j = 0;
        int r = 0;
        //Mergemetoden kjorer saa lenge det er noe igjen i arrayene.
        while(i<a.length && j<b.length){
            if(a[i].compareTo(b[j])<0){
                result[r]=a[i];
                i++; r++;
            }else{
                result[r]=b[j];
                r++; j++;
            }//Dersom det kun er noe igjen i det ene arrayet.
            if(i==a.length){
                while(j<b.length){
                    result[r]=b[j];
                    r++; j++;
                }
            }
            if(j==b.length){
                while(i<a.length){
                    result[r]=a[i];
                    r++; i++;
                }
            }
        }//Sender array til "mergepool"
        monitor.addArray(result);
    }
}
