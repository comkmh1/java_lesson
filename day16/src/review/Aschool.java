package review;

public class Aschool {
	public static void main(String[] args) {
		// �׽�Ʈ�� ���� ��ü 3���� ������. 
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
		
	}
}
