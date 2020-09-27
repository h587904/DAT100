package jp7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Oppg5 {

	public static void main(String[] args) {
		
		//A
		String test = "The quick brown fox jumped over the lazy dog";
		String[] stringArr = test.split("\\s+");
		System.out.println(Arrays.toString(stringArr));
		
		//B
		char pattern = 'o';
		int antall = 0;
		for(String ord : stringArr) {
			if(ord.indexOf(pattern) != -1) antall++;
		}
		System.out.println("Antall ord som inneholder mønsteret('" + pattern + "'): " + antall);
		
		//C
		for(int i = 0; i < stringArr.length; i++) {
			if(stringArr[i].length() == 1) {
				System.out.println(stringArr[i]);
			} 
			else if(stringArr[i].length() % 2 == 0) {
				System.out.println(stringArr[i].substring(((stringArr[i].length()/2)-1), ((stringArr[i].length()/2)+1)));
			}
			else if(stringArr[i].length() % 2 == 1) {
				System.out.println(stringArr[i].substring((stringArr[i].length()/2) - 1, (stringArr[i].length()/2) + 2));
			}
		}
		
		//D
		System.out.println(baklengs("Baklengs"));
		
		//E
		System.out.println("Første ordet alfabetisk: " + firstAlfabetisk(stringArr));
		
		//F
		System.out.println(lidlCompareTo("ab", "abc"));
		//System.out.println("ab".compareTo("abc"));
	}
	
	public static String baklengs(String ord) {
		String baklengs = "";
		
		for(int i = ord.length() - 1; i >= 0; i--) {
			baklengs += ord.charAt(i);
		}
		
		return baklengs;
	}
	
	public static String firstAlfabetisk(String[] tabell) {
		String[] sortert = new String[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			sortert[i] = tabell[i];
		}

        for (int i = 0;  i < sortert.length - 1;  i++) {
        	for (int j = i + 1;  j < sortert.length;  j++) {
        		if (sortert[i].compareToIgnoreCase(sortert[j]) > 0) {
        			String element = sortert[i];
        			sortert[i] = sortert[j];
        			sortert[j] = element;
        		}
        	}
        }

		return sortert[0];
	}
	
	public static int lidlCompareTo(String dette, String tildette) {
		for (int i = 0; i < dette.length() && i < tildette.length(); i++) {
	        if (dette.charAt(i) != tildette.charAt(i)) { 
	        	return dette.charAt(i) - tildette.charAt(i); 
	        }
		} 
	    
	    if(dette.length() == tildette.length()) {
	    	return 0;
	    } else {
	    	return (dette.length()-tildette.length());
	    } 
	}

}
