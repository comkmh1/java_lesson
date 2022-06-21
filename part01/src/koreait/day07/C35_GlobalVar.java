package koreait.day07;

public class C35_GlobalVar {

	
	
	int count;
	String message;
	static int num;
	static double point;
	static final int TEST = 9999;
	
	
	public static void main(String[] args) { // static 은 static만 접근합니다.
		/* [변수가 선언된 위치로 구분]
		 * 지역변수 : 메소드, for, if, while 등등 {}에서 선언된 변수, 블록을 벗어나면 사용 못함.
		 * 전역변수 : 클래스 {}에서 선언된 변수
		 * [전역변수를 static 여부로 구분]
		 * 클래스이름.변수명
		 * 객체를 만들어서 사용하는 this.변수명(이대 변수는 인스턴스 변수)
		 * 전역변수는 클래스 또는 객체의 특성을 나타낼 때 필드(프로퍼티)라고 부릅니다.
		 */
	
		int num = 10; //main 메소드에서만 사용
		System.out.println("num = " + num);
//		methodA();  //오류
		methodB();
	}
	public void methodA() { // static 메소드가 아니므로 객체를 만들어서 사용하는 메소드 	
		int num = 99;
		System.out.println("num = " + num);
		System.out.println("message = " + message);
	}	
	public static void methodB() {
		int num = 99;
//				지역변수와 전역변수 이름이 같은 경우
		System.out.println("num = " + num);
		System.out.println("num = " + C35_GlobalVar.num);
//				지역변수로 선언된 num. static 일대는 클래스 이름.변수명/static이 아닐때는 this.변수명	
	}
		public void methodC(int count) {
		this.count = count;
	}
	}
	
	
		
		


		
	
	
	
	
	
	
	
	
	
	
	
	
	

