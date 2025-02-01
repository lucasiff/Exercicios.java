package model;

public class Evento
{
	private String Nome;
	private String Tipo;
	private String Local;
	
	public Evento(String Nome, String Tipo, String Local)
	{
		this.Nome = Nome;
		this.Tipo = Tipo;
		this.Local = Local;
	}
	
	public Evento(String nome)
	{
        this.Nome = Nome;
    }
	public String getNome()
	{
		return Nome;
	}
	
	public void setNome(String Nome)
	{
		this.Nome = Nome;
	}
	
	public String getTipo()
	{
		return Tipo;
	}
	
	public void setTipo(String Tipo)
	{
		this.Tipo = Tipo;
	}
	
	public String getLocal()
	{
		return Local;
	}
	
	public void setLocal(String Local)
	{
		this.Local = Local;
	}
	
	 @Override
	    public String toString()
	 {
	        return "Evento: " + Nome + ",Tipo: " + Tipo + ",Local: " + Local;
	 }
}
		
	


