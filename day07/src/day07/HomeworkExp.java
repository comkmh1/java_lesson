package day07;

import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		// 1. 
		// ������ 2~9�� ����ϱ�
		// ------ 2�� -------
		// 2 x 1 = 2
		// .....
		// 2 x 9 = 18
		// ------ 3�� -------
		// 3 x 1 = 3
		// .....
		// 3 x 9 = 27

		// ����ȫ
//		for (int i = 2; i < 10; i++) {
//			System.out.println("-----"+ i + "��" + "-----");
//			for (int j = 1; j < 10; j++) {
//				int result = i * j;
//				System.out.println(i + " x " + j + " = " + result);
//				
//			}
//		}

		/* 2.
		 * �ݺ����� ����ϰ� 1 ~ 100�� �ϳ��� ���� �Է¹޾�
		 * 1���� �Էµ� ���ڱ��� ������ ���ϴ� �ݺ����� ����ÿ�.
		 * 
		 * 1 ~ 100������ ������ �ϳ��� �Է��ϼ��� : 10
		 * 1���� 10������ ������ 55�Դϴ�.
		 * 
		 */

		// ������
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("1~100������ ���� �� �ϳ��� �Է��ϼ��� : ");
//
//		int num = sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			sum += i;	// sum = sum + i; �����ϴ�.
//		}
//		System.out.printf("1���� %d������ ������ %d�Դϴ�.",num,sum);

//		if(num>=1 && num<=100) {	// ���ܻ�Ȳ ó��
//			for(int i=1;i<=num;i++) {
//				sum+=i;
//			}
//			System.out.printf("1���� %d������ ������ %d�Դϴ�.",num,sum);
//		}
//		else {
//			System.out.println("1���� 100������ ���ڰ� �ƴմϴ�.");
//		}

//		System.out.println();
//		System.out.println("================================================");

		/* 3.
		 * �ݺ����� ����Ͽ� �Ʒ��� ���� ��µǵ��� ���弼��.
		 * 
		 * #
		 * ##
		 * ###
		 * 
		 * #�� 1 ~ 3������ ���ʷ� ���
		 * hint) 
		 * 1. String ������ "#"�� ����, ���� �ϴ� ���
		 * 2. for�� �ȿ� for���� ����� ���� �ݺ��� ��� ���.
		 * # ���� for ���� 1�϶� ���� for ���� 1�� ����ȴ�.
		 * ## ���� for ���� 2�϶� ���� for ���� 2�� ����ȴ�.
		 * ### ���� for ���� 3�϶� ���� for ���� 3�� ����ȴ�.
		 */

		// �赿��
//		String t ="#";
		
		for(int i=1;i<=3;i++) {			

			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}
}
