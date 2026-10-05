package PresentazionePersona;
class Persona
{
	protected String nome;
	protected String cognome;
	protected String residenza;
	protected String codicefiscale;
	public int annodinascita;
	public Persona (String nome, String cognome, String residenza, String codicefiscale, int annodinascita)
	{
		this.nome=nome; //this è un riferimento all'oggetto che stiamo costruendo, serve per distinguere tra variabili locali e variabili di istanza
		this.cognome=cognome;
		this.residenza=residenza;
		this.codicefiscale=codicefiscale;
		this.annodinascita=annodinascita;
	}
	public void Calcoloeta(int anno,int annodinascita)
	{
		int eta=anno-annodinascita;
		System.out.println("La mia età è "+eta);
	}
	public void SiPresenta()
	{
		System.out.println("Mi chiamo "+nome+" "+cognome+", abito a "+residenza);
	}
}