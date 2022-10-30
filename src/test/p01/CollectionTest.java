package test.p01;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		int num = 1;
		int[] nums = new int[2];
		
		nums[0] = 1;
		nums[1] = 20;
		
		List<Integer> nums2 = new ArrayList<>();
		System.out.println(nums2.size());
		nums2.add(1);
		System.out.println(nums2.size());
		
		nums2.add(20);
		System.out.println(nums2.size());
		
		nums2.remove(1);
		System.out.println(nums2.size());
	}
}
