package test.p01;

public class Condition {

	public static void main(String[] args) {
		int a = 1;
		
		int b = a++;
		System.out.println(a++ + "," + b);
		System.out.println(a);
		if(a<1) {
			System.out.println("a�� 1���� �۴�");
		}
		if(a<=1) {
			System.out.println("a�� 1���� ���ų� �۴�");
		}else if(a==1) {
			System.out.println("a�� 1�̴�");
		}
	}
}
