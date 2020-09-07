package jp3;

import static javax.swing.JOptionPane.*;

public class oppg6 {

	public static void main(String[] args) {

		int n = Integer.parseInt(showInputDialog("Heltall"));
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		
		showMessageDialog(null, sum);
	}

}
