package view;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;


public class TelaCadastroEventos 
{
	private JPanel Eventos;
	private JTextField Nome;
	private JTextField Tipo;
	private JTextField Local;
	private JButton botao;
	
	public TelaCadastroEventos() 
	{
		Eventos = new JPanel();
		Eventos.setLayout(null);
		Eventos.setBackground(Color.GREEN);
		JLabel LabelNome = new JLabel("Nome");
		Nome = new JTextField(50);
		JLabel LabelTipo = new JLabel("Tipo");
		Tipo = new JTextField(10);
		JLabel LabelLocal = new JLabel("Local");
		Local = new JTextField(50);
		LabelNome.setBounds(10,20,50,25);
		Nome.setBounds(70,20,300,25);
		LabelTipo.setBounds(10,60,200,25);
		Tipo.setBounds(70,60,100,25);
		LabelLocal.setBounds(10,100,200,25);
		Local.setBounds(70,100,300,25);
		Eventos.add(LabelNome);
		Eventos.add(Nome);
		Eventos.add(LabelTipo);		
		Eventos.add(Tipo);
		Eventos.add(LabelLocal);
		Eventos.add(Local);
		botao = new JButton("Salvar");
		botao.setSize(100,30);
		botao.setLocation(30,150);
		Eventos.add(botao);
	}

	public String getNome()
	{
		return Nome.getText();
	}
	public String getTipo()
	{
		return Tipo.getText();
	}
	public String getLocal()
	{
		return Local.getText();
	}
	public JButton getbotao()
	{
		return botao;
	}
	public JPanel getEventos()
	{
	    return Eventos;
	}
	
	public void adicionarOuvinteCadastrar(MouseAdapter ouvinte)
	{
        botao.addMouseListener(ouvinte);
    }

    public void mostrarMensagem(String mensagem)
    {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void limparCampos() 
    {
        Nome.setText("");
        Tipo.setText("");
        Local.setText("");
    }
	
}
