
public class If {

	public static void main(String[] args) {
// 今日課程
		{
			int age = 35;
			if (age >= 30) {
				System.out.println("壯年");
			} else if (age >= 18) {
				System.out.println("成年");
			} else {
				System.out.println("未成年");
			}
		}

		// 巢狀式if
		{
			int age = 20;
			if (age >= 18) {
				if (age >= 30) {
					System.out.println("壯年");
				}
				System.out.println("成年");
			} else {
				System.out.println("未成年");
			}
		}

		// switch
		{
			int classroom = 204;
			switch (classroom) {
			case 204:
				System.out.println("人數大於等於30人");
				break;
			case 305:
				System.out.println("人數小於30大於等於20人");
				break;
			default:
				System.out.println("其他");
			}
		}

	}

}
