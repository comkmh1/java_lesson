package review;

public class Aschool {
	public static void main(String[] args) {
		// ���� Ŭ������ ���� ��ü ���� �� �׽�Ʈ
		ClassRoom cls = new ClassRoom();

		// setter �޼ҵ� ����Ͽ� �� ����
		cls.setClassName("��ǻ�Ͱ��а�");
		cls.setStudent(0, "ȫ�浿");
		cls.setStudent(1, "������");
		cls.setStudent(2, "������");

		System.out.println("==================================");
		
		// getter �޼ҵ� ����Ͽ� �� �о����
		System.out.println("�а��� : " + cls.getClassName());
		System.out.println("1�� �л� : " + cls.getStudent(0));
		System.out.println("2�� �л� : " + cls.getStudent(1));
		System.out.println("3�� �л� : " + cls.getStudent(2));
		
		System.out.println("==================================");
		
		// print �޼ҵ� ���
		cls.printClassName();
		cls.printTeacher();
		cls.printStudents();
	
		System.out.println("==================================");
		// �л��� �����ϴ� �迭�� �����.
		String[] students = new String[] {"�̼���", "������", "ȫ�浿" };
		// Ŭ������ ����� �迭�� �л��� �Ķ���ͷ� ����
		ClassRoom cr = new ClassRoom("��ǻ�� ���а�", "�踻��", students);

		// print �޼ҵ� ���
		cr.printClassName();
		cr.printTeacher();
		cr.printStudents();
		
	}
}
