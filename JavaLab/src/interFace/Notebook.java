package interFace;

//            子類別            父類別
public class Notebook extends Product implements Warrantable {

	public int warranty; // 保固天數

	@Override
	public int 保固天數() { // 改寫父類別的內容
		return this.warranty;
	}

	// 產生 Constructor
	public Notebook(String name, int price, int warranty) {

		super(name, price); // 手動呼叫父類別，須在第一行，可不用寫 this.namme/price
		// super(); 隱藏呼叫父類別，須在第一行，呼叫 public Product()

		// this.name = name; // 父類別改成 private，就不能用 this.
		// setName(name); // 父類別改成 protected，就可以用 this.

		// this.price = price; // 父類別改成 private，就不能用 this.
		// setPrice(price); // 父類別改成 protected，就可以用 this.

		this.warranty = warranty;
	}

	// 產生 Override
	@Override // 另一種註解，協助檢查語法，側邊有向上箭號，可以開啟父類別所在位置
	public String desc() { // 改寫父類別的 description 內容
		String info = String.format("商品名稱: %s, 售價: NT$ %d元, 保固 %d 天", name, price, warranty);
		return info;
	}
	// 先拿到父類別產生的文字(super.desc())，再針對該文字進行加工，此寫法比上方的好，當修改父類別時，可以同時修改所有子類別
//	public String disc() {
//		String infoFromSuper = super.desc();
//		String info = String.format("%s, 保固 %d天", infoFromSuper, warranty);
//		return info;
//	}

	// 產生 Getter and Setter
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
