package day06;

public class Exam02 {

	public static void main(String[] args) {
		/*
		* switch������, case�� ������ �������� ���ڿ� ���� �̿밡���ϴٰ� ���� ������ϴ�.
		* ��κ��� ������ ���� ���� �̿��Ѵٰ� �ϼ̽��ϴ�.
		* 
		* �׷��� ���� case�� ������ ���ڿ��� ����� ���, 
		* ���� ��� case "�ȳ�" �̶�� �ۼ��ϸ�, 
		* 
		* �ش� ������ "�ȳ�"�̶�� ���ڿ� ���̿�, 
		* �ܼ� ���ڿ� �񱳸� �ϴ��� ��ü�� �ּҸ� ���ϴ� ������ �ñ��մϴ�!! 
		*/

		// new �����ڸ� ���� ��ü�� ����� �׻� �ٸ� �޸� ������ ���´�.
//		String str = "�ȳ��ϼ���";
		String str1 = new String("�ȳ�");	// ���ο� �޸� ���� ����
		String str2 = new String("�ȳ�");	// ���ο� �޸� ���� ����

		// �� ��ü���� �޸� ��
		System.out.println("str1 �ּ� : " + System.identityHashCode(str1));	// �� ��ü��
		System.out.println("str2 �ּ� : " + System.identityHashCode(str2));	// �� ��ü�� �ٸ���.

		// ����� ���� ���� �����ϴٸ� �޸� ����(�ּ�)�� �����ϴ�.
		System.out.println("�ȳ� ��� �ּ� 1 : " + System.identityHashCode("�ȳ�"));	// �ȳ� �޸𸮿�
		System.out.println("�ȳ� ��� �ּ� 2 : " + System.identityHashCode("�ȳ�"));	// �ȳ� �޸𸮴� �����ϴ�.
		System.out.println("�ݰ� ��� �ּ� 3 : " + System.identityHashCode("�ݰ�"));	// ������ ���� �ٸ��Ƿ� �޸𸮰� �ٸ���.

		// String �޸� �ּ� ��
		// ��ü�� ������ ���ڿ��� �޸𸮴� �ٸ����� ���� �����ϴ�.
		System.out.println(str1 == str2);	// false
		System.out.println(str1.equals(str2));	// true

		// ����� ������ "�ȳ�" ���ڿ��� �޸𸮴� �����ϴ�.
		System.out.println("�ȳ�" == "�ȳ�");	// true
		System.out.println("�ȳ�".equals("�ȳ�"));
		System.out.println("�ȳ�".equals(str2));
		System.out.println(System.identityHashCode("�ȳ�"));

		// ��� ----- 
		// str1�� �޸� �ּҿ� "�ȳ�" ����� �޸� �ּҴ� �ٸ���
		// ����, switch �������� �޸� �ּҰ� �ƴ� ������ �񱳸� �Ѵ�.
		switch (str1) {
		    case "�ȳ�":
		        System.out.println("�ȳ��ϼ���");
		        break;
		    default:
		        System.out.println("�ݰ����ϴ�.");
		        break;
		}
		
//		�ȳ� �� ���� �޸��ּҴ� �ȳ��� �� ���� �� ���� ��ǻ�Ͱ� ����ϰ� �ִٴ� �����ΰ���?
		// "�ȳ�"�̶�� ���ڿ��� ������ �ִ� �޸� �ּҸ� ã�Ƽ� ��ȯ�Ѵ�.
		
		// �׷� ���ݺ��� ���� ��� String a = "�ȳ�"; 
		// ���� String a = new String("�ȳ�"); �� ���°� �� ������?

		//�������� String�� �ּҶ� ���� ���� ����ǰ� ������ 
		// �⺻��(int, float, double ���)���� �ּҶ� 
		// ���� ���� ���� ����ǳ���?

	}
}








