package func;

public class TestPeople {

	public static void main(String[] args) {

		People p = new People();
		p.weight = 70;
		p.height = 1.7;
		double bmii = p.getBMI(); // shift+alt+l
		System.out.printf("BMI = %.1f%n", bmii);
		// static: 靜態屬性
		System.out.printf("OverWeightBMI = %.0f%n", People.overWeightBMI);

		People p1 = new People();
		p1.weight = 70;
		p1.height = 1.7;

		System.out.printf("OverWeightBMI = %.0f%n", People.overWeightBMI);
		System.out.printf("Static BMI = %.0f%n", People.BMI(1.8, 100));

		System.out.println(Math.pow(1.5, 2)); // 次方
		System.out.println(Math.sqrt(4)); // 開根號

	}

}
