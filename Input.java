package Esercizi;
import javax.swing.*;
import java.awt.*;
class Input
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Input");
		JPanel p=new JPanel();
		JTextField nome=new JTextField(20);
		JTextField prezzo=new JTextField("0",0);
		p.add(new JLabel("Inserisci nome: ",JLabel.RIGHT));
		nome.setBackground(Color.YELLOW);
		p.add(nome);
		p.add(new JLabel("Inserisci il prezzo: ",JLabel.RIGHT));
		prezzo.setForeground(Color.RED);
		p.add(prezzo);
		f.getContentPane().add(p);
		f.setSize(200,200);
		f.setLocation(100,100);
		f.setVisible(true);
	}
}