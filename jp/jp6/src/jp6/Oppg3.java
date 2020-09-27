package jp6;

import java.util.Arrays;

public class Oppg3 {

	public static void main(String[] args) {
		int [][] matrise = {
				{4,7,3},
				{9,2,6},
				{1,9,4}
		};
		
		int [][] matrise1 = {
				{8,14,6},
				{18,4,12},
				{2,18,8}
		};
		
		int[][] matrise2 = {
				{0, 0, 1, 1, 1, 1, 0, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 1, 0, 0, 0, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0}
		};
		
		
		//skrivUtv1(matrise);	//A
		//System.out.println(tilStreng(matrise));	//B
		//skaler(2,matrise);		//C
		//System.out.println(erLik(matrise, matrise1)); //D
		/*int[][] speiltMatrise = speile(matrise2);		//E
		skrivUtv1(speiltMatrise);*/	
		/*int a[][] = {		//F
				{1,1},
				{2,2}
				};    
		int b[][] = {
				{1,1},
				{2,2},
				};
		int[][] multiplisert = multipliser(a,b);
		skrivUtv1(multiplisert);*/
		

	}
	
	//A
	public static void skrivUtv1(int[][] matrise) {
		for (int[] rad : matrise) {
			String linje = "";
			for (int index : rad) {
				linje += index + ",";
			}
			linje = linje.substring(0, linje.length()-1);
			System.out.println("{" + linje + "}");
		}
	}
	
	//B
	public static String tilStreng(int[][] matrise) {
		
		String linje = "";
		for(int[] rad : matrise) {
			for (int index : rad) {
				linje += index + " ";
			}
			linje += "\n";
		}
		
		return linje;
	}
	
	//C
	public static int[][] skaler(int tall, int[][] matrise){
		int[][] skalertMatrise = matrise;
		for(int rad = 0; rad < skalertMatrise.length; rad++) {
			for(int index = 0; index < skalertMatrise[0].length; index++) {
				skalertMatrise[rad][index] = skalertMatrise[rad][index] * tall;
			}
		}
		return skalertMatrise;
	}
	
	//D
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		int[][] matrise1 = mat1;
		int[][] matrise2 = mat2;
		
		boolean lik = true;
		if(matrise1.length == matrise2.length) {
			if(matrise1[0].length == matrise2[0].length) {
				for(int rad = 0; rad < matrise1.length; rad++) {
					for(int index = 0; index < matrise1[0].length; index++) {
						if (matrise1[rad][index] != matrise2[rad][index]) {
							lik = false;
						}
					}
				}
			} else {
				lik = false;
			}
		} else {
			lik = false;
		}
		return lik;
	}
	
	//E
	public static int[][] speile(int [][] matrise){
		
		int[][] matrise1 = new int[matrise.length][matrise[0].length];
		
		for(int rad = 0; rad < matrise.length; rad++) {
			for(int index = 0; index < matrise[0].length; index++) {
				matrise1[matrise.length - index - 1][rad] = matrise[rad][index];
			}
		}

		return matrise1;
	}
	
	//F
	public static int[][] multipliser(int[][] a, int[][] b){
		int resultat[][] = new int[a.length][b[0].length]; 
  
        if (b.length == a[0].length) { 
            for (int i = 0; i < a.length; i++) { 
                for (int j = 0; j < b[0].length; j++) { 
                    for (int q = 0; q < b.length; q++) 
                        resultat[i][j] += a[i][q] * b[q][j]; 
                } 
            } 
        }
		
		return resultat;
	}

}
