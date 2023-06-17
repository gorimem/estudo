package entities;

public class Pessoa {

	
	protected String nome;
	protected int rendaAnual;
	
	public Pessoa(String nome, int rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	public String mostrar() {
		return nome + ", " + rendaAnual;
	}
}
