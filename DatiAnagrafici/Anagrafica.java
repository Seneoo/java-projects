package DatiAnagrafici;
class Anagrafica
{ //metodo costruttore implicito
	//attributi pubblici
	public String nome;
	public String cognome;
	public float stipendio;
	//attributi privati
	private String email;
	private boolean registrata;
	public void registrataEmail(String p_email)
	{
		email=p_email;
		registrata=true;
	}
	public void stampaDati()
	{
		System.out.println("Nome:"+nome);
		System.out.println("Cognome:"+cognome);
		if(registrata)
		{
			System.out.println("Email:"+email);
		}
		else
		{
			System.out.println("Email non registrata");
		}
		System.out.println("Stipendio:"+stipendio);
	}
}
