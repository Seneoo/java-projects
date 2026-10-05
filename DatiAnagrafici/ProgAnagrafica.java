package DatiAnagrafici;
import java.io.*;
class ProgAnagrafica
{
	public static void main(String args[])
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		//creazione degli oggetti
		Anagrafica contatto=new Anagrafica();
		Anagrafica stipendio1=new Anagrafica();
		Anagrafica stipendio2=new Anagrafica();
		Anagrafica stipendio3=new Anagrafica();
		System.out.println("Inserisci nome Contatto:");
		try
		{
			contatto.nome=tastiera.readLine();
		}
		catch(Exception e) {}
		System.out.println("Inserisci cognome Contatto:");
		try
		{
			contatto.cognome=tastiera.readLine();
		}
		catch(Exception e) {}
		System.out.println("Inserisci email Contatto:");
		try
		{
			String email=tastiera.readLine();
			contatto.registrataEmail(email);
		}
		catch(Exception e) {}
		System.out.println("Riepilogo dati Contatto:");
		contatto.stampaDati();
		//parte esercizio
		System.out.println("Inserisci nome Stipendio1:");
		try
		{
			stipendio1.nome=tastiera.readLine();
		}
		catch(Exception e) {}
		System.out.println("Inserisci cognome Stipendio1:");
		try
		{
			stipendio1.cognome=tastiera.readLine();
		} catch(Exception e) {}
		System.out.println("email Stipendio1:");
		try
		{
			String email=tastiera.readLine();
			stipendio1.registrataEmail(email);
		} catch(Exception e) {}
		System.out.println("Inserisci stipendio:");
		try
		{
			stipendio1.stipendio=Float.parseFloat(tastiera.readLine());
		} catch(Exception e) {}
		System.out.println("RIEPILOGO DATI");
		stipendio1.stampaDati();
		System.out.println("Inserisci nome Stipendio2:");
		try
		{
			stipendio2.nome=tastiera.readLine();
		}
		catch(Exception e) {}
		System.out.println("Inserisci cognome Stipendio2:");
		try
		{
			stipendio2.cognome=tastiera.readLine();
		} catch(Exception e) {}
		System.out.println("email Stipendio2:");
		try
		{
			String email=tastiera.readLine();
			stipendio2.registrataEmail(email);
		} catch(Exception e) {}
		System.out.println("Inserisci stipendio:");
		try
		{
			stipendio2.stipendio=Float.parseFloat(tastiera.readLine());
		} catch(Exception e) {}
		System.out.println("RIEPILOGO DATI");
		stipendio2.stampaDati();
		System.out.println("Inserisci nome Stipendio3:");
		try
		{
			stipendio3.nome=tastiera.readLine();
		}
		catch(Exception e) {}
		System.out.println("Inserisci cognome Stipendio3:");
		try
		{
			stipendio3.cognome=tastiera.readLine();
		} catch(Exception e) {}
		System.out.println("email Stipendio3:");
		try
		{
			String email=tastiera.readLine();
			stipendio3.registrataEmail(email);
		} catch(Exception e) {}
		System.out.println("Inserisci stipendio:");
		try
		{
			stipendio3.stipendio=Float.parseFloat(tastiera.readLine());
		} catch(Exception e) {}
		System.out.println("RIEPILOGO DATI");
		stipendio3.stampaDati();
		float media=(float) (stipendio1.stipendio+stipendio2.stipendio+stipendio3.stipendio)/3;
		System.out.println("Media Stipendi:"+media);
	}
}