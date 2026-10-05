package MotoUsoThis;
class Motocicletta
{
	String Marca,Modello,Proprietario,Targa;
	int AnnoImmatric;
	boolean Stato; //true=accesa false=spenta
	private String Colore; 
	//metodo1
	//meotodo costruttore
	Motocicletta(String Marca,String Modello,int AnnoImmatric,String Proprietario,String Targa)
	{
		this.Marca=Marca;
		this.Modello=Modello;
		this.AnnoImmatric=AnnoImmatric;
		this.Proprietario=Proprietario;
		this.Targa=Targa;
		this.Stato=false;
	}
	//metodo2
	void Avvia()
	{
		if(Stato) System.out.println("NO! Sono già accesa");
		else
		{
			Stato=true;
			System.out.println("Ok,sono in moto.");
		}
	}
	//metodo3
	void Arresta()
	{
		if(!Stato) System.out.println("NO! Sono già spenta");
		else
		{
			Stato=false;
			System.out.println("Ok,sono spenta.");
		}
	}
	//metodo4
	void fornisciDati()
	{
		System.out.println("Sono una "+Marca+" "+Modello+" di colore "+Colore
				+"dell'anno: "+AnnoImmatric+" del Signor:"+Proprietario+" targa:"+Targa+"adesso sono:");
		if(Stato) System.out.println("accesa");
		else System.out.println("spenta");
		
	}
	//meotodo5
	void Inseriscicolore(String Colore)
	{
		this.Colore=Colore;
	}
}