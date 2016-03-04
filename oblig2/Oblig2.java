/*
 * Oblig 2 INF1010
 * mathiapk
 * Mathias Kallstrom
 * gruppe 9
 */

/*
 * Jeg har valgt aa lose hele oppgaven ved hjelp av en generisk klasse.
 * Jeg har derfor brukt litt andre variabler og metoder enn oppgaven foreslaar.
 * Grunnen til at jeg har gjort dette er for aa utfordre meg selv og laere noe nytt.
 * Jeg har tatt bort alle metoder fra personklassen i Oblig1.
 * Dette gjorde jeg fordi jeg ikke brukte dem og de var kun i veien for lesingen.
 * Jeg har da heller ikke brukt bok og plate array fordi de her blir lagret i arrayet i "boxen"
 *
 * Jeg vil videre paapeke at oppgaven virker lite gjennomtenkt og er veldig uklar 
 * i beskrivelsen av hva som skal gjores.
 * Det virker ikke som om den er testet og det er mange ting som ikke gir mening.
 */

import java.util.*;
import java.io.*;

//main. Kaller paa klassen datastruktur
class Oblig22{
    public static void main(String[] args){
	Datastruktur d = new Datastruktur();
	d.lagObjekter();
    }
}

//Generisk klasse som tar i mot enten bok eller plate objekter
//og lagrer dem i arrayet "samling"
class Box<T>{
    private T [] samling = (T []) new Object[5];
    private int antall = 0;
    
    public T hentObjekt(int i){
	return samling[i];
    }
    
    public void settInn(T denne) {
	samling[antall] = denne;
	antall++;
    }
    public T taUt(){
	antall--;
	return samling[antall];
    }
}

class Datastruktur {
    
