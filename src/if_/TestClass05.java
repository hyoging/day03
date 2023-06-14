package if_;

import java.util.Scanner;

public class TestClass05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("숫자 2개를 입력하세요");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a > b && a % 2 == 0) {
			System.out.println(a);
		}
		
		if(b > a && b % 2 == 0) {
			System.out.println(b);
		}
		
	}

}
