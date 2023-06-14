package if_else_if;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int coffee, price=0;
		System.out.print("커피 수 입력 : ");
		coffee = scan.nextInt();
		if( coffee > 10 ) {
			price += 20000 + (coffee - 10)*1500;
		}else {
			price = coffee * 2000;
		}
		System.out.println("coffee "+coffee+"개의 가격은 : "+price+"입니다");
	}

}
