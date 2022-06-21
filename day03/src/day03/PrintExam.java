package day03;

public class PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 포멧 형식 문법
		// Printf() 포맷을 사용해 정수 출력하기
		// %d 정수표현 형식 지정자
		System.out.printf("%d", 10);
		System.out.println();
		
		// %f 실수표현 형식 지정자
		double pi = 3.1415;
		System.out.printf("%f", pi);
		System.out.println();
		pi = 3.1415925;
		System.out.printf("%f", pi);
		System.out.println();
		// 실수형은 소수점 6자리까지 출력한다.
		
		// 소수점 아래 2자리까지만 표현하고 싶담담
		System.out.printf("%.2f", pi);
		System.out.println();
		
		// %c 문자표현 형식 지정자 
		System.out.printf("%c", 'A');
//		System.out.printf("%c", "A"); <- 오류 
		System.out.println();
		
		// %s 문자열 표현 형식 지정자
		System.out.printf("%s\n", "A");
		System.out.printf("%s", "10");
		System.out.println();
		
		// 왼쪽 오른쪽 맞춤 정렬
		// 10개의 빈자리를 만들고 오른쪽/왼쪽 정렬
		System.out.printf("%10d\n", 12);
		System.out.printf("%10d\n", 12345);
		System.out.printf("%3d\n", 12345);
		System.out.printf("[%10d]\n", 12345);
		System.out.printf("[%-10d]\n", 12345);
		System.out.printf("[%10s]\n", "Hello");
		System.out.printf("[%-10s]\n", "Hello");

		// 비어있는 곳을 0이라는 숫자로 채우고 싶다면?
		System.out.println();
		System.out.printf("%010.2f\n", 3.1415);
//		System.out.printf("%010c\n", 'A'); //오류
//		System.out.printf("%010s\n", "Hello"); //오류
		
		
		// 여러개의 형식 지정을 한번에 사용할 경우 (인자를 맞춘다)
		System.out.println();
		System.out.printf("%d, %f, %c, %s", 10, 3.14, 'A', "Hello");
		
		
		/*
		 *  ====== 영수증 =====
		 탕수육 15000원
		 자장면 5000원
		 짬뽕 500원
		 
		 */
		
	     System.out.println();
	     System.out.printf("%s %d원\n", "탕수육", 15000);
	     System.out.printf("%s %d원\n", "자장면", 5000);
	     System.out.printf("%s %d원\n", "짬뽕", 5000);
	     
	}
	
}
