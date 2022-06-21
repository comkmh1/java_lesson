package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {

		int a = 23;	//가로
		int b = 19; //세로
		double c = 23.230; //반지름
		
		
		
		System.out.println("사각형의 넓이 : " + (a * b)+"㎠");
		System.out.println("원의 둘레 :" + (2*3.14*c)+"㎠");		
		System.out.println("원의 넓이 :" + (3.14*c*c)+"㎠");	
		
		//final 테스트
		// 변수선언 앞에 final 키워드를 붙이면 값을 변경하지 못한다.
		
		final int test = 123;		//값을 변경하지 못하는 상수 입니다. 
		System.out.println("test = " + test);
		
		
		
		
		
	}

}
