package Esercizi;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Politecnico
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Calcolo costo docenza professori Politecnico di Bari");
		f.setSize(500,800);
		JPanel p=new JPanel();
		JLabel l1=new JLabel("Seleziona il ruolo universitario");
		JLabel l2=new JLabel("Inserisci il numero dei dipendenti");
		JLabel l3=new JLabel("Numero dei docenti fuorisede");
		l3.setVisible(false);
		JLabel l4=new JLabel("Docenti con servizio >4 (numero)");
		l4.setVisible(false);
		JComboBox <String> box=new JComboBox();
		box.addItem("Prof Ordinari");
		box.addItem("Prof Associati");
		box.addItem("Ricercatori");
		box.addItem("Borsisti");
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		t3.setEditable(false);
		JTextField t4=new JTextField();
		t4.setVisible(false);
		JTextField t5=new JTextField();
		t5.setVisible(false);
		JButton b1=new JButton("Calcola spesa stipendi");
		JButton b2=new JButton("Calcola costi totali");
		b1.addActionListener(new Pulsanti(box,t2,t3,t4,t5,l3,l4,b2));
		b2.addActionListener(new Pulsanti(box,t2,t3,t4,t5,l3,l4,b2));
		b2.setVisible(false);
		l1.setBounds(50,25,220,35);
		l1.setForeground(Color.BLUE);
		box.setBounds(320,25,140,35);
		box.setBackground(Color.CYAN);
		l2.setBounds(50,100,220,35);
		l2.setForeground(Color.BLUE);
		t2.setBounds(320,100,140,35);
		t2.setBackground(Color.CYAN);
		b1.setBounds(50,175,220,35);
		b1.setBackground(Color.red);
		t3.setBounds(320,175,140,35);
		t3.setBackground(Color.BLUE);
		l3.setBounds(50,250,220,35);
		l3.setForeground(Color.BLUE);
		t4.setBounds(320,250,140,35);
		t4.setBackground(Color.CYAN);
		l4.setBounds(50,325,220,35);
		l4.setForeground(Color.BLUE);
		t5.setBounds(320,325,140,35);
		t5.setBackground(Color.CYAN);
		b2.setBounds(140,400,220,35);
		b2.setBackground(Color.red);
		p.setLayout(null);
		p.setBounds(500, 1000, 800, 800);
		p.add(l1);
		p.add(box);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(t3);
		p.add(l3);
		p.add(t4);
		p.add(l4);
		p.add(t5);
		p.add(b2);
		f.add(p);
		f.setVisible(true);
		f.addWindowListener(new Finestra());
	}
}
class Pulsanti implements ActionListener
{
	JComboBox box=new JComboBox();
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();
	JLabel l3=new JLabel();
	JLabel l4=new JLabel();
	JButton b=new JButton();
	float stipendio;
	Pulsanti(JComboBox box,JTextField t1,JTextField t2,JTextField t4,JTextField t5,JLabel l3,JLabel l4,JButton b)
	{
		this.box=box;
		this.t1=t1;
		this.t2=t2;
		this.l3=l3;
		this.l4=l4;
		this.t4=t4;
		this.t5=t5;
		this.b=b;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(t1.getText().isEmpty())
		{
		    JOptionPane.showMessageDialog(null,"Valore non valido","Errore",JOptionPane.ERROR_MESSAGE);
		    return;
		}
		int n=Integer.parseInt(t1.getText());
		String selezione=(String) box.getSelectedItem();
		if(e.getActionCommand().equals("Calcola spesa stipendi")||e.getActionCommand().equals("Calcola costi totali"))
		{
			switch(selezione)
			{
			case "Prof Ordinari": stipendio=4000;
					break;
			case "Prof Associati": stipendio=2500;
					break;
			case "Ricercatori": stipendio=1700;
					break;
			case "Borsisti": stipendio=1200;
					break;
			}
			if(n<=0)
			{
				JOptionPane.showMessageDialog(null,"Valore in numero dei dipendenti non valido","Errore",JOptionPane.ERROR_MESSAGE);
				return;
			}
			else
			{
				stipendio*=n;
				t2.setText("Il costo del Poltecnico calcolato per questi docenti è:"+stipendio);
				t4.setVisible(true);
				t5.setVisible(true);
				l3.setVisible(true);
				l4.setVisible(true);
				b.setVisible(true);
			}
		}
		if(e.getActionCommand().equals("Calcola costi totali"))
		{
			if(t4.getText().isEmpty()||t5.getText().isEmpty())
			{
			    JOptionPane.showMessageDialog(null,"Valore non valido","Errore",JOptionPane.ERROR_MESSAGE);
			    return;
			}
			int viaggio=0;
			switch(selezione)
			{
			case "Prof Ordinari": viaggio=500;
					break;
			case "Prof Associati": viaggio=300;
					break;
			case "Ricercatori": viaggio=200;
					break;
			case "Borsisti": viaggio=150;
					break;
			}
			int fuorisede=Integer.parseInt(t4.getText());
			int Nanni=Integer.parseInt(t5.getText());
			if(fuorisede<=0||Nanni<=0)
			{
				JOptionPane.showMessageDialog(null,"Valore in numero dei dipendenti non valido","Errore",JOptionPane.ERROR_MESSAGE);
				return;
			}
			else
			{
				float tot=stipendio+(fuorisede*viaggio)+(Nanni*50);
				JOptionPane.showMessageDialog(null,"Totale Costi: "+tot+" euro","Info",JOptionPane.INFORMATION_MESSAGE);
			}
		}
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