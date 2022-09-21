import java.util.Scanner;

public class PracticeWork1 {

	public static void main(String[] args) {

		{ // ex.1 選擇性敘述的練習-season

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入月份:");
			int month = input.nextInt();

			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.printf("%d 月為春%n", month); // 3,4,5
				break;
			case 6:
			case 7:
			case 8:
				System.out.printf("%d 月為夏%n", month); // 6,7,8
				break;
			case 9:
			case 10:
			case 11:
				System.out.printf("%d 月為秋%n", month); // 9,10,11
				break;
			case 12:
			case 1:
			case 2:
				System.out.printf("%d 月為冬%n", month); // 12,1,2
				break;
			default:
				System.out.printf("輸入錯誤%n");

				input.close();

			}

		}

		{ // ex.2 選擇性敘述的練習-salary

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入時數:");
			double time = input.nextInt();

			if (time <= 60) {
				double salary = time * 120;
				System.out.printf("薪資為 %.0f%n", salary);
			} else if (time > 61 && time < 80) {
				double salary = 60 * 120 + (time - 60) * 120 * 1.25;
				System.out.printf("薪資為 %.0f%n", salary);
			} else {
				double salary = 60 * 120 + 20 * 120 * 1.25 + (time - 80) * 120 * 1.5;
				System.out.printf("薪資為 %.0f%n", salary);
			}

			input.close();

		}

		{ // ex.3 選擇性敘述的練習-leapYear

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入年份:");
			int year = input.nextInt();

			if (year % 4 == 0 && year % 100 != 0) {
				System.out.printf("%d 年為閏年%n", year);
			} else if (year % 400 == 0) {
				System.out.printf("%d 年為閏年%n", year);
			} else {
				System.out.printf("%d 年為平年%n", year);
			}

			input.close();

		}

		{ // ex.4 選擇性敘述的練習-refund

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入應付金額:");
			int cost = input.nextInt();
			System.out.println("請輸入實付金額:");
			int pay = input.nextInt();
			int result = pay - cost;

			if (result > 1000) {
				int a = result / 1000;
				if (a > 0) {
					System.out.printf("%d 張1000元", a);
				} else {
				}
				int b = (result % 1000) / 500;
				if (b > 0) {
					System.out.printf("，%d 張500元", b);
				} else {
				}
				int c = ((result % 1000) % 500) / 100;
				if (c > 0) {
					System.out.printf("，%d 張100元", c);
				} else {
				}
				int d = (((result % 1000) % 500) % 100) / 50;
				if (d > 0) {
					System.out.printf("，%d 個50元", d);
				} else {
				}
				int e = ((((result % 1000) % 500) % 100) % 50) / 10;
				if (e > 0) {
					System.out.printf("，%d 個10元", e);
				} else {
				}
				int f = (((((result % 1000) % 500) % 100) % 50) % 10) / 5;
				if (f > 0) {
					System.out.printf("，%d 個5元", f);
				} else {
				}
				int g = ((((((result % 1000) % 500) % 100) % 50) % 10) % 5) / 1;
				if (g > 0) {
					System.out.printf("，%d 個1元", g);
				} else {
				}
			} else if (result >= 500 && result < 1000) {
				int b = result / 500;
				if (b > 0) {
					System.out.printf("%d 張500元", b);
				} else {
				}
				int c = (result % 500) / 100;
				if (c > 0) {
					System.out.printf("，%d 張100元", c);
				} else {
				}
				int d = ((result % 500) % 100) / 50;
				if (d > 0) {
					System.out.printf("，%d 個50元", d);
				} else {
				}
				int e = (((result % 500) % 100) % 50) / 10;
				if (e > 0) {
					System.out.printf("，%d 個10元", e);
				} else {
				}
				int f = ((((result % 500) % 100) % 50) % 10) / 5;
				if (f > 0) {
					System.out.printf("，%d 個5元", f);
				} else {
				}
				int g = (((((result % 500) % 100) % 50) % 10) % 5) / 1;
				if (g > 0) {
					System.out.printf("，%d 個1元", g);
				} else {
				}
			} else if (result >= 100 && result < 500) {
				int c = result / 100;
				if (c > 0) {
					System.out.printf("%d 張100元", c);
				} else {
				}
				int d = (result % 100) / 50;
				if (d > 0) {
					System.out.printf("，%d 個50元", d);
				} else {
				}
				int e = ((result % 100) % 50) / 10;
				if (e > 0) {
					System.out.printf("，%d 個10元", e);
				} else {
				}
				int f = (((result % 100) % 50) % 10) / 5;
				if (f > 0) {
					System.out.printf("，%d 個5元", f);
				} else {
				}
				int g = ((((result % 100) % 50) % 10) % 5) / 1;
				if (g > 0) {
					System.out.printf("，%d 個1元", g);
				} else {
				}
			} else if (result >= 50 && result < 100) {
				int d = result / 50;
				if (d > 0) {
					System.out.printf("%d 個50元", d);
				} else {
				}
				int e = (result % 50) / 10;
				if (e > 0) {
					System.out.printf("，%d 個10元", e);
				} else {
				}
				int f = ((result % 50) % 10) / 5;
				if (f > 0) {
					System.out.printf("，%d 個5元", f);
				} else {
				}
				int g = (((result % 50) % 10) % 5) / 1;
				if (g > 0) {
					System.out.printf("，%d 個1元", g);
				} else {
				}
			} else if (result >= 10 && result < 50) {
				int e = result / 10;
				if (e > 0) {
					System.out.printf("%d 個10元", e);
				} else {
				}
				int f = (result % 10) / 5;
				if (f > 0) {
					System.out.printf("，%d 個5元", f);
				} else {
				}
				int g = ((result % 10) % 5) / 1;
				if (g > 0) {
					System.out.printf("，%d 個1元", g);
				} else {
				}
			} else if (result >= 5 && result < 10) {
				int f = result / 5;
				if (f > 0) {
					System.out.printf("%d 個5元", f);
				} else {
				}
				int g = (result % 5) / 1;
				if (g > 0) {
					System.out.printf("，%d 個1元", g);
				} else {
				}
			} else if (result >= 1 && result < 5) {
				int g = result / 1;
				if (g > 0) {
					System.out.printf("%d 個1元", g);
				} else {
				}
			} else if (result == 0) {
				System.out.println("不必找錢");
			} else {
				System.out.println("金額不足");
			}

			input.close();

		}

	}

}
