// Class: 類別(設計圖)
// Object: 物件(車子)
// 車子擁有輪胎(屬性)，可以跑(方法)
public class TestEmployee {

	public static void main(String[] args) {

		// int   age = 18，等同於這種宣告
		Employee emp = new Employee();
		// 類別名稱 變數名稱 = new 類別名稱();
		//               =   物件

		emp.empno = 1; // 員工.(的)編號
		emp.name = "Vincent"; // 員工.(的)姓名
		System.out.println("編號 = " + emp.empno + "，姓名 = " + emp.name);

		Employee emp2 = new Employee();

		emp2.empno = 2;
		emp2.name = "David";
		System.out.println("編號 = " + emp2.empno + "，姓名 = " + emp2.name);

		System.out.println(emp == emp2); // 在記憶體中，這兩個變數指向不同的地方
		
		emp2 = emp;
		System.out.println(emp2.name);
		System.out.println(emp == emp2); //在記憶體中，這兩個變數指向同一個地方
		
		emp = null; // 清空 emp、emp2 變數中的值，就不能呼叫了
		emp2 = null;
		
	}

}
