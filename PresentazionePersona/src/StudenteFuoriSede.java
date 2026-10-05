package PresentazionePersona;
public class StudenteFuoriSede extends Studente
{
	protected String residenzauniversitaria;
	protected float tassacollegio;
	public StudenteFuoriSede(String nome, String cognome, String residenza, String codice,String matrice, String corso, 
			String residenzauniversitaria,int annodinascita, float tassa1, float tassa2, float tassacollegio)
	{
		super(nome,cognome,residenza,codice,matrice,corso,annodinascita,tassa1,tassa2);//super è un riferimento alla classe genitore, serve per accedere a costruttori e metodi della sopraclasse
		this.residenzauniversitaria=residenzauniversitaria;
		this.tassacollegio=tassacollegio;
	}
	float getTasseTot()
	{
		float totale=CalcolaTasseStudente()+tassacollegio;
		return totale;
	}
	public void SiPresenta()
	{
		super.SiPresenta();
		System.out.println("Sono studente fuori sede,abito nella città universitaria: "+residenzauniversitaria);
	}
}