package test_uke_37;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg1_a {

	public static void main(String[] args) {
		int a = Integer.parseInt(showInputDialog("Heltall"));
		
		if (a < 0) {
			showMessageDialog(null, a + " er mindre enn 0");
		} 
		else if (a == 0){
			showMessageDialog(null, a + " er lik 0");
		}
		else if (a > 0) {
			showMessageDialog(null, a + " er større enn 0");
		}
	}

}
