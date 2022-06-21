package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		
		
		MyclassX x1 = new MyclassX();
		MyclassY y1 = new MyclassY();
		MyclassZ z1 = new MyclassZ();
		
		InterfaceA x2 = new MyclassX();
		InterfaceB y2 = new MyclassY();
		InterfaceA z2 = new MyclassZ();
		InterfaceB z3 = new MyclassZ();
		
		
// 참조 타입에 따른 메소드 실행(다중 구현체)  		: z1, z2, z3이 어떤 메소드 실행가능한지?
		z1.methodA();
		z1.methodB(23);
		z1.name("쯔위");
		
		z2.methodA();
		z2.methodB(23);
//		z2.name("쯔위");	// 오류 : InterfaceB의 추상메소드로 실행 못함
		
//		z3.methodA();	// 오류 : InterfaceA의 추상메소드로 실행 못함
//		z3.methodB(23);
		z3.name("쯔위");
		
//캐스팅 : 다중 구현체의 인터페이스 타입 캐스팅
		InterfaceB ib = (InterfaceB)z2;
		ib.name("쯔위");
		InterfaceA ia = (InterfaceA)z3;	
		ia.methodA();
		
		System.out.println("---------------------------------");
		
		iAmethod(x2);
//		iAmethod(y2);	//오류 : InterfaceA의 구현체가 아님
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
		
		iBmethod(y1);
		iBmethod(y2);
		iBmethod(z1);
		iBmethod(z3);
		
	
	}
		
	// Interface 구현체는 모두 인자가 될 수 있다.	
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	}
	
		
		
		

}
