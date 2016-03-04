//Superklasse for Box, Row og Column
public class SuperClass{
    protected Square[] squares;
    protected int counter = 0;
    SuperClass(int length){
        squares = new Square[length];
    }
    //Setter en square inn i containeren
    public void setSquares(Square s){
        squares[counter++] = s;
    }
    public int getLength(){
        return squares.length;
    }
    //Sjekker om verdien allerede ligger i containeren
    public boolean allowed(int value){
        for(int i = 0;i<squares.length;i++){
            if(squares[i].getValue() == value){
                return false;
            }
        }
        return true; 
    }
}
