package day14;

class FinalObject {
	int width = 200;
	final double PI = 3.14159;	// ��� ��� PI
	
	final public double getPi() {
		return PI;
	}
}

class FinalExt extends FinalObject {
	// final �޼ҵ�� �������̵带 �Ҽ� ����.
//	@Override
//	public double getPi() {
//		return 10;
//	}	
}

final class FinalClass {
	int score = 100;
}

// final Ŭ������ ����� �Ұ����ϴ�.
//class FinalClassExt extends FinalClass {
//}

public class FinalExam {
	public static void main(String[] args) {
		System.out.println("==============================");
		FinalObject fo = new FinalObject();
		fo.width = 300;

//		fo.PI = 4.0;	// final�̹Ƿ� ���� �Ұ�
		
		System.out.println(fo.width);
		System.out.println(fo.PI);
		
		FinalClass fc = new FinalClass();
	}
}
