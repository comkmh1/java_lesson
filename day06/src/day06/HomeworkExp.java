package day06;

import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * �� ������ �Է� �޾Ƽ� �� ���� ���� ��Ÿ����
		 * �� ���׿����ڸ� �̿��Ͽ� ���Ѵ�.
		 *
		 * ù��° ���� �Է��ϼ��� : 10
		 * �ι�° ���� �Է��ϼ��� : 20
		 * 
		 * 30 15 --> �� ���� ���� 15 �Դϴ�.
		 * 90 120 --> �� ���� ���� 30 �Դϴ�.
		 */
		

		// ������
		Scanner sc = new Scanner(System.in);

		System.out.print("ù�� ° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι� ° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();

//		System.out.printf(num1 > num2 ? "�� ���� ���� %d �Դϴ�." : "�� ���� ���� %d �Դϴ�.", 
//				num1-num2, num2-num1);
		
		// ������ ���(����) �ڴ�
//		int res = num1 - num2;
		
		// ���� ������ ���(����) - ������
//		int res = num1 > num2 ? num1 - num2 : num2 - num1;
		
		// 
		int res = num1 - num2;
		res = res < 0 ? res * -1 : res;

		System.out.printf("�� ���� ���� %d �Դϴ�.", res);

		System.out.println();
		System.out.println("===============================================\n");

		/* 2.
		 * ����, ����, ���� ������ �Է� �޾� ����� ���� ��
		 * ����� 80�� �̻��̸� �հ�, �ƴϸ� ���հ� ���
		 * 
		 * �������� : 90
		 * �������� : 90
		 * �������� : 90
		 * ��������� 90������ �հ��Դϴ�.
		 */

		// �赿��
		System.out.print("���� ���� :");
		int kor = sc.nextInt();

		System.out.print("���� ���� :");
		int eng =sc.nextInt();

		System.out.print("���� ���� :");
		int math = sc.nextInt();

		int ever = (kor+eng+math)/3;

//		if(ever >= 80) {
//			System.out.println("��������� " + ever + "���� �հ��Դϴ�");
//		} else {
//			System.out.println("��������� " + ever + "���� ���հ��Դϴ�");
//		}

		String score = ever >= 80 ? "�հ�" : "���հ�";
		System.out.println("��������� " + ever + "����" + score + "�Դϴ�.");

		System.out.println("===============================================\n");		

		/* 3.
		 * ����ڿ��� �� �Ǵ� ����� �ΰ� �� �Ѱ��� �����ϵ��� �ϰ� 
		 * ������ �޴��� ���Ͽ� ǥ���ϱ�
		 * 
		 * ���� ����� �� �� �ϳ��� �����ϼ��� : 
		 * ���� �����ϼ̽��ϴ�.
		 * ������� �����ϼ̽��ϴ�.
		 * 
		 * hint) ���� �񱳽� equals() �޼ҵ� ���
		 */
		

		// ǥ����
		System.out.println("*******�޴�********");
		System.out.println("��");
		System.out.println("�����");
		System.out.println("--------------");

		System.out.println("���� ����� �� �ϳ��� �����ϼ���.");

//		String choice = sc.nextLine();
		String choice = sc.next();

		if(choice.equals("��")) {
			System.out.println("���� �����ϼ̽��ϴ�.");
		} else if(choice.equals("�����")) {
			System.out.println("������� �����ϼ̽��ϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

		System.out.println("===============================================\n");		

		/* 4.
		 * ����ڿ��� 1~3�� ������ �޴��� �Է¹ް�
		 * �� ��ȣ�� �ش��ϴ� �޴��� �Ʒ��� ���� ǥ���Ѵ�.
		 * ��, �׿��� ��ȣ�� ��d���ϸ� "�޴��� �������� �ʽ��ϴ�."�� ���
		 * switch���� ��� �� ��
		 * 
		 * 1 ~ 3�� �޴��� �����ϼ��� : 
		 * 1. �ܹ��Ÿ� �����ϼ̽��ϴ�.
		 * 2. �ݶ� �����ϼ̽��ϴ�.
		 * 3. ���̴ٸ� �����ϼ̽��ϴ�.
		 * �޴��� �������� �ʽ��ϴ�.
		 */

		System.out.print("1 ~ 3�� �޴��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1. �ܹ��Ÿ� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("2. �ݶ� �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("3. ���̴ٸ� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�޴��� �������� �ʽ��ϴ�.");
			break;
		}
		
		sc.close();
		
		
	}
}














