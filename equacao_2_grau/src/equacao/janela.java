package equacao;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class janela extends JFrame
{
	JButton b1,b2;
	JTextField texto1,texto2,texto3,textoSaida,textoSaida2,textoSaida3;
	JLabel textLabel,textLabel2,textLabel3,textLabel4,textLabel5,textLabel6;
	int a,b,c,delta;
	double x1,x2;
	
	
	janela()
	{
		Container c;
		Ouvinte o = new Ouvinte();
		c = this.getContentPane();
		
		this.setSize(500,300);
		this.setLocation(500,200);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setLayout(null);
		c.setBackground(Color.BLUE);
		
		textLabel = new JLabel("A");
		textLabel2 = new JLabel("B");
		textLabel3 = new JLabel("C");
		textLabel4 = new JLabel("Delta");
		textLabel5 = new JLabel("X1");
		textLabel6 = new JLabel("X2");
	    texto1 = new JTextField(20);
	    texto2 = new JTextField(20);
	    texto3 = new JTextField(20);
	    textoSaida = new JTextField();
	    textoSaida2 = new JTextField();
	    textoSaida3 = new JTextField();
	    textLabel.setBounds(20,50,150,20);
	    textLabel2.setBounds(20,80,150,20);
	    textLabel3.setBounds(20,110,150,20);
	    textLabel4.setBounds(120,50,150,20);
	    textLabel5.setBounds(120,80,150,20);
	    textLabel6.setBounds(120,110,150,20);
	    texto1.setBounds(30,50,50,20);
	    texto2.setBounds(30,80,50,20);
	    texto3.setBounds(30,110,50,20);
	    textoSaida.setBounds(150,50,50,20);
	    textoSaida2.setBounds(150,80,50,20);
	    textoSaida3.setBounds(150,110,50,20);
	    textoSaida.setEditable(false);
	    textoSaida2.setEditable(false);
	    textoSaida3.setEditable(false);
	    this.add(textLabel);
	    this.add(textLabel2);
	    this.add(textLabel3);
	    this.add(textLabel4);
	    this.add(textLabel5);
	    this.add(textLabel6);
	    this.add(texto1);
	    this.add(texto2);  
	    this.add(texto3);
	    this.add(textoSaida);
	    this.add(textoSaida2);
	    this.add(textoSaida3);
	    
	    b1 = new JButton("Resultado");
	    b2 = new JButton("Limpar");
	    b1.setSize(100,30);
	    b1.setLocation(30,150);
	    b1.addMouseListener(o);
	    b2.setSize(100,30);
	    b2.setLocation(150,150);
	    b2.addMouseListener(o);
	    this.add(b1);
	    this.add(b2);
	    
	    this.setVisible(true);
	}
	
    public class Ouvinte extends MouseAdapter
    {	
       @Override
       public void mouseClicked(MouseEvent arg0)
        {
    	  
    	   {
    	     a = Integer.parseInt(texto1.getText());
    	     b = Integer.parseInt(texto2.getText());
    	     c = Integer.parseInt(texto3.getText());
    	     delta = (int) (Math.pow(b,2) - (4*a*c));
    	     x1 = (-b+Math.sqrt(delta)) / (2*a);
    	     x2 = (-b-Math.sqrt(delta)) / (2*a);
    	    
    	     if(arg0.getSource()==b1)
    	     {
  		        textoSaida.setText(Integer.toString(delta));
    	        textoSaida2.setText(String.format("%.2f",x1));
    	        textoSaida3.setText(String.format("%.2f",x2));
    	     }
  		     if(arg0.getSource()==b2)
  		     {
  		    	texto1.setText("");
  		    	texto2.setText("");
  		    	texto3.setText("");
  			    textoSaida.setText("");
  		        textoSaida2.setText("");
  		        textoSaida3.setText("");  	
  		     }
    	   }              
        }
    }
}


