package extend;

// 如果改為抽象類別(abstract class)，要變成 public abstract class Product
public class Product {

	public static final double TAX = 0.05; // 定義常數，需全大寫

	static {
		// ex.從檔案載入一些一次性設定
		System.out.println("只執行一次");
	}

	protected String name;
	protected int price;
	// String name; // 預設(no modifier)，父子類別需在同一個 package
	// int price; // 預設(no modifier)，父子類別需在同一個 package

	// 產生 Constructor
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product() {

	}

	// 產生 abstract: 沒有實作，只有定義，須把該類別(class)加上 abstract
	// public abstract int calc(int quantity);

	// description: 描述此商品
	public String disc() {
		String info = String.format("商品名稱: %s, 售價: NT$%d元", name, price);
		return info;
	}

	// 產生 Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
