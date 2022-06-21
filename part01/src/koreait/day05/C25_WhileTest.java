package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		//while 문 형식 
		//loop counter
		int j = 0;
		while(j < 5) {
			System.out.println("hello!(" + (j + 1) + ")");
			j++; 
		}
			
		int k = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다.(종료 : -1)");
		while(k != -1) {
			System.out.print("정수 입력 >>>");
			k = sc.nextInt();
			sum += k;
		}
	
		System.out.println("sum = " + sum);
		
		sum = 0;
		k = 0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다[ver2.0](종료 : -1");
		do { 
			sum += k;
			System.out.println("정수 입력 >>>");
			k = sc.nextInt();
			
		}while(k != -1);
		System.out.println("sum = " + sum);
			sum = 0;
			System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다[ver2.2](종료 : -1");
		
		
		while(true) {
			System.out.println("정수 입력 >>>");
			k = sc.nextInt();
			
			if(k == -1)
				break;
			sum += k;
		}
		System.out.println("sum = " + sum);
		
		sum = 0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다[ver2.3](종료 : -1");
		boolean isState = true;
		while(isState){
			System.out.println("정수 입력 >>>");
			k = sc.nextInt();
			
			if(k == -1 ) isState = false;
			else sum += k;
			
		}		
		System.out.println("sum = " + sum);
		
		// continue 연습 : 입력된 값이 0의 배수라면 sum 에 더하지 않고 다시 입력받기
		sum = 0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다[연습](종료 : -1");
		while(true) {
			System.out.println("정수 입력 >>>");
			k =sc.nextInt();
			if(k == -1)
				break;
			if(k%10 == 0) 
				continue;//아래 명령어 실행하지 않고 반복 처음으로
			sum += k;
			
			
			
		}
		sc.close();
		
		
		
		
		
		
		
		}	
}
	
	
	
	
	


