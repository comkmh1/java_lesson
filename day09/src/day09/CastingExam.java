package day09;

public class CastingExam {
	public static void main(String[] args) {
		// ���ڸ� ���������� ����ȯ.
		int num = Integer.parseInt("10");
		System.out.println(num);
		
		// ���ڸ� �Ǽ������� ����ȯ.
		double pi = Double.parseDouble("3.14159");
		System.out.println(pi);
		
		System.out.println("10" + "3.14159");	// ���ڿ��̴�.
		System.out.println(num + pi);	// ���ڷ� ����ϱ⸦ ���Ѵ�.
		
		// �������� ���ڿ��� ����ȯ.
		String a = Integer.toString(num);
		// �Ǽ����� ���ڿ��� ����ȯ.
		String b = Double.toString(pi);
		
		// �ڵ� ����ȯ�� �̿��� ���ڿ��� ��ȯ
		String c = 1234 + "";
		String d = num + "";
		System.out.println(d);		
	}
}







