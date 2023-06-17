package entities;

public class PessoaJuridica extends Pessoa {

	protected int numeroFuncionarios;

	public PessoaJuridica(String nome, int rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
		
	}
	public String mostrar() {
		int total = 0;
		if (numeroFuncionarios < 10) {
			total = (int) (rendaAnual - (rendaAnual * 0.16));
		}
		if (numeroFuncionarios < 10) {
			total = (int) (rendaAnual - (rendaAnual * 0.14));
		}
		return nome + ", " + total;
		
	}
}
