package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
	public static void main(String[] args) {
		
		/* 학생 성적(국어) 분포 보고서를 만듭니다.
		 * 학생 인원은 100명 - 점수는 랜덤값으로 테스트(0 <= 난수 <= 100)
		 * 90 ~ 100 : x명 (소수점 1자리%)    카운트변수가 5개 필요합니다.
		 * 80 ~ 89 : x명 (소수점 1자리%)				ㄴ counts[5] : counts[0],counts[1]
		 * 70 ~ 79 : x명 (소수점 1자리%) count[2]
		 * 60 ~ 69 : x명 (소수점 1자리%) count[3]
		 * 60점 미만 : x명 (소수점 1자리%) count[4]
		 *   
		 */
		
		int[] koreans = new int[100];
		int[] counts = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < koreans.length; i++) {
			koreans[i] = r.nextInt(101);
			//국어 점수 저장
		}
		//점수 분포 count하기
		for(int i =0; i < koreans.length; i++) {
			if(koreans[i] >= 90)	counts[0]++;
			else if(koreans[i] >= 80)	counts[1]++;
			else if(koreans[i] >= 70)	counts[2]++;
			else if(koreans[i] >= 60)	counts[3]++;
			else	counts[4]++;
		}
		
		//점수 분포 출력하기
		System.out.println("90 ~ 100\t 80 ~ 89\t 70 ~ 79\t 60 ~ 69\t 60미만");
		System.out.printf("%8s %8s %8s %8s %8s\n", "90 ~ 100","80 ~ 89","70 ~ 79","60 ~ 69","60 미만");
		System.out.println("=======================");
		
		for(int i = 0; i < counts.length; i++) 
			//counts배열값 출력
			System.out.printf("%8d ",counts[i]);
		
		System.out.println();
		for(int i = 0; i < counts.length; i++) 
			//counts배열값으로 백분율 구하고 출력하기
			System.out.printf("%8.1f%%",(double)counts[i]/koreans.length*100);
		
		// 배열에서 기능이 향상 된것이 ArrayList
		// 배열에서는는직접 데이터 상입/삭제를 구현합니
	}
}
