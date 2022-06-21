package project;

public class Aschool {
	public static void main(String[] args) {
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
	}
}
