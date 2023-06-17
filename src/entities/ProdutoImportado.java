package entities;

public class ProdutoImportado extends Product{

	private int taxa;

	public ProdutoImportado(String name, int price, int taxa) {
		super(name, price);
		this.taxa = taxa;
	}
	public int calcTotal() {
		return taxa * price;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag() + " taxa: " + taxa;
		
	}
}
