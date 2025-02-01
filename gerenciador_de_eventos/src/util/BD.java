package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

import model.Pessoa;
import model.Evento;
import model.PessoaEvento;

public class BD
{
	String path;
	public BD(String path)
	{
		this.path = path;
	}
	
	public void salvar(Object obj)
	{
		BufferedWriter arq;
		
		try
		{
			if(obj instanceof Pessoa)
			{
				arq = new BufferedWriter(new FileWriter(path+"pessoa.txt",true));
				arq.write(((Pessoa)obj).getCpf()+"|"+((Pessoa)obj).getNome()+"|"+((Pessoa)obj).getEmail());
				arq.newLine();
				arq.close();
			}
			if(obj instanceof Evento)
			{
				arq = new BufferedWriter(new FileWriter(path+"evento.txt",true));
				arq.write(((Evento)obj).getNome()+"|"+((Evento)obj).getTipo()+"|"+((Evento)obj).getLocal()+"|"+"\n");
				arq.close();
			}
			if(obj instanceof PessoaEvento)
			{
				arq = new BufferedWriter(new FileWriter(path+"pessoa_evento.txt",true));
				arq.write(((PessoaEvento)obj).getPessoa().getCpf()+"|"+((PessoaEvento)obj).getEvento().getNome()+"|"+"\n");
				arq.close();
			}
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public Object[] obterLista(String tipo)
	{
		ArrayList<Object> lista = new ArrayList<>();
        int cont = 0;
        BufferedReader arq;
        String linha;
        StringTokenizer tokens;
        try 
        {
            if(tipo.equals("Pessoa"))
            {
                arq = new BufferedReader(new FileReader(path+"pessoa.txt"));
                while(arq.ready())
                {
                    linha = arq.readLine();
                    tokens = new StringTokenizer(linha,"|");
                    String cp = tokens.nextToken();
                    String np = tokens.nextToken();
                    String ep = tokens.nextToken();
                    Pessoa p = new Pessoa(np, cp, ep);
                    lista.add(p);
                    cont++;
                }
                arq.close();
            }
            if(tipo.equals("Evento"))
            {
                arq = new BufferedReader(new FileReader(path+"evento.txt"));
                while(arq.ready())
                {
                    linha = arq.readLine();
                    tokens = new StringTokenizer(linha,"|");
                    String na = tokens.nextToken();
                    String ta = tokens.nextToken();
                    String la = tokens.nextToken();
                    Evento a = new Evento(na, ta, la);
                    lista.add(a);
                    cont++;
                }
                arq.close();
            }
            if(tipo.equals("PessoaEvento")) 
            {
                arq = new BufferedReader(new FileReader(path+"pessoa_evento.txt"));
                while(arq.ready())
                {
                    linha = arq.readLine();
                    tokens = new StringTokenizer(linha,"|");
                    String cp = tokens.nextToken();
                    String na = tokens.nextToken();
                    Pessoa pessoa = buscarPessoaPorCPF(cp);
                    Evento evento = buscarEventoPorNome(na);
                    if (pessoa != null && evento != null)
                    {
                        PessoaEvento pa = new PessoaEvento(pessoa, evento);
                        lista.add(pa);
                        cont++;
                        
                        System.out.println("PessoaEvento criado: " + pessoa.getNome() + " inscrito no evento " + evento.getNome());
                    }
                    else
                    {
                        System.out.println("Pessoa ou evento nulo: " + cp + ", " + na);
                    }
                        
                    
                }
                arq.close();
            }
           
        }
        
        
        catch(Exception e) 
        {
            e.printStackTrace();
        }

        return lista.toArray();
    }

    public int obterTamanho(String tipo)
    {
        int i=0;
        Object[] lista = obterLista(tipo);
        for(i=0;i<lista.length;i++)
            try
            {
                String s=lista[i].toString();
            }
            catch(NullPointerException e)
            {
                break;
            }
        return i;
    }
    
    public Pessoa buscarPessoaPorCPF(String cpf) {
        System.out.println("Buscando pessoa com CPF: " + cpf);
        Object[] listaPessoa = this.obterLista("Pessoa");
        for (Object obj : listaPessoa) {
            if (obj instanceof Pessoa) {
                Pessoa pessoa = (Pessoa) obj;
                System.out.println("Comparando com CPF: " + pessoa.getCpf());
                if (pessoa.getCpf().equals(cpf)) {
                    System.out.println("Pessoa encontrada: " + pessoa.getNome());
                    return pessoa;
                }
            }
        }
        System.out.println("Nenhuma pessoa encontrada com CPF: " + cpf);
        return null;
    }

    public Evento buscarEventoPorNome(String nome) {
        System.out.println("Buscando evento com nome: " + nome);
        Object[] listaEvento = this.obterLista("Evento");
        for (Object obj : listaEvento) {
            if (obj instanceof Evento) {
                Evento evento = (Evento) obj;
                System.out.println("Comparando com nome do evento: " + evento.getNome());
                if (evento.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Evento encontrado: " + evento.getNome());
                    return evento;
                }
            }
        }
        System.out.println("Nenhum evento encontrado com nome: " + nome);
        return null;
    }
}

