package day06;

public class LoopNestedFor {

	public static void main(String[] args) {
		// ���� �ݺ����� ����Ͽ� �Ʒ��� ���� ����ϱ�
		// 1. 12345
		// 2. 12345
		// 3. 12345
		// 4. 12345
		// 5. 12345
		
		// ������ �Ʒ� 1 ~ 5
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + ".");
			for(int j = 0; j < 5; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
