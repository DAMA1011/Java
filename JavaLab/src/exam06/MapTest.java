package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		People p1 = new People("001", 21);
		People p2 = new People("002", 33);
		People p3 = new People("003", 41);

		// 實作1: 請定義一個泛型的 Map，key 值為 people 的 id，value 為『People物件』，將上述三個 people 放入 Map 中
		Map<String, People> map = new HashMap<>();
		map.put("001", p1);
		map.put("002", p2);
		map.put("003", p3);

		// 實作2: 請用 for 迴圈或者 iterator，利用實作 1 的 Map 計算三人的平均年齡至少到小數第一位
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		double sum = 0;
		while (it.hasNext()) {
			String key = it.next();
			People p = map.get(key);
			sum += p.getAge();
		}
		// System.out.println(sum);
		double s = map.size();
		double avg = sum / s;
		System.out.printf("平均年齡: %.1f%n", avg);

	}

}
