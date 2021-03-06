package koreait.day11;

/*추상클래스 : 객체를 직접생성하지 않는 형태의 클래스 입니다. new 연산 못함.
추상메소드를 갖고 있습니다. 추상(abstract): 구체화되지 않은 상태.
부모클래스에서 구체화되지 않은 추상메소드를 자식클래스가 재정의(오버라이드)하도록 하는 것입니다.
추상메소드를 재정의(구현)한 자식클래스를 정의해서 객체르 생성합니다.
*/

public abstract class ClassAbs {

	protected String name;		//자식 클래스는 다른 패키지에서도 직접 접근. 
	//추상메소드 : 자식들이 재정의하도록 형식만 선언합니다.  
	public abstract void test();
	
	public void print() {
		System.out.println("name = " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	












}
