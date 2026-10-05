package Esercizio;
import java.io.*;
class Progetto
{
	public static void main(String[] args) {
		automobile autoo[] = new automobile[10];
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int n=0;
		System.out.println("Quante automobili vuoi inserire? (max 10)");
		try
		{
			n=Integer.parseInt(tastiera.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Errore di input: "+e.getMessage());
			return;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input non valido: "+e.getMessage());
			return;
		}
		System.out.println("Inserisci i dati delle automobili:");
		String targa, marca, modello, colore;
		int anno;
		for(int i=0;i<n;i++)
		{
			System.out.println("Automobile "+(i+1)+":");
			System.out.print("Targa: ");
			try
			{
				targa = tastiera.readLine();
			}
			catch(IOException e)
			{
				System.out.println("Errore di input: ");
				return;
			}
			System.out.print("Marca: ");
			try
			{
				marca = tastiera.readLine();
			}
			catch(IOException e)
			{
				System.out.println("Errore di input: ");
				return;
			}
			System.out.print("Modello: ");
			try
			{
				modello = tastiera.readLine();
			}
			catch(IOException e)
			{
				System.out.println("Errore di input: ");
				return;
			}
			System.out.print("Colore: ");
			try
			{
				colore = tastiera.readLine();
			}
			catch(IOException e)
			{
				System.out.println("Errore di input: ");
				return;
			}
			System.out.print("Anno: ");
			try
			{
				anno = Integer.parseInt(tastiera.readLine());
			}
			catch(IOException e)
			{
				System.out.println("Errore di input: ");
				return;
			}
			autoo[i] = new automobile(targa, marca, modello, colore, anno);
		}
		System.out.println("MENU:");
		System.out.println("1. Visualizza tutte le automobili");
		System.out.println("2. Rimuovi un'automobile");
		System.out.println("3. Esci");
		int scelta=0;
		try
		{
			scelta = Integer.parseInt(tastiera.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Errore di input: ");
			return;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input non valido: ");
			return;
		}
		switch(scelta)
		{
			case 1:
				for(int i=0;i<n;i++)
				{
					if(autoo[i]!=null)
						autoo[i].stampa();
				}
				break;
			case 2:
				System.out.print("Inserisci la targa dell'automobile da rimuovere: ");
				String targaRimuovi;
				try
				{
					targaRimuovi = tastiera.readLine();
				}
				catch(IOException e)
				{
					System.out.println("Errore di input: ");
					return;
				}
				boolean trovato=false;
				for(int i=0;i<n;i++)
					{
						if(autoo[i]!=null && autoo[i].getTarga().equals(targaRimuovi))
						{
							autoo[i].remove(targaRimuovi);
							System.out.println("Automobile rimossa.");
							trovato=true;
							break;
						}
					}
				if(!trovato)
					{
					System.out.println("Automobile non trovata.");
				}
				break;
			case 3:
				System.out.println("Uscita");
				break;
			default:
				System.out.println("Scelta non valida.");
		}
	}
}