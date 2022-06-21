package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		
		Person momo = new Person();
//		ClassAbs abs = new ClassAbs();  // 오류 : ClassAbs는 추상클랫 new를 사용할 수 없다. 추상메소드를 구체화하지 못 했기 때문에
		ClassAbs abs = new ClassX();	//부모 타입 참조
		ClassX cls = new ClassX();		//자식 클래스 타입 참조
		
		abs.test();
		cls.test();
		abs.name = "손흥민";
		cls.name = "모모";
		abs.print();
		cls.print();
//		abs.setNum(1);  	오류 : 부모 타입 참조이기 때문에 자식 클래스에서만 정의된 메소드는 사용 불가
		cls.setNum(2);
		ClassX x = (ClassX)abs;
		x.setNum(100);
		
		
	}

}
