package encap;

public class Car {

	private String model;
	private String color;
	private int price;

	// Constructor: 建構方法
	public Car(String color) {
		// Overloaded Constructors
		this("Yaris", color); // 只能在建構方法的底下呼叫建構方法
		// 屬性的預設值
		// this.color = color; // 跟下方 Car(String model, String color) 重複了
	}

	// 可以設定屬性的預設值
	// public Car() {
	// this.color = "黑色";
	// }

	public Car(String model, String color) {
		// this.model = model; // 跟下方的 setModel(String model) 重複了
		setModel(model); // 要呼叫下方的 setModel，才會把 price 帶入
		this.color = color;
	}

	// 設定 model 屬性的方法
	public void setModel(String model) {
		// 把傳入的參數 model 設到屬性 model 上
		// this.: 會明確指定為屬性，意思為目前這個物件的屬性
		this.model = model;

		// 在這邊設定控制內容
		// equals: 要進行逐字比較，必須使用 equals，不能使用 ==
		if (model.equals("Prius")) {
			price = 1099000;
		} else if (model.equals("Yaris")) {
			price = 575000;
		} else {
			System.out.println("型號設定有錯");
		}

	}

	// 取得 model 屬性值得方法
	public String getModel() {
		return model; // 也可以寫 this.model

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;

	}

}
