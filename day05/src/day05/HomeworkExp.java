package day05;

import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * �뷡 �Ѱ�� 300���� ���� �뷡�濡�� ����ڿ��� �ݾ��� �Է� ���� �� 
		 * �θ� �� �ִ� ����� �ܵ��� ����Ѵ�. 
		 * 
		 * �󸶸� �ְڽ��ϱ�? :
		 * 1600 �θ��� �ִ� �뷡�� 5���̰�, �ܵ��� 100�� �Դϴ�.
		 */
		// ���ؿ�
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("�󸶸� �ְڽ��ϱ�? : ");
//
//		int song = sc.nextInt();
//		int value = song / 300;
//		int rest = song % 300;
//
//		System.out.printf("�θ� �� �ִ� �뷡�� " + value + "���̰�,");
//		System.out.printf("�ܵ��� " + rest + "�� �Դϴ�.");
//		
//		System.out.println();
//		System.out.println("=================================");
		
		/* 2.
		 * 10~99 ������ ���ڸ� �Է� �޾Ƽ� ���� �ڸ��� ���� �ڸ��� ����Ѵ�.
		 * 
		 * 10~99 ������ ������ �Է��ϼ��� : 98
		 * �����ڸ� : 9
		 * �����ڸ� : 8
		 */
		
		// ��ȿ��
		System.out.print("10 ~ 99 ������ ���ڸ� �Է��ϼ��� : ");

		int input = sc.nextInt();
		int tens = input / 10;
		int units = input % 10;

		System.out.printf("�����ڸ� : %d\n", tens);
		System.out.printf("�����ڸ� : %d\n", units);

		System.out.println("=================================");

		/* 3.
		 * ����ڿ��� ���� ���� ���������� �Է� �޾� ����� ����� ???�� �Դϴ�.
		 * (��, �������� ������ �޾ƿ´�.)
		 * 
		 * �������� : 90
		 * �������� : 50
		 * �������� : 70
		 * ����� ��� ������ 70��
		 */

		// Ȳ����
		System.out.print("�������� : ");
		int score = sc.nextInt();

		System.out.print("�������� : ");
		int score2 = sc.nextInt();

		System.out.print("�������� : ");
		int score3 = sc.nextInt();

		int scoreA = (score + score2 + score3) / 3;

		System.out.println("����� ��� ������ " + scoreA + "��");
	}
}
