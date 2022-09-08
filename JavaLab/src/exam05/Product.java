package exam05;

public class Product {

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	private String name; //商品名稱
	private int price; // 商品價錢

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}
