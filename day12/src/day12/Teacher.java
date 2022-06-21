package day12;

public class Teacher extends Human {
	public Teacher() {
		super();
	}

	public void print() {
		System.out.println("저는 선생님입니다. 성별은 " + this.getType() + "입니다.");
		System.out.println("저의 이름은" + this.name + ", 저의 나이는 " + this.age);
	}
}
