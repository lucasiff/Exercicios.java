package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

import view.TelaCadastroEventos;
import util.BD;
import model.Evento;

public class CadastrarEvento extends MouseAdapter
{
	TelaCadastroEventos tela;
	BD assistente;
	
	public CadastrarEvento(TelaCadastroEventos t, BD assistente)
	{
		this.tela = t;
		this.assistente = assistente;
		JButton botao = tela.getbotao();
		botao.addMouseListener(this);
	}
			

	
	 @Override
     public void mouseClicked(MouseEvent e)
     {
		 String nome,tipo,local;
			
			nome = tela.getNome();
			tipo = tela.getTipo();
			local = tela.getLocal();
		  if (nome.isEmpty() || tipo.isEmpty() || local.isEmpty())
		  {
	            tela.mostrarMensagem("Por favor, preencha todos os campos.");
	            return; 
		  }
		  Evento a = new Evento (nome, tipo, local);
	        assistente.salvar(a);
	        tela.limparCampos(); 
	        tela.mostrarMensagem("Evento salvo com sucesso!");
		
	}

}
