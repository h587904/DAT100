package jp3;

public class oppg5 {

	public static void main(String[] args) {
		String karakter;
		int poeng = 0;
		
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
		
		System.out.println(karakter);
	}

}