    public void lagObjekter(){
	Person[] personer = new Person[7];
	personer[0] = new Person("Mathias", "boker");
	personer[1] = new Person("Stian", "plater");
	personer[2] = new Person("John", "plater");
	personer[3] = new Person("Martine", "begge");
	personer[4] = new Person("Anniken", "begge");
	personer[5] = new Person("Henrik", "begge");
	personer[6] = new Person("Malin", "ingenting");

	personer[3].megetInteressertI("Queen");
	personer[3].megetInteressertI(1946);
	personer[4].megetInteressertI("Silya Nymoen");
	personer[5].megetInteressertI(1900);
	personer[1].megetInteressertI("Bob Dylan");
		
	Bok[] gaveBok = new Bok[20];
	gaveBok[0] = new Bok("Roald Dahl", "Mathilda", 1988);
	gaveBok[1] = new Bok("George Martin", "A Song of Ice and Fire", 1996);
	gaveBok[2] = new Bok("Dan Brown", "Angels & Demons", 2000);
	gaveBok[3] = new Bok("Charles Dickens", "A Tale of Two Cities", 1859);
	gaveBok[4] = new Bok("J.R.R Tolkien", "The Lord Of The Rings", 1954);
	gaveBok[5] = new Bok("J.K Rowling", "Harry Potter and the Deathly Hallows", 2007);
	gaveBok[6] = new Bok("Stieg Larsson", "The Girl With The Dragon Tattoo", 2005);
	gaveBok[7] = new Bok("F. Scott Fitzgerald", "The Great Gatsby", 1925);
	gaveBok[8] = new Bok("Mario Puzo", "The Godfather", 1969);
	gaveBok[9] = new Bok("Thor Heyerdahl", "Kon-Tiki", 1950);
	gaveBok[10] = new Bok("Dan Brown", "The Da-Vinci Code", 2003);
	gaveBok[11] = new Bok("Miscellaneous", "The Bible", 100);
	gaveBok[12] = new Bok("Jane Austen", "Pride and Prejudice", 1813);
	gaveBok[13] = new Bok("Charlotte Bronte", "Jane Eyre", 1847);
	gaveBok[14] = new Bok("Mary Shelley", "Frankenstein", 1818);
	gaveBok[15] = new Bok("J.K Rowling", "Harry potter and the Philosophers Stone", 1998);
	gaveBok[16] = new Bok("Beatrix Potter", "The Tale Of Tom Kitten", 1907);
	gaveBok[17] = new Bok("Joseph Conrad", "The Secret Agent", 1907);
	gaveBok[18] = new Bok("J.R.R Tolkien", "Two Towers", 1955);
	gaveBok[19] = new Bok("J.R.R Tolkien", "Return of the King", 1956);

	Plate[] gavePlate = new Plate[20];
	gavePlate[0] = new Plate("Michael Jackson", "Thriller", 9);
	gavePlate[1] = new Plate("Pink Floyd", "The Dark Side Of The Moon", 10);
	gavePlate[2] = new Plate("Queen", "A Kind Of Magic", 9);
	gavePlate[3] = new Plate("Bob Dylan", "Blonde on Blond", 14);
	gavePlate[4] = new Plate("Eagles", "Hotel California", 9);
	gavePlate[5] = new Plate("The Beatles", "Abbey Road", 17);
	gavePlate[6] = new Plate("Bruce Springsteen", "Born in the USA", 12);
	gavePlate[7] = new Plate("Dire Straits", "Brothers in Arms", 9);
	gavePlate[8] = new Plate("Metallica", "The Black Album", 12);
	gavePlate[9] = new Plate("Silya Nymoen", "Rock With You", 8);
	gavePlate[10] = new Plate("Led Zeppelin", "Led Zeppelin IV", 10);
	gavePlate[11] = new Plate("Bob Dylan", "Best OF", 20);
	gavePlate[12] = new Plate("Queen", "Bohemian Rhapsody", 11);
	gavePlate[13] = new Plate("Bob Dylan", "Awesome Music", 9);
	gavePlate[14] = new Plate("Queen", "Best Of Queen", 19);
	gavePlate[15] = new Plate("Silya Nymoen", "Worst hits", 20);
	gavePlate[16] = new Plate("Queen", "We are the Champions", 12);
	gavePlate[17] = new Plate("Bob Dylan", "Another Album", 14);
	gavePlate[18] = new Plate("Silya Nymoen", "Best of Silya", 1);
	gavePlate[19] = new Plate("Bob Dylan", "Still Not Dead", 10);
	
	System.out.println("");
	System.out.println("PLATER");
	System.out.println("");
	//for-lokkene under er for aa gi gaver til personene.
	for(int i = 0;i<gavePlate.length;i++){
	    andre:
	    for(int j = 0;j<personer.length;j++){
		if(personer[j].vilDuHaGaven(gavePlate[i]) == null){
		    gavePlate[i] = null;
		    break andre;
		}
	    }
	}
	System.out.println("");
	System.out.println("BOKER");
	System.out.println("");
	
	personer[3].vilDuHaGaven(gaveBok[3]);
	for(int k = 0;k<gaveBok.length;k++){
	    andre:
	    for(int l = 0;l<personer.length;l++){
		if(personer[l].vilDuHaGaven(gaveBok[k]) == null){
		    gaveBok[k] = null;
		    break andre;
		}
	    }
	}
    }
}
//Blokk for oppretting av bok-objekter
class Bok {
    private String forfatter;
    private String tittel;
    private int utgivelsesAar;
      
    public String hentForfatter() {
	return forfatter;
    }

    public int hentUtgivelsesAar(){
	return utgivelsesAar;
    }

    public String hentTittel(){
	return tittel;
    }
    Bok(String f, String t, int u){
	this.forfatter = f;
	this.tittel = t;
	this.utgivelsesAar = u;
    }
}
//Blokk for oppretting av plate-objekter
class Plate{
    private String artist;
    private String album;
    private int antSpor;

    public String hentArtist(){
	return artist;
    }

    public String hentAlbum(){
	return album;
    }

    public int hentSpor(){
	return antSpor;
    }
    
    Plate(String artist, String tittel, int antSpor){
	this.artist = artist;
	this.album = tittel;
	this.antSpor = antSpor;
    }
}

class Person{
    private String navn;  
    private String smlp;
    private String interessePlate;
    private int interesseBok;
    //HashMap som holder key(boker eller plater) og objektet.
    private HashMap<String, Box> samleHash = new HashMap<String, Box>();
        
    Person(String navn, String smlp){
	this.navn = navn;
	this.smlp = smlp;
	samlerAv(smlp);
    }

