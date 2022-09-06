package collection;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {

		// Python: Dictionary(Key-Value)
		Map<String, Integer> map = new HashMap<>();
		// 放值，無序，都是 object
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		// 取值
		System.out.println("Tom's salary = " + map.get("Tom"));

		map.put("Tom", 2500); // 會覆蓋掉前值
		System.out.println("Tom's salary = " + map.get("Tom"));

		// 取得所有的 key，包裝成為 set
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator(); // 利用 Iterator 處理所有的 key
		int sum = 0;
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("key = %s, value = %s%n", key, map.get(key));
			// Integer salary = (Integer) map.get(key); // object
			Integer salary = map.get(key);
			sum = sum + salary.intValue(); // salary 是物件(Integer)，需要 unboxing 轉成 int，才能做加減
			// .intValue() 可以不寫
		}
		System.out.printf("總和 = %d%n", sum);

	}

}
