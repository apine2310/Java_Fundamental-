package java_20191128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap : key 값은 반드시 유일해야 하고, value에는 데이터(객체)을 저장하는데
		//데이터의 중복은 허용한다. Key값이 중복되는 경우는 덮어쓰기를 한다.(기존의 키는 삭제)
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		map.put("1", 11111);
		map.put("2", 22222);
		map.put("3", 33333);
		map.put("4", 44444);
		map.put("5", 55555);
		map.put("1", 66666);
		
		Integer value = map.get("1");
		System.out.println(value);
		
		Set<String> set = map.keySet();
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()){
			String key = i.next();
			Integer v = map.get(key);
			System.out.format("key : %s, value : %d%n", key, v);
			
		}
	}
}
