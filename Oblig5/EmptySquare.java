public class EmptySquare extends Square{

    EmptySquare(int value){
        super(value);
    }
    //Metode som sjekker alle verdier i seg selv.
    //Dersom en verdi er lovlig settes den fast, og kaller neste.
    //Dersom neste = null lagrer den brettet og avslutter.
    public void fillRemaining(){
        for(int i = 1;i<=box.getLength();i++){
            if(column.allowed(i) && row.allowed(i) && box.allowed(i)){
                value = i;
                if(next != null){
                    next.fillRemaining();
                }else{
                    board.saveBoard();
                }
                value = 0;
            }
        }
    }
}
