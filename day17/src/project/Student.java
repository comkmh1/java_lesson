package project;

import java.util.Arrays;

public class Student extends Human {
	final static String JOB = "�л�";
	// ��� ����
	private String className;
	private int[] score;

	// ������
	public Student() {
		super();
		className = "";
		score = new int[5];
	}

	public Student(String className, char type, String name, int age, int[] score) {
		super(type, name, age);
		this.className = className;
		this.score = score;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}

	public void setScore(int index, int score) {
		this.score[index] = score;
	}

	// getter
	public String getClassName() {
		return this.className;
	}

	public int getScore(int index) {
		return this.score[index];
	}
	
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

	// Object Ŭ������ equals() �޼ҵ� �������̵�(������)
	@Override
	public boolean equals(Object obj) {
		// �̿� ���� �ص� ������ ������ ������ ����Ѵ�.
//		return this.value == ((ObjectTest)obj).value;

		// �׷��� ���� ������ ������ ó���Ѵ�.
		if(obj instanceof Student) {
			Student st = (Student)obj;

			boolean a = st.getType() == this.getType(); 
			boolean b = st.getAge() == this.getAge();
			boolean c = st.getClassName().equals(this.className); 
			boolean d = st.getName().equals(this.getName()); 
			boolean e = Arrays.equals(st.score, this.score);

			if( a && b && c && d && e) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

		// ���� �����ϰ��ϴ� ���.
//		if(obj instanceof Student) {
//			Student st = (Student)obj;
//
//			boolean a = st.getType() == this.getType(); 
//			boolean b = st.getAge() == this.getAge();
//			boolean c = st.getClassName().equals(this.className); 
//			boolean d = st.getName().equals(this.getName()); 
//			boolean e = Arrays.equals(st.score, this.score);
//
//			if( a && b && c && d && e) return true;
//		}
//
//		return false;
	}
		

	// Object Ŭ������ toString() �޼ҵ� �������̵�(������)
	@Override
	public String toString() {
		return this.className + " " + this.getName() + " " + this.getAge();
//			return super.toString();
	}
	
	public Student max(Student st) {
		return this.getTotal() > st.getTotal() ? this : st;
	}
}