package Esercizi;
import javax.swing.*;
import javax.swing.JFrame;

import java.awt.*;
class Scelte
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JCheckBox c1=new JCheckBox("antipasto",true);
		JCheckBox c2=new JCheckBox("primo piatto");
		JCheckBox c3=new JCheckBox("secondo piatto",true);
		JCheckBox c4=new JCheckBox("contorno");
		JCheckBox c5=new JCheckBox("dessert");
		p.setLayout(new GridLayout(6,1));
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(c4);
		p.add(c5);
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Scelte menu");
		f.setSize(250,200);
		f.setVisible(true);
	}
}