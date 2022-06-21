package project;

import java.util.Arrays;

public class Student extends Human {
	private String className;
	// score�� �迭�� ��������.
	private int[] score;
	// age, name�� �θ� Ŭ������ �̵��ߴ�. 

	public Student() {
		// super() �޼ҵ带 �̿��� �ʱ�ȭ�� �θ��� �������̿��Ͽ� �ʱ�ȭ�� �� �ִ�.
		super();	// type, name, age�� ���� ���⼭ �ʱ�ȭ�ȴ�.

		className = "";
		
		// �迭 ����
		score = new int[5];
	}

	public Student(String className, char type, String name, int age, int[] score) {
		// super() �޼ҵ带 �̿��� �ʱ�ȭ�� �θ��� �������̿��Ͽ� �ʱ�ȭ�� �� �ִ�.
		super(type, name, age);	// type, name, age�� ���� ���⼭ �ʱ�ȭ�ȴ�.

		this.className = className;

		// �迭 �ʱⰪ ����
		this.score = score;	// �迭�� ������ �״�� �迭��...
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}
	
	// setName, setAge�� Human Ŭ������ �ִ�.

	// score�� �迭�̹Ƿ� �� �迭 ��ҿ� ���� �����ϱ� ����
	// index�� �迭 ����� ��ġ�� ��Ÿ����.
	public void setScore(int index, int score) {
		// �� ���� �迭�� index�� �ش��ϴ� ����� ���� ����
		this.score[index] = score;
		
		// index = 0�̸� this.score[0] ��ҿ� score�� ����;
		// index = 1�̸� this.score[1] ��ҿ� score�� ����;
		// index = 2�̸� this.score[2] ��ҿ� score�� ����;
		// index = 3�̸� this.score[3] ��ҿ� score�� ����;
		// index = 4�̸� this.score[4] ��ҿ� score�� ����;
	}

	// getter
	public String getClassName() {
		return this.className;
	}

	// getName, getAge�� Human Ŭ������ �ִ�.
	
	// score�� �迭�̹Ƿ� �� �迭 ��ҿ� ���� �������� ����
	// index�� �迭 ����� ��ġ�� ��Ÿ����.
	public int getScore(int index) {
		// �� ���� �迭�� index�� �ش��ϴ� ����� ���� ��������
		return this.score[index];
		
		// index = 0�̸� this.score[0] ��ҿ� ���� ��ȯ;
		// index = 1�̸� this.score[1] ��ҿ� ���� ��ȯ;
		// index = 2�̸� this.score[2] ��ҿ� ���� ��ȯ;
		// index = 3�̸� this.score[3] ��ҿ� ���� ��ȯ;
		// index = 4�̸� this.score[4] ��ҿ� ���� ��ȯ;
	}
	
	// print �޼ҵ�(�߻� �޼ҵ� �������̵�)
	@Override
	public void print() {
		System.out.println("============ ���� �л� ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + this.getName() + "�Դϴ�.");
		System.out.println("���̴� " + this.getAge() + "�Դϴ�.");
		System.out.println("������ " + this.getType() + "�Դϴ�.");
		// Arrays.toString�� �̿��Ͽ� �迭�� ���� ���ڿ��� ǥ��
		System.out.println("������ " + Arrays.toString(score) + "�� �Դϴ�.");
		System.out.println("������ " + this.getTotal() + "���Դϴ�.");
		System.out.println("������ " + this.getAverage() + "���Դϴ�.");
		System.out.println("=====================================");
	}

	// ���� ����ϱ� �޼ҵ�
	public int getTotal() {
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}

	// ��� ����ϱ� �޼ҵ�
	public double getAverage() {
		return getTotal() / this.score.length;
	}
}