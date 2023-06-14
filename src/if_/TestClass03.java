package if_;

import java.util.Scanner;

public class TestClass03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		if (num % 3 == 0) {
			System.out.println(num + " 은 3의 배수입니다");
		}
		if (num % 3 != 0) {
			System.out.println(num + "은 3의 배수가 아닙니다");
	
		}
	}

}
