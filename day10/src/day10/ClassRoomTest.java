package day10;

public class ClassRoomTest {

	public static void main(String[] args) {
//		ClassRoom clsroom = new ClassRoom();
//		
//		// setter �޼ҵ� ����Ͽ� �� ����
//		clsroom.setClassName("��ǻ�Ͱ��а�");
//		
//		clsroom.setTeacher("�̼���");
//
//		clsroom.setStudent(0, "ȫ�浿");
//		clsroom.setStudent(1, "������");
//		clsroom.setStudent(2, "������");
//		
//		System.out.println("==================================");
//		
//		// getter �޼ҵ� ����Ͽ� �� �о����
//		System.out.println("�а��� : " + clsroom.getClassName());
//		System.out.println("������ : " + clsroom.getTeacher());
//		System.out.println("1�� �л� : " + clsroom.getStudent(0));
//		System.out.println("2�� �л� : " + clsroom.getStudent(1));
//		System.out.println("3�� �л� : " + clsroom.getStudent(2));
//		
//		System.out.println("==================================");
		
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

















