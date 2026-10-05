package Esercizio;
public class Cliente {
	//attributi;
	private String Nome;
	private String PartitaIVA;
	private double Saldo;
	//metodo costruttore;
	public Cliente(String nome, String IVA) {
		Nome=nome;
		PartitaIVA=IVA;
		Saldo=0;
	}
	//metodo 1;
	public void Addebita(double importo) {
		Saldo+=importo;
	}
	//metodo 2;
	public void Paga(double importo) {
		Saldo-=importo;
	}
	//metodo 3;
	public void StampaSituazione()   
	{       
		System.out.println("Cliente     = " +Nome);    
		System.out.println("Partita IVA = " +PartitaIVA);    
		System.out.println("Saldo       = " +Saldo);    
		System.out.println("––––––––––––––––––––");  
	}
	//metodo 4;
	public String getNome() {
		return Nome;
	}
	//metodo 5;
	public void setNome(String nome) {
		Nome=nome;
	}
	//metodo 6;
	public String getPartitaIVA() {
		return PartitaIVA;
	}
	//metodo 7;
	public void setPartitaIVA(String partitaIVA) {
		PartitaIVA=partitaIVA;
	}
}