package test.p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("이지민");
		nameList.add("박기민");
		nameList.add("강태구");
		nameList.add("안수진");
		nameList.add("조선미");
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
		map.put("이름","박경훈");
		map.put("나이","33");
		map.put("주소","서울");
	}
}
