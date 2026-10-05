package Esercizi;
import java.awt.*;
class FinestraAwt
{
	public static void main(String args[])
	{
		Frame f= new Frame(); //creazione della finestra
		Panel p= new Panel(); //creazione del pannello
		Label l= new Label("Etichetta"); //creazione dell'etichetta
		Button b= new Button("Pulsante"); //creazione del pulsante
		p.add(l); //aggiunta dell'etichetta al pannello
		p.add(b); //aggiunta del pulsante al pannello
		f.add(p); //aggiunta del pannello alla finestra
		f.setSize(300,200); //impostazione della dimensione della finestra
		f.setVisible(true); //visualizzazione della finestra
	}
}