package jp5;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Oppg4{

	public static void main(String[] args) {
		
		double[] arr = new double[7];
		
		System.out.print("Analyse av temperaturer\n***********************\nSkriv inn temperaturene:\n");
		
		double grade = 0;
		for (int i = 1; i <= arr.length; i++) {
			do {
				grade = Integer.parseInt(showInputDialog("Temperatur: "));
				arr[i-1] = grade;
				System.out.println(i + ". dag: " + grade);
				if ((grade <= -100) || (grade >= 100)) {
					showMessageDialog(null,"Error: bare grader mellom -100 - 100");
				}
			} while ((grade <= -100) || (grade >= 100));
		}

		double sum = 0;
		for (double element : arr) sum += element;
		double gjennomsnitt = sum / arr.length;
		
		Arrays.sort(arr);
		
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(java.math.RoundingMode.CEILING);
	
		System.out.println("Gjennomsnittstemperaturen var " + df.format(gjennomsnitt));
		System.out.println("Maksimum for denne uken var " + arr[arr.length-1] + " grader");
		
	}

}