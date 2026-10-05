package Esercizi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CambiaFrame extends JFrame implements ActionListener
{
	Color sfondo = Color.WHITE;
	JPanel p = new JPanel();
	JPanel panArea = new JPanel();
	JComboBox<String> cbColori = new JComboBox<>();
	JButton btnCambia = new JButton("Cambia");

	public CambiaFrame()
	{
		super("Cambia sfondo!");
		setSize(400,250);
		addWindowListener(new GestoreFinestra());
		inizializzaCombo();
		panArea.setBackground(sfondo);

		// inserisce le componenti nel pannello in alto
		p.add(new JLabel("Colore di sfondo: "));
		p.add(cbColori);
		p.add(btnCambia);

		// inserisce le componenti nella finestra
		add(p, "North");
		add(panArea, "Center");
		btnCambia.addActionListener(this);
	}

	private void inizializzaCombo()
	{
		// aggiunge le voci alla combo box
		cbColori.addItem("bianco");
		cbColori.addItem("rosso");
		cbColori.addItem("arancione");
		cbColori.addItem("giallo");
		cbColori.addItem("verde");
		cbColori.addItem("blu");
		cbColori.addItem("nero");
	}

	public void actionPerformed(ActionEvent e)
	{
		String pulsante = e.getActionCommand();

		if (pulsante.equals("Cambia"))
		{
			switch (cbColori.getSelectedIndex())
			{
				case 0: sfondo = Color.WHITE; break;
				case 1: sfondo = Color.RED; break;
				case 2: sfondo = Color.ORANGE; break;
				case 3: sfondo = Color.YELLOW; break;
				case 4: sfondo = Color.GREEN; break;
				case 5: sfondo = Color.BLUE; break;
				case 6: sfondo = Color.BLACK; break;
			}
			panArea.setBackground(sfondo);
		}
	}
}
