package day06;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		* 1,2,3 ���ڸ� �Է����� ���� ������ �޴��� ��µǰ�
		* �ܹ���, �ݶ�,  ���̴ٸ� ���� ���� ���� �޴��� ��µǰ�
		* �Ҽ� �ִ� ����� �������?
		*/
		
		System.out.print("1 ~ 3�� �޴��� �����ϼ��� : ");
		String no = sc.next();
		
		switch(no) {
		case "1":
		case "�ܹ���":
			System.out.println("�ܹ��Ÿ� �����ϼ̽��ϴ�.");
			break;	
		case "2":
		case "�ݶ�":
			System.out.println("�ݶ� �����ϼ̽��ϴ�.");
			break;
		case "3":
		case "���̴�":
			System.out.println("���̴ٸ� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�޴��� �������� �ʽ��ϴ�.");
			break;
		}
	}
}








