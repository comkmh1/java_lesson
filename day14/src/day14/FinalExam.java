package day14;

class FinalObject {
	int width = 200;
	final double PI = 3.14159;	// 멤버 상수 PI
	
	final public double getPi() {
		return PI;
	}
}

class FinalExt extends FinalObject {
	// final 메소드는 오버라이드를 할수 없다.
//	@Override
//	public double getPi() {
//		return 10;
//	}	
}

final class FinalClass {
	int score = 100;
}

// final 클래스는 상속이 불가능하다.
//class FinalClassExt extends FinalClass {
//}

public class FinalExam {
	public static void main(String[] args) {
		System.out.println("==============================");
		FinalObject fo = new FinalObject();
		fo.width = 300;

//		fo.PI = 4.0;	// final이므로 수정 불가
		
		System.out.println(fo.width);
		System.out.println(fo.PI);
		
		FinalClass fc = new FinalClass();
	}
}
