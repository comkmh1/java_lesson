package day09;

class ClassRoom {
	String teacher = "�踻��";
	String[] students = {"�̼���", "������"};
	
	public void teach() {
		System.out.println("�踻�� �������� ��� ����Ĩ�ϴ�.");
	}
	
	public void study() {
		System.out.println("�̼���, ������ �л����� ��� ���ϴ�.");
	}
}

public class ClassExam {
	public static void main(String[] args) {
		System.out.println("Ŭ���� ����....");
		
		// ClassRoom Ŭ������ cls ��ü ����
		ClassRoom cls;
		// cls ��ü ����(���� ��ü�� �޸𸮿� ����)
		cls = new ClassRoom();
		
		// �����԰� �л��� ��� ������ ����غ���.
		System.out.println(cls.teacher);
		System.out.println(cls.students[0]);
		System.out.println(cls.students[1]);

		// ��� �Լ�(���)�� ����� ����.
		cls.teach();
		cls.study();
	}
}










