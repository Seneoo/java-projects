package PresentazionePersona;
public class Studente extends Persona
{
	protected String matricola;
	protected String corsodilaurea;
	protected float tassa1;
	protected float tassa2;
	public Studente(String nome, String cognome, String residenza, String codicefiscale, String matrice, 
			String corsodilaurea, int annodinascita, float tassa1, float tassa2)
	{
		super(nome,cognome,residenza,codicefiscale,annodinascita); //super è un riferimento alla classe genitore, serve per accedere a costruttori e metodi della sopraclasse
		this.matricola=matrice;
		this.corsodilaurea=corsodilaurea;
		this.tassa1=tassa1;
		this.tassa2=tassa2;
	}
	public void setTassa1(float tassa1)
	{
		this.tassa1=tassa1;
	}
	public void setTassa2(float tassa2)
	{
		this.tassa2=tassa2;
	}
	public float getTassa1()
	{
		return tassa1;
	}
	public float getTassa2()
	{
		return tassa2;
	}
	public float CalcolaTasseStudente()
	{
		float totale=tassa1+tassa2;
		return totale;
	}
	public void SiPresenta()
	{
		super.SiPresenta();
		System.out.println("Sono uno studente di "+corsodilaurea+",il mio numero di matricola "+matricola);
	}
}