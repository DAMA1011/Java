//3.程式如下，請問compile會有錯嗎，如果有錯請問錯誤原因為何?

public class Test {
	private int i = 1;

	public static void main(String argv[]) {
		int i = 2;
		Test s = new Test();
		s.print();
	}

//DO NOT CHANGE
	public static void print() {
		System.out.println(i);
	}
}