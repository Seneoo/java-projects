package HardDisk;
class Harddisk
{
   // attributi
   private String marca;
   private int rpm;
   private double accesso;
   private double capacita;

   // costanti per il calcolo del punteggio
   private final int PUNTI_RPM      = 1;
   private final int PUNTI_ACCESSO  = -200;
   private final int PUNTI_CAPACITA = 500;

   // costruttore parametrico
   public Harddisk(String marca, int rpm, double accesso, double capacita)
   {
      this.marca=marca;
      this.rpm=rpm;
      this.accesso=accesso;
      this.capacita=capacita;
   }

   // formatta i dati e li stampa su standard output
   public void stampaDati()
   {
      System.out.println("Marca            = " + marca);
      System.out.println("Velocita'        = " + rpm + " rpm");
      System.out.println("Tempo di accesso = " + accesso + " ms");
      System.out.println("Capacita'        = " + capacita + " Gb");
      System.out.println("Punteggio        = " + punteggio());
   }

   // restituisce il punteggio assegnato a questo HD
   public int punteggio()
   {
      int punt=0;

      punt += (int) (rpm      * PUNTI_RPM);
      punt += (int) (accesso  * PUNTI_ACCESSO);
      punt += (int) (capacita * PUNTI_CAPACITA);

      return punt;
   }
}
