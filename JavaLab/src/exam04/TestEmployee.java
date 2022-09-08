package exam04;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "John", 1000);
		System.out.printf("員工編號: %d, 員工姓名: %s, 員工薪水: %d%n", emp1.getEmpno(), emp1.getName(), emp1.getSalary());
		
		Manager man2 = new Manager(2, "Kevin", 5000, 10000);
		System.out.printf("經理編號: %d, 經理姓名: %s, 經理薪水: %d, 經理分紅: %d%n", man2.getEmpno(), man2.getName(), man2.getSalary(), man2.getBonus());
		
		Manager man3 = new Manager(3, "Mary", 8000, 20000);
		System.out.printf("經理編號: %d, 經理姓名: %s, 經理薪水: %d, 經理分紅: %d%n", man3.getEmpno(), man3.getName(), man3.getSalary(), man3.getBonus());
	}

}
