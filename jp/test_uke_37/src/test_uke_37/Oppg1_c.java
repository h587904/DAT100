package test_uke_37;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg1_c {

	public static void main(String[] args) {
		int tall = Integer.parseInt(showInputDialog("Heltall"));
		String svar;
		
		switch(tall) {
		case 0:
			svar = "null";
		case 1:
			svar = "en";
		case 2:
			svar = "to";
		case 3:
			svar = "tre";
		case 4:
			svar = "fire";
		default:
			svar = "ulovlig verdi";
		}
		
		showMessageDialog(null, "Tall: " + tall + "\nSvar: " + svar);
	}

}



