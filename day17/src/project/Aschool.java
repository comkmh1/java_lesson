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
		room.addStudent(new Student(clsname, '��', "�̼���", 22,  new int[]{10, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "ȫ�浿", 22,  new int[]{20, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "������", 22,  new int[]{30, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�迵ö", 22,  new int[]{40, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�����", 22,  new int[]{50, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "��α�", 22,  new int[]{60, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�ȳ���", 22,  new int[]{70, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�踻��", 22,  new int[]{80, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '��', "�̺���", 22,  new int[]{90, 80, 80, 90, 70}));
		room.addStudent('��', "�Ѱ���", 22,  new int[]{100, 80, 80, 90, 70});
		
		// index ��ġ�� ��Ҹ� �����ϰ��� �Ѵٸ� �Ʒ��� ���� setStudent() �޼ҵ带 ����Ҽ� �ִ�.
//		room.setStudent(0, new Student(clsname, '��', "�ѿ���", 21,  new int[]{100, 80, 80, 90, 70}));

		// �Է� ������ Ȯ������.
		room.printClassName();
		room.printTeacher();
		room.printStudents();

		System.out.println("�� ���� = " + room.getTotal());
		System.out.println("�� ��� = " + room.getAverage());
	}	
}
