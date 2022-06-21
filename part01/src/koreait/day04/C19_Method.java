package koreait.day04;

public class C19_Method {

	public static void main(String[] args) {
		
		System.out.println("메소드를 직접 정의해서 사용해봅시다");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해");
		System.out.println("실행을 이동합니다, 메소드 실행이 종료되면 다시 main 메소드 제어가 돌아옵니다");
	
		System.out.println("1.");
		methodA();
		System.out.println("2.");
		methodB(11,33);
		System.out.println("3.");
		methodC(929,12.1);
		System.out.println("4.");
		methodD();
		System.out.println(methodD());
		int temp = methodD();
		System.out.println(temp);
		System.out.println("5.");
		methodE(3,5);
		int temp2 = methodE(3,5);
		System.out.println(temp2);
	}
	public static void methodA() {
			System.out.println("##첫번째 메소드 정의 연습입니다.##");
		}
		
	public static void methodB(int a,int b) {
			System.out.println("##두번째 메소드 정의 연습입니다.##");
			System.out.println("전달 받은 값 a =" + a + ",b =" + b);
		}
	public static void methodC(int a, double b) {
		System.out.println("##세번째 메소드 정의 연습입니다.##");
		System.out.println("전달 받은 값 a =" + a + ",b =" + b);
		
	}
	
	public static int methodD() {
		System.out.println("##네번째 메소드 정의 연습입니다.##");
		return 999; 
	}
	public static int methodE(int a, int b) {
		System.out.println("##다섯번째 메소드 정의 연습입니다.##");
		return a+b;	
	}
	
	
	
}
