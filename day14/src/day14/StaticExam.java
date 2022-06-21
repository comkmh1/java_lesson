package day14;

class StaticCalc {
	int width = 200;
	static int HEIGHT = 300;
	
	// static �޼ҵ忡 ���� ����
	// static�� ��� ������ ������ ����.
	// ���������� ���Ǵ� �޼ҵ�� �ƹ��뼭�� �����Ͽ� ����� �� ������
	// ������ �� ������������ ���� �Ϲ������� ���� �ִ� ���� ��� ���´�.
	static public int sum(int a, int b) {
		return a + b;
	}
}

public class StaticExam {
	public static void main(String[] args) {
		StaticCalc sc1 = new StaticCalc();
		StaticCalc sc2 = new StaticCalc();
		
		// ù��° ��ü
		System.out.println("=========================");
		System.out.println("sc1�� width = " + sc1.width);
		System.out.println("sc1�� HEIGHT = " + sc1.HEIGHT);
		System.out.println("sc2�� width = " + sc2.width);
		System.out.println("sc2�� HEIGHT = " + sc2.HEIGHT);
		System.out.println("=========================");
		
		sc1.width = 200;
		sc1.HEIGHT = 210;
		sc2.width = 300;
		sc2.HEIGHT = 310;
		
		StaticCalc.HEIGHT = 400;
		
		System.out.println("=========================");
		System.out.println("sc1�� width = " + sc1.width);
		System.out.println("sc1�� HEIGHT = " + sc1.HEIGHT);
		System.out.println("sc2�� width = " + sc2.width);
		System.out.println("sc2�� HEIGHT = " + sc2.HEIGHT);
		System.out.println("=========================");
		
		/*
		 * static ������ �������� ����ϱ� ���� �޸� ������ ����� 
		 * ���� Ŭ������ ��üȭ�� ��� ��ü���� �������� �̿��ϴ� �����̴�.
		 * static �޼��嵵 static ������ ������ ����������
		 * �Ϲ������� �޼ҵ�� Ŭ������ ���õ� �͵鿡 ����� �����ϱ����� ������(?)
		 * �������� �� ���� ���ȴ�.  
		 */
		
//		System.out.println("���ϱ� ����� " + sc1.sum(10, 20));
//		System.out.println("���ϱ� ����� " + sc2.sum(10, 20));
		
		System.out.println("���ϱ� ����� " + StaticCalc.sum(10, 20));
	}
}








