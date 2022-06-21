package project;
/*
 * 2�� ������Ʈ ���� ��ǥ
 * 	�߻� Ŭ����
 * 	ĸ��ȭ(����������)
 * 
 * 
 * ��� ��� ������ private�� �Ѵ�.
 * ��� ��� �Լ��� public�� �Ѵ�.
 * 
 * ClassRoom Ŭ������ ��� ������
 * 	String[] students; ���ڿ� �迭 ������
 * 	Student[] students; Ŭ���� �迭 ������
 * ��ȯ�Ѵ�.
 */

/* 1.
 * Human �߻� Ŭ������ ����� �Ʒ��� ���� ��������
 * 
 * ��� ���� ����
 * 	private char type;		// ����
 * 
 * ��� �Լ� �߰�
 *  	// �߻� �޼���
 * 	public abstract void print()
 */

/* 2.
 * Teacher Ŭ������ ����� Human�� ����ϰ� �Ʒ��� ���� �����Ѵ�.
 * 
 * ��� ���� ����
 * 	private String className;
 * 	private String name;
 * 	private int age;
 * 
 * ��� �Լ� �߰�
 * 	// �߻� �޼ҵ� ����
 *	@Override
 * 	 void print()
 */

/* 3.
 * Student Ŭ������ ����� Human�� ����ϰ� �Ʒ��� ���� �����Ѵ�. 
 * 
 * ��� ���� ����
 * 	private String className;
 * 	private String name;
 *  	private int age;
 * 	private int score;
 * 
 * ��� �Լ� �߰�
 * 	// �߻� �޼ҵ� ����
 *	@Override
 * 	 void print()
 */

/* 4.
 * ClassRoom�� �Ʒ��� ���� �����Ѵ�.
 * 
 * ������
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
 * 
 * ��� ����
 * 	private String className;
 *	private Teacher teacher;
 *	private Student[] students;
 *
 * ��� �Լ�
 *	//setter
 * 	setClassName(String className)
 * 	setStudent(int index, Student student)
 * 	setTeacher(Teacher teacher)
 * 
 * 	//getter
 * 	getClassName()
 * 	getStudent(int index)
 * 	getTeacher()
 * 
 * 	printClassName()
 * 	printTeacher()
 * 	printStudents()
 * 
 * hint>
  	public void setStudent(int index, Student student) {
		students[index] = student;
	}
	
	public Student getStudent(int index) {
		return students[index];
	}
	
	public void printStudents() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(i+1 + "�� �л�����.");
			students[i].print();
		}
	}
 */


/*
 * 5.
 * School�� Ȯ�� ����� �Ʒ��� ����.
 * �׸��� �Ʒ��� ���� ������ ������� Ŭ�������� �׽�Ʈ�Ѵ�. 
 * 
	public static void main(String[] args) {
		// ClassRoom Ŭ���� ��ü ���� �� �׽�Ʈ
		ClassRoom room = new ClassRoom("��ǻ�� ���а�");
		
		// ������ Ŭ������ �����Ͽ� Ŭ���� room�� �����Ѵ�.
		Teacher te = new Teacher(room.getClassName(), '��', "�̼���", 50);
		room.setTeacher(te);
		
		String clsname = room.getClassName();
		
		// ù��° �л� Ŭ������ ��ü�� �����Ѵ�(�л��� �����Ѵ�)
		Student st1 = new Student(clsname, '��', "�̼���", 22,  90);
		// room ��ü�� �л��� �����Ѵ�(������ �����Ѵ�).
		room.setStudent(0, st1);
		
		// �ι�° �л� Ŭ������ ��ü�� �����Ѵ�.
		Student st2 = new Student(clsname, '��', "�̼���", 22,  90);
		// room ��ü�� �л��� �ִ´�(������ �����Ѵ�).
		room.setStudent(1, st2);
		
		// ����°���ʹ� �л� Ŭ���� ��ü�� ������ ������ ���ÿ� �����ϰ�.
		room.setStudent(2, new Student(clsname, '��', "������", 22,  80));
		room.setStudent(3, new Student(clsname, '��', "�迵ö", 22,  60));
		room.setStudent(4, new Student(clsname, '��', "�����", 22,  100));
		room.setStudent(5, new Student(clsname, '��', "��α�", 22,  50));
		room.setStudent(6, new Student(clsname, '��', "�ȳ���", 22,  20));
		room.setStudent(7, new Student(clsname, '��', "�踻��", 22,  80));
		room.setStudent(8, new Student(clsname, '��', "�̺���", 22,  0));
		room.setStudent(9, new Student(clsname, '��', "�Ѱ���", 22,  50));
		
		// ����Ʈ �޼ҵ� �׽�Ʈ
		room.printClassName();
		room.printTeacher();
		room.printStudents();
	}
	
	��°��

	��ǻ�� ���а��Դϴ�.
	============ ���� ������ ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �̼����Դϴ�.
	���������Դϴ�.
	���̴� 50�Դϴ�.
	=====================================
	1�� �л�����.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �̼����Դϴ�.
	������ ���Դϴ�.
	���̴� 22�Դϴ�.
	������ 90�� �Դϴ�.
	=====================================
	2�� �л�����.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �̼����Դϴ�.
	������ ���Դϴ�.
	���̴� 22�Դϴ�.
	������ 90�� �Դϴ�.
	=====================================
	
	~~~~~~~~~~~~~~~~ �߷� ~~~~~~~~~~~~~~~~

	=====================================
	10�� �л�����.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �Ѱ����Դϴ�.
	���̴� 22�Դϴ�.
	������ 50�� �Դϴ�.
	=====================================
 */
