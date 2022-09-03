
public class TestString {

	public static void main(String[] args) {

		// 使用 == 比較字串時，是比較記憶體位置是否相同
		String name = "Vincent";
		String name1 = "Vincent";
		System.out.println(name == name1); // 在同一個記憶體位置

		// new String(很少用)
		String name2 = new String("Vincent");
		System.out.println(name == name2); // 在不同的記憶體位置

		// 真正比較字串內容是否相同: equals
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));

		// 回傳字串長度
		System.out.println("abc中文".length());

		// 尋找字串中是否包含指定的字，回傳符合的位置，位置從 0 起算，找不到時回傳 -1
		System.out.println("abc中文".indexOf("bc")); // 1
		System.out.println("abc中文".indexOf("bcd")); // -1

		// 尋找字串中是否包含指定的字
		System.out.println("abc中文".contains("bcd"));

		// 指定頭的位置，後面全取，位置從0起算
		System.out.println("abc中文".substring(2));
		// 頭尾都指定，但尾巴的字不算進去
		System.out.println("abc中文".substring(2, 4));

		// String.format()，一個 %，對應一個值
		double salary = 300.1567;
		String message = String.format("salary = $%.1f", salary);
		System.out.println(message);
		String message1 = String.format("%s salary = $%.1f", "David", salary);
		System.out.println(message1);
		String message2 = String.format("%s salary = $%.1f, 借出%d元", "David", salary, 10);
		System.out.println(message2);
		// printf 沒有換行功能，要在內部加一個 %n
		System.out.printf("%s salary = $%.1f, 借出%d元%n", "David", salary, 10);
		// template，
		System.out.printf("%n");
	}

}
