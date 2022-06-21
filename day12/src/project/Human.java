package project;

// 추상 클래스 : 추상 메소드가 있으면 반드시 추상 클래스가 되야 한다.
abstract class Human {
	// 멤버 변수는 private로 캡슐화 한다.
	private char type; // 성별

	public Human() {
		this.type = 0;
	}
	
	public Human(char type) {
		this.type = type;
	}
	
	// 추상 메소드는 모든 자식이 일단 무조건 구현해야한다.
	public abstract void print();

	// getter
	public char getType() {
		return type;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}
}