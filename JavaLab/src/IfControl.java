// 流程控制: If
public class IfControl {

	public static void main(String[] args) {

//		  語法:
//			if ( 判斷式 1 ){
//				判斷式 1 為 true，則執行這行程式，不再執行其他判斷
//			} else if ( 判斷式 2 ){
//				判斷式 2 為 true，則執行這行程式，不再執行其他判斷
//			} else {
//				上述判斷式皆為 false，則執行這行程式
//			}

		{
			int age = 20;
			if (age >= 30) {
				System.out.println("壯年");
			} else if (age >= 18) {
				System.out.println("成年");
			} else {
				System.out.println("未成年");
			}
		}

		// 巢狀式if:
		{
			int age = 40;
			if (age >= 18) {
				System.out.println("成年");
				if (age >= 30) {
					System.out.println("壯年");
				}
			} else {
				System.out.println("未成年");
			}
		}

		// switch:
		{
			int classroom = 204;
			switch (classroom) {
				case 204: // case 只能放等於，不能放其他比較法
					System.out.println("有30人");
					break;
				case 305:
					System.out.println("有50人");
					break;
				default:
					break;
			}
		}

		{
			int classroom = 204;
			switch (classroom) {
				case 204:
				case 305:
					System.out.println("有50人");
					break;
				default:
					break;
				// 等同於: if (classroom == 204 || classroom == 305)
				// ||: 或
			}
		}

	}

}
