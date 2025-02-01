package model;

public class PessoaEvento
{
	private Pessoa pessoa;
	private Evento evento;
	
	public PessoaEvento(Pessoa pessoa, Evento evento)
	{
		this.pessoa = pessoa;
		this.evento = evento;
	}
	
	public Pessoa getPessoa()
	{
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa)
	{
		this.pessoa = pessoa;
	}
	
	public Evento getEvento()
	{
		return evento;
	}
	
	public void setEvento(Evento evento)
	{
		this.evento = evento;;
	}
	
	 @Override
	    public String toString() {
	        return "Pessoa: " + pessoa.getCpf() + " associada ao Evento: " + evento.getNome();
	    }

}

