package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		{
			// 不重覆
			Set set = new HashSet();
//		Set set = new LinkedHashSet(); // 這個方法會使 set 有順序，但會吃掉額外效能
			set.add("Hello");
			System.out.printf("size=%d%n", set.size());

			boolean success = set.add("Hello"); // 判斷加入重覆資料時是否加成功
			System.out.printf("加重覆，成功? %s%n", success);
			System.out.printf("size=%d%n", set.size()); // size 還是 1，表示沒加成功
			System.out.println(set.contains("Hello")); // 檢查是否含有此值，效率較好(set)

			set.add("World");
			set.add(3.0);

			Iterator it = set.iterator(); // set 是不保證順序的
			while (it.hasNext()) {
				Object item = it.next();
				System.out.println(item);
			}
		}

		{ // 泛型:
			Set<String> set = new LinkedHashSet<>();
			set.add("Hello");
			set.add("World");

			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String item = it.next();
				System.out.println(item);
			}
		}

	}

}
