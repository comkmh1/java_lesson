//package project;
//
//public class ClassRoom {
//	// ��� ����
//	public String className;	// �а���
//	public String teacher;		// ������ �̸� ����
//	public String[] students;	// �л��� �̸�[�ִ� 3��]
//
//	// ������(�⺻ ������)
//	public ClassRoom() {
//		this.className = "";				// ���ڿ����� �����ϴ� �ڵ� �ʱ�ȭ
//		this.teacher = new String();		// ���ڿ� Ŭ���� �����ڸ� �̿��� �ʱ�ȭ(��ü ����)
//
//		this.students = new String[3];	// 1���� �迭 ����
//		
//		this.students = new String[3];		// String �迭 �ʱ�ȭ
//
//		// 1���� �迭 ���� �� �ʱ�ȭ(���ڿ������� ����)
//		// students = new String[]{"","",""};
//
//		// 1���� �迭 ���� �� �ʱ�ȭ(Ŭ���� �����ڸ� �̿��� ��ü ����)
//		// students = new String[]{new String(),new String(),new String()};
//	}
//	
//	// �ʱ�ȭ ������
//	public ClassRoom(String className, String teacher, String[] students) {
//		this.className 	= className;
//		this.teacher 	= teacher;
//		this.students 	= students;
//	}
//
//	// ����ϱ� �޼ҵ�
//	public void printClassName() {
//		System.out.println("�츮 �а��� : " + this.className);
//	};
//	public void printTeacher() {
//		System.out.println("�츮�� ������ : " + this.teacher);
//	};
//	public void printStudents() {
//		for (int i = 0; i < students.length; i++) {			
//			System.out.println("�л��� : " + this.students[i]);
//		}
//	}
//
//	// setter �޼ҵ�
//	public void setClassName(String className) {
//		this.className = className;
//	};
//	
//	public void setTeacher(String teacher) {
//		this.teacher = teacher;
//	};
//	
//	// students�� �迭�̹Ƿ� �� �迭 ��ҿ� ���� �����ϱ� ����
//	// index�� �迭 ����� ��ġ�� ��Ÿ����.
//	public void setStudent(int index, String name) {
//		// index�� ����Ű�� ����� �޸� ������
//		// �Ķ���ͷ� �Ѿ�� name�� �����Ѵ�.
//		this.students[index] = name;
//		
//		// index = 0�̸� this.students[0] ��ҿ� �Ű����� name�� ����;
//		// index = 1�̸� this.students[1] ��ҿ� �Ű����� name�� ����;
//		// index = 2�̸� this.students[2] ��ҿ� �Ű����� name�� ����;
//		// index = 3�̸� this.students[3] ��ҿ� �Ű����� name�� ����;
//		// index = 4�̸� this.students[4] ��ҿ� �Ű����� name�� ����;
//	};
//
//	// getter �޼ҵ�
//	public String getClassName() { 
//		return this.className; 
//	};
//	
//	public String getTeacher() { 
//		return this.teacher; 
//	};
//	
//	// students�� �迭�̹Ƿ� �� �迭 ��ҿ� ���� �������� ����
//	// index�� �迭 ����� ��ġ�� ��Ÿ����.	
//	public String getStudent(int index) {
//		// index�� ����Ű�� ����� �޸� ������ ����� ���� ��ȯ�Ѵ�.
//		return this.students[index]; 
//		
//		// index = 0�̸� this.students[0] ��ҿ� ��ü�� ��ȯ;
//		// index = 1�̸� this.students[1] ��ҿ� ��ü�� ��ȯ;
//		// index = 2�̸� this.students[2] ��ҿ� ��ü�� ��ȯ;
//		// index = 3�̸� this.students[3] ��ҿ� ��ü�� ��ȯ;
//		// index = 4�̸� this.students[4] ��ҿ� ��ü�� ��ȯ;	
//	};
//}