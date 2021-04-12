package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
	
	   Map<String, Integer> map = new HashMap<String, Integer>();
	   
	   map.put("신용권", 85);
	   map.put("홍길동", 75);
	   map.put("김수지", 65);
	   map.put("진현주", 95);
	
	   Set<String> keySet = map.keySet();
	   //key값을 줘야 value값을 갖고나옴
	   Iterator<String> keyIterator = keySet.iterator();
	   
	   while(keyIterator.hasNext()) {
	     String key = keyIterator.next();
	     System.out.println(key + " : " +map.get(key)); //키에 해당하는 값 가져오기
	     
	   
	   }
	   
	}

}
