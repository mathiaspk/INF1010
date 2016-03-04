class Oblig6{
    public static void main(String[] args){
        if(args.length==3){
            FileParser f = new FileParser(args[0], args[1], args[2]);
            f.read();
        }else{
            System.out.println("Example: java Oblig6 <number of threads> <inFile/path> <OutFile/path>");
        }
    }
}
