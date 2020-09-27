package test_uke_37;

import java.util.Arrays;

public class Oppg4 {
	
	public static double finnMinsteTall(double x, double y, double z) {
		double[] tall = {x,y,z};
		Arrays.sort(tall);
		return tall[0];
	}

	public static void main(String[] args) {
		double minsteTall = finnMinsteTall(5.5,5.4,7.6);
		System.out.println(minsteTall);
	}

}





