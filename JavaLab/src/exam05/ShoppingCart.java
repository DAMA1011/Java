package exam05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

	public static void main(String[] args) {
		List<Product> shoppingList = new ArrayList<Product>();
		// 實作1.加入二台 Notebook 跟一個 Food 至 shoppingList 中
		// Notebook("Asus",30000), Notebook("Acer",20000), Food("Cookie",200)
		Product p1 = new Product("Asus", 30000);
		Product p2 = new Product("Acer", 20000);
		Product p3 = new Product("Cookie", 200);
		shoppingList.add(p1);
		shoppingList.add(p2);
		shoppingList.add(p3);

		// 實作2.利用 for 迴圈，計算 shoppingList 中的總金額,並印在 Console 中
//		int sum = 0;
//		for each 迴圈
		
//		System.out.printf("總金額: %d%n", sum);
		
//	if (it instanceof type) {
//		type new_name = (type) it;
//		
//	}

		// 實作3.利用 for 迴圈，加總 shoppingList 中是 Notebook 型態的總金額,並印在 Console 中
//		System.out.println(p3.getPrice());
		
	}

}
