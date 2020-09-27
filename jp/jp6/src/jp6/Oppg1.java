package jp6;

public class Oppg1 {

	public static void main(String[] args) {

		boolean[][] aud = { 
			  { false, false, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};

		//System.out.println(ledigePlasserForLoop(aud));
		//System.out.println(prosentOpptatt(aud));
		//System.out.println(skrivLedigPlass(aud, "last"));
		//System.out.println(ledigePlasserEnhancedForLoop(aud, "last"));
		/*
		if(smittevernAuditorium(aud)) {
			System.out.println("Auditoriet følger smitteverns reglene(det er to ledige plasser mellom personer i auditoriet)");
		} else {
			System.out.println("Auditoriet følger IKKE smitteverns reglene.");
		}*/
		
	}
	
	//A
	public static int ledigePlasserForLoop(boolean[][] matrise) {
		int ledigePlasser = 0;

		for(int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				if (matrise[i][j] == false) {
					ledigePlasser++;
				}
			}
		}
		
		return ledigePlasser;
	}
	
	//B
	public static double prosentOpptatt(boolean[][] matrise) {
		int ledigePlasser = ledigePlasserForLoop(matrise);
		int antallPlasser = matrise.length * matrise[0].length;
		int opptattePlasser = antallPlasser - ledigePlasser;
		double prosentOpptatt = (double) opptattePlasser/antallPlasser * 100;

		return prosentOpptatt;
	}
	
	//C
	public static String skrivLedigPlass(boolean[][] matrise, String firstOrLast) {
		
		if (firstOrLast == "first") {
			for(int i = 0; i < matrise.length; i++ ) {
				for(int j = 0; i < matrise[0].length; i++) {
					if (matrise[i][j] == false) {
						matrise[i][j] = true;
						return "Skriver til\nRad: " + i + "\nIndex: " + j;
					}
				}
			}
		}
		
		if (firstOrLast == "last") {
			for(int i = matrise.length-1; i >= 0; i-- ) {
				for(int j = matrise[0].length-1; i >= 0; i--) {
					if (matrise[i][j] == false) {
						matrise[i][j] = true;
						return "Skriver til\nRad: " + i + "\nIndex: " + j;
					}
				}
			}
		}
		
		return "Error: bruk 'firstOrLast' string parameter.";
	}
	
	//D Usikker på om eg tolka oppgåveteksten riktig. 
	public static int ledigePlasserEnhancedForLoop(boolean[][] matrise) {
		int ledigePlasser = 0;
		
		for(boolean[] rader : matrise) {
			for(boolean antall : rader) {
				if (antall == false) {
					ledigePlasser++;
				}
			}
		}
		
		return ledigePlasser;
	}
	
	//E
	public static boolean smittevernAuditorium(boolean[][] matrise) {

		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[0].length; j++) {
				if(matrise[i][j] == true) {
					if((j-2 >= 0) && (j-2 < matrise[0].length)) {
						if(matrise[i][j-2] == true) {
							return false;
						}
					} 
					if ((j+2 >= 0) && (j+2 < matrise[0].length)) {
						if(matrise[i][j+2] == true) {
							return false;
						}
					}
				}
			}
		}
		
		
		return true;
	}
}
