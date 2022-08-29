package func;

public class TestFunc {

	public static void main(String[] args) {
		// 方法呼叫
		int s = add(1, 2); // f5(debug)，快速設定變數: shift+alt+l
		System.out.println(s);
		// 可以拿回傳結果做進一步的計算
		System.out.println(s%2 == 1? "奇數":"偶數");
		
	}
	// 方法定義
	// void: 表示沒有回傳結果，
	// int: 表示回傳的型態是 int，需搭配 return 回傳
	// add: 表示方法的名子
	// a, b: 參數/輸入/input
	public static int add(int a, int b) {
		// 方法實作
		int sum = a + b; // f6(debug)
		System.out.printf("sum = %d%n", sum);
		return sum; 
		
	}
	
	
	

}
