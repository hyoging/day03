package if_else_if;

public class TestClass01 {

	public static void main(String[] args) {

		int num = 150;
		if(num > 100) {
			System.out.println("100보다 크다");
		}else if(num > 70) {
			System.out.println("70보다 크다");
		} else if(num > 50) {
			System.out.println("50보다 크다");
		}else {
			System.out.println("그 외의값 입력");
		}
		System.out.println("다음 문장들 실행!");
	}

}
