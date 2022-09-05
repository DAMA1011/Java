package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {

		Product pd = new Product("筆記本", 50);
		System.out.printf("名稱: %s, 價錢: %d%n", pd.getName(), pd.getPrice());

//		多型: Notebook, Product
//		Product nb = new Notebook("Asus", 30000, 365);
		Notebook nb = new Notebook("Asus", 30000, 365);
		System.out.printf("名稱: %s, 價錢: %d%n", nb.getName(), nb.getPrice());
		System.out.println(nb.name); // 同一個 package 才能有 protected 效果
		System.out.println(nb.desc());
		System.out.println(nb.getWarranty());
		
//		多型範例:
		Product item = nb; // Notebook 是 Product 的一種嗎? : 是
		System.out.println(item.desc());
//		            就像是 Product.desc()，但實際是呼叫 Notebook 裡面的 desc()
				
//		強制轉型:
		Notebook item2 = (Notebook)item; // Product 是　Notebook 的一種嗎?
//		強制轉型發生失敗: 須加上 if 條件做檢查
		if (item instanceof Food) {
//			如果 item 有 Food 型態，才做強制轉型，避免發生問題
			Food item3 = (Food)item; // Product 是 Food 的一種嗎?			
		}

//		Product 裡面沒有 getWarrenty 所以無法呼叫
//		System.out.println(item.getWarranty());		

//		buy(nb)

//		GregorianCalendar 代表西曆
//		GregorianCalendar calendar = new GregorianCalendar(2022,8,5); // 因為 0 起算。所以要打 8，才會跳成 9 月 
		GregorianCalendar calendar = new GregorianCalendar(2022, Calendar.SEPTEMBER, 5);
//		getTime() 可以取得 Date 物件，Date 物件是 calendar 程式幫你產生在 heap 區
		Date expDate = calendar.getTime();

		Food f = new Food("肉圓", 50, expDate);
		System.out.println(f.desc());

//		buy(f);

//		很多商品: 利用陣列以及多型
		Product[] ps = { nb, f };
		buy(ps);
	}

//	public static void buy(Notebook nb) {
//		System.out.println("買入: " + nb.desc());
//		
//	}
//	
//	public static void buy(Food f) {
//		System.out.println("買入: " + f.desc());
//		
//	}

// 多型的使用時機:	Notebook, Food 都是 Product 的子類別型態，所以用父類別型態即可
	public static void buy(Product[] items) {
		int sum = 0;
		for (int i = 0; i < items.length; i++) {
			Product p = items[i];
			System.out.println("買入: " + p.desc());
			sum += p.getPrice();
		}
		System.out.printf("總金額: %d%n", sum);

	}

}
