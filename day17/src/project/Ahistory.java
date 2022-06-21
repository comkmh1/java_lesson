package project;
/*
 * 6�� ������Ʈ ���� ��ǥ
 * List
 * 
 */

/* 1. 
 * ClassRoom Ŭ������ �Ʒ��� ���� �����ϼ���
 * 
 * �л��� ��� ������ �ڷᱸ�������� ��ȯ�ϴ� ����
 * Student[] �迭������ �÷����� List�� �̿��Ͽ� �����Ѵ�.
 * Student[] => ArrayList
 * 
 * ��� ���� ����
 * private ArrayList<Student> students;
 * 
 * �����ؾ��� ��� �Լ�(���� ó�� �ڵ常 ����ȴ�.)
 * ClassRoom()
 * public void setClassName(String className)
 * public void setStudent(int index, Student student) 
 * public Student getStudent(int index)
 * public void printStudents()
 * public int getStudentCount()
 * public int getTotal()
 * public int getAverage()
 * 
 * �߰��� ��� �Լ�
 * public void setTeacher(char type, String name, int age)
 * public void setStudent(int index, char type, String name, int age, int[] score)
 * 
 * Student�� List �÷��� �迭�� �����Կ�����
 * �л��� �߰��ϱ� ���� �޼ҵ带 �ϳ� �߰��Ѵ�.
 * ��ȯ���� int�� �߰��ϰ� ���� list�� size�� ��ȯ�Ѵ�.
 * public int addStudent(Student student)
 * 
 */

/* 2.
 * 
 * School Ŭ������ ����� ���⿡ main() �޼ҵ带 �߰��Ѵ�.
 * �׸��� �Ʒ��� ���� ������ ������� Ŭ�������� �׽�Ʈ�Ѵ�. 
 * 
 	public static void main(String[] args) {
		// ���� Ŭ�����ʹ� �����ϹǷ� ���������� Ŭ���� ��ü ���� �� �׽�Ʈ
		Boss boss = new Boss('��', "������", 40);
		boss.print();
	
		// ClassRoom Ŭ���� ��ü ���� �� �׽�Ʈ
		ClassRoom room = new ClassRoom("��ǻ�� ���а�");
		
		// ������ Ŭ������ �����Ͽ� Ŭ���� room�� �����Ѵ�.
		room.setTeacher(new Teacher(room.getClassName(), '��', "�̼���", 50));
		
		// �л� Ŭ���� ��ü�� ������ ������ ���ÿ� �����ϰ�.
		String clsname = room.getClassName();
		room.addStudent(new Student(clsname, '��', "�̼���", 22,  new int[]{10, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "ȫ�浿", 22,  new int[]{20, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "������", 22,  new int[]{30, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�迵ö", 22,  new int[]{40, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�����", 22,  new int[]{50, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "��α�", 22,  new int[]{60, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�ȳ���", 22,  new int[]{70, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�踻��", 22,  new int[]{80, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�̺���", 22,  new int[]{90, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�Ѱ���", 22,  new int[]{100, 80, 80, 90, 70}));
		
		// index ��ġ�� ��Ҹ� �����ϰ��� �Ѵٸ� �Ʒ��� ���� setStudent() �޼ҵ带 ����Ҽ� �ִ�.
		//room.setStudent(9, new Student(clsname, '��', "�ѿ���", 21,  new int[]{100, 80, 80, 90, 70}));
		
		// �Է� ������ Ȯ������.
		room.printClassName();
		room.printTeacher();
		room.printStudents();
	
		System.out.println("�� ���� = " + room.getTotal());
		System.out.println("�� ��� = " + room.getAverage());
	}
	
	
	��°��
	
	============ ���� ���� ���� =============
	�ڸ���IT�б��� ���弱�����Դϴ�.
	�̸��� �������Դϴ�.
	���̴� 40�Դϴ�.
	���ȣ�� 101ȣ �Դϴ�.
	�������δ� 10���� �Դϴ�.
	=====================================
	��ǻ�� ���а��Դϴ�.
	============ ���� ������ ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �̼����Դϴ�.
	���̴� 50�Դϴ�.
	������ ���Դϴ�.
	=====================================
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �̼����Դϴ�.
	���̴� 22�Դϴ�.
	������ [10, 80, 80, 90, 70]�� �Դϴ�.
	������ 330���Դϴ�.
	������ 66.0���Դϴ�.
	=====================================
	.
	.
	.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �Ѱ����Դϴ�.
	���̴� 22�Դϴ�.
	������ [100, 80, 80, 90, 70]�� �Դϴ�.
	������ 420���Դϴ�.
	������ 84.0���Դϴ�.
	=====================================
	�� ���� = 3750
	�� ��� = 75

 */
