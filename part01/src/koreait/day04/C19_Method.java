package koreait.day04;

public class C19_Method {

	public static void main(String[] args) {
		
		System.out.println("�޼ҵ带 ���� �����ؼ� ����غ��ô�");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����");
		System.out.println("������ �̵��մϴ�, �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ� ��� ���ƿɴϴ�");
	
		System.out.println("1.");
		methodA();
		System.out.println("2.");
		methodB(11,33);
		System.out.println("3.");
		methodC(929,12.1);
		System.out.println("4.");
		methodD();
		System.out.println(methodD());
		int temp = methodD();
		System.out.println(temp);
		System.out.println("5.");
		methodE(3,5);
		int temp2 = methodE(3,5);
		System.out.println(temp2);
	}
	public static void methodA() {
			System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
		}
		
	public static void methodB(int a,int b) {
			System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
			System.out.println("���� ���� �� a =" + a + ",b =" + b);
		}
	public static void methodC(int a, double b) {
		System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���� ���� �� a =" + a + ",b =" + b);
		
	}
	
	public static int methodD() {
		System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
		return 999; 
	}
	public static int methodE(int a, int b) {
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
		return a+b;	
	}
	
	
	
}
