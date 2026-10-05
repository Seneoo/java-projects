package HardDisk;
import java.io.*;
class Proghd
{
   public static void main(String[] args)
   {
      // costante
      final int MAX_HD=5;

      // variabili
      int totalePunteggio=0;
      int punteggioMedio;
      String marca;
      int rpm;
      double accesso;
      double capacita;

      // oggetti
      Harddisk peggiore, migliore;

      // array di oggetti
      Harddisk[] hd=new Harddisk[MAX_HD];

      InputStreamReader input=new InputStreamReader(System.in);
      BufferedReader tastiera=new BufferedReader(input);

      // chiede i dati e crea gli harddisk col costruttore parametrico
      for(int i=0; i<hd.length; i++)
      {
         System.out.println("\nHARD DISK :" + i+1);
         marca="";
         rpm=0;
         accesso=0;
         capacita=0;
         System.out.print("Inserisci la marca: ");
         try
         {
            marca=tastiera.readLine();
         }
         catch(IOException e) {}
         System.out.print("Inserisci la velocita' (rpm): ");
         try
         {
            String numeroLetto=tastiera.readLine();
            rpm=Integer.parseInt(numeroLetto);
         }
         catch(Exception e)
         {
            System.out.println("\nVelocita' non corretta");
            System.exit(1);
         }
         System.out.print("Inserisci il tempo di accesso (ms): ");
         try
         {
            String numeroLetto=tastiera.readLine();
            accesso=Double.parseDouble(numeroLetto);
         }
         catch(Exception e)
         {
            System.out.println("\nTempo di accesso non corretto");
            System.exit(1);
         }
         System.out.print("Inserisci la capacita' (Gb): ");
         try
         {
            String numeroLetto=tastiera.readLine();
            capacita=Double.parseDouble(numeroLetto);
         }
         catch(Exception e)
         {
            System.out.println("\nCapacita' non corretta");
            System.exit(1);
         }
         hd[i]=new Harddisk(marca, rpm, accesso, capacita);
      }
      peggiore=hd[0];
      migliore=hd[0];
      // calcola il migliore-peggiore e il punteggio medio
      for(int i=0; i<hd.length; i++)
      {
         totalePunteggio+=hd[i].punteggio();

         if(hd[i].punteggio() < peggiore.punteggio())
         {
            peggiore=hd[i];
         }
         else if(hd[i].punteggio() > migliore.punteggio())
         {
            migliore=hd[i];
         }
      }
      punteggioMedio=totalePunteggio/MAX_HD;
      System.out.println("\nPunteggio medio = " + punteggioMedio);
      System.out.println("\n*** HardDisk migliore ***");
      migliore.stampaDati();
      System.out.println("\n*** HardDisk peggiore ***");
      peggiore.stampaDati();
   }
}
