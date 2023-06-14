package if_else_if;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("잘 못 입력했습니다");
		}else if (num % 3 == 0 && num % 4 == 0) {
			System.out.println(num);
		}else if(num % 3 == 0) {
			System.out.println(num);
		}else if(num % 4 == 0) {
			System.out.println(num);
		}else if(num % 3 != 0 && num % 4 != 0) {
			System.out.println(num + "은 3의 배수도 4의 배수도 아니다");
		}
		
	}

}
