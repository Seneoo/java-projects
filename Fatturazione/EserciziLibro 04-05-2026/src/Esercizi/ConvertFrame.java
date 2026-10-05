package Esercizi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ConvertFrame extends JFrame implements ActionListener
{
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JTextField txtCelsius = new JTextField(15);
	JTextField txtKelvin = new JTextField(15);
	JButton btnConverti = new JButton("Converti");

	public ConvertFrame()
	{
		super("Convertitore gradi Celsius->kelvin");

		addWindowListener(new GestoreFinestra());

		// inserisce le componenti nei pannelli
		p1.add(new JLabel("Gradi Celsius: "));
		p1.add(txtCelsius);
		p2.add(new JLabel("kelvin: "));
		p2.add(txtKelvin);

		// inserisce le componenti nella finestra disponendole con una griglia
		setLayout(new GridLayout(3,1,5,10));
		add(p1);
		add(btnConverti);
		add(p2);
		btnConverti.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String pulsante = e.getActionCommand();
		double celsius, kelvin;

		if (pulsante.equals("Converti"))
		{
			try
			{
				String numeroLetto = txtCelsius.getText();
				celsius = Double.parseDouble(numeroLetto);
				kelvin = celsius + 273.15;
				txtKelvin.setText("" + kelvin);
			}
			catch(Exception exc)
			{
				txtKelvin.setText("");
			}
		}
	}
}
