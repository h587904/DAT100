package jp5;


import static javax.swing.JOptionPane.showInputDialog;

import easygraphics.*;

public class Oppg3 extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		
		int rader = Integer.parseInt(showInputDialog("Rader: "));
		int bredde = Integer.parseInt(showInputDialog("Bredde: "));
		
		makeWindow("Grafikk", 400, 400);
		
		for(int i = 0; i < rader; i++) {
			
			for(int j = 0; j < bredde; j++) {
				drawRectangle(((i % 2) * 10) + (j*20), (i*10), 20, 10);
			}
			
			drawRectangle(((i+1) % 2) * (bredde*20), ((i*10)), 10, 10);
		}
		
		
	}
}
