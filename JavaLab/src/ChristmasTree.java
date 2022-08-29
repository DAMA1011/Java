
public class ChristmasTree {

	public static void main(String[] args) {

		//   *    第一層: 3 空格，1 星
		//  ***   第二層: 2 空格，3 星
		// *****  第三層: 1 空格，5 星
		//******* 第四層: 0 空格，7 星

		int n = 15; // 輸入層數
		
		for (int line = 1; line <= n; line += 1) {
			
			// printspace
			for (int space = n - line; space > 0; space -= 1) {
				System.out.print(" ");
			}
			
			// printstar
			// for (int star = 1 + (line - 1) * 2; star > 0; star -= 1) {
			for (int star = 1; star <= 1 + (line - 1) * 2; star += 1) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
