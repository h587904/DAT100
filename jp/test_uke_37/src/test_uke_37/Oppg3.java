package test_uke_37;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg3 {
	
	public static int[] oppdaterArray(int[] gammeltArray, int nyttTall) {
		
        int i; 
       
        //Oppretta eit nytt array med lengda til det gamle + 1
        int nyttArray[] = new int[gammeltArray.length + 1]; 

        //Loopar gjennom alle verdiane i det gamle arrayet og pusha dei inn i det nye arrayet 
        for (i = 0; i < gammeltArray.length; i++) {
        	nyttArray[i] = gammeltArray[i]; 
        }
        	
        //Pusha det nye tallet inn i array
        nyttArray[gammeltArray.length] = nyttTall; 
        
		return nyttArray;
	}

	public static void main(String[] args) {
		
		int[] tall = {};
		int nyttTall;
		int sum = 0;
		
		do {
			nyttTall = Integer.parseInt(showInputDialog("Heltall"));
			if (nyttTall != 0) {
				tall = oppdaterArray(tall, nyttTall);
			}
			
		} while (nyttTall != 0);
		
		for (int i : tall) {
			sum += i;
			
		}
		
		showMessageDialog(null, "Antall tall: " + tall.length + "\nSum: " + sum);
	}

}
