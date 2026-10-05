package Esercizi;
import javax.swing.*;
import java.awt.*;
class Tabella
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JTextField txtNome=new JTextField(30);
		JTextField txtCognome=new JTextField(30);
		JTextField txtTelefono=new JTextField(30);
		p.setLayout(new GridLayout(3,2,10,10));
		p.add(new JLabel("Nome", JLabel.RIGHT));
		p.add(txtNome);
		p.add(new JLabel("Cognome",JLabel.RIGHT));
		p.add(txtCognome);
		p.add(new JLabel("Telefono", JLabel.RIGHT));
		p.add(txtTelefono);
		f.getContentPane().add(p);
		f.setSize(200,120);
		f.setLocation(100,100);
		f.setVisible(true);
	}
}