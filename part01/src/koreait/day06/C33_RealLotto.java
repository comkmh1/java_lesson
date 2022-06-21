package koreait.day06;

import java.util.Arrays;
import java.util.Random;
// 작성자 : 안동근 
public class C33_RealLotto {

	public static void main(String[] args) {

		int[] numbers = new int[45];   
		Random r = new Random();
		// 처음 상태 : 값을 인덱스 + 1 -> 인덱스 난수를 뽑고 해당 값을 삭제 하면 이 규칙은 적용이 안됩니다.
		for(int i = 0; i < 45; i++) {//인덱스의 범위 : 0 ~44
			numbers[i] = i + 1;		//값의 범위 : 1 ~ 45
		}
		
		System.out.println("numbers 배열 초기값------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-----------------------------------------------");
	
		int[] lotto = new int[6]; // 로또 추첨 번호 개수가 6개 
		int k;	//뽑힐 값의 인덱스 - 난수로 정합니다.
		for(int cnt = 0; cnt < 6; cnt++) {
			k = r.nextInt(45-cnt);	//45 -cnt -> 번호를 추첨한 후 나머지 개수
			System.out.println("k = " + k+ ",numbers =" + numbers[k]);
			
			lotto[cnt] = numbers[k]; //당첨번호를 최종 로또번호에 정렬
			//k위치의 값을 제거 : 인덱스 k - 1 부터 마지막요소 까지 왼쪽으로 이동
			for(int i = k; i < numbers.length - 1; i++) {//선택된 로또 번호를 제외 -> 중복방지 
				numbers[i] = numbers[i + 1];
			}
			System.out.println(Arrays.toString(numbers));
		    
		}	
		System.out.print("최종 선택 숫자 : ");	
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto); // lotto 배열값의 크기 순서대로 위치를 변경합니다.
		System.out.println(Arrays.toString(lotto)); //오름차순으로 출력
		
		}
		}


