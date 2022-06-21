package project;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassRoom {
	private String className;
	private Teacher teacher;
	/*
	 * �л� Ŭ������ ���� �迭 ��ü�� �÷���(List) �迭�� ��������.
	 * ������ �Ϲ� Ŭ���� �迭�� �÷��� �迭�� ������ ���� ū ���̴�
	 * �迭�� ��� �ѹ� ������ �迭 ������(ũ��, ���⼭�� 10���� ����)��
	 * �����߿� �������� ������ �Ұ����ϴ�.
	 * ������, �÷����� ���� ���� ������ŭ ����� ���������� ����ȴ�.
	 * ��, ���� ��� �� ���Ǹ��� 10��, 20, 13, 20�� ������
	 * ���Ǵ� ��Ȳ�� ���� ũ�⸦ �����ϸ� ����� �� �ִ�.
	 * ����Ʈ�� ��� �� ��Ȯ���� ���� ũ�⸸ŭ�� �迭 ������ ���������.  
	 */
	private ArrayList<Student> students;

	ClassRoom() {
		className = "";
		teacher = new Teacher();
		
		// �������ϰ� �ʱ�ȭ�� �ʿ����(��Ȯ���� ���� �� ������ ������� �ִ�.)
		students = new ArrayList<>();
	}
	
	ClassRoom(String className) {
		this();
		this.className = className;
	}
	
	public void setClassName(String className) {
		// �� Ŭ������ ��� ������ ���� �����ϰ�
		this.className = className;
		
		// �����԰� �л��鵵 ����������.
		this.teacher.setClassName(className);

		// �÷����� Iterator�� �̿��ؼ� �ݺ��ؾ��Ѵ�.		
		for (Iterator<Student> iter = students.iterator(); iter.hasNext();) {
			Student student = (Student)iter.next();
			student.setClassName(className);
		}
	}

	// �÷����� set �޼ҵ带 �̿��ؾ��Ѵ�.
	public void setStudent(int index, Student student) {
		// ���� �߻� outOfBounds error�� ����ϱ����� ��� �ڵ�
		int length = students.size();
		if(index > length-1) {
			System.err.printf("index(%d) �� List length(%d) ���� ũ�Ƿ� �����Ҽ� �����ϴ�.\n", index, length);
			return;
		}

		students.set(index, student);
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getClassName() {
		return this.className;
	}
	
	// �÷����� get �޼ҵ带 �̿��ؾ��Ѵ�.
	public Student getStudent(int index) {
		return students.get(index);
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void printClassName() {
		System.out.println(className + "�Դϴ�.");
	}
	
	public void printTeacher() {
		this.teacher.print();
	}

	public void printStudents() {		
		// �÷����� Iterator�� �̿��ؼ� �ݺ��ؾ��Ѵ�.
//		for (Iterator<Student> iter = students.iterator(); iter.hasNext();) {
//			Student student = (Student)iter.next();
//			// print �޼��带 ����ϰ� �ѹ� �����ϰ� ����
//			student.print();
//		}
		
		// ������ �� ���� foreach ��� ����� ����� ���� �ִ�.
		// students ��� �迭�� ó������ ������ ��ȸ�ϸ鼭 �� ����� ��ü�� �����´�.
		for (Student student : students) {
			student.print();
		}
	}
	
	// �÷����� set �޼ҵ带 �̿��ؾ��Ѵ�.
	public void addStudent(char type, String name, int age, int[] score) {
		/*
		 * Ŭ���� �ܺο��� �޼ҵ带 ���� �Է��� ������ ������ �̿���
		 * ���ο��� Ŭ���� ��ü�� ����� �� ��ü��
		 * ��� ��ü ������ teacher�� �����Ѵ�.
		 */
		students.add(new Student(this.className, type, name, age, score));
	}
	
	// �÷����� set �޼ҵ带 �̿��ؾ��Ѵ�.
	public void setStudent(int index, char type, String name, int age, int[] score) {
		/*
		 * Ŭ���� �ܺο��� �޼ҵ带 ���� �Է��� ������ ������ �̿���
		 * ���ο��� Ŭ���� ��ü�� ����� �� ��ü��
		 * ��� ��ü ������ teacher�� �����Ѵ�.
		 */
		students.set(index, new Student(this.className, type, name, age, score));
	}
	
	public void setTeacher(char type, String name, int age) {
		/*
		 * Ŭ���� �ܺο��� �޼ҵ带 ���� �Է��� ������ ������ �̿���
		 * ���ο��� Ŭ���� ��ü�� ����� �� ��ü��
		 * ��� ��ü ������ teacher�� �����Ѵ�.
		 */
		this.teacher = new Teacher(this.className, type, name, age);
	}
	
	// �÷��� size �޼ҵ带 �̿�
	public int getStudentCount() {
		return students.size();
	}

	public int getTotal() {
		int total = 0;
		// for (Iterator<Student> iter = students.iterator(); iter.hasNext();)
		// ���� ���� ���ϰ� ����Ҽ� �ִ� for(�Ϲ������� foreach�� �θ���) ��
		for (Student student : students) {
			total += student.getTotal();
		}
		
		return total;
	}
	
	// �÷��� size �޼ҵ带 �̿�
	public double getAverage() {
		// List �迭�� ũ�Ⱑ 0���� ������ / by zero ������ �߻�
		if(students.size() <= 0) return 0;

		return this.getTotal() / students.size() / 5.0;
	}
	
	// �л��� list �÷����� ���ڸ��� �߰��ϴ� �޼ҵ� �߰�
	// �߰��ϰ� ���� ����� ��ȯ����.
	public int addStudent(Student student) {
		students.add(student);
		return students.size();
	}
	
	// �ܺο��� �迭 ��ü�� ����� ��츦 ���� �迭 ��ü�� ��ȯ�ϴ� �޼ҵ带 �߰��ߴ�.
	// �� �ܺο��� Student �÷��� �迭 ��ü�� for �� ���� ���� ����ϰ��� �� ��� ��밡��
	public ArrayList<Student> getStudents() {
		return this.students;
	}
}
