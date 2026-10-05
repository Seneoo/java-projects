package MotoUsoThis;
import java.io.*;
class ProgMotocicletta
{
	public static void main(String args[])
	{
		Motocicletta unaMotocicletta=new Motocicletta("Honda","CBR 600F",1993,"Mario Rossi","MI1234"); //dichiarazione dell'ogetto
		unaMotocicletta.Inseriscicolore("Gialla");
		Motocicletta motocicletta2; //oggetto2
		String Marca,Modello,Proprietario,Targa;
		int AnnoImmatric;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		System.out.println("Inserire Marca");
		try
		{
			Marca=tastiera.readLine();
		} catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserire Modello");
		try
		{
			Modello=tastiera.readLine();
		} catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserire Anno");
		try 
		{
		    String anno=tastiera.readLine();
		    AnnoImmatric=Integer.parseInt(anno);
		} 
		catch(IOException e) 
		{
		    System.out.println("Errore di input");
		    return;
		} 
		catch(NumberFormatException e) 
		{
		    System.out.println("Devi inserire un numero valido per l'anno");
		    return;
		}
		System.out.println("Inserire Nome e Cognome Proprietario");
		try
		{
			Proprietario=tastiera.readLine();
		} catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserire Targa");
		try
		{
			Targa=tastiera.readLine();
		} catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		motocicletta2=new Motocicletta(Marca,Modello,AnnoImmatric,Proprietario,Targa); //dichiarazioone oggetto2 
		System.out.println("Inserire Colore");
		try
		{
			String colore=tastiera.readLine();
			motocicletta2.Inseriscicolore(colore);
		} catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		int risp;
		do
		{
			System.out.println("0 Exit,1Fornisci i dati, 2 Avvia, 3 Arresta la motocicletta");
			try
			{
				String temp=tastiera.readLine();
				risp=Integer.parseInt(temp);
			} catch(NumberFormatException e)
			{
				System.out.println("Errore Input:Non è stato inserito un numero");
				return;
			}
			catch(IOException e)
			{
				System.out.println("Errore Input");
				return;
			}
			if(risp==1) motocicletta2.fornisciDati();
			else if(risp==2) motocicletta2.Avvia();
			else if(risp==3) motocicletta2.Arresta();
		}while(risp!=0);
		System.out.println("Programma concluso");
	}
}