package array;

public class TestEmployeeArray {

	public static void main(String[] args) {

		{
			// 第一種寫法:
			Employee[] emps = new Employee[2];
			Employee emp1 = new Employee();
			emp1.empno = 1;
			emp1.name = "Vincent";
			// 放到陣列第一格
			emps[0] = emp1;

			System.out.println(emps[0].empno);
			System.out.println(emps[0].name);

//			 // 第二種寫法:(常用)
//			Employee[] emps = new Employee[2];
//			emps[0] = new Employee();
//			emps[0].empno = 1;
//			emps[0].name = "Vincent";
//		
//			System.out.println(emps[0].empno);
//			System.out.println(emps[0].name);

			Employee emp2 = new Employee();
			emp2.empno = 2;
			emp2.name = "David";
			// 放到陣列第二格
			emps[1] = emp2;
		}

		{
			Employee[] emps = new Employee[2];
			emps[0] = new Employee();
			emps[0].empno = 1;
			emps[0].name = "Vincent";
			
			emps[1] = new Employee();
			emps[1].empno = 2;
			emps[1].name = "David";
			
			for(int i = 0; i < emps.length; i++) {
				System.out.printf("員工編號: %d 員工姓名: %s%n", emps[i].empno, emps[i].name);
			}
			

		}

	}

}
