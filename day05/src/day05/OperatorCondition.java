package day05;

import java.util.Scanner;

public class OperatorCondition {
	public static void main(String[] args) {
		System.out.println(true ? 10 : 20);
		System.out.println(false ? 10 : 20);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		
		int age = sc.nextInt();

//		// age > 19 ? "����" : "�̼�����"
//		System.out.println(age > 19 ? "����" : "�̼�����");
//		// 60���� ������ ���� �ƴϸ� ����
//		System.out.println(age > 60 ? "����" : "����");
		
		// 19���ϸ� �̼����� 19 ~ 60 ���� 60���̻��̸� ����
		System.out.println(age > 19 ? age > 60 ? "����" : "����" : "�̼�����");
	}
}
