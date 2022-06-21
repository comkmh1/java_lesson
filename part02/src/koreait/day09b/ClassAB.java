package koreait.day09b;
import koreait.day09a.ClassA;
public class ClassAB extends ClassA{
	
	public void test() { 
//		System.out.println("name = " + name); // 오류 : name 필드 접근한정자는 디폴트 다른 패키지에서 사용 못합니다.
		title = "momo"; // 상속받은 tilte 필드 : 다른패키지 이지만 protected 접근한정자로 자식클래스는 허용.
		System.out.println("tilte = " + title);
		System.out.println("신비");
		System.out.println("name = " + getName());
		
		
	}
	
	
}
