
public class DoubleArray {

	public static void main(String[] args) {

		double[] x = { 1.1, 2.0, 1.2, 1.4, 0.5, 6.0 };

		double max = x[0]; // 設定一個 max 的初值
		double min = x[0]; // 設定一個 min 的初值
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) { // 跟陣列裡的所有值進行比大
				max = x[i]; // 重新定義 max 為陣列裡的最大值
			}

			if (x[i] < min) { // 跟陣列裡的所有值進行比小
				min = x[i]; // 重新定義 min 為陣列裡的最小值
			}

			sum += x[i]; // 求總和

			avg = sum / x.length; // 求平均值
		}
		System.out.printf("長度 = %d%n", x.length);
		System.out.printf("總和 = %.1f%n", sum);
		System.out.printf("平均值 = %.3f%n", avg);
		System.out.printf("最大值 = %.1f%n", max);
		System.out.printf("最小值 = %.1f%n", min);

	}

}
