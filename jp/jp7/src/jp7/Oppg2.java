package jp7;


/* Oppgåve 2:

Lag en klasse 'Konto' med objektvariabler 'kontonummer' og 'saldo'.
Klassen skal ha konstruktør for initiering av objektvariablene, 
samt metoder for å avlese saldo, og for å sette inn og ta ut 
penger fra kontoen.

La et testprogram opprette tre Konto-objekt, prøve ut 
objektmetodene og skrive ut samlet saldo for kontoene.

*/
public class Oppg2 {

	public static void main(String[] args) {
		Konto konto1 = new Konto("1231412512", 300);
		Konto konto2 = new Konto("1751877125", 600);
		Konto konto3 = new Konto("2821891984", 500);
		
		konto1.settInnPenger(120);
		konto2.taUtPenger(200);
		konto3.taUtPenger(100);
		System.out.println("Saldo Konto 1: " + konto1.hentSaldo());
		System.out.println("Saldo Konto 2: " + konto2.hentSaldo());
		System.out.println("Saldo Konto 3: " + konto3.hentSaldo());
		
		double samletSaldo = konto1.hentSaldo() + konto2.hentSaldo() + konto3.hentSaldo();
		
		System.out.println("Samlet saldo: " + samletSaldo);
		
	}

}

class Konto{
	String kontonummer;
	double saldo;
	
	public Konto(String kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}
	
	public double hentSaldo() {
		return saldo;
	}
	
	public double settInnPenger(double penger) {
		saldo += penger;
		return saldo;
	}
	
	public double taUtPenger(double penger) {
		saldo -= penger;
		return saldo;
	}
}