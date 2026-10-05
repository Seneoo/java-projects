package Supermercato;
class tessera
{
	private String nome,cognome;
	private int punteggio,codice;
	public tessera(String nome, String cognome, int codice,int punteggio)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.codice=codice;
		this.punteggio=punteggio+10;
	}
	public void acquisto(float spesa)
	{
		punteggio+=(int)(spesa/10);
	}
	public void ritirapremio(int punti)
	{
		if(punti<=punteggio)
		{
			punteggio-=punti;
			System.out.println("Premio ritirato con successo!");
		}
		else
		{
			System.out.println("Punteggio insufficiente per ritirare il premio.");
		}
	}
	public int getPunteggio()
	{
		return punteggio;
	}
	public void setPunteggio(int punteggio)
	{
		this.punteggio=punteggio;
	}
	public void mostraDati()
	{
		System.out.println("Nome: "+nome);
		System.out.println("Cognome: "+cognome);
		System.out.println("Codice: "+codice);
		System.out.println("Punteggio: "+punteggio);
	}
}