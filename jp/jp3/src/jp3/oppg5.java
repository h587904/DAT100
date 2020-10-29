package jp3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg5 {

	public static void main(String[] args) {

		int poeng = -1;

		for(int i = 0; i < 10; i++) {
			do {
				String poengString = showInputDialog("Poeng:");
				if(!poengString.isEmpty()) {
					poeng = Integer.parseInt(poengString);
					String karakter = karakter(poeng);
					System.out.println(karakter);
				}
				
				if (poeng < 0 || poeng > 100 || poengString == "") {
					showMessageDialog(null,"Ugyldig poengsum");
					System.out.println("Ugyldig poengsum");
				}
	
			} while(poeng < 0 || poeng > 100);
		}
		
	}
	
	private static String karakter(int poeng) {
		String karakter = "";
		
		if ((poeng >= 0) && (poeng <= 39)) {
			karakter = "F";
		}
		else if ((poeng >= 40) && (poeng <= 49)) {
			karakter = "E";
		}
		else if ((poeng >= 50) && (poeng <= 59)) {
			karakter = "D";
		}
		else if ((poeng >= 60) && (poeng <= 79)) {
			karakter = "C";
		}
		else if ((poeng >= 80) && (poeng <= 89)) {
			karakter = "B";
		}
		else if ((poeng >= 90) && (poeng <= 100)) {
			karakter = "A";
		}
		else {
			karakter = "Ugyldig poengsum";
		}
		return karakter;
	}

}
