package test.p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("������");
		nameList.add("�ڱ��");
		nameList.add("���±�");
		nameList.add("�ȼ���");
		nameList.add("������");
		List<Integer> ageList = new ArrayList<>();
		ageList.add(20);
		ageList.add(22);
		ageList.add(12);
		ageList.add(42);
		ageList.add(62);
		for(int age:ageList) {
			System.out.println(age);
		}
		
		Map<String,String> map = new HashMap<>();
		map.put("�̸�","�ڰ���");
		map.put("����","33");
		map.put("�ּ�","����");
	}
}
