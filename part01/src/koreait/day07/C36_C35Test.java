package koreait.day07;

public class C36_C35Test {

	public static void main(String[] args) {
		
		C35_GlobalVar test1 = new C35_GlobalVar();
		C35_GlobalVar test2 = new C35_GlobalVar();
	
		//35Ŭ�������� static �� �ƴ� �ν��Ͻ� �������� ��ü���� �ٸ� ���� �����մϴ�.
		test1.count = 10;
		test2.count = 200;
		
		test1.message = "hi test1";
		test2.message = "hello test2";
		
		test1.methodA();
		test2.methodA();
		
		test1.methodC(123);
		test2.methodC(999);
	
		//static ��� �׽�Ʈ : static ���� �Ǵ� �޼ҵ�� Ŭ���� �̸����� ���
		
		C35_GlobalVar.num = 101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num);
		System.out.println("static num = " + test2.num);
	
		// static�� ����Ǵ� �޸� ������ ��ü�� ����Ǵ� �޸� ����(�� ����)�� �ٸ��ϴ�.
		
		System.out.println("TEST = " + C35_GlobalVar.TEST);
//		C35_GlobalVar.TEST = 100;  ���� : final �� ������ �ȵ˴ϴ�.
	
		 C35_GlobalVar test3 = new  C35_GlobalVar();
		 System.out.println("test3.count = " + test3.count);
		 System.out.println("test3.count = " + test3.message);
		 System.out.println("C35_GlobalVar.point = " + C35_GlobalVar.point);
	
	
	
	}

}
	