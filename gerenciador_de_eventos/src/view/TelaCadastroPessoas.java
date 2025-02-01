package view;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

public class TelaCadastroPessoas
{
	private JPanel Pessoas;
	private JTextField Nome;
	private JTextField Cpf;
	private JTextField Email;
	private JButton botao;

	
	TelaCadastroPessoas()
	{
		Pessoas = new JPanel();
		Pessoas.setLayout(null);
		Pessoas.setBackground(Color.YELLOW);
		JLabel LabelNome = new JLabel("Nome");
		Nome = new JTextField(50);
		JLabel LabelCpf = new JLabel("CPF");
		Cpf = new JTextField(10);
		JLabel LabelEmail = new JLabel("E-mail");
		Email = new JTextField(50);
		LabelNome.setBounds(10,20,50,25);
		Nome.setBounds(70,20,300,25);
		LabelCpf.setBounds(10,60,200,25);
		Cpf.setBounds(70,60,100,25);
		LabelEmail.setBounds(10,100,200,25);
		Email.setBounds(70,100,300,25);
		Pessoas.add(LabelNome);
		Pessoas.add(Nome);
		Pessoas.add(LabelCpf);		
		Pessoas.add(Cpf);
		Pessoas.add(LabelEmail);
		Pessoas.add(Email);
		botao = new JButton("Salvar");
		botao.setSize(100,30);
		botao.setLocation(30,150);
		Pessoas.add(botao);	
		Pessoas.setVisible(true);
	}
	
	
	public String getNome()
	{
		return Nome.getText();
	}
	public String getCpf()
	{
		return Cpf.getText();
	}
	public String getEmail()
	{
		return Email.getText();
	}
	public JButton getbotao()
	{
		return botao;
	}
	public JPanel getPessoas()
	{
		
		 return Pessoas;
	}
	
	 public void adicionarOuvinteCadastrar(MouseAdapter ouvinte) {
	        botao.addMouseListener(ouvinte);
	    }

	    public void mostrarMensagem(String mensagem) {
	        JOptionPane.showMessageDialog(null, mensagem);
	    }

	    public void limparCampos() 
	    {
	        Nome.setText("");
	        Cpf.setText("");
	        Email.setText("");
	    }
	}
