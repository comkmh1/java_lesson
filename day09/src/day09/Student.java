package day09;

/*
 * Student ��� Ŭ������ �����
 * ��� ������ �л��̸��� �����Ѵ�.
 * ��� ������ �л��� ���� ������ �����Ѵ�.
 * ��� ������ �л��� ���� ������ �����Ѵ�.
 * 
 * ��� �Լ��� �л��� �̸��� ����ϴ� �޼ҵ带 �����.
 * ��� �Լ��� �л��� ������ ����ϴ� �޼ҵ带 �����(����, ���� ���� ���).
 * ��� �Լ��� �л��� �̸��� ������ ����ϴ� �޼ҵ带 �����.
 */

public class Student {
	String name;
	int eng;
	int kor;
	
	// �⺻ ������
	Student() {
		this.name = "";
		this.eng = 0;
		this.kor = 0;
	}
	
	// �ʱ�ȭ ������
	Student(String name, int eng, int kor) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
	}

	public void printName() {
		System.out.println("�� �̸��� " + this.name + "�Դϴ�.");
	}
	
	public void printScore() {
		System.out.println("���� ������" + this.eng + "�Դϴ�.");
		System.out.println("���� ������" + this.kor + "�Դϴ�.");
	}
	
	public void printInfo() {
		// ����
		int total = eng + kor;
		System.out.println("�� �̸��� " + name + "�̰�, ������ " + total + "�� �Դϴ�.");
	}
	
	public int getTotal() {
		return eng + kor;
	}
}
