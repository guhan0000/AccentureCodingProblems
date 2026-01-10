package arrays;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		map.put(5, 1);
		System.out.println(map);
		Integer integer = map.get(5);
		System.out.println(integer);
		map.put(5, integer+1);
		System.out.println(map);
	}

}
