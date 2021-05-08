package ch15;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 분반별 전화번호부 구현
		 * Map 타입의 phoneBook에 A반 전화번호부, B반 전화번호부를 저장
		 * A반 전화번호부도 Map 타입.
		 * A반 전화번호부에는 A반 학생들의 전화번호가 <이름, 전화번호>의 쌍으로
		 * B반 전화번호부에는 B반 학생들의 전화번호가 <이름, 전화번호>의 쌍으로
		 * 저장됨.
		 */
		//A반 전화번호부 <이름, 전화번호>의 쌍으로 저장되니
		Map<String,String> WDA = new TreeMap<>();
		WDA.put("박동현", "010-5561-5616");
		WDA.put("김정세", "010-4125-1654");
		WDA.put("서재열", "010-4175-9773");
		Map<String,String> WDB = new TreeMap<>();
		WDB.put("구나현", "010-5425-6548");
		WDB.put("임채환", "010-5615-9568");
		WDB.put("나비현", "010-5789-1238");

		//<"A반",aBan>, <"B반", bBan>으로 저장
		Map<String,Map<String,String>> phoneBook = new TreeMap<>();
		phoneBook.put("A반", WDA);
		phoneBook.put("B반", WDB);
		
//		------------String,Map<String,String>형태의 Map을 만든다.-----------------------
		
		
		Set<Map.Entry<String, Map<String,String>>> entrySet = phoneBook.entrySet();
		//key와 value의 쌍으로 값을 entrySet에 저장하는 것 같다.
		//제네릭은 entrySet으로 만들재료(entrySet이면 된다.)
		
		Iterator<Map.Entry<String,Map<String,String>>> iter1 = entrySet.iterator();
		//entrySet을 iterator로 집어넣는다.
		
//		------------순서대로 꺼내기 위해서 phoneBook을 Set에 넣고 그 객체를 Iterator로 만든 객체를 만든다.----------

		while(iter1.hasNext()) {
			Map.Entry<String, Map<String,String>> entry = iter1.next();
//			entry에는 A반(key) WDA(value)가 담긴뒤 B반(key) WDB(value)가 담긴다.
			System.out.println(entry.getKey());
			//iter1으로 나올 key값이 A반일지 B반일지 모른다. iter1의 재료가 Set이기 때문이다.
			Map<String,String> pb = entry.getValue();
			Set<Map.Entry<String, String>> phones = pb.entrySet();
			Iterator<Map.Entry<String, String>> iter2 = phones.iterator();
			while(iter2.hasNext()) {
				Map.Entry<String, String> phone = iter2.next();
				System.out.println(phone.getKey() + " : "+phone.getValue());
			}
		}
		System.out.print("끝");
	}
}
