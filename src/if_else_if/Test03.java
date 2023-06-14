package if_else_if;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		double height, dheight, weight, bmi;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm단위)\t");
		height = scann.nextDouble();
		dheight = height / 100.0;
		
		System.out.print("몸무게를 입력하세요(kg)\t");
		weight = scann.nextDouble();
		
		bmi = weight / (dheight*dheight);
		
		if (bmi < 18.5) {
			System.out.println( bmi + "는 저체중입니다");
		}else if(bmi >= 18.5 && bmi < 23) {
			System.out.println( bmi +"정상입니다");
		}else if(bmi >= 23 && bmi < 25) {
			System.out.println( bmi +"과체중입니다");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println( bmi +"비만입니다");
		}else {
			System.out.println( bmi +"고도비만 입니다");
		}
	
	}

}
