package review;
/*
 * 1�� ������Ʈ ���� ��ǥ
 * 	��ü���� ���α׷���
 * 	���
 */

/* 1.
 * Human �θ� Ŭ������ ����� �Ʒ��� ���� �߰�����
 * ������
 * 	Human() {
		this.type = 0;
	}
 * 	Human(char type) {
		this.type = type;
	}
 * 
 * ��� ����
 * 	char type;		// ����
 * 
 * ��� �Լ�
 * 	// setter
 * 	setType(char type) 
 * 	// getter
 * 	getType()
 *  
 */

/* 2.
 * Teacher Ŭ������ ����� Human�� ����Ѵ�.
 * �׸��� �Ʒ��� ���� ������� �߰��Ѵ�.
 * ������
 * 	Teacher()
 * 	Teacher(String className, char type, String name, int age)
 * 
 * ��� ����
 * 	String className;
 * 	String name;
 * 	int age;
 * 
 * ��� �Լ�
 *  
 *  // setter
 *  setClassName(String className)
 *  setName(String name)
 *  setAge(int age)
 *  
 *  // getter
 *  String getName()
 *  int getAge()
 *  
 *  // �޼ҵ�
 *  void print()
 */

/* 3.
 * Student Ŭ������ ����� Human�� ����Ѵ�.
 * �׸��� �Ʒ��� ���� ������� �߰��Ѵ�.
 * ������ �ִ� Student�� ������ �ϰų� �Ǵ� �Ʒ��� �µ��� �����Ѵ�. 
 * 
 * ������
 * 	Student()
 * 	Student(String className, char type, String name, int age, int score)
 * 
 * ��� ����
 * 	String className;
 * 	String name;
 *  int age;
 * 	int score;
 * 
 * ��� �Լ�
 *  
 *  // setter
 *  setClassName(String className)
 *  setName(String name)
 *  setAge(int age)
 *  setScore(int score)
 *  
 *  // getter
 *  String getClassName()
 *  String getName()
 *  int getAge()
 *  int getScore()
 *   
 *  void print()
 */

/* 4.
 * ClassRoom Ŭ������ �ϴ� �״�� �ΰ�
 * School Ŭ������ ����� ���⿡ main() �޼ҵ带 �߰��Ѵ�.
 * �׸��� �Ʒ��� ���� ������ ������� Ŭ�������� �׽�Ʈ�Ѵ�. 
 * 
	// Teacher Ŭ���� ��ü ���� �� �׽�Ʈ
	Teacher te = new Teacher("��ǻ�� ���а�", '��', "ȫ�浿", 40);
	te.print();

	System.out.println("\n");
	
	// Student Ŭ���� ��ü ���� �� �׽�Ʈ
	Student st = new Student("��ǻ�� ���а�", '��', "������", 16, 90);
	st.print();
	
	// Teacher setter/getter �׽�Ʈ
	System.out.println("\n");
	te.setClassName("������ ���а�");
	te.setName("������");
	te.setAge(30);
	te.setType('��');
	
	System.out.println("�а� : " + te.getClassName());
	System.out.println("�̸� : " + te.getName());
	System.out.println("���� : " + te.getAge());
	System.out.println("���� : " + te.getType());
	
	// Teacher setter/getter �׽�Ʈ
	System.out.println("\n");
	st.setClassName("������ ���а�");
	st.setName("�賲��");
	st.setAge(20);
	st.setScore(90);
	st.setType('��');
	
	System.out.println("�а� : " + st.getClassName());
	System.out.println("�̸� : " + st.getName());
	System.out.println("���� : " + st.getAge());
	System.out.println("���� : " + st.getScore());
	System.out.println("���� : " + st.getType());
	
	��� ���
	============ ���� ������ ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� ȫ�浿�Դϴ�.
	���������Դϴ�.
	���̴� 40�Դϴ�.
	=====================================
	
	
	============ ���� �л� ���� =============
	��ǻ�� ���а��Դϴ�.
	�̸��� �������Դϴ�.
	������ ���Դϴ�.
	���̴� 16�Դϴ�.
	������ 90�� �Դϴ�.
	=====================================
	

	�а� : ������ ���а�
	�̸� : ������
	���� : 30
	���� : ��
	
	
	�а� : ������ ���а�
	�̸� : �賲��
	���� : 20
	���� : 90
	���� : ��
 */