package view;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;


public class TelaAssociarPessoaEvento 
{
	private JPanel Associar;
	private JTextField Cpf;
	private JTextField Evento;
	private JButton botao;
	
	public TelaAssociarPessoaEvento()
	{
		Associar = new JPanel();
		Associar.setLayout(null);
		Associar.setBackground(new Color(50,200,255));
		JLabel LabelCpf = new JLabel("CPF");
		Cpf = new JTextField(10);
		LabelCpf.setBounds(10,20,50,25);
		Cpf.setBounds(70,20,100,25);
		JLabel LabelEvento = new JLabel("Evento");
		Evento = new JTextField(50);
		LabelEvento.setBounds(10,60,200,25);
		Evento.setBounds(70,60,300,25);
		Associar.add(LabelCpf);
		Associar.add(Cpf);
		Associar.add(LabelEvento);
		Associar.add(Evento);
		botao = new JButton("Associar");
		botao.setSize(100,30);
		botao.setLocation(30,150);
		Associar.add(botao);
	}
	
	public String getCpf()
	{
		return Cpf.getText();
	}
	
	public String getEvento()
	{
		return Evento.getText();
	}
	public JButton getbotao()
	{
		return botao;
	}
	public JPanel getAssociar()
	{
		return Associar;
	}
	
	 public void adicionarOuvinteAssociar(MouseAdapter ouvinte) {
	        botao.addMouseListener(ouvinte);
	    }

	    public void mostrarMensagem(String mensagem) {
	        JOptionPane.showMessageDialog(null, mensagem);
	    }

	    public void limparCampos() 
	    {
	        Cpf.setText("");
	        Evento.setText("");
	        
	    }

}
