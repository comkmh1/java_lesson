package project;

//�б� Ŭ������ ������ ��ü�� �л� ��ü���� ������ �ִ� Ŭ�����̴�.
public class ClassRoom {
	// ��� ����
	private String className;
	private Teacher teacher;
	private Student[] students;

	// ������
	ClassRoom() {
		className = "";
		teacher = new Teacher();
		students = new Student[10];
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
	}
	
	ClassRoom(String className) {
		this();
		this.className = className;
	}
	
	// setter
	public void setClassName(String className) {
		this.className = className;
		this.teacher.setClassName(className);
		for(int i = 0; i < students.length; i++ ) {
			students[i].setClassName(className);
		}
	}
	
	public void setStudent(int index, Student student) {
		this.students[index] = student;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// getter
	public String getClassName() {
		return this.className;
	}
	
	public Student getStudent(int index) {
		return this.students[index];
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	// print �޼ҵ�
	public void printClassName() {
		System.out.println(className + "�Դϴ�.");
	}
	
	public void printTeacher() {
		this.teacher.print();
	}

	public void printStudents() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(i+1 + "�� �л�����.");
			students[i].print();
		}
	}
}