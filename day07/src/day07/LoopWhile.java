package day07;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 15;
		while(i < 10) {
			System.out.println("ȫ�浿");
			i = i + 1;	
			// i += 1; 	// �� ���� �������� ���� ����
			// i++;		// �� ������ ���� ==> (���� ������)
			// ���������� 3���� ����
		}
//		
		// while�� ������ ���Ӽ�(�ý����� ����ɶ����� ���� �ݺ�, �Ĵ� �޴� Ű����ũ)
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		// 5�� �޴��� ����
//		while(menu <= 4) {
//			System.out.print("1 ~ 4�� �޴��� �����ϼ���(����� 5��)");
//			menu = sc.nextInt();
//			
//			if(menu <= 4) {
//				System.out.println(menu + "�� �޴��� �����ϼ̽��ϴ�.");
//			} else {
//				System.out.println("�ý����� �����մϴ�.");
//			}
//			System.out.println("�ݺ����� ������ ���Դϴ�.");
//		}
//		
//		System.err.println("�ݺ����� ���� ������ ��");
		
		// ���� �ݺ� while��
		while(true) {
			System.out.print("1 ~ 4�� �޴��� �����ϼ���(����� 5��)");
			menu = sc.nextInt();

			if(menu <= 4) {
				System.out.println(menu + "�� �޴��� �����ϼ̽��ϴ�.");
			} else {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			System.out.println("�ݺ����� ������ ���Դϴ�.");
		}
		
		System.err.println("�ݺ����� ���� ������ ��");
	}

}











