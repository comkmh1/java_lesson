package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		
		System.out.println("[[���� ���� ���α׷�]]");
		String best = "����";	// Ư������ ������ ����
		Scanner sc = new Scanner(System.in);
		
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int science = sc.nextInt();
		int total = korean + english + science;
		int average =  (korean + english + science) / 3;
		
		System.out.println("���� -> " + korean);
		System.out.println("���� -> " + english);
		System.out.println("���� -> " + science);
		System.out.println("������ " + total +" �� �Դϴ�.");
		System.out.println("����� " + average + " �� �Դϴ�.");	
		System.out.println("������� 3���� �Դϴ�.");
	
		int max;
		if(korean > english) {
			max = korean;
		}
		else {
			max = english;
		}
		if(max < science) {
			max = science;
		}
		
		if(max == korean) {
			 best = "����";
		}
		else if(max == english) {
			 best = "����";
		}
		else if(max == science) {
			 best = "����";
		}
		System.out.printf("�� �л��� Ư������� %s �Դϴ�.",best);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
