package test.p01;

public class Condition {

	public static void main(String[] args) {
		int a = 1;
		
		int b = a++;
		System.out.println(a++ + "," + b);
		System.out.println(a);
		if(a<1) {
			System.out.println("a는 1보다 작다");
		}
		if(a<=1) {
			System.out.println("a는 1보다 같거나 작다");
		}else if(a==1) {
			System.out.println("a는 1이다");
		}
	}
}
