package day10;

public class ClassRoom {
	public String className;	// �а���
	public String teacher;		// ������ �̸� ����
	public String[] students;	// �л��� �̸�[�ִ� 3��]

	// �⺻ ������
	public ClassRoom() {
		this.className = "";
		this.teacher = "";

		this.students = new String[3];	// String �迭 �ʱ�ȭ
	}
	
	// �ʱ�ȭ ������
	public ClassRoom(String className, String teacher, String[] students) {
		this.className 	= className;
		this.teacher 	= teacher;
		this.students 	= students;
	}

	// ����ϱ� �޼ҵ�
	public void printClassName() {
		System.out.println("�츮 �а��� : " + this.className);
	};
	public void printTeacher() {
		System.out.println("�츮�� ������ : " + this.teacher);
	};
	public void printStudents() {
		for (int i = 0; i < students.length; i++) {			
			System.out.println("�л��� : " + this.students[i]);
		}
	}

	// setter �޼ҵ�
	public void setClassName(String className) {
		this.className = className;
	};
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	};
	public void setStudent(int index, String name) {
		// index�� ����Ű�� ����� �޸� ������
		// �Ķ���ͷ� �Ѿ�� name�� �����Ѵ�.
		this.students[index] = name;
	};

	// getter �޼ҵ�
	public String getClassName() { 
		return this.className; 
	};
	public String getTeacher() { 
		return this.teacher; 
	};
	public String getStudent(int index) {
		// index�� ����Ű�� ����� �޸� ������ ����� ���� ��ȯ�Ѵ�.
		return this.students[index]; 
	};
}


















