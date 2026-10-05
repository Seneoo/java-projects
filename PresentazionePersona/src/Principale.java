package PresentazionePersona;
import java.io.*;
class Principale
{
	public void main(String args[])
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		Persona MarioRossi= new Persona("Mario","Rossi","Corso Matteotti,Genova","MRRSS73E23K126E",1973);
		//potenziamenti:nuovi metodi+attributi(3/03/26)
		Studente MartaGrimaldi=new Studente ("Marta","Grimaldi","Via di Pratale,Pisa","GRMMRT75A14J098S","165112","Informatica",1975,3400,300);
		StudenteFuoriSede LucaMoretti=new StudenteFuoriSede("Luca","Moretti","Via Guarnacci ,Pesaro","MRTLCA76A12M12IE",
				"162312","Informatica","Via S.Doninno,Pisa",1976,2400,500,100);
		MarioRossi.SiPresenta();
		MartaGrimaldi.SiPresenta();
		System.out.println("Tasse da pagare per "+MartaGrimaldi.nome+" "+MartaGrimaldi.cognome+":"+MartaGrimaldi.getTassa1()+" "+MartaGrimaldi.getTassa2()+
				" Totale: "+(MartaGrimaldi.CalcolaTasseStudente()));
		LucaMoretti.SiPresenta();
		LucaMoretti.Calcoloeta(2026, LucaMoretti.annodinascita);
		System.out.println("Totale tasse da pagare:"+LucaMoretti.getTasseTot());
		//potenziamenti: aggiunti oggetti(24/02/26)
		Persona padre=new Persona("Michele","Caldarola","Via X,Bitonto","CLDMHL123456789",1977);
		Persona docente=new Persona("Raffaella","Moretti","Via Giacomo Matteotti,Bitonto","MRTRFL123456789",1980);
		padre.SiPresenta();
		padre.Calcoloeta(2026, padre.annodinascita);
		docente.SiPresenta();
		docente.Calcoloeta(2026, docente.annodinascita);
		
		Studente io=new Studente("Giuseppe","Caldarola","Via X,Bitonto","CLDGPP123456789","1234567","Informatica",2008,1000,600);
		io.SiPresenta();
		System.out.println(io.nome+" "+io.cognome+" tassa1"+io.getTassa1()+" tassa2 "+io.getTassa2()+" totale:"+io.CalcolaTasseStudente());
		String nome,cognome,residenza,codicefiscale,matricola,corsodilaurea;
		int annodinascita;
		System.out.println("Inserisci nome:");
		try
		{
			nome=tastiera.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci cognome:");
		try
		{
			cognome=tastiera.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci residenza:");
		try
		{
			residenza=tastiera.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci codice fiscale:");
		try
		{
			codicefiscale=tastiera.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci matricola:");
		try
		{
			matricola=tastiera.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci corso di laurea:");
		try
		{
			corsodilaurea=tastiera.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci anno di nascita:");
		try
		{
			annodinascita=Integer.parseInt(tastiera.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci tassa 1:");
		float tassa1,tassa2;
		try
		{
			tassa1=Float.parseFloat(tastiera.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci tassa 2:");
		try
		{
			tassa2=Float.parseFloat(tastiera.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Errore di input");
			return;
		}
		Studente compagno=new Studente(nome,cognome,residenza,codicefiscale,matricola,corsodilaurea,annodinascita,tassa1,tassa2);
		compagno.SiPresenta();
		System.out.println(compagno.nome+" "+compagno.cognome+" tassa1:"+compagno.getTassa1()+" tassa2:"+compagno.getTassa2()+" totale:"+compagno.CalcolaTasseStudente());
		
		StudenteFuoriSede nonno=new StudenteFuoriSede("Giuseppe","Caldarola","Via X,Bitonto","CLDGPP123456789","1234567","Informatica","Via Roma,Bari",1940,3000,800,100);
		StudenteFuoriSede madre=new StudenteFuoriSede("Carmela","Fatone","Via X,Bitonto","FTNCML123456789","1234568","Informatica","Via Roma,Bari",1980,1000,550,1700);
		nonno.SiPresenta();
		nonno.Calcoloeta(2026, nonno.annodinascita);
		System.out.println("Totale tasse da pagare:"+nonno.getTasseTot());
		madre.SiPresenta();
		madre.Calcoloeta(2026, madre.annodinascita);
		System.out.println("Totale tasse da pagare:"+madre.getTasseTot());
	}
}