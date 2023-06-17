package entities;

public class Product {


		private String name;
		protected Integer price;
		
		public Product() {
			
		}
		
		public Product(String name, int price) {
			this.name = name;
			this.price = price;
		}
		public String priceTag() {
			return " Produto: " + name + ", preço: " + price;
			
		}
		
		
	}


