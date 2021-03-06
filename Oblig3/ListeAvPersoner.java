// 2014.02.06: Gitt nytt navn til metoden settInnIStarten...

public class ListeAvPersoner {
    private Person personliste, sistePerson;
    private int antall;
    
    ListeAvPersoner(){
	// skal etablere datastrukturen for tom liste:
        Person lh = new Person("LISTEHODE!!");
	personliste = lh;
	sistePerson = lh;
	antall = 0;
    }

    /* 
       Invariante tilstandspaastander (skal gjelde for og etter alle metodekall):

       - personliste peker paa listehodet
       - forste person i lista er forste person etter
         listehodet, dvs. personliste.neste
       - sisteperson peker paa siste person i lista, dvs.
       - sisteperson.neste er alltid null
       - ingen andre personobjekter har neste som er null

       - Naar lista er tom skal (tilstanden etableres av konstruktor):
            - antall innholde tallet 0
            - personliste peke paa listehodet
	    - sistePerson peke paa listehodet
	    - personliste.neste vaere null
    */
       
    public boolean LiggerILista(Person p){
	if(finnPerson(p.hentNavn()) == p){
	    return true;
	}
	return false;
    }
    
    /* public Person returnPerson(){
	
	antall2--;
	return p;
	}*/
    
    public void settInnIStarten(Person nypers){
	if(!LiggerILista(nypers)){
	nypers.neste = personliste.neste;
	personliste.neste = nypers;
	if (sistePerson.neste == nypers) // nyperson er ny siste!
	    sistePerson = nypers;
	antall++;
	
	}
    }
    
    public void settInnSist(Person inn){
	if(!LiggerILista(inn)){
	    sistePerson.neste = inn;
	    sistePerson = inn;
	    antall++;
	    
	}
    }

    public void settInnEtter(Person denne, Person nypers) {
	if(!LiggerILista(nypers)){
	    if(denne != nypers){
		nypers.neste = denne.neste;
		denne.neste = nypers;
		if(!LiggerILista(nypers)){
		    if (sistePerson.neste == nypers)  // nyperson er ny siste!
			sistePerson = nypers;
		    antall++;
		    
		}
	    }
	}
    }

    public Person finnPerson(String s) {
	Person p = personliste.neste;
        for (int i = antall; i>0; i--) {
	    if (p.hentNavn().equals(s)) return p;
	    else p = p.neste;
        }
	return null;
    }
    

    public void skrivAlle() { 
        Person p = personliste.neste;
	System.out.println("------");
        for (int i = antall; i>0; i--) {
     	    System.out.print(antall - i +1 + ": ");
            p.skrivUtAltOmMeg();
            p = p.neste;
        }
	System.out.println("=======");
    }
}



