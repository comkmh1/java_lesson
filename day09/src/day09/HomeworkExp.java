package day09;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * 아래와 같이 2차원 배열을 선언하고
		 * {{"햄버거", "1개", "2000원"}, {"콜라", "1잔", "500원"}, {"포테이토", "1개", "1000원"}}
		 * 이 값을 이용해 음식점 메뉴를 출력하는 프로그램을 작성하세요.
		 * 
		 *  결과
		 * 	========== 메뉴 ==========
			햄버거	1개	2000원	
			콜라		1잔	500원	
			포테이토	1개	1000원	
			========================
		 */
		
		
				
		
		
		String[][] menus = {
			{"햄버거", "1개", "2000원"}, 
			{"콜라", "1잔", "500원"}, 
			{"포테이토", "1개", "1000원"}
		}
		
		System.out.println("================ 메뉴 =================");
		for (int i = 0; i < menus.length; i++) {
			for (int j = 0; j < menus.length; j++) {
//				System.out.print(menus[i][j] + '\t');
				System.out.printf("%s\t", menus[i][j]);
			}
			System.out.println();
		}	

		System.out.println("======================================");

		/* 2.
		 * 두수를 입력받아 사칙연산(+-/*)를 하는 메소드를 만드세요.
		 * 
		 * 
		   	사용예 calc(6, 3) 메소드를 호출하면 아래와 같이 출력
		  	
		  	더하기 		9	
		 	빼기			3	
		 	곱하기		18
		 	나누기		2
		 */
		
		
	    
		
//		calc(6, 3);
//		calc(5, 3);
//		calc(2, 5); 
		

		/* 3.
		 * 메뉴를 표시하는 기능을 메소드(함수)로 만들어 재사용하여 아래처럼 출력하세요.
		 * 
		 * hint)
		 * 메소드의 입력파라메터로 메뉴명과 가격을 입력받는다(String name, int price)
		 * 리턴 값으로는 price를 다시 리턴받는다.
		 * 이 리턴값을 총액 계산시 사용한다.
		 * menu("자장면", 5000);	: 사용법
		 * 
		   	결과

		  	자장면	5000원	
		 	짬뽕		6000원	
		 	탕수육	10000원
		 	====================
		 	총액		21000원
		 */
		
		int total 	= 0;
		
		total 	+= menu("자장면", 5000);
		total 	+= menu("짬뽕", 7000);
		total 	+= menu("탕수육", 10000);
		
		System.out.println("======================");
		menu("총액", total);
	}
	
	// 값을 리턴하면 메소드는 무조건 종료되나요?

	public static int menu(String name, int price) {
		System.out.println(name + "\t" + price + "원");
		return price;
	}
	
	public static void calc(int a, int b) {
		System.out.println("더하기\t" + (a + b));
		System.out.println("빼기\t" + (a - b));
		System.out.println("곱하기\t" + (a * b));
		System.out.println("나누기\t" + (a / b));
	} 
}












