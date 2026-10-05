package Esercizio;
import java.io.*;
public class ProgFatturazione {
	public static void main(String args[]) {
		//Originale;
		Cliente computerSpa=new Cliente("Computer SPA", "01122334455");
		Fattura ordine1 = new Fattura(computerSpa);    
		Fattura ordine2 = new Fattura(computerSpa);
		//Registra i dati delle fatture e le addebita;    
		ordine1.Descrizione="Mouse";
		ordine1.qta=28;
		ordine1.PrezzoUnitario=17.5;    
		ordine1.EmettiFattura();
		ordine2.Descrizione = "Monitor";    
		ordine2.qta=7;    
		ordine2.PrezzoUnitario=328.99;    
		ordine2.EmettiFattura();
		//Incassa il pagamento di un bonifico;     
		double bonifico=1000.0;    
		System.out.println("Pagamento= " +bonifico);    
		computerSpa.Paga(bonifico);    
		computerSpa.StampaSituazione();
		//Potenziamento 1;
		Cliente Io=new Cliente("Giuseppe Caldarola", "12345678901");
		Fattura ordineIo=new Fattura(Io);
		//Output;
		ordineIo.Descrizione="Quaderno";
		ordineIo.qta=30;
		ordineIo.PrezzoUnitario=38.5;    
		ordineIo.EmettiFattura();
		//Potenziamento 2;
		Cliente Nuovo=new Cliente(null, null);
		Fattura ordineNew1=new Fattura(Nuovo);
		Fattura ordineNew2=new Fattura(Nuovo);
		Fattura ordineNew3=new Fattura(Nuovo);
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		System.out.println("Inserisci il nome del terzo cliente");
		try {
			Nuovo.setNome(tastiera.readLine());
		}
		catch (Exception e) {
		}
		System.out.println("Inserisci la P.IVA");
		try {
			Nuovo.setPartitaIVA(tastiera.readLine());
		}
		catch (Exception e) {
		}
		//Output;
		ordineNew1.Descrizione="Libro";
		ordineNew1.qta=1;
		ordineNew1.PrezzoUnitario=21;    
		ordineNew1.EmettiFattura();
		ordineNew2.Descrizione="Monopattino";
		ordineNew2.qta=1;
		ordineNew2.PrezzoUnitario=350;    
		ordineNew2.EmettiFattura();
		ordineNew3.Descrizione="Penna";
		ordineNew3.qta=1;
		ordineNew3.PrezzoUnitario=2.99;    
		ordineNew3.EmettiFattura();
	}
}