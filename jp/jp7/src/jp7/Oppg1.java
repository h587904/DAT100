package jp7;

/*	Oppgåve 1:

Lag en ny klasse "Kvadrat" som har kun en heltallig objektvariabel 
sidelengde, en konstruktør og metoder for å beregne både arealet 
og omkretsen av kvadratet, samt lengden av diagonadlen. 
Kvadrat-objekt skal kunne tegne seg ut i konsollvinduet ved 
sidelengde både som (antall) linjer og kolonner. Bruk stjerner 
som tegnesymbol, se de tre figurene der hhv. sidelengde = 3, 
sidelengde = 4 og sidelengde = 5. 

* * *	* * * *	  * * * * *
* * *	* * * *	  * * * * *
* * * 	* * * *	  * * * * *
		* * * *	  * * * * *
				  * * * * *

Skriv et testprogram som kan håndtere tre slike Kvadrat-objekt 
kv3, kv4, kv5, dvs- opprette dem, tegne dem og vise informasjon 
om både areal, omkrets og diagonal. Utvid klassen med en 
objektmetode som avgjør om et kvadrat kan skrives som en 
"sum" av to andre Kvadrat-objekt(parameter). Se på de tre 
kvadratene i figuren: Det siste har 25 stjerner, lik summen 
av de 9 første og 16 midterste stjernene. 
Metodekallet kv5.sum(kv3, kv5) skal altså returnere true.
*/

public class Oppg1 {

	public static void main(String[] args) {
		Kvadrat kv3 = new Kvadrat(3);
		Kvadrat kv4 = new Kvadrat(4);
		Kvadrat kv5 = new Kvadrat(5);
		kv3.tegnOgInfo();
		kv4.tegnOgInfo();
		kv5.tegnOgInfo();
		System.out.println("Sum? : " + kv5.sum(kv3, kv4));
	}

}


class Kvadrat {
	
	int sidelengde;
	
	public Kvadrat(int sidelengde){
		this.sidelengde = sidelengde;
	}
	
	public int hentAreal() {
		int areal = sidelengde * sidelengde;
		return areal;
	}
	
	public int hentOmkrets() {
		int omkrets = sidelengde * 4;
		return omkrets;
	}

	public int hentLengdeDiagonal() {
		return sidelengde;
	}
	
	public int tegn() {
		String kvadrat = "";
		for(int i = 0; i < sidelengde; i++) {
			for(int j = 0; j < sidelengde; j++) {
				kvadrat += " * ";
			}
			kvadrat += "\n";
		}
		
		System.out.println(kvadrat);
		
		return 0;
	}
	
	public int tegnOgInfo() {
		System.out.println("Areal: " + hentAreal());
		System.out.println("Omkrets: " + hentOmkrets());
		System.out.println("Diagonal lengde: " + hentLengdeDiagonal());
		tegn();
		System.out.println();
		
		return 0;
	}
	
	public boolean sum(Kvadrat kv1, Kvadrat kv2) {
		boolean isSum = false;
		
		if(kv1.hentAreal() + kv2.hentAreal() == hentAreal()) {
			isSum = true;
		}
		
		return isSum;
	}
	
	public static void main(String[] args) {
		Kvadrat kv3 = new Kvadrat(3);
		Kvadrat kv4 = new Kvadrat(4);
		Kvadrat kv5 = new Kvadrat(5);
		kv3.tegnOgInfo();
		kv4.tegnOgInfo();
		kv5.tegnOgInfo();
		System.out.println("Sum? : " + kv5.sum(kv3, kv4));
	}

}
