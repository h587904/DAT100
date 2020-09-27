package jp7;

import java.util.Arrays;

public class Oppg6 {

	public static void main(String[] args) {
		
		int[][] test = {
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		
		Oppg6 oppg6 = new Oppg6();
		oppg6.skrivUt(test);
		
	}
	
	public void skrivUt(int[][] tabell) {
		String stringArr = "[";
		
		int j = 0;
		for(int i = 0; i < tabell.length; i++) {
			if(j==0) stringArr += "[";
			stringArr += tabell[i][j];
			if(j==tabell[0].length-1) {
				stringArr += "]";
				if(i != tabell.length-1) {
					stringArr += ", ";
				}
			} else {
				stringArr += ", ";
			}
			if(j < tabell[0].length-1) {
				j++;
				i--;
			} else {
				j = 0;
			}
		}
		
		stringArr += "]";
		
		System.out.println(stringArr);
	}

}
