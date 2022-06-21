package day12;

public abstract class Human {
	// 일반적으로 클래스 변수에 값을 직접 접근하지 않는다. 그래서 보호(숨김)한다.
	// 나 이외에는 접근 불가
	private String type;
	
	protected int age;	// 나이
	public String name;

	public Human() {
		this.type = "남성"; 
	}

	public abstract void print();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

