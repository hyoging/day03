package if_else_if;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {

	
//		최소 1시간 부터 최대 8시간까지 이용 가능한 카페가 있다.
//		이용시간 1시간당 요금은 10,000원 이며
//		3시간 이상 이용시 10% 할인, 5시간 이용시 20% 할인을 진행하고 있다.
//		이용시간에 따른 금액을 출력하시오.
//		(단, 가능하지 않은 이용 시간일 경우 가능한 이용시간을 알려주세요)
//		ex) 1시간 --> 10,000원/ 3시간 --> 27,000원/ 5시간 --> 40,000원/ 그 외 "잘못 입력" 출력
		
		double usetime, time;
		double price = 0;
		price = 10000;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이용 할 시간을 입력하세요: ");
		time = scan.nextInt();
		
		usetime = time * price;
		
		if (time <= 1 && time >= 8) {
			System.out.println("이용가능한 시간이 아닙니다.");
		}else if(time >= 3) {
			price = usetime * 0.9;
		}else if(time >= 5) {
			price = usetime * 0.8;
		}
		System.out.println("사용 가능한 시간은 " + time + " 시간 이고 가격은 " + price + "입니다");
		

	
	}

}
