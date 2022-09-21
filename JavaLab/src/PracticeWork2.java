import java.util.Scanner;

public class PracticeWork2 {

	public static void main(String[] args) {

		{ // ex.1 迴圏的練習-expression

			int sum1 = 0;
			int sum2 = 0;
			for (int i = 1; i <= 50; i++) {
				if (i % 2 == 0) {
					sum1 += (-i * i);
				} else {
					sum2 += (i * i);
				}
			}
			System.out.println(sum1 + sum2);

		}

		{ // ex.2 迴圏的練習-factor

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入一個正整數:");
			int num = input.nextInt();

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.printf("%d 的因數有 %d%n", num, i);
				}
			}

			input.close();

		}

		{ // ex.3 迴圏的練習-perfectNumber

			for (int i = 1; i <= 100; i++) {
				int sum = 0;
				for (int j = 1; j < i; j++) {
					if (i % j == 0 && i != j) {
						sum += j;
					}
				}
				if (sum == i) {
					System.out.print(i + " ");
				}
			}

		}

		{ // ex.4 迴圏的練習-amstrong

			for (int i = 0; i < 10; i++) {
				int fir = i;
				if (fir == i) {
					System.out.printf("%d 是 Amstrong 數%n", i);
				}
			}

			for (int i = 100; i < 1000; i++) {
				int fir = (i / 100);
				int sec = (i % 100) / 10;
				int thi = (i % 10);
				if (fir * fir * fir + sec * sec * sec + thi * thi * thi == i) {
					System.out.printf("%d 是 Amstrong 數%n", i);
				}
			}

			for (int i = 1000; i < 10000; i++) {
				int fir = (i / 1000);
				int sec = (i % 1000) / 100;
				int thi = (i % 100) / 10;
				int fort = (i % 10);
				if (fir * fir * fir * fir + sec * sec * sec * sec + thi * thi * thi * thi
						+ fort * fort * fort * fort == i) {
					System.out.printf("%d 是 Amstrong 數%n", i);
				}
			}

		}

		{ // ex.5 迴圈的練習-prime

			Scanner input = new Scanner(System.in);
			System.out.println("請輸入一個正整數:");
			int num = input.nextInt();

			boolean isPrime = true;
			if (num == 1) {
				System.out.println("1 不是質數");
			}
			int sqrt = (int) Math.sqrt(num);
			for (int i = 2; i <= sqrt; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.printf("%d 是一個質數%n", num);
			} else {
				System.out.printf("%d 不是質數%n", num);
			}

			input.close();

		}

		{ // ex.6 迴圏的練習-rope

			double sum = 3000;
			double day;
			for (day = 1; sum * Math.pow(0.5, day) >= 5; day++) {
				System.out.printf("第 %.0f 天，繩子長 %.0f%n", day, (sum * Math.pow(0.5, day)));
			}
			System.out.printf("需要 %.0f 天，繩子才會小於 5 公尺%n", day);

		}

		{ // ex.7 迴圏的練習-rabbit

			for (int sum = 1;; sum++) {
				if (sum % 3 == 1 && sum % 5 == 3 && sum % 7 == 2) {
					System.out.println(sum);
					break;
				}
			}

		}

	}

}
