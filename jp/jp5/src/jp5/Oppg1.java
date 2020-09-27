package jp5;

import java.text.DecimalFormat;

public class Oppg1 {

	public static void main(String[] args) {
		double arr[][] = {
				{0,0,0,0},
				{15,0,0,0},
				{30,0,0,0},
				{45,0,0,0},
				{60,0,0,0},
				{75,0,0,0},
				{90,0,0,0},
				{105,0,0,0},
				{120,0,0,0},
				{135,0,0,0},
				{150,0,0,0},
				{165,0,0,0},
				{180,0,0,0},	
		};
		
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(java.math.RoundingMode.CEILING);
		
		System.out.println("x i grader" + "    " + "x i radianer" + "    " + "sin(x)" + "    " + "cos(x)");
		System.out.println("______________________________________________");
		
		for (double[] rad : arr) {
			rad[1] = (Math.PI * rad[0]) / 180;
			rad[2] = Math.sin(rad[1]);
			rad[3] = Math.cos(rad[1]);
			
			System.out.format("%10s%16s%10s%10s\n", df.format(rad[0]), df.format(rad[1]), df.format(rad[2]), df.format(rad[3]));
			
		}

		System.out.println("______________________________________________");
	}

}
