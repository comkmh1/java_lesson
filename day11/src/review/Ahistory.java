package review;
/*
 * �ڹ� 1���� ������� �⺻ Ŭ������ ������ ��
 * 
 * Aschool�� ���������Ͽ�
 * ClassRoom Ŭ����
 * Student Ŭ����
 * �� ���� �������� Ŭ������ �����Ǿ� �ִ�.
 * ��, ���ΰ��� ���� ���谡 ����.
 */

/* 1.
 * ClassRoom ��� Ŭ������ �����
 * 
 * ��� ������ �Ʒ��� ���� �����Ѵ�.
 	String className;		// �а���
	String teacher;			// ������ �̸�
	String[] students;		// �л��� �̸�[�ִ� 3��]
	
 * ��, �л����� ������ ���� String Ŭ������ ����Ͽ� �迭�� ����
 * ClassRoom �����ڿ��� �Ʒ��� ���� �迭�� �ʱ�ȭ �Ѵ�.
 * hint) students = new Student[3];
 * 
 * ��� �Լ��� �Ʒ��� ���� �����Ѵ�.
 * ����ϱ� �Լ�
 * 		�а��� ǥ��
 * 		������ �̸� ǥ��
 * 		�л� ��� ǥ��
 * �����ϱ�(Setter) �Լ�
 * 		�а��� ����
 * 		������ �̸� ����
 * 		�л��� �̸� ����
 * 		hint) setStudent(index, �̸�) > (0, "ȫ�浿")
 * ��������(Getter) �Լ�
 * 		�а��� ��������
 * 		������ �̸� ��������
 * 		�л��� �̸� ��������
 * 		hint) getStudent(index) return "ȫ�浿" �̸� ��ȯ

 hint>
	day10 ��Ű���� �����Ѵ�.
	ClassRoom Ŭ����(ClassRoom.java) ������ �����Ѵ�.
	ClassRoom.java ���� �ȿ� �����ϰ� ClassRoom Ŭ������ �����Ѵ�

	public class ClassRoom {
	// �������
		String className;		// �а���
		String teacher;			// ������ �̸�
		String[] students;		// �л��� �̸�

	// ������
	public ClassRoom() {
		className = "";				// ���ڿ����� �����ϴ� �ڵ� �ʱ�ȭ
		teacher = new String();		// ���ڿ� Ŭ���� �����ڸ� �̿��� �ʱ�ȭ(��ü ����)
		
		students = new String[3];	// 1���� �迭 ����
		
		// �ݺ������� �ʱ�ȭ(�� ����� �� ���� ����Ѵ�)
		for(int i = 0; i < students.length; i++) {
			students[i] = new String("");
		}
	}

	print �޼ҵ�,
	setXXX �޼ҵ�[setter �޼ҵ�], 
	getXXX �޼ҵ�[getter �޼ҵ�]

	��� �ڵ� �ۼ�
	}


	�׽�Ʈ(���) ��

	ClassRoom clsroom = new ClassRoom();
		
	// setter �޼ҵ� ����Ͽ� �� ����
	clsroom.setClassName("��ǻ�Ͱ��а�");
	clsroom.setStudent(0, "ȫ�浿");
	clsroom.setStudent(1, "������");
	clsroom.setStudent(2, "������");

	System.out.println("==================================");
	
	// getter �޼ҵ� ����Ͽ� �� �о����
	System.out.println("�а��� : " + clsroom.getClassName());
	System.out.println("1�� �л� : " + clsroom.getStudent(0));
	System.out.println("2�� �л� : " + clsroom.getStudent(1));
	System.out.println("3�� �л� : " + clsroom.getStudent(2));
	
	System.out.println("==================================");
	
	// print �޼ҵ� ���
	clsroom.printClassName();
	clsroom.printTeacher();
	clsroom.printStudents();
	
	System.out.println("==================================");
*/

/* 
	�߰� ��Ʈ

	public class ClassRoom { 
		// �������
	 	String className;		// �а���
		String teacher;			// ������ �̸�
		String[] students;		// �л��� �̸�[�ִ� 3��]
	
		// ������
		public ClassRoom()
	
		// print �޼ҵ�
		public void printClassName()
		public void printTeacher()
		public void printStudents()
	
		// setXXX �޼ҵ�[setter �޼ҵ�]
		public void setClassName(String className)
		public void setTeacher(String name)
		public void setStudent(int index, String name)
	
		// getXXX �޼ҵ�[getter �޼ҵ�]
		public String getClassName()
		public String getTeacher()
		public String getStudent(int index)
	}
 */