package jp5;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import easygraphics.*;

public class Oppg5 extends EasyGraphics{

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		int antall = 0;
				
		do {
			antall = Integer.parseInt(showInputDialog("Antall sirkler: "));
			if((antall < 2) || (antall > 10)) {
				showMessageDialog(null,"Error: bare tall fra 2-10");
			}
		} while((antall < 2) || (antall > 10));
		
		makeWindow("Grafikk",500,500);
		
		int subAntall = 200/antall;
		
		for(int i = 0; i < antall; i++) {
			setColor((i % 2) * 250,(i % 2) * 250, (i % 2) * 250);
			fillCircle(250,250,200 - (i*subAntall));	
		}
		
	}

}
