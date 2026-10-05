package VolumeCilindro;
import  java.io.*;
class ProgCilindro
{
	public static void main(String args[])
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera=new BufferedReader(input);
		Cilindro cil=new Cilindro(4.0,10.0);
		System.out.println("Dimensioni del primo cilindro:");
		System.out.println("Area della base:"+cil.area());
		System.out.println("Volume"+cil.volume());
		cil.setRaggio(7.6);
		cil.setAltezza(23.5);
		System.out.println("Dimensioni del nuovo cilindro:");
		System.out.println("Area della base:"+cil.area());
		System.out.println("Volume"+cil.volume());
		//esercizio
		Cilindro cil2;
		System.out.println("Inserisci dimensione raggio:");
		String temp;
		double raggio,altezza;
		try
		{
			temp=tastiera.readLine();
			raggio=Double.parseDouble(temp);
		}catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		System.out.println("Inserisci dimensione :");
		try
		{
		    temp=tastiera.readLine();
		    altezza=Double.parseDouble(temp);
		}catch(IOException e)
		{
			System.out.println("Errore di input");
			return;
		}
		cil2=new Cilindro(raggio,altezza);
		System.out.println("Informazioni del cilindro inserito in input:");
		System.out.println("Area:"+cil2.area());
		System.out.println("Volume:"+cil2.volume());
	}
}