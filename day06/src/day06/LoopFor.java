package day06;

public class LoopFor {

	public static void main(String[] args) {
//		// for���� ������ ��(ȫ�浿 10�� ����ϱ�)
//		for(int i = 0; i < 10; i = i + 1) {
////			System.out.println("������");
//			System.out.println((i + 1) + ". ������");
//		}
//		
//		
//		// 1 2 3 ... 20���� ����ϱ�(2�� ����)
//		for(int i = 0; i < 20; i = i + 1) {
//			System.out.println(i + 1);
//		}
		
		// for���� �ܰ�մ� 1 ~ 10���� ��� �� ���ϱ�
//		int sum = 0;	// 1 ~ 10���� ���� ���� ������ ����
//		for(int i = 1; i <= 10; i = i + 1) {
//			System.out.printf("%d + %d\t", sum, i);
//			sum = sum + i;	// ���� �����
//			System.out.println("������ sum = " + sum);
//		}
//		System.out.println(sum);
		
		// ������ 3�� ����ϱ�
		// ----- 3�� -----
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 3 = 9
		// .....
		// 3 x 9 = 27
		
		// i = i + 1  ====> i++ ����
		System.out.println("---- 3�� ----");
		for(int i = 1; i < 10; i++) {
			System.out.printf("3 x %d = %d\n", i, 3*i);
		}
	}

}














