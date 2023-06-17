package entities;

public class PessoaFisica extends Pessoa{
	protected int gastoSaude;

	public PessoaFisica(String nome, int rendaAnual, int gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public String mostrar() {
		int total = 0;
		if (rendaAnual <= 20000) {
			
			total = (int) (rendaAnual * 0.15);
		}
		if (rendaAnual > 20000) {
			
			total = (int)  (rendaAnual * 0.25);
		}
		if (gastoSaude > 0) {
			total = (int) (total - (gastoSaude * 0.5));
			
		}
		return nome + ", " + total;
	}
	
}