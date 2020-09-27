package jp6;

import easygraphics.EasyGraphics;

public class Oppg2 extends EasyGraphics{

	// nesten dekket hvis mindre en fra havoverflaten
		int NESTEN_DEKKET = 1;
		int RADIUS = 20;
		int MARGIN = 50;

		// terreng hogde
		int[][] terreng = { 
				{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
                { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
                { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } 
        };

		public static void main(String[] args) {
			launch(args);
		}

		public void run() {

			makeWindow("FLOODING", 800, 300);

			visualiser();
		}

		public void visualiser() {

			System.out.println("Angi havhøyde i tegnevinduet ...");
			int hav = Integer.parseInt(getText("havhøyde"));

			while (hav >= 0) {

				// TODO - START

				 for(int rad = 0; rad < terreng.length; rad++) {
					 for(int index = 0; index < terreng[0].length; index++) {
						 if(terreng[rad][index] < hav) {
							 setColor(0,0,255); // blå - vann
						 }

						 if(terreng[rad][index] > hav) {
							 if((terreng[rad][index] - hav) > 1) {
								 setColor(222,184,135); // lysebrun - tørt
							 } else {
								 setColor(255,140,0); // oransje - søle
							 }
							 
						 }
						 
						 fillCircle((2*20) + (2*20*index),(2*20) + (2*20*rad), 20);
						 
					 }
				 }

				// TODO - SLUTT

				System.out.println("Angi havhøyde i tegnevinduet ...");
				hav = Integer.parseInt(getText("havhøyde"));
			}
		}

}
