package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.util.ArrayList;

import util.BD;
import view.TelaListarInscritos;
import model.PessoaEvento;
import model.Pessoa;

public class ListarInscritos extends MouseAdapter
{
    private TelaListarInscritos tela;
    private BD assistente;

    public ListarInscritos(TelaListarInscritos tela, BD assistente)
    {
        this.tela = tela;
        this.assistente = assistente;
        JButton botao = tela.getbotao();
        botao.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        String nomeEvento = tela.getEvento();
        if (nomeEvento.isEmpty()) {
            tela.mostrarMensagem("Por favor, insira o nome do evento.");
            return;
        }

        PessoaEvento[] inscritos = buscarInscritosPorEvento(nomeEvento);
        if (inscritos.length == 0)
        {
            tela.mostrarMensagem("Nenhuma pessoa associada a este evento.");
        } else {
            String[] listaNomes = new String[inscritos.length];
            for (int i = 0; i < inscritos.length; i++)
            {
                listaNomes[i] = "Nome: " + inscritos[i].getPessoa().getNome() + 
                                ", CPF: " + inscritos[i].getPessoa().getCpf() + 
                                ", E-mail: " + inscritos[i].getPessoa().getEmail();
            }
            tela.atualizarLista(listaNomes);
        }
    }

    private PessoaEvento[] buscarInscritosPorEvento(String nomeEvento)
    {
        Object[] lista = assistente.obterLista("PessoaEvento");
        ArrayList<PessoaEvento> inscritos = new ArrayList<>();
        nomeEvento = nomeEvento.trim();

        for (Object obj : lista)
        {
            if (obj instanceof PessoaEvento)
            {
                PessoaEvento pe = (PessoaEvento) obj;
                String nomeDoEvento = pe.getEvento().getNome().trim();
             
                    System.out.println("Comparando evento buscado: " + nomeEvento + " com " + nomeDoEvento+"'");

                    if (nomeDoEvento.equalsIgnoreCase(nomeEvento))
                    {
                        inscritos.add(pe);
                        System.out.println("Inscrição encontrada para: " + pe.getPessoa().getNome());
                    }
                    else
                    {
                        System.out.println("Nome do evento não corresponde: " + nomeDoEvento);
                    }
                } 
            }
        
        System.out.println("Total de inscritos encontrados: " + inscritos.size());
        return inscritos.toArray(new PessoaEvento[0]);
    }
}
    