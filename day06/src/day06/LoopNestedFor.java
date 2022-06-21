package day06;

public class LoopNestedFor {

	public static void main(String[] args) {
		// 이중 반복문을 사용하여 아래와 같이 출력하기
		// 1. 12345
		// 2. 12345
		// 3. 12345
		// 4. 12345
		// 5. 12345
		
		// 위에서 아래 1 ~ 5
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + ".");
			for(int j = 0; j < 5; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
