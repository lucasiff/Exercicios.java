package view;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import controller.ListarInscritos;
import model.Pessoa;

public class TelaListarInscritos
{
	private JTextField Evento;
	private JPanel Lista;
	private JTextArea AreaInscritos;
	private JButton botao;
	
	public TelaListarInscritos()
	{
		Lista = new JPanel();
		Lista.setLayout(null);
		Lista.setBackground(Color.GRAY);
		JLabel LabelEvento = new JLabel("Evento");
		LabelEvento.setBounds(10,20,300,25);
		Evento = new JTextField(50);
		Evento.setBounds(70,20,300,25);
		AreaInscritos = new JTextArea();
		AreaInscritos.setEditable(false);
		AreaInscritos.setLineWrap(true);
		AreaInscritos.setWrapStyleWord(true);
	    JScrollPane scrollPane = new JScrollPane(AreaInscritos);
	    scrollPane.setBounds(10,50,550,150);
	    Lista.add(LabelEvento);	
	    Lista.add(Evento);
	    Lista.add(scrollPane);
	    botao = new JButton("OK");
	    botao.setSize(100,30);
	    botao.setLocation(Evento.getX()+Evento.getWidth()+20,Evento.getY()-2);
	    Lista.add(botao);
	}
	
	public String getEvento()
	{
		return Evento.getText();
	}
	public JButton getbotao()
	{
		return botao;
	}
	public JPanel getLista()
	{
		return Lista;
	}
	
	public void atualizarLista(String[] pessoas)
	{
	    AreaInscritos.setText(""); 
	    if(pessoas == null || pessoas.length == 0)
	    {
	        AreaInscritos.setText("Nenhuma pessoa associada a este evento."); 
	        return; 
	    }
	    for(String p : pessoas)
	    {
	        AreaInscritos.append(p + "\n"); 
	    }
	}
	    public void mostrarMensagem(String mensagem)
	    {
	        JOptionPane.showMessageDialog(null, mensagem);
	    }
	    
	    
    }

