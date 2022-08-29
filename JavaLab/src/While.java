
public class While {

	public static void main(String[] args) {
// 今日課程
		{
			int i = 0;
			int sum = 0;
			while (i <= 100) {
				sum += i;
				i++;
			}
			System.out.println("總和 = " + sum);

			i = 0; // 給值，不能重複宣告
			sum = 0; // 給值，不能重複宣告
			do { // 至少會執行一次
				sum += i;
				i++;
			} while (i <= 100);
			System.out.println("總和 = " + sum);
		}

		// 取亂數，直到大於5
		{
			double random; // 0~1 的浮點數
			do {
				random = Math.random() * 10;
				System.out.println(random);
			} while (random < 5);
		}

	}

}
