package day05;

import java.util.Scanner;

public class ConditionIF {

	public static void main(String[] args) {
		System.out.println("���ǹ��� �����ϱ� ��!!!");
		if(11 < 10) {
			System.out.println("if�� ���� ��¹� 1");
			System.out.println("if�� ���� ��¹� 2");
		} else {
			System.out.println("else�� ���� ��¹� 1");
			System.out.println("else�� ���� ��¹� 2");
		}
		System.out.println("���ǹ��� �����ϰ� ����!!!");
		System.out.println("========================");
		
		// ���� �Ѱ��� �Է� �޾� �� ������ ¦����� ¦������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���� �Ѱ��� �Է����ּ��� : ");
//		
//		int num = sc.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("¦�� �Դϴ�.");
//		} else {
//			System.out.println("Ȧ�� �Դϴ�.");
//		}

//		if(num % 2 == 1) {
//			System.out.println("Ȧ�� �Դϴ�.");
//		}
		
		// ����ڰ� �Է��� ����
		// 3�� ����� 3�� ����Դϴ�.
		// 4�� ����� 4�� ����Դϴ�.
		// ����ϱ�..

//		System.out.print("���� �Ѱ��� �Է����ּ��� : ");
//		int number = sc.nextInt();
//
//		if(number % 3 == 0) {
//			System.out.println("3�� ����Դϴ�.");
//		}
//		
//		if(number % 4 == 0) {
//			System.out.println("4�� ����Դϴ�.");
//		}
		
		int score = 72; 
		if(score < 60) {
			System.out.println("F �����Դϴ�");
		} else if(score >= 60 && score < 70) {
			System.out.println("D �����Դϴ�.");
		} else if(score >= 70 && score < 80) {
			System.out.println("C �����Դϴ�.");
		} else if(score >= 80 && score < 90) {
			System.out.println("B �����Դϴ�.");
		} else {	// score > 90 
			System.out.println("A �����Դϴ�.");
		}		
	}
}












