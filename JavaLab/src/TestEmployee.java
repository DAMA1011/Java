
public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.empno = 1; // (員工)(的)(屬性/實體變數)
		emp.name = "Vincent";
		System.out.println("標號 = " + emp.empno + ", name = " + emp.name);

		Employee emp2 = new Employee();
		emp2.empno = 2;
		emp2.name = "David";
		System.out.println("標號 = " + emp2.empno + ", name = " + emp2.name);
		System.out.println(emp == emp2); // false，這兩個變數是不是指向同一個物件

		emp2 = emp;
		System.out.println(emp2.name); // Vincent
		System.out.println(emp == emp2); // true

		emp = null; // 清空變數中的值，釋放記憶體位置
		emp2 = null;
		// System.out.println(emp2.name); // 物件變數一旦為 null，不能呼叫，否則會有錯誤

	}

}
