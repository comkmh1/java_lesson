package day03;

public class PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻ ���� ���� ����
		// Printf() ������ ����� ���� ����ϱ�
		// %d ����ǥ�� ���� ������
		System.out.printf("%d", 10);
		System.out.println();
		
		// %f �Ǽ�ǥ�� ���� ������
		double pi = 3.1415;
		System.out.printf("%f", pi);
		System.out.println();
		pi = 3.1415925;
		System.out.printf("%f", pi);
		System.out.println();
		// �Ǽ����� �Ҽ��� 6�ڸ����� ����Ѵ�.
		
		// �Ҽ��� �Ʒ� 2�ڸ������� ǥ���ϰ� �ʹ��
		System.out.printf("%.2f", pi);
		System.out.println();
		
		// %c ����ǥ�� ���� ������ 
		System.out.printf("%c", 'A');
//		System.out.printf("%c", "A"); <- ���� 
		System.out.println();
		
		// %s ���ڿ� ǥ�� ���� ������
		System.out.printf("%s\n", "A");
		System.out.printf("%s", "10");
		System.out.println();
		
		// ���� ������ ���� ����
		// 10���� ���ڸ��� ����� ������/���� ����
		System.out.printf("%10d\n", 12);
		System.out.printf("%10d\n", 12345);
		System.out.printf("%3d\n", 12345);
		System.out.printf("[%10d]\n", 12345);
		System.out.printf("[%-10d]\n", 12345);
		System.out.printf("[%10s]\n", "Hello");
		System.out.printf("[%-10s]\n", "Hello");

		// ����ִ� ���� 0�̶�� ���ڷ� ä��� �ʹٸ�?
		System.out.println();
		System.out.printf("%010.2f\n", 3.1415);
//		System.out.printf("%010c\n", 'A'); //����
//		System.out.printf("%010s\n", "Hello"); //����
		
		
		// �������� ���� ������ �ѹ��� ����� ��� (���ڸ� �����)
		System.out.println();
		System.out.printf("%d, %f, %c, %s", 10, 3.14, 'A', "Hello");
		
		
		/*
		 *  ====== ������ =====
		 ������ 15000��
		 ����� 5000��
		 «�� 500��
		 
		 */
		
	     System.out.println();
	     System.out.printf("%s %d��\n", "������", 15000);
	     System.out.printf("%s %d��\n", "�����", 5000);
	     System.out.printf("%s %d��\n", "«��", 5000);
	     
	}
	
}
