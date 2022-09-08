package exam04;

public class Employee {

	private int empno; // 員工編號
	private String name; // 員工姓名
	private long salary; // 薪水

	public Employee(int empno, String name, long salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary;
	}

}
/*
 * - 如果我們希望外部其它類別『不能修改』empno、name、salary的欄位，僅能在new Employee 時於建構方法中
 * 設定員工編號以及員工姓名以及salary，以及建立物件後要可以利用getXXX取得 empno、name、salary。
 * 
 * - 設計一個新的Manager(經理)類別，繼承Employee類別，然而經理比一般員工多了long型態的bonus(分紅)，分紅
 * 也『不開放修改』同樣只能由建構方式中指定，請設計一個新的建構方法可以同時指定empno、name、salary、bonus的欄位
 * 而且要呼叫父類別的建構方法。
 * 
 * - 經理的薪水為原本的salary加上bonus，請覆寫getSalary方法。
 */