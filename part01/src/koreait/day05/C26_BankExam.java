package koreait.day05;

import java.util.Scanner;

// GUI : Graphic User Interface(����� ����� ������, �޴� ������� ó��)
// CLI : Command Line Interface(����� ����� �ؽ�Ʈ�� ó��)

public class C26_BankExam {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	boolean run = true;	//�ݺ��� ������ ����
	int sel; //���� ���� ����
	int balance = 0; // �ܰ�(�ܾ�) 
	
	
	while(run) {
		int money; 
		System.out.println("--------------------------");
		System.out.println(" 1.����  | 2.��� | 3.�ܰ� Ȯ�� | 4.����");
		System.out.println("--------------------------");
		System.out.println("�޴� ���� >>>");
		sel = sc.nextInt();
			
		switch(sel) {
		case 1:
				System.out.print("���ݾ� > ");
				money = sc.nextInt();
				balance += money;
				
				System.out.println("������ �ܾ��� "+ balance + "���Դϴ� ");
				break;
		case 2: //��� ó�� (��ݱݾ��Է� -> �ܾ׺��� ���� ���� �� ó��(�ܾ׿��� ����))
				System.out.print("��ݾ� > ");
				money = sc.nextInt();
				if(money > balance)
					System.out.println("�ܾ��� �����մϴ�. Ȯ���ϼ���!");
				else
					balance -= money;
				System.out.println("������ �ܾ��� " + balance + " �� �Դϴ�");
				break;
		case 3: //�ܰ�(balance) ���
				System.out.println("���� �ܰ� : " + balance);
				System.out.println();
				break;
		case 4: // �ݺ� ����
				System.out.println("���α׷��� �����մϴ�");
				run =false;	//switch�ȿ��� break �� while Ż���� �� �����ϴ�.
				break;
		default://1,2,3,4 �� ������ ���� ��
				System.out.println("�߸��� �����Դϴ� 1~4�� �Է��ϼ���");
				
				
		
		}	
	
	}
	System.out.println("*******End*******");
}
}