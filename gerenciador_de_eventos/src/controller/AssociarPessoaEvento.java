package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

import view.TelaAssociarPessoaEvento;
import util.BD;
import model.Pessoa;
import model.Evento;

import model.PessoaEvento;

public class AssociarPessoaEvento extends MouseAdapter
{
	TelaAssociarPessoaEvento tela;
	BD assistente;
	
	public AssociarPessoaEvento(TelaAssociarPessoaEvento t, BD assistente )
	{
		this.tela = t;
		this.assistente = assistente;
		JButton botao = tela.getbotao();
		botao.addMouseListener(this);
	}
	
	 @Override
     public void mouseClicked(MouseEvent e)
     {
		 String cpf, nome;
			
			cpf = tela.getCpf();
			nome = tela.getEvento();
		  if (cpf.isEmpty() || nome.isEmpty())
		  {
	            tela.mostrarMensagem("Por favor, preencha todos os campos.");
	            return; 
		  }
		  Pessoa pessoa = buscarPessoaPeloCpf(cpf);
	        if (pessoa == null) {
	            tela.mostrarMensagem("Pessoa não encontrada para o CPF informado.");
	            return;
	        }

	       
	        Evento evento = buscarEventoPeloNome(nome);
	        if (evento == null) {
	            tela.mostrarMensagem("Evento não encontrado para o nome informado.");
	            return;
	        }
		  
		  PessoaEvento pa = new PessoaEvento (pessoa, evento);
	        assistente.salvar(pa);
	        tela.limparCampos(); 
	        tela.mostrarMensagem("Pessoa cadastrada como sucesso!");
     }
		
	        private Pessoa buscarPessoaPeloCpf(String cpf)
	        {
	            Object[] lista = assistente.obterLista("Pessoa");
	            for (Object obj : lista)
	            {
	                if (obj instanceof Pessoa)
	                {
	                    Pessoa p = (Pessoa) obj;
	                    if (p.getCpf().equals(cpf))
	                    {
	                        return p;
	                    }
	                }
	            }
	            return null;
	        }

	        private Evento buscarEventoPeloNome(String nomeEvento)
	        {
	            Object[] lista = assistente.obterLista("Evento");
	            for (Object obj : lista)
	            {
	                if (obj instanceof Evento)
	                {
	                    Evento e = (Evento) obj;
	                   
	                    if (e.getNome().trim().equalsIgnoreCase(nomeEvento.trim()))
	                    {
	                        return e;
	                    }
	                }
	            }
	            return null;
	        }
}
