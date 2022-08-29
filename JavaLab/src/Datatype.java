
public class Datatype {

	public static void main(String[] args) {

//基本資料型別(data type): 8 種型別
// 整數:
//	byte: 範圍 -128~127
//	short: 範圍 -32768~32767
//	int: 範圍 -21e~21e
//	long: 範圍 -9.2*10^18~9.2*10^18，要加 L

		{
			int a;
			a = 5;
			System.out.println(a);
		}
		{
			int a, b, c; // 同 int a = 4, b = 8, c = 14;
			a = 4;
			b = 8;
			c = 14;
			System.out.println(a + b + c);
		}
		{
			long salaryOfMine = 22L; // 變數命名規則: 小寫開頭，如果後面還有其他字，則後字以大寫開頭
			System.out.println(salaryOfMine); // 數值超過 21e 時，需要再字尾加 L，表示為 long 型態
		}

//資料溢位(overflow): 計算結果超過能儲存的範圍，1 byte = 8 bit
//	0  1  1  1  1  1  1  1  =  127
//	0  0  0  0  0  0  0  1  =  1  (127和1相加)
//	1  0  0  0  0  0  0  0  =  -128  (結果)

// 浮點數:
//	float: 精度7位數，要加 f
//	double: 精度15位數，Java 預設浮點數都是 double
//  浮點數計算不精確，會有誤差，但較快

		{
			float a, b;
			a = 33.33f;
			b = 4.5f;
			System.out.println(a * b);
		}
		{
			double a, b;
			a = 33.33;
			b = 4.5;
			System.out.println(a * b);
		}

// 布林值、char:
//	boolean: 變數 = true or false
//	char: 變數 = '單一字元'

		{
			boolean x, y;
			x = true;
			y = false;
			System.out.println(x);
			System.out.println(y);
		}
		{
			char m, n;
			m = 'M';
			n = 'N';
			System.out.println(m);
			System.out.println(n);
		}

//跳脫字元:
		{
			System.out.println("\"檔案\"\'路徑\'\nc:\\user");
		}

	}

}
