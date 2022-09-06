package collection;

import java.util.HashSet;
import java.util.Set;
import equals.Employee;

public class TestEmployrrSet {

	public static void main(String[] args) {

		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		Set set = new HashSet();
		set.add(e1);
		set.add(e2); // 沒有加成功，因為有改寫 equals 判斷內容
		System.out.printf("size=%d%n", set.size());
		
		
	}

}
