package day05;

public class ConditionSwitch {
	public static void main(String[] args) {
		int num = 3;
		
		// switch ���ǹ� ����
		switch(num) {
		case 1:
			System.out.println("���� 1�Դϴ�.");
			break;
		case 3:
			System.out.println("���� 3�Դϴ�.");
			System.out.println("Ȧ���Դϴ�.");
			break;
		case 5:
			System.out.println("���� 5�Դϴ�.");
			break;
		default:
			System.out.println("�⺻ ������ �����Ѵ�.");
			break;
		}
		
		// ���� ������ if������ �ٲ㺻�ٸ�
		if(num == 1) {
			System.out.println("1");
		} else if(num == 3) {
			System.out.println("3");
		} else if(num == 5) {
			System.out.println("5");
		} else {
			System.out.println("�⺻");
		}
		
		
		// String ������ ����غ���
		
		String a = "�ϼ���.";		
		switch(a) {
		case "�ȳ�":
			System.out.println("���� 1�Դϴ�.");
			break;
		case "�ϼ���":
			System.out.println("���� 3�Դϴ�.");
			System.out.println("Ȧ���Դϴ�.");
			break;
		case "�ݰ���":
			System.out.println("���� 5�Դϴ�.");
			break;
		default:
			System.out.println("�⺻ ������ �����Ѵ�.");
			break;
		}
		
//		double score = 1.5;	// double ������ switch�� �ȵȴ�.
//		switch(score) {
//		case 1.5:
//			System.out.println("1.5 �Դϴ�.");
//			break;
//		default:
//			System.out.println("�⺻ ���� ����");
//			break;
//		}
		
		char ch = 'a';
		switch(ch) {
		case 97:	// int->number
			System.out.println("a �Դϴ�.");
			break;
		default:
			break;
		}
	}
}
