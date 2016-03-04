public class FilledSquare extends Square{

    FilledSquare(int value){
        super(value);
    }
    //Dersom den har en neste sender den videre.
    //Hvis ikke lagrer den losningen og avslutter
    public void fillRemaining(){
        if(next != null){
            next.fillRemaining();
        }else{
            board.saveBoard();
        }
    }
}
