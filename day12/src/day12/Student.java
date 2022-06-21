package day12;

public class Student extends Human {
	public Student() {
		super();
	}

	@Override
	public void print() {
		System.out.println("저는 학생입니다. 성별은 " + this.getType() + "입니다.");
		System.out.println("저의 이름은" + this.name + ", 저의 나이는 " + this.age);
	}
}
