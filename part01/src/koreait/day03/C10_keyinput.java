package koreait.day03;

import java.util.Scanner;

public class C10_keyinput {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
			
	int data;
	
	System.out.println("������ �Է��ϼ���. -> ");
	
	data = sc.nextInt();
	System.out.println("�Էµ� ���� " + data + " �Դϴ�.");
   	
	double point;
	System.out.println("�Ǽ��� �Է��ϼ���. -> ");
	
	point = sc.nextDouble();
	System.out.println("�Էµ� ����" + point + " �Դϴ�"); 
		
	
	
	int width;
	int height;
	int box_area;
	double hat,round,circle_area;
	final double PI = 3.14;
	
	System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
	System.out.println("�簢�� ���� �Է� -> ");
	width = sc.nextInt();
	System.out.println("�簢�� ���� �Է� -> ");
	height = sc.nextInt();
	
	box_area = width*height;
	
	
	}

}
/* ǥ�� ��� : System.out (out�� System Ŭ������ ������ �ʵ�)
   ǥ�� �Է� : System.in  (out�� System Ŭ������ ������ �ʵ�)
      -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ��Ű�� ��� ���.
      -> �⺻ ��Ű���� Ŭ������ �ƴϹǷ� import �� �ʿ��մϴ�. 
		*����: �⺻��Ű�� java.lang�� import ���� ����մϴ�.
*/
