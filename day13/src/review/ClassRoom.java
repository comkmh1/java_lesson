package review;

// �б� Ŭ������ ������ ��ü�� �л� ��ü���� ������ �ִ� Ŭ�����̴�.
public class ClassRoom {
	// ��� ����
	private String className;
	private Teacher teacher;
	private Student[] students;	// �迭�� �ϴ� 10����

	// ������
	ClassRoom() {
		className = "";
		
		// Teacher ��ü�� �����Ѵ�.
		teacher = new Teacher();
		
		// Student �迭�� �����Ѵ�(Student ��ü ������ �ƴԿ� ��������).
		students = new Student[10];

		// �ݺ������� �ʱ�ȭ(�� ����� �� ���� ����Ѵ�)
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
	} 
	
	ClassRoom(String className) {
		//this() �޼ҵ�� �⺻ �����ڸ� ȣ���Ͽ� �����Ѵ�(�޼ҵ� ����).
		this();	// �ʱ�ȭ�� �� ����� �Ѵ�.
		
		// className �Ű����� ���� ���ڽ��� ��� ������ �����Ѵ�.
		this.className = className;
	}
	
	// setter
	public void setClassName(String className) {
		// �� Ŭ������ ��� ������ ���� �����ϰ�
		this.className = className;
		
		// �а����� �л��� ������ ��� �����ϹǷ� ������ ��ġ�� �ʿ��ϴ�.
		// ������ ��ü�� �а��� ����������
		this.teacher.setClassName(className);

		// �л� ��ü���� �а��� ����������
		for(int i = 0; i < students.length; i++ ) {
			students[i].setClassName(className);
		}
	}
	
	// students�� �迭�̹Ƿ� �� �迭 ��ҿ� ���� �����ϱ� ����
	// index�� �迭 ����� ��ġ�� ��Ÿ����.
	public void setStudent(int index, Student student) {
		this.students[index] = student;

		// index = 0�̸� this.students[0] ��ҿ� �Ű����� students�� ����;
		// index = 1�̸� this.students[1] ��ҿ� �Ű����� students�� ����;
		// index = 2�̸� this.students[2] ��ҿ� �Ű����� students�� ����;
		// index = 3�̸� this.students[3] ��ҿ� �Ű����� students�� ����;
		// index = 4�̸� this.students[4] ��ҿ� �Ű����� students�� ����;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// getter
	public String getClassName() {
		return this.className;
	}
	
	// students�� �迭�̹Ƿ� �� �迭 ��ҿ� ���� �������� ����
	// index�� �迭 ����� ��ġ�� ��Ÿ����.
	public Student getStudent(int index) {
		return this.students[index];
		
		// index = 0�̸� this.students[0] ��ҿ� ��ü�� ��ȯ;
		// index = 1�̸� this.students[1] ��ҿ� ��ü�� ��ȯ;
		// index = 2�̸� this.students[2] ��ҿ� ��ü�� ��ȯ;
		// index = 3�̸� this.students[3] ��ҿ� ��ü�� ��ȯ;
		// index = 4�̸� this.students[4] ��ҿ� ��ü�� ��ȯ;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	// print �޼ҵ�
	public void printClassName() {
		System.out.println(this.className + "�Դϴ�.");
	}
	
	public void printTeacher() {
		this.teacher.print();
	}

	public void printStudents() {
		for(int i = 0; i < this.students.length; i++) {
			System.out.println(i+1 + "�� �л�����.");
			this.students[i].print();
		}
	}
}

















