package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
//���ǽ��� ����� ���� ����� �����ϴ� ���ǿ����� : ���ǽ�? ��/����T 
	public static void main(String[] args) {
		int korean, math; //��������, ��������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� ->");
		korean = sc.nextInt();
		System.out.println("���� ���� �Է� ->");
		math = sc.nextInt();
		
		//���������� �������� ��� 80�� �̻��ΰ�? ->����л�
		System.out.println("����л� ? " + ((korean>=80 && math>=80)? "�½��ϴ�.":"�ƴմϴ�."));
		
//		if: ó���ϴ� ����� �����ϴ� ���ǹ�
//		{}�ȿ� ���� ����� 1���� ���� ������ �� �ֽ��ϴ�.
		if(korean >= 80 && math >= 80) {  
			//���ǽ��� ���� �� �����ϴ� ��ɵ� 
			System.out.println("�½��ϴ�");
		} 
		else {
			// ���ǽ��� ������ �� �����ϴ� ��ɵ�
			System.out.println("�ƴմϴ�.");
		}
		if(korean>=90 || math >=90)
			System.out.println("�½��ϴ�");
		else
			System.out.println("�ƴմϴ�.");
		

//		else { } �� �ش��ϴ� ������ ������ �ۼ� ���մϴ�.
		
			
		
	}

}
