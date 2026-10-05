package Supermercato;
class tesseraoro extends tessera
{
	private String colore;
	public tesseraoro(String nome, String cognome, int codice,int punteggio,String colore)
	{
		super(nome,cognome,codice,punteggio+10);
		this.colore=colore;
	}
	@Override
	public void acquisto(float spesa)
	{
		if(spesa>=100)
		{
			if(spesa==100) setPunteggio(getPunteggio()+(int)(spesa/10));
			else setPunteggio(getPunteggio()+(int)((spesa/10)*2));
		}
		else
		{
			System.out.println("Spesa insufficiente per accumulare punti extra.");
		}
	}
	@Override
	public void mostraDati()
	{
		super.mostraDati();
		System.out.println("Colore: "+colore);
	}
}