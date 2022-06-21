package koreait.day11;

public class ClassX extends ClassAbs {
	// 추상클래스 상속받은 자식(하위)클래스는 반드시 추가해야 한다.
	private int num;
	
	@Override
	public void test() {
		System.out.println("ClassX 의 test()");
		System.out.println("num = " + num);
	
	
	}


	public void setNum(int num) {
		this.num = num;
	}




}
