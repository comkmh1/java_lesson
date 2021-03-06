package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
//난수를 발생하는 Random 클래스의 메소드를 테스트 합니다.
	public static void main(String[] args) {
		Random r = new Random(); //객체 생성
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(); //int 범위내에서 랜덤값(난수)을 만듦
			System.out.println(inum);
		}
		System.out.println("1. 정수형 10개 출력 - bound(경계값) 있음");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100); //0 <= 난수 < 100 범위의 랜덤값을 만듦
			System.out.println(inum);
		} // 경계값은 양수값만 가능합니다.
		
		// 1 <= 난수 < 101 범위의 랜덤값 만들어야 한다면?
		System.out.println("3. 특정범위의 랜덤값 10개 출력 - bound를 이용한 수식");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100) + 1; //1 <= 난수 < 101 범위의 랜덤값을 만듦
			System.out.println(inum);
		}	
		
		//n보다 크거나 같고m보다 작은 범위 난수 :r.nextInt(m-n+1) + n
		
		System.out.println("4. 2 ~ 45 범위의 값으로 난수 10개");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(44) + 2;
			System.out.println(inum);
			
			
		}
			
	
	}
}
