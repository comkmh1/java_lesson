package day08;

public class MethodExam {

	public static void main(String[] args) {
//		// ȫ�浿 32��
//		print("ȫ�浿", 32);
//		// ������ 33��
//		print("������", 33);
//		// �̼��� 40��
//		print("�̼���", 40);
//		print("�̼���1", 41);
//		print("�̼���2", 42);
//		print("�̼���3", 43);
//		
		int result = sum(3, 4);
		System.out.println(result);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	// ����� ���� �޼ҵ带 ����� �Ű������� �̸��� ���̸� �Է¹޾� ����Ѵ�.
	public static void print(String name, int age) {
		System.out.println("===============================");
		System.out.println(name);
		System.out.println(age + "�� �Դϴ�.");
		System.out.println("���� ���ѹα� ����Դϴ�.");
		System.out.println("���� ���ѹα� ����Դϴ�.");
		System.out.println("���� ���ѹα� ����Դϴ�.");	
		System.out.println("���� ���ѹα� ����Դϴ�.");
		System.out.println("�ݰ����ϴ�.");
		System.out.println("===============================");
	}
}
