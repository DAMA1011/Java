package exam05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

	public static void main(String[] args) {
		List<Product> shoppingList = new ArrayList<Product>();
		// 實作1.加入二台 Notebook 跟一個 Food 至 shoppingList 中
		// Notebook("Asus",30000), Notebook("Acer",20000), Food("Cookie",200)
		Product p1 = new Notebook("Asus", 30000);
		Product p2 = new Notebook("Acer", 20000);
		Product p3 = new Food("Cookie", 200);
		shoppingList.add(p1);
		shoppingList.add(p2);
		shoppingList.add(p3);
		
//		shoppingList.add(new Notebook("Asus", 30000));
//		shoppingList.add(new Notebook("Acer", 20000));
//		shoppingList.add(new Food("Cookie", 200));

		// 實作2.利用 for 迴圈，計算 shoppingList 中的總金額,並印在 Console 中
		int sum = 0;
		for (Product pd : shoppingList) {
			sum += pd.getPrice();
		}
		System.out.printf("總金額: %d%n", sum);
		
		// 實作3.利用 for 迴圈，加總 shoppingList 中是 Notebook 型態的總金額,並印在 Console 中
		int sumN = 0;
		for (Product pd : shoppingList) {		
			if (pd instanceof Notebook) {
				Notebook nb = (Notebook)pd;
				sumN += nb.getPrice();
			}
		}
		System.out.printf("Notebook 的總金額: %d%n", sumN);
		
	}

}
