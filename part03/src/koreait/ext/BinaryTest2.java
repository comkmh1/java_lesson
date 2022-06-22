package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {
	public static void main(String[] args) {
		
		int n10 = 123;
		int n16 = 0xa41c; 	//16���� ǥ�� 0x�� �����մϴ�.
		int n2 = 0b1010010000011100;	// 2���� ǥ��	0b�� �����մϴ�.
		
		System.out.println("1. ������ �״�� ���");
		System.out.println("10���� ���ͷ� : " + n10);
		System.out.println("16���� ���ͷ� : " + n16);	//������ ����� format ���� ���ϸ� 10������ ���ɴϴ�.
		System.out.println("2���� ���ͷ� : " + n2);
		
		System.out.println("2. format ����");
		System.out.println(String.format("%x", n2));	//16���� ���� %x
		System.out.println(String.format("%x", n16));
		
		//��� :10���� 42012, n16�� n2 ���� ���� �޸𸮿� ����ɶ��� ��� ������ 0,1 ǥ�����Դϴ�.
	
		System.out.println("3. -1�� 2����, 16���� ǥ�� Ȯ��");
		n16 = 0xffffffff;
		System.out.println("16���� 0xffffffff : " + n16);		//-1
		System.out.printf("-1�� 16����%x\n",-1);
		System.out.println("-1�� 2���� : " + Integer.toBinaryString(-1));
		
		System.out.println("4. �Է��� 2���� �Ǵ� 16�������� 10������ �ٲپ� �帳�ϴ�.");
		Scanner sc = new Scanner(System.in);
		System.out.println("2���� �� �Է� >>> ");
		String t2 = sc.nextLine();
		System.out.println("16���� �� �Է� >>>");
		String t16 = sc.nextLine();
		//������ integer.parstInt(s)�� s���ڿ��� 10���� ǥ���̶�� �ǹ��Դϴ�.
		System.out.println(String.format("2���� %s �� 10���� %d �Դϴ�." ,t2,Integer.parseInt(t2,2)));	//t2�� 2�����̴�  
		System.out.println(String.format("16���� %s �� 10���� %d �Դϴ�." ,t16,Integer.parseInt(t16,16))); //t16�� 16�����̴�.
		
		//n���� ���ڿ� -> 10�� ������ ��ȯ Integer.parseInt(���ڿ�,n)
		//10�� �������� -> n���� ���ڿ� Integer.toBinaryString �޼ҵ�, toHexString �޼ҵ�
		
		//format ���� %d�� 10����, %x�� 16����, %o�� 8���� , 2������ ���������� �����ϴ�.
		
		//2������ ��Ʈ ���� : %, |, ^, ~, >>, << ��� 
		
	}
}
