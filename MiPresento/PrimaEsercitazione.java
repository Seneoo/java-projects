package MiPresento;
import javax.swing.*;
import java.awt.*;
public class PrimaEsercitazione
{
	public static void main(String args[])
	{
		//definizione oggetti
		JFrame f=new JFrame("Mi presento");
		JPanel p=new JPanel();
		JLabel l1=new JLabel("Inserisci nome ");
		JLabel l2=new JLabel("Inserisci cognome ",JLabel.CENTER); //allineamento al centro
		JTextField nome=new JTextField();
		JTextField cognome=new JTextField();
		JLabel l3=new JLabel("Inserisci hobbies ");
		JTextArea messaggi=new JTextArea();
		JButton b1=new JButton("BOTTONE 1");
		JButton b2=new JButton("BOTTONE 2");
		//disposizione dell'oggetto grafico pannello
		p.setLayout(null);
		p.setBounds(100,100,800,400);
		//disposizione dell'etichetta l1
		l1.setLayout(null); //anullamento gestore di layout automatico
		l1.setBounds(150,150,300,30); //posizionamento
		l1.setForeground(Color.RED); //scritta rossa
		l1.setBackground(Color.YELLOW); //sfondo giallo
		l1.setHorizontalAlignment(JLabel.RIGHT); //allineamento a destra
		p.add(l1); //l1 aggiiunto al pannello
		//disposizione dell'etichetta l2
		l2.setLayout(null); 
		l2.setBounds(150,200,300,30);
		l2.setForeground(Color.BLUE); 
		l2.setBackground(Color.GREEN); 
		p.add(l2);
		//disposizione della casella di testo per il nome
		nome.setLayout(null);
		nome.setBounds(550,150,300,30);
		nome.setForeground(Color.BLUE);
		nome.setBackground(Color.GRAY);
		nome.setText("Pippo");
		p.add(nome);
		//disposizione della caasella di testo per il cognome
		cognome.setLayout(null); 
		cognome.setBounds(550,200,300,30);
		cognome.setForeground(Color.PINK); 
		cognome.setBackground(Color.LIGHT_GRAY);
		cognome.setText("Topolino");
		p.add(cognome);
		//disposizione del bottone b1
		b1.setLayout(null); 
		b1.setBounds(450,250,100,90); 
		b1.setBackground(Color.BLUE);
		b1.setText("OK");
		p.add(b1);
		//dichiarazione dell'etichetta l3
		l3.setLayout(null); 
		l3.setBounds(100,350,300,90);
		l3.setHorizontalAlignment(JLabel.RIGHT);
		l3.setForeground(Color.BLACK); 
		l3.setBackground(Color.PINK); 
		p.add(l3);
		//disposizione del'area di testo per i messaggi
		messaggi.setLayout(null); 
		messaggi.setBounds(550,350,300,100);
		messaggi.setForeground(Color.BLACK); 
		messaggi.setBackground(Color.ORANGE);
		messaggi.setText("Minnie");
		p.add(messaggi);
		//disposizione del bottone b2
		b2.setLayout(null); 
		b2.setBounds(200,400,100,30);
		b2.setBackground(Color.BLUE);
		b2.setText("INSERISCI");
		p.add(b2);
		//disposizione della finestra principale
		f.getContentPane().add(p);
		f.setSize(900,500);
		f.setLocation(0,0);
		f.setVisible(true);
	}
}