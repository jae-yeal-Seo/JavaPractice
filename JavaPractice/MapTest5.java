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
		 * �йݺ� ��ȭ��ȣ�� ����
		 * Map Ÿ���� phoneBook�� A�� ��ȭ��ȣ��, B�� ��ȭ��ȣ�θ� ����
		 * A�� ��ȭ��ȣ�ε� Map Ÿ��.
		 * A�� ��ȭ��ȣ�ο��� A�� �л����� ��ȭ��ȣ�� <�̸�, ��ȭ��ȣ>�� ������
		 * B�� ��ȭ��ȣ�ο��� B�� �л����� ��ȭ��ȣ�� <�̸�, ��ȭ��ȣ>�� ������
		 * �����.
		 */
		//A�� ��ȭ��ȣ�� <�̸�, ��ȭ��ȣ>�� ������ ����Ǵ�
		Map<String,String> WDA = new TreeMap<>();
		WDA.put("�ڵ���", "010-5561-5616");
		WDA.put("������", "010-4125-1654");
		WDA.put("���翭", "010-4175-9773");
		Map<String,String> WDB = new TreeMap<>();
		WDB.put("������", "010-5425-6548");
		WDB.put("��äȯ", "010-5615-9568");
		WDB.put("������", "010-5789-1238");

		//<"A��",aBan>, <"B��", bBan>���� ����
		Map<String,Map<String,String>> phoneBook = new TreeMap<>();
		phoneBook.put("A��", WDA);
		phoneBook.put("B��", WDB);
		
//		------------String,Map<String,String>������ Map�� �����.-----------------------
		
		
		Set<Map.Entry<String, Map<String,String>>> entrySet = phoneBook.entrySet();
		//key�� value�� ������ ���� entrySet�� �����ϴ� �� ����.
		//���׸��� entrySet���� �������(entrySet�̸� �ȴ�.)
		
		Iterator<Map.Entry<String,Map<String,String>>> iter1 = entrySet.iterator();
		//entrySet�� iterator�� ����ִ´�.
		
//		------------������� ������ ���ؼ� phoneBook�� Set�� �ְ� �� ��ü�� Iterator�� ���� ��ü�� �����.----------

		while(iter1.hasNext()) {
			Map.Entry<String, Map<String,String>> entry = iter1.next();
//			entry���� A��(key) WDA(value)�� ���� B��(key) WDB(value)�� ����.
			System.out.println(entry.getKey());
			//iter1���� ���� key���� A������ B������ �𸥴�. iter1�� ��ᰡ Set�̱� �����̴�.
			Map<String,String> pb = entry.getValue();
			Set<Map.Entry<String, String>> phones = pb.entrySet();
			Iterator<Map.Entry<String, String>> iter2 = phones.iterator();
			while(iter2.hasNext()) {
				Map.Entry<String, String> phone = iter2.next();
				System.out.println(phone.getKey() + " : "+phone.getValue());
			}
		}
		System.out.print("��");
	}
}
