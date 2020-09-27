package test_uke_37;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg1_b {

	public static void main(String[] args) {

		int a = Integer.parseInt(showInputDialog("Heltall"));
		
		if ((a >= 5) && (a <= 8)) {
			showMessageDialog(null, a + " er innenfor intervallet");
		} else {
			showMessageDialog(null, a + " er utenfor intervallet");
		}
	}

}



