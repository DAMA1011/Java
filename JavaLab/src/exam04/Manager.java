package exam04;

public class Manager extends Employee {

	private long bonus; // 分紅

	public Manager(int empno, String name, long salary, long bonus) {
		super(empno, name, salary);
		this.bonus = bonus;
	}

	public long getBonus() {
		return bonus;
	}

	@Override
	public long getSalary() {
		long sb = super.getSalary() + bonus; // 薪水+分紅
		return sb;
	}

}
