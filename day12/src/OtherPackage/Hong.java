package OtherPackage;

import day12.Human;

public class Hong extends Human {
	@Override
	public void print() {
		System.out.println("���� �������Դϴ�. ������ " + this.getType() + "�Դϴ�.");
		System.out.println("���� �̸���" + this.name + ", ���� ���̴� " + this.age);
	}
}
