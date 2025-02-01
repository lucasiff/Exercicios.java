package model;

public class Pessoa
{
	private String Nome;
	private String Cpf;
	private String Email;
	
	public Pessoa(String Nome, String Cpf, String Email)
	{
		this.Nome = Nome;
		this.Cpf = Cpf;
		this.Email = Email;
	}
	
	public Pessoa(String cpf) 
	{
	    this.Cpf = Cpf;
	    this.Nome = "";
	    this.Email = "";
	}
	public String getNome()
	{
		return Nome;
	}
	
	public void setNome(String Nome)
	{
		this.Nome = Nome;
	}
	
	public String getCpf()
	{
		return Cpf;
	}
	
	public void setCpf(String Cpf)
	{
		this.Cpf = Cpf;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	
	
	 @Override
	    public String toString()
	    {
	        return "Nome: " + Nome + ", CPF: " + Cpf + ", E-mail: " + Email;
	    }
}
