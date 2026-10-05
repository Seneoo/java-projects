package Esercizio;
public class Fattura {
	//attributi;
	private final int percIVA=20;
	private Cliente Destinatario;
	public String Descrizione;  
	public int qta;  
	public double PrezzoUnitario;
	//metodo costruttore;
	public Fattura(Cliente dest) {
		Destinatario=dest;
	}
	//metodo 1;
	private double CalcolaImponibile() {
		return qta*PrezzoUnitario;
	}
	//metodo 2;
	private double CalcolaImposta() {
		double imp=CalcolaImponibile();
		return (imp*percIVA)/100;
	}
	//metodo 3;
	public double TotaleFattura() {
		double totale;
		totale=CalcolaImponibile()+CalcolaImposta();
		return totale;
	}
	//metodo 4;
	public void EmettiFattura() {
		double totale=TotaleFattura();
		System.out.println("Totale fattura= " +totale);
		 
		Destinatario.Addebita(totale);    
		Destinatario.StampaSituazione();
	}
}