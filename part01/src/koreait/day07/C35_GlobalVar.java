package koreait.day07;

public class C35_GlobalVar {

	
	
	int count;
	String message;
	static int num;
	static double point;
	static final int TEST = 9999;
	
	
	public static void main(String[] args) { // static �� static�� �����մϴ�.
		/* [������ ����� ��ġ�� ����]
		 * �������� : �޼ҵ�, for, if, while ��� {}���� ����� ����, ����� ����� ��� ����.
		 * �������� : Ŭ���� {}���� ����� ����
		 * [���������� static ���η� ����]
		 * Ŭ�����̸�.������
		 * ��ü�� ���� ����ϴ� this.������(�̴� ������ �ν��Ͻ� ����)
		 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� �ʵ�(������Ƽ)��� �θ��ϴ�.
		 */
	
		int num = 10; //main �޼ҵ忡���� ���
		System.out.println("num = " + num);
//		methodA();  //����
		methodB();
	}
	public void methodA() { // static �޼ҵ尡 �ƴϹǷ� ��ü�� ���� ����ϴ� �޼ҵ� 	
		int num = 99;
		System.out.println("num = " + num);
		System.out.println("message = " + message);
	}	
	public static void methodB() {
		int num = 99;
//				���������� �������� �̸��� ���� ���
		System.out.println("num = " + num);
		System.out.println("num = " + C35_GlobalVar.num);
//				���������� ����� num. static �ϴ�� Ŭ���� �̸�.������/static�� �ƴҶ��� this.������	
	}
		public void methodC(int count) {
		this.count = count;
	}
	}
	
	
		
		


		
	
	
	
	
	
	
	
	
	
	
	
	
	

