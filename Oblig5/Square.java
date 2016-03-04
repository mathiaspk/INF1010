abstract public class Square{
    protected int value;
    protected Square next;
    protected Column column;
    protected Row row;
    protected Box box;
    protected Board board;
 
    public void fillRemaining(){}
    public void fillRemainingAndSave(){}

    Square(int value){
        this.value = value;
    }
    public void setValue(int v){
        value = v;
    }

    public void setNext(Square s){
        next = s;
    }
    public int getValue(){
        return value;
    }
    public Square getNext(){
        return next;
    }
    public void setColumn(Column c){
        column = c;
    }
    public void setRow(Row r){
        row = r;
    }
    public void setBox(Box b){
        box = b;
    }
    public void setBoard(Board b){
        board = b;
    }
}
