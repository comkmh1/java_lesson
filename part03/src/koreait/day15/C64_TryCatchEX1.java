package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEX1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String message = null;
			int cnt = message.length();
			
			System.out.println("���� �Է� >>> ");
//			int n = sc.nextInt();
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("����� �Է��� �� : " + n);
		}
//		}catch(NullPointerException e) {
			//�߻��� ���� ������ Exception ��ü�� �����ϰ� �̿� ���� ���������� e�Դϴ�.
		// | ��ȣ�� bit ���� or ���� : Exception ��Ʈ������ ���� 
		catch(NullPointerException | NumberFormatException e) {	
			System.out.println("���� �߻� : " +e.getMessage());
			System.out.println("����� ��ɿ� ������ �߻��߽��ϴ�.");
		}finally {
			sc.close();
		}
		
		
	
	
	
	
	
	
	
	}

}
