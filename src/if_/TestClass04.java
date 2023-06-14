package if_;

import java.util.Scanner;

public class TestClass04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("숫자 3개를 입력하세요 ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a);
		}
		if (b>a && b>c) {
			System.out.println(b);
		}
		if (c>a && c>b) {
			System.out.println(c);
		}
	}

}
