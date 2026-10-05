package Supermercato;
class Main
{
	public static void main(String agrs[])
	{
		tessera t1=new tessera("Mario","Rossi",123,50);
		tesseraoro t2=new tesseraoro("Luigi","Bianchi",456,70,"Oro");
		tesseraplatino t3=new tesseraplatino("Giovanni","Verdi",789,90,"Platino",30);
		
		t1.mostraDati();
		System.out.println();
		t2.mostraDati();
		System.out.println();
		t3.mostraDati();
		
		System.out.println("\nAcquisto di 150 euro con tessera oro:");
		t2.acquisto(150);
		System.out.println("Punteggio dopo acquisto: "+t2.getPunteggio());
		
		System.out.println("\nAcquisto di 250 euro con tessera platino:");
		t3.acquisto(250);
		System.out.println("Punteggio dopo acquisto: "+t3.getPunteggio());
		
		System.out.println("\nRitiro premio da 100 punti con tessera oro:");
		t2.ritirapremio(100);
		System.out.println("Punteggio dopo ritiro premio: "+t2.getPunteggio());
		
		System.out.println("\nRitiro premio da 200 punti con tessera platino:");
		t3.ritirapremio(200);
		System.out.println("Punteggio dopo ritiro premio: "+t3.getPunteggio());
	}
}