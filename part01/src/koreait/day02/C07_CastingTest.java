package koreait.day02;


public class C07_CastingTest {

	public static void main(String[] args) {

		
//		���Թ� : ������ ��/����/������ ���� ������ ����.
//				������� +, -, *, /(������ ��), %(������ ������) 
//				���迬�� ==(����) , !=(���� �ʴ�), >, <, >=, <=
//				������ &&(and,�׸���), ||(or,�Ǵ�), !(not)

		int a = 123; 
		int b = 10;
		double c = 10.34;		
		// ���꿡 ���Ǵ� �ǿ����ڰ� 
		
		
		int isum;
		double dsum;
		
		isum = a+b;
		dsum = a+c;
		
		
		System.out.println("a + b = " + isum);	
		System.out.println("a + b = " + dsum);	

//		����ȯ(ĳ����) : ���� + �Ǽ� ����� �� ���� ������ �����ؾ� �Ѵٸ� �Ǽ��� ������ ����ȯ �� �Ŀ� �����Ѵ�.
		
		isum = a + (int)c; // c������ �Ǽ����� ������ ��ȯ 
		
		System.out.println("a +(int)c = " + isum);
		
		System.out.println(" a / b =" + (a/b));  //�������� ������ ��� ����
		System.out.println(" a / b =" + (a%b));  //�������� �������� ������
		
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);
		
//		���� ����ȯ(ĳ����) ���� : �������� ������ ����� �Ǽ��� ���ϴ� ó�������϶�
//		-> ���� �Ѱ��� �Ǽ��� ���� 
		
		
		System.out.println("���� / ���� = �Ǽ� ���� ������ ���մϴ�");
		System.out.printf("%d / %d = %.2f\n", a,b,(double)a/b); //�Ǽ� ���Ĺ��� %f , �⺻ �Ҽ��� ���� 6�ڸ�
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
