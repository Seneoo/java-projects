package esercizio;
import java.io.*;
class Voti
{
	public static void main(String[] args)
	{
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader tastiera= new BufferedReader(input);
		final int NUMERO_VOTI =10;
		int voto;
		String testo;
		for(int i=0;i<NUMERO_VOTI;i++)
		{
			System.out.print("Voto numerico:");
			try
			{
				String votoLetto=tastiera.readLine();
				voto=Integer.parseInt(votoLetto);
			}
			catch(Exception e)
			{
				System.out.println("Voto non valido.");
				//torna all'inizio del ciclo
				i--;
				continue;
			}
			if(voto<6)
			{
				testo="negativo";
			}
			else if(voto==6)
			{
				testo="sufficiente";
			}
			else
			{
				testo="positivo";
			}
			System.out.println("Hai ricevuto un voto " +testo);
		}
	}
}