package day12;

public class Student extends Human {
	public Student() {
		super();
	}

	@Override
	public void print() {
		System.out.println("���� �л��Դϴ�. ������ " + this.getType() + "�Դϴ�.");
		System.out.println("���� �̸���" + this.name + ", ���� ���̴� " + this.age);
	}
}
