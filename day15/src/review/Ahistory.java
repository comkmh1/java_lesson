package review;
/*
 * 4�� ������Ʈ ���� ��ǥ
 * 	�������̽�
 *  static & final
 * 
 * static & final ��� ���
 * �������̽� Ŭ������ �̿��� ���� ��� ���
 * Boss Ŭ���� ����
 */

/* 1.
 * static/final ���þ ����Ͽ� ������ �ʴ� �������� �����.
 * 
 * Student Ŭ�������� �Ʒ��� ���� ����� ���弼��
 * final static String JOB = "�л�";
 * 
 * Teacher Ŭ�������� �Ʒ��� ���� ����� ���弼��
 * final static String JOB = "������";
 *  
 */

/* 2.
 * SpecialJob �������̽��� �Ʒ��� ���� �������� ���弼��.
 * 
 * �������̽� �޼ҵ�
 *	public abstract getJobLevel();
 *	public abstract setJobLevel();
 *	public abstract getJobName();
 *	public abstract setJobName();
 * 
 */

/* 3.
 * Boss Ŭ������ �Ʒ��� ���� �������� ���弼��.
 * Teacher Ŭ������ ��ӹ޴´�.
 * SpecialJob �������̽��� �����Ѵ�.
 * hint) class Boss extends Teacher implements SpecialJob {}
 * 
 * Ŭ���� ���
 * 	final static String SCHOOL = "�ڸ���IT�б�";
 *	final static String JOB = "���弱����";
 *
 * ������
 * 
	public Boss() {
		this('��', "", 0);
		joblevel = 10;
		roomno = 101;
	}
	
	public Boss(char type, String name, int age) {
		// ���弱������ ���� ���� ����.
		// �׷��� className�� �б��̸����� ����
		super(SCHOOL, type, name, age);

		school = SCHOOL;
		jobname = JOB;
		joblevel = 10;
		roomno = 101;
	}
 * 
 * ��� ����
 * 	int roomno;	// ����� ��ȣ
 * 
 * ��� �Լ�
 * 	// setter
 * 	getRoomNo()
 * 	getJobLevel()
 * 	getJobName()
 *  getSchool()
 *  
 * 	// getter
 * 	setRoomNo(char type) 
 * 	setJobLevel()
 * 	setJobName()
 * 	setSchool()
 * 
 * 	// �߻� �޼���
 * 	public abstract void print()
 * 
 * ��, setSchool()�� getSchool()�� className ������ ��Ȱ������.
 * ���弱������ ���� ���� ���� �����Ƿ� �θ��� ���� ������ ��Ȱ���Ѵ�.
 * 	
 * public String getSchool() {
		return this.getClassName();
	}
	public void setSchool(String school) {
		this.setClassName(school);
	}
 */


/* 4.
 * School Ŭ������ ����� ���⿡ main() �޼ҵ带 �߰��Ѵ�.
 * �׸��� �Ʒ��� ���� ������ ������� Ŭ�������� �׽�Ʈ�Ѵ�. 
 * 
	// ClassRoom Ŭ���� ��ü ���� �� �׽�Ʈ
	ClassRoom room = new ClassRoom("��ǻ�� ���а�");
	
	// ������ Ŭ������ �����Ͽ� Ŭ���� room�� �����Ѵ�.
	Teacher te = new Teacher(room.getClassName(), '��', "�̼���", 50);
	room.setTeacher(te);
	
	String clsname = room.getClassName();

	// ù��° �л��� ������ �迭�� ���� �� �ʱ�ȭ�Ѵ�.
	int[] arr1 = new int[]{10, 80, 80, 90, 70};
	// ù��° �л� Ŭ������ ��ü�� �����Ѵ�(�л��� �����Ѵ�)
	Student st1 = new Student(clsname, '��', "�̼���", 22,  arr1);	// scores �迭�� ����
	// room ��ü�� �л��� �����Ѵ�(������ �����Ѵ�).
	room.setStudent(0, st1);

	// �ι�° �л� Ŭ������ ��ü�� ������ ���ÿ� ������ �迭�� ���� �� �ʱ�ȭ.
	Student st2 = new Student(clsname, '��', "�̼���", 22,  new int[]{10, 80, 80, 90, 70});
	// room ��ü�� �л��� �ִ´�(������ �����Ѵ�).
	room.setStudent(1, st2);
	
	// ����°���ʹ� �л� Ŭ���� ��ü�� ������ ������ ���ÿ� �����ϰ�.
	room.setStudent(2, new Student(clsname, '��', "������", 22,  new int[]{30, 80, 80, 90, 70}));
	room.setStudent(3, new Student(clsname, '��', "�迵ö", 22,  new int[]{40, 80, 80, 90, 70}));
	room.setStudent(4, new Student(clsname, '��', "�����", 22,  new int[]{50, 80, 80, 90, 70}));
	room.setStudent(5, new Student(clsname, '��', "��α�", 22,  new int[]{60, 80, 80, 90, 70}));
	room.setStudent(6, new Student(clsname, '��', "�ȳ���", 22,  new int[]{70, 80, 80, 90, 70}));
	room.setStudent(7, new Student(clsname, '��', "�踻��", 22,  new int[]{80, 80, 80, 90, 70}));
	room.setStudent(8, new Student(clsname, '��', "�̺���", 22,  new int[]{90, 80, 80, 90, 70}));
	room.setStudent(9, new Student(clsname, '��', "�Ѱ���", 22,  new int[]{100, 80, 80, 90, 70}));
	
	// ����Ʈ �޼ҵ� �׽�Ʈ
	room.printClassName();
	room.printTeacher();
	room.printStudents();
	
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
	=====================================
	1�� �л�����.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �̼����Դϴ�.
	���̴� 22�Դϴ�.
	������ [10, 80, 80, 90, 70]�� �Դϴ�.
	������ 330���Դϴ�.
	������ 66.0���Դϴ�.
	=====================================
	2�� �л�����.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� ȫ�浿�Դϴ�.
	���̴� 22�Դϴ�.
	������ [20, 80, 80, 90, 70]�� �Դϴ�.
	������ 340���Դϴ�.
	������ 68.0���Դϴ�.
	=====================================
	.
	.
	.
	10�� �л�����.
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �Ѱ����Դϴ�.
	���̴� 22�Դϴ�.
	������ [100, 80, 80, 90, 70]�� �Դϴ�.
	������ 420���Դϴ�.
	������ 84.0���Դϴ�.
	=====================================
 */