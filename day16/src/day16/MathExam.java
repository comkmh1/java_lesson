package day16;

public class MathExam {
	public static void main(String[] args) {
		// abs ���밪�� ��ȯ�Ѵ�.
		System.out.println("abs ================== ");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1));
		
		// ceil �ø��� ��ȯ
		System.out.println("ceil ====================");
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.7));
		System.out.println(Math.ceil(10.456));
		System.out.println(Math.ceil(10.123));
		
		// �Ҽ� 2��°�ڸ����� �ø� �ϴ� ���
		System.out.println(Math.ceil(10.456 * 100));
		System.out.println(Math.ceil(10.456 * 100) / 100.0);
		
		// floor ������ ��ȯ
		System.out.println("floor ====================");
		System.out.println(Math.floor(10.1));
		System.out.println(Math.floor(10.7));
		System.out.println(Math.floor(10.456));
		System.out.println(Math.floor(10.456 * 100) / 100.0);
		
		// round �ݿø� ��ȯ
		System.out.println("found ===================");
		System.out.println(Math.round(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.456));
		System.out.println(Math.round(10.456 * 100) / 100.0);
		
		// max ���� ū �� ��ȯ
		System.out.println("max =====================");
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(10.1, 10.12));
		
		// min ���� ���� �� ��ȯ
		System.out.println("min =====================");
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(10.1, 10.12));
		
		// random ������ ���� ��ȯ(0.0 ~ 1.0)
		System.out.println("random ==================");
		System.out.println(Math.random());
		
		// �׷� 0 ~ 10������ ������ ������ ���� ���� ���ʹ�.
		// random ���� ���� �Ҽ� ����� > floor�� �Ҽ� �Ʒ� ������ > ���������� ����ȯ
		double rand = Math.random() * 10;
		System.out.println(rand);
		System.out.println(Math.floor(rand));
		System.out.println((int)Math.floor(rand));
	}
}















