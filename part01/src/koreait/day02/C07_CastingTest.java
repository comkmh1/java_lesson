package koreait.day02;


public class C07_CastingTest {

	public static void main(String[] args) {

		
//		대입문 : 오른쪽 값/수식/변수가 왼쪽 변수로 대입.
//				산술연산 +, -, *, /(나눗셈 몫), %(나눗셈 나머지) 
//				관계연산 ==(같다) , !=(같지 않다), >, <, >=, <=
//				논리연산 &&(and,그리고), ||(or,또는), !(not)

		int a = 123; 
		int b = 10;
		double c = 10.34;		
		// 연산에 사용되는 피연산자가 
		
		
		int isum;
		double dsum;
		
		isum = a+b;
		dsum = a+c;
		
		
		System.out.println("a + b = " + isum);	
		System.out.println("a + b = " + dsum);	

//		형변환(캐스팅) : 정수 + 실수 결과를 꼭 정수 변수에 저장해야 한다면 실수를 정수로 형변환 한 후에 저장한다.
		
		isum = a + (int)c; // c변수의 실수값을 정수로 변환 
		
		System.out.println("a +(int)c = " + isum);
		
		System.out.println(" a / b =" + (a/b));  //정수끼리 나누면 결과 정수
		System.out.println(" a / b =" + (a%b));  //정수끼리 나누기의 나머지
		
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
		
//		강제 형변환(캐스팅) 예시 : 정수끼리 나눗셈 결과를 실수로 구하는 처리조건일때
//		-> 정수 한개를 실수로 변형 
		
		
		System.out.println("정수 / 정수 = 실수 형식 값으로 구합니다");
		System.out.printf("%d / %d = %.2f\n", a,b,(double)a/b); //실수 형식문자 %f , 기본 소수점 이하 6자리
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
