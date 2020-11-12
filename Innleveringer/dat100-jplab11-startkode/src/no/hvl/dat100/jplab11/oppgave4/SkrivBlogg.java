package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String test = samling.toString();

		PrintWriter skriver = null;
		try {
			java.io.File file = new java.io.File(mappe + filnavn);
			skriver = new PrintWriter(file);
			skriver.println(test);
			
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
			return false;
			
		}
		finally {
			if(skriver != null) 
				skriver.close();
		}
		
		return true;
		
	}
}
