package project;

public class Aschool {
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
		room.setStudent(0, new Student(clsname, '��', "�̼���", 22,  new int[]{10, 80, 80, 90, 70}));
		room.setStudent(1, new Student(clsname, '��', "ȫ�浿", 22,  new int[]{20, 80, 80, 90, 70}));
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
