package test.p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

	public static void main(String[] args) {
		List<Map<String,String>> mapList = new ArrayList<>();
		
		Map<String,String> map = new HashMap<>();
		map.put("��ȣ", "1");
		map.put("�̸�", "���±�");
		map.put("����", "26");
		mapList.add(map);
		
		map = new HashMap<>();
		map.put("��ȣ", "2");
		map.put("�̸�", "��ٺ�");
		map.put("����", "28");
		mapList.add(map);
		
		map = new HashMap<>();
		map.put("��ȣ", "3");
		map.put("�̸�", "���ö");
		map.put("����", "34");
		mapList.add(map);
		
		
		System.out.println("��ȣ\t�̸�\t����");
		for(Map<String,String> p:mapList) {
			System.out.println(p.get("��ȣ") + "\t" + p.get("�̸�") + "\t" + p.get("����"));
		}
	}
}
