package Supermercato;
class tesseraplatino extends tesseraoro
{
	private int eta;
	public tesseraplatino(String nome, String cognome, int codice,int punteggio,String colore,int eta)
	{
		super(nome,cognome,codice,punteggio,colore);
		this.eta=eta;
	}
	@Override
	public void acquisto(float spesa)
	{
		if(spesa>=200)
		{
			if(spesa==200) setPunteggio(getPunteggio()+(int)((spesa/10)*2));
			else setPunteggio(getPunteggio()+(int)((spesa/10)*3));
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
		System.out.println("Età: "+eta);
	}
}