package exception;

public class TestException {

	public static void main(String[] args) {

		try {
			int a = 1;
			int c = 1;
			System.out.println("c=" + c);
			int b = a / c;
			System.out.println("b=" + b); // 一樣不會執行

			int[] x = {};
			System.out.println(x[0]);

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) { // 設定一個參數去接住錯誤
			ex.printStackTrace();
		} catch (Exception aa) {
			// 攔最上層的父類別 Exception，盡量避免只寫 Exception 父類別
			aa.printStackTrace();
		} finally {
			// 例如: 關閉檔案或關閉資料庫
			System.out.println("無論錯誤有沒有正確處理，都一定會被執行的程式碼");
		}
		// 錯誤有被 catch 處理，所以會繼續執行
		System.out.println("after try catch");
	}

}
