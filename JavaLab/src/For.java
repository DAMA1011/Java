
public class For {

	public static void main(String[] args) {
// 今日課程
		{
			   // (初值設定;判斷條件;次數控制)
			for (int i = 1; i <= 100; i++) {
				System.out.println(i); // 重複執行的程式
			}
		}
		{
			int i = 1;
			for ( ; i <= 100; i++) {
				System.out.println(i);
			}
			System.out.println("finally i = "+ i);
		}
		{
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				System.out.println(i);
				sum = sum + i;
				// i = 1，sum = 0 + 1 = 1
				// i = 2，sum = 1 + 2 = 3
				// i = 3，sum = 3 + 3 = 6
			}
			System.out.println("總和 = "+ sum);
		}
		
		// 計算 1 到 100，所有奇數的總和
		{
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i%2 == 0) {
					continue;
				}
				System.out.println(i);
				sum = sum + i;
			}
			System.out.println("奇數總和 = "+ sum);
		}
		{
			int sum = 0;
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
				sum = sum + i;
			}
			System.out.println("奇數總和 = "+ sum);
		}
		
		// 印出 99 乘法表
		{
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					// ln: line的意思
					System.out.print(i+ "X"+ j+ "="+ i*j+ "\t");
				}
				System.out.println(); // 每印完一個 i 就換行
			}
		}
	}

}
