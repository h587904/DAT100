package jp5;

import static javax.swing.JOptionPane.*;

public class Oppg2 {

	public static void main(String[] args) {
		int bredde = lesInnTall("Bredde: ");

		int hoyde = lesInnTall("Høyde: ");

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}
	

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	
	private static int lesInnTall(String message) {
		int heltall = 0;
		
		do {
			heltall = Integer.parseInt(showInputDialog(message));
			if(heltall <= 0) {
				showMessageDialog(null,"Error: bare positive nummer.");
			}
		} while (heltall <= 0);
		
		return heltall;
	}

}
