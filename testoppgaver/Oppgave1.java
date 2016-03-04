class Oppgave1{
    public static void main(String[] args){


    }
}

class Box<T>{
    private T[] samling = (T []) new Object[5];
    private int antall = 0;
    public void settInn(T t){
	samling[antall] = t;
	antall++;
    }
}


class Bok{
    String author;
    String title;
    int year;

    Bok(String a, String t, int y){
	this.author = a;
	this.title = t;
	this.year = y;
    }
}

Interface 