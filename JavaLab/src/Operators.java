
public class Operators {

	public static void main(String[] args) {

// rename: alt + shift + r

// 運算子(Operators):
// 算術運算:

		{
			int a = 10, b = 3; // 兩者皆為 int
			System.out.println("a+b:" + (a + b));
			System.out.println("a-b:" + (a - b));
			System.out.println("a*b:" + (a * b));
			System.out.println("a/b:" + (a / b)); // 兩個相同型別運算時，結果也會是同一個型別，至少為 int
			System.out.println("a%b:" + (a % b)); // 取餘數
		}

// 二元數字運算晉升:
// 以能儲存的 range 最大的為主，Double>Float>Long>Int，至少為 int，避免資料溢位
// int + int = int
// int + float = float
// float + double = double
// byte + short = int

// 晉升(Promotion):
// double a = 1;  // 右邊資料型別較左邊型別小，則右邊會自動變成較大的資料型別
// 型別轉換(TypeCasting):
// double a = 10.5;
// int y = (int)a;  // 較大的資料型別轉換為較小的型別時，必須強制轉換，利用()進行，轉換完小數會不見 y=10

// 比較運算:
// 其回傳值為 boolean(true or false)
// >=(不小於)、<=()不大於、==(等於)、!=(不等於)

		{
			int age = 20;
			boolean adult = age > 18;
			System.out.println("是否成年=" + adult);
		}

// 條件運算:
// 兩邊運算元必須都是 boolean 型別，其回傳值也是 boolean
// &&: 交集(and)，age > 18 && age < 30，左右皆為 true，才回傳 true，如果左為 false，則右不計算，較快
// ||: 聯集(or)，age < 18 || age > 30，一邊回傳 true，即為 true，如果左為 true，則右不計算，較快
// !: 相反 boolean，!(age > 18)
// &: 交集(and)，age > 18 & age < 30，兩邊都運算完才回傳，較慢
// |: 聯集(or)，age < 18 | age > 30，兩邊都運算完才回傳，較慢
// ^: 一邊為 true，一邊為 false 才會回傳 true，age < 18 ^ age < 30		

// 位元運算:
// &: 兩個 bit 都是1，結果才是1，否則為0
// |: 只要有一邊是1，結果就是1，否則為0
// ^: 一邊0，一邊1，結果才是1，否則為0
// ~: 01互換

		{
			int a = 12, b = 6;
			System.out.println(a & b);
			System.out.println(a | b);
			System.out.println(a ^ b);
			int c = 6;
			System.out.println(~c);
		}

// 今日課程		
		{
			System.out.println(2 << 1); // 2*2^1
			System.out.println(12 << 2);

			int a = 20;
			a++;
			System.out.println("a = " + a);
		}
		{
			int a = 20;
			System.out.println("a = " + a++); // 後置型
			System.out.println("a1 = " + a);
		}
		{
			int a = 20;
			System.out.println("a = " + ++a);
			System.out.println("a1 = " + a);
		}
		{
			int a = 10;
			float b = 3;
			a += b; // 自動強制轉換
			a = (int) (a + b); // 需手動強制轉換
			System.out.println("a = " + a);
		}
		{
			int age = 20; // 三元運算沒有層數的限制
			System.out.println(age > 18 ? "成年" : "未成年");
			System.out.println(age > 18 ? (age > 30 ? "壯年" : "成年") : "未成年");
		}
		{
			int sales = 2000;
			int salary = 100;
			// 如果銷售大於1000，薪水加10，否則薪水-10
			salary = sales > 1000 ? salary + 10 : salary - 10;
			System.out.println("薪水 = " + salary);
		}
	}

}
