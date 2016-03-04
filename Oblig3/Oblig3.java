/*
 * Oblig 3 INF1010
 * mathiapk
 * Mathias Kallstrom
 * gruppe 9
 */

import java.util.*;
import java.io.*;

//main. Kaller paa klassen datastruktur
class Oblig3{
    public static void main(String[] args){
	Testklasse t = new Testklasse();
	t.Test();

    }
}
//Kaller paa nodvendige klasser.
class Testklasse{
    public void Test(){
	ListeAvPersoner l = new ListeAvPersoner();
	Personer p = new Personer();
	GaveLager gavelager = new GaveLager();

	//Lager lenkeliste av personer.
	l.settInnIStarten(p.hentPerson());
	for(int i = 0;i<p.hentPersonnavn().length-1;i++){
	    l.settInnSist(p.hentPerson());
	}
	Gave nyGave;
	int utdelteGaver = 0;
	int returnert = 0;
	int teller = 0;
	Person person;

	//Deler ut gavene. 
	//Dersom gaven blir returnert blir den gitt til "neste"
	forste:
	for(int i = 0;i<600;i++){
	    person = l.finnPerson(p.hentPersonnavn()[0]);
	    nyGave = gavelager.hentGave();
	    andre:
	    for(int j = 0;j<p.hentPersonnavn().length;j++){
		if(person.vilDuHaGaven(nyGave) != null){
		    person = person.hentNeste();
		    if(person == null){
			returnert++;
			break andre;
		    }
		}else{
		    utdelteGaver++;
		    break andre;
		}
	    }
	}
	l.skrivAlle();
	System.out.println("Antall gaver returnert: " + returnert);
	System.out.println("Antall gaver utdelt: " + utdelteGaver);
    }	    
}
//Klassen som oppretter relasjoner og gavesamling.
class Person{
    private String navn;  
    private String smlp;
    private Person[] kjenner = new Person[100];
    private Person[] likerikke = new Person[10];
    private Person forelsketi;
    private Person sammenmed;
    public Gave[] mineGaver;
    public Person neste;
    private int antGaver = 0;
            
    Person(String navn){
	this.navn = navn;
	
    }
    
    public Person hentNeste(){
	return neste;
    }

    public String hentNavn(){
	return navn;
    }

    public boolean erKjentMed(Person p){
	for(int i = 0;i<p.kjenner.length;i++){
	    if(kjenner[i] == p){
		return true;
	    }
	}return false;
    }

    public void blirKjentMed(Person p){
	if(navn.equals(p.navn)){
	    System.out.println("Kan ikke bli kjent med seg selv");
	}else if(erKjentMed(p)){
	    System.out.println("Kjenner allerede denne personen");
	}else{
	    for(int i = 0;i<kjenner.length;i++){
		if(kjenner[i] == null){
		    kjenner[i] = p;
		    break;
		}
	    }
	}
    }

    public void blirForelsketI(Person p) {
	boolean misliker = false;
        if(this != p){
	    for(int i = 0;i<likerikke.length;i++){
		if(likerikke[i] == p){
		    misliker = true;
		}
	    }
	    if(!misliker){
		forelsketi = p;
	    }
        } else {
            System.out.println("Kan ikke vaere forelsket i seg selv");
        }
    }

    public void blirSammenMed(Person p){
	if(navn.equals(p.navn)){
	    System.out.println("Kan ikke bli sammen med seg selv");
	}else{
	    sammenmed = p;
	    p.sammenmed = this;
	}
    }

    public void blirUvennMed(Person p){
	boolean finnes = true;
	if(navn.equals(p.navn)){
	    System.out.println("Kan ikke bli uvenn med seg selv");
	}else{
	    for(int i = 0;i<likerikke.length;i++){
		if(likerikke[i] == p){
		    System.out.println("Er allerede uvenn med denne personen");
		    break;
		}else{
		    finnes = false;
		}
	    }
	}if(!finnes){
	    for(int i = 0;i<likerikke.length;i++){
		if(likerikke[i] == null){
		    likerikke[i] = p;
		    break;
		}
	    }
	}
    }

