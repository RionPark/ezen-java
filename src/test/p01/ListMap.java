package test.p01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

	public static void main(String[] args) {
		List<Map<String,String>> mapList = new ArrayList<>();
		
		Map<String,String> map = new HashMap<>();
		map.put("번호", "1");
		map.put("이름", "강태구");
		map.put("나이", "26");
		mapList.add(map);
		
		map = new HashMap<>();
		map.put("번호", "2");
		map.put("이름", "김다빈");
		map.put("나이", "28");
		mapList.add(map);
		
		map = new HashMap<>();
		map.put("번호", "3");
		map.put("이름", "김민철");
		map.put("나이", "34");
		mapList.add(map);
		
		
		System.out.println("번호\t이름\t나이");
		for(Map<String,String> p:mapList) {
			System.out.println(p.get("번호") + "\t" + p.get("이름") + "\t" + p.get("나이"));
		}
	}
}
