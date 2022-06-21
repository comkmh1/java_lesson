package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {
	public static void main(String[] args) {
		//try ����
		Scanner sc = new Scanner(System.in);
		try {
			// Exception ���ɼ��� �ִ� ������ �ۼ� -> ������ ����� catch �� ���ϴ�.
			// ����ġ���� ���� ���� �ϸ� try{}�� ��������
		} catch (NullPointerException e) { // 	���� ���ο� ���� Exception ������ �˻��մϴ�.
			//NullPointerException �϶��� �Ʒ� ������ ó���մϴ�.
			e.printStackTrace();	//������ �����ϱ� ���� ������ ���(���� Exception ��� ����)
		} catch (InputMismatchException e) {
			// catch �� ������ �ۼ� �����դ���.
		}	finally { //����������, ����������: ���� �߻� ������� ����Ǵ� �κ��Դϴ�.
			//�ַ� �ڿ��� �����ϴ� �ڵ� �ۼ��մϴ�.
			sc.close();
		}	
		
		
		//		try ������ ���� �Ǵ� catch ������ ������ ������ ������ ��� �˴ϴ�.
		
	}
}