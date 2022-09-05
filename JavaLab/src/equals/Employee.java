package equals;

import java.util.Objects;

public class Employee {

	private String id;

	public Employee(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			// 須轉型，才能比較 id
			Employee emp = (Employee) obj;
			return this.id.equals(emp.id);
		}
		return false; // 如果是不同類別的話
	}

	@Override
	public int hashCode() {
		return Objects.hash(id); // 官方提供的功能，產生數字
	}

	@Override
	public String toString() {
		return String.format("員工(%s)", this.id);
	}
	
}
