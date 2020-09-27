package test_uke_37;

import java.util.Arrays;

public class Oppg5 {

	public static double finnSirkelAreal(double radius) {
		double areal = Math.PI * Math.pow(radius, 2);
		return areal;
	}
	
	public static void main(String[] args) {
		double areal = finnSirkelAreal(1.5);
		System.out.println(areal);
	}

}




