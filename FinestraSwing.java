package Esercizi;
import javax.swing.*;
import java.awt.*;
class FinestraSwing
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame(); //creazione della finestra
		JPanel p= new JPanel(); //creazione del pannello
		JLabel l= new JLabel("Etichetta"); //creazione dell'etichetta
		JButton b= new JButton("Pulsante"); //creazione del pulsante
		p.add(l); //aggiunta dell'etichetta al pannello
		p.add(b); //aggiunta del pulsante al pannello
		Container c = f.getContentPane(); //ottenimento del contenitore della finestra
		c.add(p); //aggiunta del pannello al contenitore
		f.setSize(300,200); //impostazione della dimensione della finestra
		f.setVisible(true); //visualizzazione della finestra
	}
}