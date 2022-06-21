package koreait.day07;

import java.util.Random;
import java.util.Scanner;
// 작성자: 안동근
public class C42_Day07Exam {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------");
		System.out.println("시작합니다");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int point1[] = new int[5];
		int point2[] = new int[5];
		int answer[] = new int[5];
		int[] cnt = new int[5];
		int a = 0;
		for(int i = 0; i < 5; i++ ) {
			point1[i] = r.nextInt(99);
			point2[i] = r.nextInt(99);
			System.out.print("문제"+(i + 1)+"."+ point1[i] + "+" + point2[i] + " = 답 입력 -> ");
			answer[i] = sc.nextInt();
			System.out.print(answer[i]);
			System.out.println();
			cnt[i] = answer[i];
			if(point1[i] + point2[i] == cnt[i]) {
				a++;
			}	
		}	
		
		System.out.println("채점 합니다. 맞은 갯수" + a + "("+ (a*10) + "점)");
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		for(int i =0; i < cnt.length; i++) {
			if(point1[i] + point2[i] != cnt[i]) {
				System.out.println("문제"+(i+1)+"." + point1[i] + "+" + point2[i] + " = " + (point1[i] + point2[i]));			
			}
		}
		
		
		
		
		
		
		
		
						
		
		
		
			
	sc.close();
	}
	
	}


