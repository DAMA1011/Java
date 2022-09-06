package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		{
			// 介面型態 List
			List list = new ArrayList();
			list.add("Hello");
			list.add("World");

			// 做出 3.0 的物件(boxing): list.add(3.0);
			Double d = new Double(3.0);
			list.add(d);
			// 取出基本型別的值(unboxing)，才能做加減乘除的運算
			double value = d.doubleValue();
			// Autoboxing:
			// list.add(3.0);
			// 等同 list.add(new Double(3.0));
			// double a = d + 1;
			// 等同 double a = d.doubleValue() + 1;
			String m = "1";
			int n = Integer.parseInt(m); // 文字轉數字
			System.out.println(n + 2);

			// 取得 list 大小
			System.out.printf("Size=%d%n", list.size());
			// 取得 list 內容 get(index)，從 0 起算
			System.out.printf("[%d]=%s%n", 0, list.get(0));
			System.out.printf("[%d]=%s%n", 1, list.get(1));
			System.out.printf("[%d]=%s%n", 2, list.get(2));
			System.out.println(list.contains("Hello")); // 檢查是否含有此值，效率較差(list)

			// for 迴圈取值的方法:
			for (int i = 0; i < list.size(); i++) {
				Object item = list.get(i);
				System.out.println(item);
			}

			// while 迴圈取值的方法，須帶入 Iterable:
			Iterator it = list.iterator(); // shift+alt+l
			while (it.hasNext()) { // 偵測游標下方是否有資料(hasNext())
				Object item = it.next(); // 當偵測完，就把值取出來(next())，一次只取一筆
				System.out.println(item);
			}
			// foreach 迴圈取值的方法:
			for (Object item : list) {
				System.out.println(item);
			}
		}

		{ // 泛型:
			List<String> list = new ArrayList<>();
			list.add("Hello");
			list.add("World");

			for (int i = 0; i < list.size(); i++) {
				String item = list.get(i);
				System.out.println(item);
			}

			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				String item = it.next();
				System.out.println(item);
			}

			for (String item : list) {
				System.out.println(item);
			}

		}

	}

}
