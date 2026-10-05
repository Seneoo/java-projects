package Esercizi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class principale 
{
    //dichiarazione di possibili attributi e oggetti grafici
    private JFrame f;
    private JLabel label1,label2,labelResult;
    private JTextField txtNum1,txtNum2,txtResult;
    private JButton btnAdd,btnSub,btnMul,btnDiv,btnReset;
    public principale() 
    {
        //creazione del frame e impostazioni
        f=new JFrame("OPERAZIONI ARITMETICHE");
        f.setBounds(50,50,400,450); 
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //aggiunta del gestore per la chiusura della finestra
        f.addWindowListener(new GestoreFinestra());
        
        //colore: Arancione - dimensione: 20x10 
        label1=new JLabel("PRIMO NUMERO");
        label1.setBounds(50,50,100,50); 
        label1.setOpaque(true);
        label1.setBackground(Color.ORANGE);
        f.add(label1);
        label2=new JLabel("SECONDO NUMERO");
        label2.setBounds(50,110,100,50); 
        label2.setOpaque(true);
        label2.setBackground(Color.ORANGE);
        f.add(label2);
        
        //colore: Giallo - dimensione: 30x10 
        txtNum1=new JTextField();
        txtNum1.setBounds(160,50,150,50); 
        txtNum1.setBackground(Color.YELLOW);
        f.add(txtNum1);
        txtNum2=new JTextField();
        txtNum2.setBounds(160,110,150,50); 
        txtNum2.setBackground(Color.YELLOW);
        f.add(txtNum2);
        
        //colore: Rosa - dimensione: 10x10 
        //istanza dell'unico ascoltatore per tutti i bottoni
        AscoltatoreUnico oggettoascoltatore = new AscoltatoreUnico();
        btnAdd=new JButton("+");
        btnAdd.setBounds(50,180,50,50); 
        btnAdd.setBackground(Color.PINK);
        btnAdd.addActionListener(oggettoascoltatore);
        f.add(btnAdd);
        btnSub=new JButton("-");
        btnSub.setBounds(110,180,50,50); 
        btnSub.setBackground(Color.PINK);
        btnSub.addActionListener(oggettoascoltatore);
        f.add(btnSub);
        btnMul=new JButton("x");
        btnMul.setBounds(170,180,50,50); 
        btnMul.setBackground(Color.PINK);
        btnMul.addActionListener(oggettoascoltatore);
        f.add(btnMul);
        btnDiv=new JButton("/");
        btnDiv.setBounds(230,180,50,50); 
        btnDiv.setBackground(Color.PINK);
        btnDiv.addActionListener(oggettoascoltatore);
        f.add(btnDiv);

        //colore: Arancione - dimensione: 20x10 
        labelResult=new JLabel("RISULTATO");
        labelResult.setBounds(50,250,100,50); 
        labelResult.setOpaque(true);
        labelResult.setBackground(Color.ORANGE);
        f.add(labelResult);

        //colore: Giallo - dimensione: 30x10 
        txtResult=new JTextField();
        txtResult.setBounds(160,250,150,50); 
        txtResult.setBackground(Color.YELLOW);
        txtResult.setEditable(false);
        f.add(txtResult);

        //colore: Rosa - dimensione: 20x10 
        btnReset=new JButton("RESET");
        btnReset.setBounds(130,320,100,50); 
        btnReset.setBackground(Color.PINK);
        btnReset.addActionListener(oggettoascoltatore);
        f.add(btnReset);
        f.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new principale(); //metodo main 
    }
    
    //utilizzo di una sola classe ascoltatrice interna con if
    private class AscoltatoreUnico implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            //controllo se il bottone premuto è reset
            if(e.getSource()==btnReset)
            {
                //reset dei campi di testo
                txtNum1.setText("");
                txtNum2.setText("");
                txtResult.setText("");
            }
            else
            {
                //conversione dei numeri inseriti
                double n1=Double.parseDouble(txtNum1.getText());
                double n2=Double.parseDouble(txtNum2.getText());
                
                //controllo del bottone per eseguire l'operazione corretta senza valueOf
                if(e.getSource()==btnAdd)
                {
                    txtResult.setText(""+(n1+n2));
                }
                else if(e.getSource()==btnSub)
                {
                    txtResult.setText(""+(n1-n2));
                }
                else if(e.getSource()==btnMul)
                {
                    txtResult.setText(""+(n1*n2));
                }
                else if(e.getSource()==btnDiv)
                {
                    //se il secondo numero è 0 si visualizza ALERT
                    if(n2==0) 
                    {
                        JOptionPane.showMessageDialog(null,"Operazione impossibile","ALERT",JOptionPane.ERROR_MESSAGE);
                    } 
                    else 
                    {
                        txtResult.setText(""+(n1/n2));
                    }
                }
            }
        }
    }

    //classe per la gestione della chiusura della finestra
    private class GestoreFinestra implements WindowListener
    {
        public void windowClosing(WindowEvent e)
        {
            //stampa del messaggio di chiusura
            System.out.println("Programma terminato");
        }
        public void windowOpened(WindowEvent e){}
        public void windowClosed(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowActivated(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}
    }
}
