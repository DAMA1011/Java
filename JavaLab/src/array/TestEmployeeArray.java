package array;

public class TestEmployeeArray {

	public static void main(String[] args) {

		{
			Employee[] emps = new Employee[2];

			// 寫法一:
			Employee emp1 = new Employee();
			emp1.empno = 1;
			emp1.name = "Vincent";
			// 放到陣列的第一格
			emps[0] = emp1;

			// 寫法二: 較常這樣寫
			emps[1] = new Employee();
			emps[1].empno = 2;
			emps[1].name = "David";

			System.out.println(emps[0].name);
			System.out.println(emps[1].empno);

			for (int i = 0; i < emps.length; i++) {
				System.out.printf("員工編號: %d, 員工姓名: %s%n", emps[i].empno, emps[i].name);
			}
		}

	}

}
