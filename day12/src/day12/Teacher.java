package day12;

public class Teacher extends Human {
	public Teacher() {
		super();
	}

	public void print() {
		System.out.println("���� �������Դϴ�. ������ " + this.getType() + "�Դϴ�.");
		System.out.println("���� �̸���" + this.name + ", ���� ���̴� " + this.age);
	}
}
