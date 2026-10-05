package Esercizi;
import javax.swing.*;
import java.awt.*;
class BigliettiCinema
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JTextField txtNome=new JTextField(30);
		JTextField txtCognome=new JTextField(30);
		JTextField txtEmail=new JTextField(30);
		JComboBox film=new JComboBox();
		film.addItem("Thruman Show");
		film.addItem("Colpa delle stelle");
		film.addItem("Noi i ragazzi dello zoo di Berlino");
		film.addItem("Sole a catinelle");
		film.addItem("Il miglio verde");
		JComboBox orari=new JComboBox();
		orari.addItem("10:00");
		orari.addItem("12:00");
		orari.addItem("14:00");
		orari.addItem("16:00");
		orari.addItem("18:00");
		orari.addItem("20:00");
		JButton b1=new JButton("Acquista");
		JButton b2=new JButton("Annulla");
		p.setLayout(new GridLayout(5,2,10,10));
		p.add(new JLabel("Nome", JLabel.RIGHT));
		p.add(txtNome);
		p.add(new JLabel("Cognome",JLabel.RIGHT));
		p.add(txtCognome);
		p.add(new JLabel("Email", JLabel.RIGHT));
		p.add(txtEmail);
		p.add(new JLabel("Film", JLabel.RIGHT));
		p.add(film);
		p.add(new JLabel("Orario", JLabel.RIGHT));
		p.add(orari);
		f.getContentPane().add(p, BorderLayout.CENTER);
		JPanel pulsanti=new JPanel();
		pulsanti.add(b1);
		pulsanti.add(b2);
		f.getContentPane().add(pulsanti, BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Acquisto biglietti cinema");
		f.setSize(400,200);
		f.setVisible(true);
	}
}