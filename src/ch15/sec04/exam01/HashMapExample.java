package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("이순신", 60);
		map.put("홍길동", 75);
		map.put("강감찬", 80);
		map.put("홍길동", 55);
		
		System.out.println("총 객체수 : " + map.size());
		System.out.println("--------------------------");
		
		
		String key = "홍길동";
		int value = map.get(key);
		System.out.printf("%s : %d \n",key, value);
		System.out.println("--------------------------");
		
		
		String key1 = "강감찬";
		int value1 = map.get(key1);
		System.out.printf("%s : %d \n",key1, value1);
		
		
		System.out.println("전체 목록 (키s와 반복자)--------------");
		
		//목록 : 키와 반복자
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			String strKey = keyIter.next();
			int iValue = map.get(strKey); 
			System.out.printf("%s : %d \n", strKey, iValue);
		}
		
		
		//삭제
		map.remove("이순신");
		
		
		//엔트리 Set
		System.out.println("전체 목록 (EntrySet)--------------------");
		Set< Entry<String, Integer> > entrySet = map.entrySet();
		Iterator< Entry <String, Integer> > entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			Entry<String, Integer> entry = entryIter.next();
			System.out.printf("%s : %d \n", entry.getKey(), entry.getValue());
		}

	}

}













