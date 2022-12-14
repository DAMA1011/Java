package array;

public class TestArray {

	public static void main(String[] args) {

		{
			// 陣列本身是物件
			int[] ages = new int[10];

			ages[0] = 1; // 位置從 0 起算，會有預設值 0
			ages[1] = 2;
			ages[2] = 3;
			// [0]...[9]

			System.out.printf("第一個 = %d%n", ages[0]);

			// 屬性 length: 取陣列長度
			System.out.printf("長度 = %d%n", ages.length);
		}

		{
			int[] ages = { 1, 2, 3 }; // 使用大括號產生陣列並指定初值
			ages[0] = 1; // 位置從 0 起算，會有預設值 0
			ages[1] = 2;
			ages[2] = 3;

			System.out.printf("第二個 = %d%n", ages[1]);

			System.out.printf("長度 = %d%n", ages.length);
		}

		// 多維陣列:
		{
			int[][] x = new int[5][4];
			x[0][0] = 1;
			x[1][1] = 2;
			x[2][2] = 3;
			System.out.printf("x[%d][%d] = %d%n", 2, 2, x[2][2]);
			System.out.printf("有%d排%n", x.length); // 表示排數
			System.out.printf("第一排有%d個%n", x[0].length); // 表示第幾排有幾個
		}

		{
			// int[][] x = new int [5][4]; // 列 x 行;第一個代表有幾排，第二個代表有幾個
			int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			// 第一排 第二排 第三排
			x[0][0] = 1;
			x[1][1] = 2;
			x[2][2] = 3;
			System.out.printf("x[%d][%d]=%d%n", 2, 2, x[2][2]);
			System.out.printf("有%d排%n", x.length); // x.length 沒有括號，表示排數
			System.out.printf("第一排有%d個%n", x[0].length); // x[i].length 表示第幾排有幾個

			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					System.out.printf("x[%d][%d] = %d%n", i, j, x[i][j]);
				}
			}
			// for-each 迴圈
			int[] nums = { 1, 2, 3, 4, 5, 6 }; // 沒有計數器功能
			for (int item : nums) {
				System.out.println(item);
			}
			// int[] item = x[0]
			for (int[] item : x) {
				// int value = item[0]
				for (int value : item) {
					System.out.println(value);
				}

			}

		}

	}

}
