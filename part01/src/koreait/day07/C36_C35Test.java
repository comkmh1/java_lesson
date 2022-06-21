package koreait.day07;

public class C36_C35Test {

	public static void main(String[] args) {
		
		C35_GlobalVar test1 = new C35_GlobalVar();
		C35_GlobalVar test2 = new C35_GlobalVar();
	
		//35클래스에서 static 이 아닌 인스턴스 변수에는 객체마다 다른 값을 저장합니다.
		test1.count = 10;
		test2.count = 200;
		
		test1.message = "hi test1";
		test2.message = "hello test2";
		
		test1.methodA();
		test2.methodA();
		
		test1.methodC(123);
		test2.methodC(999);
	
		//static 요소 테스트 : static 변수 또는 메소드는 클래스 이름으로 사용
		
		C35_GlobalVar.num = 101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num);
		System.out.println("static num = " + test2.num);
	
		// static이 저장되는 메모리 영역과 객체가 저장되는 메모리 영역(힙 영역)은 다릅니다.
		
		System.out.println("TEST = " + C35_GlobalVar.TEST);
//		C35_GlobalVar.TEST = 100;  오류 : final 은 변경이 안됩니다.
	
		 C35_GlobalVar test3 = new  C35_GlobalVar();
		 System.out.println("test3.count = " + test3.count);
		 System.out.println("test3.count = " + test3.message);
		 System.out.println("C35_GlobalVar.point = " + C35_GlobalVar.point);
	
	
	
	}

}
	