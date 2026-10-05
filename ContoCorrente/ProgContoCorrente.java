package ContoCorrente;
import java.io.*;
class ProgContoCorrente
{
	public static void main(String args[])
	{
	InputStreamReader input=new InputStreamReader(System.in);
	BufferedReader tastiera=new BufferedReader(input);
	//creazione degli oggetti
	ContoCorrente conto1=new ContoCorrente();
	ContoCorrente conto2=new ContoCorrente();
	//dichiarazione e inizializzazione delle variabili
	String valore="";
	double importo=0;
	System.out.print("Importo da versare conto1:");
	try
	{
		valore=tastiera.readLine();
		importo=Double.parseDouble(valore);
	} 
	catch(IOException e) {
		System.out.println("Errorre nell'input");
		return;
	}
	conto1.versa(importo);
	conto1.stampaSaldo();
	System.out.print("Importo da prelevare conto1:");
	try
	{
		valore=tastiera.readLine();
		importo=Double.parseDouble(valore);
	}
	catch(IOException e) {
		System.out.println("Errorre nell'input");
		return;
	}
	if(conto1.getSaldo()>=importo)
	{
		conto1.preleva(importo);
		conto1.stampaSaldo();
	}
	else
	{
		System.out.println("Prelievo non disponibile conto1");
	}
	System.out.print("Importo da versare conto2:");
	try
	{
		valore=tastiera.readLine();
		importo=Double.parseDouble(valore);
	}catch(IOException e) {
		System.out.println("Errorre nell'input");
		return;
	}
	conto2.versa(importo);
	conto2.stampaSaldo();
	System.out.print("Importo da prelevare conto2:");
	try
	{
		valore=tastiera.readLine();
		importo=Double.parseDouble(valore);
	}catch(IOException e) {
		System.out.println("Errorre nell'input");
		return;
	}
	if(conto2.getSaldo()>=importo)
	{
		conto2.preleva(importo);
		conto2.stampaSaldo();
	}
	else
	{
		System.out.println("Prelievo non disponibile conto2");
	}
	if(conto1.getSaldo()>conto2.getSaldo())
	{
		System.out.println("Conto 1 saldo maggiore:");
		conto1.stampaSaldo();
	}
	else if(conto1.getSaldo()==conto2.getSaldo())
	{
		System.out.println("Conti con lo stesso saldo:");
		conto1.stampaSaldo();
		conto2.stampaSaldo();
	}
	else
	{
		System.out.println("Conto2 saldo maggiore:");
		conto2.stampaSaldo();
	}
	}
}