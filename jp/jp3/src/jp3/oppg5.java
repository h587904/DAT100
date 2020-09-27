package jp3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppg5 {
	
	
	public static String poengTilKarakter(int poeng) {
		
		String karakter;
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
			karakter = null;
		}

		return karakter;
	}

	public static void main(String[] args) {
		int poeng = 0;
		int i = 0;
		do {
			poeng = Integer.parseInt(showInputDialog("Heltall"));
			if (poeng >= 0 && poeng <= 100) {
				String karakter = poengTilKarakter(poeng);
				showMessageDialog(null, "Karakter: " + karakter);
			} else {
				showMessageDialog(null, "Ugyldig poengsum.");
				i--;
			}
			i++;
			
		} while (i != 10);
		
	}
}
