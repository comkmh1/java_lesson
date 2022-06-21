package day06;

public class LoopFor {

	public static void main(String[] args) {
//		// for문의 간단한 예(홍길동 10번 출력하기)
//		for(int i = 0; i < 10; i = i + 1) {
////			System.out.println("김유신");
//			System.out.println((i + 1) + ". 김유신");
//		}
//		
//		
//		// 1 2 3 ... 20까지 출력하기(2분 생각)
//		for(int i = 0; i < 20; i = i + 1) {
//			System.out.println(i + 1);
//		}
		
		// for문의 단골손님 1 ~ 10까지 모든 합 구하기
//		int sum = 0;	// 1 ~ 10까지 더한 값을 저장할 변수
//		for(int i = 1; i <= 10; i = i + 1) {
//			System.out.printf("%d + %d\t", sum, i);
//			sum = sum + i;	// 누적 연산식
//			System.out.println("더한후 sum = " + sum);
//		}
//		System.out.println(sum);
		
		// 구구단 3단 출력하기
		// ----- 3단 -----
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 3 = 9
		// .....
		// 3 x 9 = 27
		
		// i = i + 1  ====> i++ 같다
		System.out.println("---- 3단 ----");
		for(int i = 1; i < 10; i++) {
			System.out.printf("3 x %d = %d\n", i, 3*i);
		}
	}

}














