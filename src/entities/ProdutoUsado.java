package entities;

public class ProdutoUsado extends Product {

	private String data;
	
	
	
	public ProdutoUsado() {}
	

	public ProdutoUsado(String name, int price, String data) {
		super(name, price);
		this.data = data;
	}
	@Override
	public String priceTag() {
		return super.priceTag() + " data: " + data;
		
	}
	
	
}
