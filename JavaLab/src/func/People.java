package func;

// 類別(設計圖)
public class People {

	// static: 表示該屬性屬於類別，稱為類別成員/靜態屬性
	// final: 不可改變後方內容
	static final double overWeightBMI = 24; // 設定一個常數，一樣是一個屬性
	// 靜態方法不能用到物件屬性，因為不需要物件(new)就可以呼叫

	public static double BMI(double h, double w) {
		System.out.println(People.overWeightBMI);
		return w / (h * h);
	}

	double height; // 屬性
	double weight;

	// 物件屬性跟方法:
	public double getBMI() {
//		double bmi = weight/(height*height);
		double bmi = People.BMI(height, weight);
		return bmi;

	}

}