    public boolean erVennMed(Person p){
	boolean venn = false;
	for(int i = 0;i<p.kjenner.length;i++){
	    if(kjenner[i] == p){
		venn = true;
	    }
	    for(int j = 0;j<likerikke.length;j++){
		if(likerikke[j] == p){
		    venn = false;
		}
	    }
	}
	return venn;
    }
    
    public void blirVennMed(Person p){
	if(!erVennMed(p)){
	    for(int i = 0;i<likerikke.length;i++){
		if(likerikke[i] == p){
		    likerikke[i] = null;
		}
	    }
	}
    }

    public void skrivUtVenner(){
	System.out.println(hentVenner());
    }
    
    public String hentBestevenner(){
	return kjenner[0].navn;
    }

    public String hentVenner(){
	String venner = "";
	for(int i = 0;i<kjenner.length;i++){
	    if(erVennMed(kjenner[i])){
		venner += kjenner[i].navn + "";
	    }
	}
	return venner;
    }
    
    public int antVenner(){
	int antall = 0;
	for(int i = 0;i<kjenner.length;i++){
	    if(erVennMed(kjenner[i])){
		antall++;
	    }
	}
	return antall;
    }

    public Gave hentGaver(int i){
	return mineGaver[i];
    }

    public void skrivUtKjenninger(){
	for(Person p: kjenner){
	    if(p!=null){
		System.out.println(p.hentNavn() + " ");
	    }
	}
    }

    public void skrivUtLikerIkke(){
	for(Person p: likerikke){
	    if(p!=null){
		System.out.println(p.hentNavn() + " ");
	    }
	}
    }
    //Skriver ut personens kjaereste, evt hvem den er forelsket i.
    //Deretter skrives gavene ut.
    public void skrivUtAltOmMeg(){
	if(sammenmed!=null){
	    System.out.print(navn + " er sammen med: ");
	    System.out.println(sammenmed.navn);
	}else{
	    System.out.print(navn + " er singel, ");
	    if(forelsketi != null){
		System.out.println("men er forelsket i " + forelsketi.navn + ("."));
	    }else{
		System.out.println("og er heller ikke forelsket i noen.");
	    }
	}
	if(mineGaver[0] != null){
	    System.out.println(navn + " sine gaver: ");
	    for(int i = 0;i<mineGaver.length;i++){
		if(mineGaver[i] != null){
		    System.out.println(mineGaver[i].gaveId());
		}
	    }
	}else{
	    System.out.println(navn + " har ingen gaver.");
	}
	System.out.println("--------------");
    }
    //Sjekker om personen vil ha gaven.
    //Dersom ikke, gaven blir forsokt gitt til kjaereste, forelskelse, venner.
    Gave vilDuHaGaven(Gave nyGave){
	if(smlp.equals(nyGave.kategori())){
	    if(antGaver<mineGaver.length){
		mineGaver[antGaver] = nyGave;
		antGaver++;
		return null;
	    }
	}else if(sammenmed != null){
	    if(sammenmed.smlp.equals(nyGave.kategori())){
		if(sammenmed.antGaver<sammenmed.mineGaver.length){
		    sammenmed.mineGaver[sammenmed.antGaver] = nyGave;
		    sammenmed.antGaver++;
		    return null;
		}
	    }
	}else if(forelsketi != null){
	    if(forelsketi.smlp.equals(nyGave.kategori())){
		if(forelsketi.antGaver<forelsketi.mineGaver.length){
		    forelsketi.mineGaver[forelsketi.antGaver] = nyGave;
		    forelsketi.antGaver++;
		    return null;
		}
	    }
	}else{
	    for(int i = 0;i<kjenner.length;i++){
		if(kjenner[i] != null){
		    if(erVennMed(kjenner[i])){
			if(kjenner[i].smlp.equals(nyGave.kategori())){
			    if(kjenner[i].antGaver<kjenner[i].mineGaver.length){
				kjenner[i].mineGaver[kjenner[i].antGaver] = nyGave;
				kjenner[i].antGaver++;
				return null;
			    }
			}
		    }
		}
	    }
	}
	return nyGave;
    }
    //Lager gavesamling og tar i mot hva personen samler paa + lengde paa samlingen
    public void samlerAv(String smlp, int lengde) {
	mineGaver = new Gave[lengde];
	this.smlp = smlp;
    }    
}
