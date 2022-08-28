// 流程控制: For
public class ForControl {

	public static void main(String[] args) {

//		  語法:
//		  	for ( 初值設定 ; 判斷條件 ; 次數控制 ){
//		  		重複執行的程式;
//		  	}

		{
			for (int i = 1; i <= 100; i++) {
				// repeat code
				System.out.println(i);
				// 這個變數 i 只能用在 for 迴圈的 block 裡，一旦離開 block，就不能再用
			}
		}

		{
			int i = 1;
			for (; i <= 100; i++) {
				System.out.println(i);
			}
			System.out.println("Finally i = " + i);
		}

		// 計算 1 加到 100 的總和:
		{
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i; // sum = sum + i
				// i = 1, sum = 0 + 1 = 1
				// i = 2, sum = 1 + 2 = 3
				// i = 3, sum = 3 + 3 = 6
			}
			System.out.println("1加到100的總和 = " + sum);
		}

		// 計算 1 到 100 中，所有奇數的總和:
		{// ex1:
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 1) {
					sum += i;
				}
			}
			System.out.println(sum);
		}
		{// ex2:(較好)
			int sum = 0;
			for (int i = 1; i <= 100; i += 2) {
				sum += i;
			}
			System.out.println(sum);
		}
		{// ex3:
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum = sum + (i % 2 == 1 ? i : 0); // 利用三元運算
			}
			System.out.println(sum);
		}

		// continue / break:
		{
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0) {
					continue; // 如果是偶數，跳過下方程式，繼續下一個迴圈
				}
				if (i >= 50) {
					break; // 加到大於等於 50 就中斷迴圈
				}
				System.out.println("i = " + i);
				sum += i;
			}
			System.out.println(sum);
		}

		// 9*9乘法表:
		{
			// 1x1=1 1x2=2 ... 1x9=9
			// 2x1=2 2x2=4 ... 2x9=18
			// 9x1=9 9x2=18 ... 9x9=81
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i + " x " + j + " = " + i * j + "\t"); // ln: line 換行
				}
				System.out.println(); // 執行換行
			}

		}

	}

}
