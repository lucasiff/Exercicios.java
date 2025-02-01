package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

import view.TelaCadastroPessoas;
import util.BD;
import model.Pessoa;

public class CadastrarPessoa extends MouseAdapter
{
	TelaCadastroPessoas tela;
	BD assistente;
	
	public CadastrarPessoa(TelaCadastroPessoas t, BD assistente)
	{
        this.tela = t;
        this.assistente = assistente ;
        JButton botao = tela.getbotao();
        botao.addMouseListener(this); 
        
    }
	
	
	 @Override
     public void mouseClicked(MouseEvent e)
     {
		String nome,cpf,email;
		
		  nome = tela.getNome();
		  cpf = tela.getCpf();
		  email = tela.getEmail();
		  if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty())
		  {
	            tela.mostrarMensagem("Por favor, preencha todos os campos.");
	            return; 
		  }
		  Pessoa p = new Pessoa(nome, cpf, email);
	        assistente.salvar(p);
	        tela.limparCampos(); 
	        tela.mostrarMensagem("Pessoa salva com sucesso!");
	 }

}
