package review;
/*
 * 5�� ������Ʈ ���� ��ǥ
 * 	Object Ŭ����
 * 
 * toString() �޼ҵ� �������̵�
 * equals() �޼ҵ� �������̵�
 */

/* 1.
 *  
 * ��� ��ü�� ������ Object�� �ִ� 
 * toString() �޼ҵ带 �������̵�����.
 * 
 * Student ��ü�� toString() �޼ҵ带 
 * ����� �Ʒ��� ���� ��µǵ��� �Ѵ�.
 * 
 * public String toString()
 * ��ȯ���� "�а��� �̸� ����"�� ��ȯ�ϵ��� �Ѵ�.
 * 
 * �޼ҵ� �����ȯ ��
 * 	��ǻ�� ���а� �̼��� 22
 */

/* 2.
 *  
 * ��� ��ü�� ������ Object�� �ִ� 
 * equals() �޼ҵ带 �������̵�����.
 * 
 * Student ��ü�� equals() �޼ҵ带 
 * ����� �Ʒ��� ���� ���θ� �����Ѵ�.
 * 
 * 1. �л� ���� ��
 * 2. �л� ���� ��
 * 3. �л� �а� ��
 * 4. �л� �̸� ��
 * 5. �л� ���� ��
 * 
 * hint>
 * 3,4�� String�� �񱳴� equals() �޼ҵ� �̿�
 * 5�� int[] �迭 �񱳴� Arrays.equals(a, b) �޼ҵ� �̿� 
 */

/* 3.
 * �л��� ������ ���Ͽ� ���� ū �л� ��ü�� 
 * ��ȯ�ϴ� �޼ҵ带 �����Ѵ�.
 * 
 * �޼ҵ��
 *  public Student max(Student st)
 *  
 * ��ȯ��
 * 	Student ��ü
 * 
 */

/* 4.
 * School Ŭ������ ����� ���⿡ main() �޼ҵ带 �߰��Ѵ�.
 * �׸��� �Ʒ��� ���� ������ ������� Ŭ�������� �׽�Ʈ�Ѵ�. 
 * 
	Student st1 = new Student("��ǻ�� ���а�", '��', "�̼���", 22,  new int[]{10, 80, 80, 90, 70});
	Student st2 = new Student("��ǻ�� ���а�", '��', "�̼���", 22,  new int[]{10, 80, 80, 90, 70});
	Student st3 = new Student("��ǻ�� ����", '��', "ȫ�浿", 12,  new int[]{80, 70, 90, 90, 40});

	// toString�� �������̵��Ͽ� "�а� �̸� ����"�� ��ȯ�Ѵ�. 
	System.out.println(st1.toString());
	System.out.println(st2.toString());
	System.out.println(st3.toString());
	System.out.println("======================");
	
	// equals�� �������̵��Ͽ� "�а� ���� ���� �̸� ����(��������)"�� ���Ѵ�.
	System.out.println("���� ������ �� = " + st1.equals(st2));
	System.out.println("�ٸ� ������ �� = " + st1.equals(st3));
	System.out.println("======================");
	
	System.out.println(st1.getAverage());
	System.out.println(st3.getAverage());
	System.out.println("======================");
	
	��°��

	��ǻ�� ���а� �̼��� 22
	��ǻ�� ���а� �̼��� 22
	��ǻ�� ���� ȫ�浿 12
	======================
	���� ������ �� = true
	�ٸ� ������ �� = false
	======================
	66.0
	74.0
	======================
	��ǻ�� ���� ȫ�浿 12
	
 */