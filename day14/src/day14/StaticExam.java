package day14;

class StaticCalc {
	int width = 200;
	static int HEIGHT = 300;
	
	// static 메소드에 대한 설명
	// static는 멤버 변수를 가질수 없다.
	// 독립적으로 사용되는 메소드로 아무대서나 정의하여 사용할 수 있지만
	// 가독성 및 유지보수등을 위해 일반적으로 관련 있는 곳에 모아 놓는다.
	static public int sum(int a, int b) {
		return a + b;
	}
}

public class StaticExam {
	public static void main(String[] args) {
		StaticCalc sc1 = new StaticCalc();
		StaticCalc sc2 = new StaticCalc();
		
		// 첫번째 객체
		System.out.println("=========================");
		System.out.println("sc1의 width = " + sc1.width);
		System.out.println("sc1의 HEIGHT = " + sc1.HEIGHT);
		System.out.println("sc2의 width = " + sc2.width);
		System.out.println("sc2의 HEIGHT = " + sc2.HEIGHT);
		System.out.println("=========================");
		
		sc1.width = 200;
		sc1.HEIGHT = 210;
		sc2.width = 300;
		sc2.HEIGHT = 310;
		
		StaticCalc.HEIGHT = 400;
		
		System.out.println("=========================");
		System.out.println("sc1의 width = " + sc1.width);
		System.out.println("sc1의 HEIGHT = " + sc1.HEIGHT);
		System.out.println("sc2의 width = " + sc2.width);
		System.out.println("sc2의 HEIGHT = " + sc2.HEIGHT);
		System.out.println("=========================");
		
		/*
		 * static 변수는 공용으로 사용하기 위한 메모리 공간을 만들어 
		 * 동일 클래스로 객체화된 모든 객체들이 공용으로 이용하는 변수이다.
		 * static 메서드도 static 변수와 동일한 개념이지만
		 * 일반적으로 메소드는 클래스와 관련된 것들에 기능을 포함하기위한 가독성(?)
		 * 목적으로 더 많이 사용된다.  
		 */
		
//		System.out.println("더하기 결과는 " + sc1.sum(10, 20));
//		System.out.println("더하기 결과는 " + sc2.sum(10, 20));
		
		System.out.println("더하기 결과는 " + StaticCalc.sum(10, 20));
	}
}








