package equals;

public class TestEquals {

	public static void main(String[] args) {

		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		System.out.println(e1 == e2); // False，比較兩者的記憶體位置
		System.out.println(e1.equals(e2)); // False，一樣是比較兩者的記憶體位置(同上)
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1);
		System.out.println(e1.toString());
	}

}