    //Sjekker kriteriene for gavemottak (bok)
    //Jeg fikk ikke tid til aa legge inn en byttefunksjon.
    //Her blir istedet bokene forkastet ved taUt() metoden.
    //Det kan jeg gjore senere ved aa iterere gjennom samlingen
    //og se etter objekter som personen ikke er meget interessert i.
    //Deretter returnere evt objekt som den finner og sette inn 
    //det nye i dets plass.
    public Bok vilDuHaGaven(Bok gaveBok){
	Box b = samleHash.get("boker");
      	if(smlp.equals("boker") || smlp.equals("begge")){
	    if(!harDen(gaveBok)){
		if(b.hentObjekt(2) != null){
		    if(interesseBok>gaveBok.hentUtgivelsesAar()){
			if(b.hentObjekt(4) != null){
			    b.taUt();
			    b.settInn(gaveBok);
			    System.out.print(navn + " er meget interessert og mottar ");
			    System.out.println(gaveBok.hentTittel());
			    return null;
			}else{
			    b.settInn(gaveBok);
			    System.out.print(navn + " er meget interessert og mottar ");
			    System.out.println(gaveBok.hentTittel());
			    return null;
			}
		    }
		}else{
		    b.settInn(gaveBok);
		    System.out.println(navn + " mottok " + gaveBok.hentTittel());
		    return null;
		}
	    }else{
		System.out.println(navn + " har allerede " + gaveBok.hentTittel());
		return gaveBok;
	    }
	}
	System.out.println(navn + " er ikke interessert i " + gaveBok.hentTittel());
	return gaveBok;
    }	    
    //Sjekker kriterier for gavemottak (plate)
    public Plate vilDuHaGaven(Plate gavePlate){
	Box b = samleHash.get("plater");
	if(smlp.equals("plater") || smlp.equals("begge")){
	    if(!harDen(gavePlate)){
		if(b.hentObjekt(2) != null){
		    if(interessePlate == gavePlate.hentArtist()){
			if(b.hentObjekt(4) != null){
			    b.taUt();
			    b.settInn(gavePlate);
			    System.out.print(navn + " er meget interessert og mottar ");
			    System.out.println(gavePlate.hentAlbum());
			    return null;
			}else{
			    b.settInn(gavePlate);
			    System.out.print(navn + " er meget interessert og mottar ");
			    System.out.println(gavePlate.hentAlbum());
			    return null;
			}
		    }
		}else{
		    b.settInn(gavePlate);
		    System.out.println(navn + " mottok " + gavePlate.hentAlbum());
		    return null;
		}
	    }else{
		System.out.println(navn + " har allerede denne plata");
		return gavePlate;
	    }
	    
	}
	System.out.println(navn + " er ikke interessert i " + gavePlate.hentAlbum());
	return gavePlate;
    }
    //Setter opp bibliotek eller platesamling utifra hva personen samler paa
    public void samlerAv(String smlp) {
	if(smlp.equals("boker")){
	    Box<Bok> bibliotek = new Box<Bok>();
	    samleHash.put("boker", bibliotek);	    
	}else if(smlp.equals("plater")){
	    Box<Plate> platesamling = new Box<Plate>();
	    samleHash.put("plater", platesamling);
	}else if(smlp.equals("begge")){
	    Box<Bok> bibliotek = new Box<Bok>();
	    Box<Plate> platesamling = new Box<Plate>();
	    samleHash.put("boker", bibliotek);
	    samleHash.put("plater", platesamling);
	}
    }    
    public boolean harDen(Bok b){
	for(int i = 0;i<5;i++){
	    if(samleHash.get("boker").hentObjekt(i) == b){
		return true;
	    }
	}
	return false;
    }
    public boolean harDen(Plate p){
	for(int i = 0;i<5;i++){
	    if(samleHash.get("plater").hentObjekt(i) == p){
		return true;
	    }
	}
	return false;
    }
    //Metoder som fastslaar hva hver person er spesielt interessert i
    public void megetInteressertI(String a){
	this.interessePlate = a;	
    }
    
    public void megetInteressertI(int e){
	this.interesseBok = e;
    }
}
