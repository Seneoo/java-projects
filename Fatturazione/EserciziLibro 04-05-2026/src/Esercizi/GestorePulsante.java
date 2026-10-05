package Esercizi;
import javax.swing.*;
import java.awt.event.*;
class GestorePulsante implements ActionListener
{
	JTextArea a;
	public GestorePulsante(JTextArea a)
	{
		this.a = a;
	}

	public void actionPerformed(ActionEvent e)
	{
		String pulsante = e.getActionCommand();

		if (pulsante.equals("Superiore"))
		{
			a.append("È stato premuto il pulsante \"superiore\".\n");
		}
		if (pulsante.equals("Inferiore"))
		{
			a.append("È stato premuto il pulsante \"inferiore\".\n");
		}
	}
}
