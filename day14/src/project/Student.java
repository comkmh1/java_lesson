package project;

import java.util.Arrays;

public class Student extends Human {
	// final Ű����� ����� ����� ���� Ű�����̴�.
	// static Ű����� ���� ������ ����� ���� Ű�����̴�.
	// ��, �Ʒ��� ���� ����� JOB ����� ���� �� �ʱ�ȭ �� ���̴�.
	final static String JOB = "�л�";
	
	// ��� ����
	private String className;
	private int[] score;

	public Student() {
		super();
		className = "";
		score = new int[5];
	}

	// ������
	public Student(String className, char type, String name, int age, int[] score) {
		super(type, name, age);
		this.className = className;
		this.score = score;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	// setter
	public void setScore(int index, int score) {
		this.score[index] = score;
	}

	public String getClassName() {
		return this.className;
	}

	// getter
	public int getScore(int index) {
		return this.score[index];
	}
	
	// print �޼ҵ�(�߻� �޼ҵ� �������̵�)
	@Override
	public void print() {
		System.out.println("============ ���� �л� ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + this.getName() + "�Դϴ�.");
		System.out.println("���̴� " + this.getAge() + "�Դϴ�.");
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