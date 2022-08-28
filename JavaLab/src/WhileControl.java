// 流程控制: While
public class WhileControl {

	public static void main(String[] args) {

//		  語法:
//			while ( 判斷條件 ){
//				重複執行的程式;
//			}

		// 計算 1 加到 100 的總和:
		{
			int i = 0;
			int sum = 0;
			while (i <= 100) {
				sum += i;
				i++;
			}
			System.out.println("1加到100的總和 = " + sum);
		}

		// do while:
		{
			int i = 0;
			int sum = 0;
			do { // 至少會執行 block 中的程式一次
				sum += i;
				i++;
			} while (i <= 100);
			System.out.println("1加到100的總和 = " + sum);
		}

		// 取亂數，直到大於5:
		{
			double random;
			do {
				random = Math.random() * 10; // 0~1 的亂數
				System.out.println(random);
			} while (random < 5);
		}

	}

}
