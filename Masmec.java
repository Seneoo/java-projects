package Esercizi;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Masmec
{
	public static void main(String[] args)
	{
	JFrame f=new JFrame("Calcolo stipendio dipendente azienda MASMEC");
	f.setSize(500,1100);
	JPanel p=new JPanel();
	p.setPreferredSize(new Dimension(500,1100));
	JLabel l1=new JLabel("Inserisci livello");
	l1.setForeground(Color.RED);
	l1.setHorizontalAlignment(JLabel.CENTER);
	l1.setBackground(Color.YELLOW);
	JComboBox<String> Box=new JComboBox<>();
	Box.setBackground(Color.BLUE);
	Box.setForeground(Color.YELLOW);
	Box.addItem("Dirigente");
	Box.addItem("Impiegato");
	Box.addItem("Operaio");
	JLabel l2=new JLabel("Inserisci mesi di lavoro");
	JTextField t1=new JTextField(10);
	t1.setBackground(Color.BLUE);
	t1.setForeground(Color.YELLOW);
	JButton b1=new JButton("Calcola stipendio");
	b1.setForeground(Color.BLACK);
	b1.setBackground(Color.RED);
	b1.setHorizontalAlignment(JLabel.CENTER);
	JTextField t2=new JTextField(10);
	t2.setEditable(false);
	JLabel l3=new JLabel("Premio Produzione:");
	JTextField t3=new JTextField(10);
	JButton b2=new JButton("Calcola totale");
	
	l1.setBounds(200,300,400,50);
	Box.setBounds(500,300,400,50);
	l2.setBounds(200,200,400,50);
	t1.setBounds(500,500,400,50);
	b1.setBounds(200,700,400,50);
	t2.setBounds(500,700,400,50);
	l3.setBounds(200,900,400,50);
	t3.setBounds(500,900,400,50);
	b2.setBounds(350,1000,400,50);
	p.add(l1);
	p.add(Box);
	p.add(l2);
	p.add(t1);
	p.add(b1);
	p.add(t2);
	p.add(l3);
	p.add(t3);
	p.add(b2);
	b1.addActionListener(new Stipendio(Box,t1,t2));
	b2.addActionListener(new Stipendio(Box,t1,t2,t3));
	p.setLayout(null);
	f.add(p);
	f.setVisible(true);
	f.addWindowListener(new Finestra());
	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
class Stipendio implements ActionListener
{
	JComboBox<String> Box;
	JTextField t1,t2,t3=null;
	public Stipendio(JComboBox<String> Box, JTextField t1, JTextField t2) 
	{
		this.Box=Box;
		this.t1=t1;
		this.t2=t2;
	}
	public Stipendio(JComboBox<String> Box, JTextField t1, JTextField t2, JTextField t3) 
	{
		this.Box=Box;
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
	}
	public void actionPerformed(ActionEvent e)
	{
		String lvl=(String)Box.getSelectedItem();
		int mesi=Integer.parseInt(t1.getText());
		int stipendio=0;
		if(e.getActionCommand().equals("Calcola stipendio")||e.getActionCommand().equals("Calcola totale"))
		{
			if(mesi<0)
			{
				JOptionPane.showMessageDialog(null,"Inserisci un numero di mesi valido","Errore",JOptionPane.ERROR_MESSAGE);
				return;
			}
			switch(lvl)
			{
				case "Dirigente": stipendio=6000; break;
				case "Impiegato": stipendio=1900; break;
				case "Operaio": stipendio=1700; break;
			}
			stipendio*=mesi;
		}
		if(e.getActionCommand().equals("Calcola totale"))
		{
		    int premio=Integer.parseInt(t3.getText());
		    stipendio+=premio;
		    if(premio<0)
		    {
		        JOptionPane.showMessageDialog(null,"Inserisci un premio valido","Errore",JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    JOptionPane.showMessageDialog(null,"Lo stipendio totale è: "+stipendio,"Totale",JOptionPane.INFORMATION_MESSAGE);
		    return;
		}
		t2.setText("Lo stipendio calcolato è: "+stipendio);
	}
}
class Finestra implements WindowListener
{
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		int risposta=JOptionPane.showConfirmDialog(null,"Vuoi davvero uscire?","Uscita",JOptionPane.YES_NO_OPTION);
		if(risposta==JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
}