package project;

public class Aschool {
	public static void main(String[] args) {
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
	}
}
