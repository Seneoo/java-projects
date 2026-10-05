package es3;
import java.io.*;
class Media
{
	public static void main(String[] args)
	{
		//impostazione dello standard input
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		//dichiarazione delle variabili
		int eta1,eta2,eta3;
		float media;
		System.out.println("Persona 1 **********");
		System.out.println("età:");
		try {
			String numeroLetto= tastiera.readLine();
			eta1= Integer.parseInt(numeroLetto);
		}
		catch (Exception e)
		{
			System.out.println("\nNumero non corretto!");
			return;
		}
		System.out.println("Persona 2 **********");
		System.out.println("età:");
		try {
			String numeroLetto= tastiera.readLine();
			eta2= Integer.parseInt(numeroLetto);
		}
		catch (Exception e)
		{
			System.out.println("\nNumero non corretto!");
			return;
		}
		System.out.println("Persona 3 **********");
		System.out.println("età:");
		try {
			String numeroLetto= tastiera.readLine();
			eta3= Integer.parseInt(numeroLetto);
		}
		catch (Exception e)
		{
			System.out.println("\nNumero non corretto!");
			return;
		}
		media= (float) (eta1+eta2+eta3)/3;
		System.out.println("\nEtà media:"+media);
	}
}