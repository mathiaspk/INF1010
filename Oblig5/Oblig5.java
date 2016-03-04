public class Oblig5{
    public static void main (String [] args){
        //Sjekker argumentene ved kjoring.
        if(args.length<1){
            System.out.println("Skriv feks: java Oblig5 <filnavn/sti>");
            System.out.println("java Oblig5 <filnavn/sti> <filnavn/sti> \n dersom du onsker aa lagre til fil");
        }else if(args.length==2){
	          ReadFile r = new ReadFile(args[0], args[1]);
        }else{
            ReadFile r = new ReadFile(args[0]);
        }
    }
}
