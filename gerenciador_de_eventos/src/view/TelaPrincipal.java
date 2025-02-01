package view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

import util.BD;
import controller.CadastrarPessoa;
import controller.CadastrarEvento;
import controller.AssociarPessoaEvento;
import controller.ListarInscritos;

public class TelaPrincipal extends JFrame 
{
	JTabbedPane abas;
	TelaCadastroPessoas cadastrar_p;
	TelaCadastroEventos cadastrar_e;
	TelaAssociarPessoaEvento associar_p_e;
	TelaListarInscritos listar;
	BD assistente;
	
	public TelaPrincipal()
	{
	  cadastrar_p = new TelaCadastroPessoas();
	  cadastrar_e = new TelaCadastroEventos();
	  associar_p_e = new TelaAssociarPessoaEvento();
	  listar = new TelaListarInscritos();
	  
      assistente = new BD("C:./");
      
      CadastrarPessoa cadastrarPessoa = new CadastrarPessoa(cadastrar_p, assistente);
      CadastrarEvento cadastrarEvento =  new CadastrarEvento(cadastrar_e,assistente);
      AssociarPessoaEvento associar = new AssociarPessoaEvento(associar_p_e,assistente);
      ListarInscritos lista = new ListarInscritos(listar,assistente);

	  this.setSize(600,300);
	  this.setTitle("Controle de Eventos");
	  this.setResizable(false);
	  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  abas = new JTabbedPane(); 
	  abas.addTab("Cadastrar Pessoas", cadastrar_p.getPessoas());
	  abas.addTab("Cadastrar Evento", cadastrar_e.getEventos());
	  abas.addTab("Inscrever Pessoas em Eventos", associar_p_e.getAssociar());
	  abas.addTab("Listar Inscritos", listar.getLista());
	  this.add(abas);
	  this.setVisible(true); 
	}
	public static void main(String[] args)
	{
		TelaPrincipal tela = new TelaPrincipal();
		
	
	}

}
