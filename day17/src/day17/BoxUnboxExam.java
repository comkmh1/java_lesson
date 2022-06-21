package day17;

public class BoxUnboxExam {
	public static void main(String[] args) {
		// Boxing
		Integer a1 = new Integer(10);
		Integer a2 = new Integer("100");
		
		// deprecated(����? ��������) version 9 ����
		Integer a3 = Integer.valueOf(10);
		Integer a4 = Integer.valueOf("100");
		
		System.out.println(a3);
		System.out.println(a4);
		
		// ������ �̿��ؼ��� ����
		int ab1 = 10;
		String ab2 = "100";
		System.out.println(Integer.valueOf(ab1));
		System.out.println(Integer.valueOf(ab2));
		
		// ���� ���ڿ��� ���ڰ� ���Եȴٸ�?
//		System.out.println(Integer.valueOf("123a"));
		
		// Unboxing
		int ab3 = a3.intValue();
		String ab4 = a4.toString();
		
		System.out.println(ab3);
		System.out.println(ab4);
		
		// �Ǽ���
		Double d1 = new Double(10.1);	//deprecated
		
		// boxing
		Double d2 = Double.valueOf(10.1);
		Double d3 = Double.valueOf("100.1");
		
		// unboxing
		double ad1 = d2.doubleValue();
		int ad2 = d3.intValue();	// �Ҽ����� ���ŵȴ�.
		
		System.out.println(ad1);
		System.out.println((double)ad2);	// �ٲ㵵 �״�� 100�� ���´�.
		
		// ���� �ڽ� & ��ڽ�
		Integer au1 = 10;	//int
//		 Integer au2 = "100";	// ����ڽ� �Ұ�
		
		int au3 = au1; // ���� ��ڽ�
		int au4 = 100 + au1;	// ���� ��ڽ�
		
		System.out.println(au1);
		System.out.println(au3);
		System.out.println(au4);
		
//		Integer a = Integer.valueOf("123");
//		int b = Integer.parseInt("A12345");
//		System.out.println(a);
//		System.out.println(b);
	}
}













