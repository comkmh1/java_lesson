package koreait.day08b;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
	Random r = new Random();
	Scanner sc = new Scanner();
	int[] triallst = new int[10];
	
	System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다");
	System.out.println("너, 휴먼은 맞춰보세요. (101 ~ 299)");
	int numComputer = r.nextInt(199) + 101; 
	int numHuman;
	int i = 0;
	
	do {
		System.out.println("생각한 숫자 입력(기회 : " + (10 - i) + ") -> ");
		numHuman = sc.nextInt();
		if (numComputer > numHuman) {
			triallst[i] = numHuman;
			i++;
			System.out.println("아닙니다. 더 큰 값입니다.");
		} else if (numComputer < numHuman) {
			triallst[i] = numHuman;
			i++;
			System.out.println("아닙니다. 더 작은 값입ㄴ디ㅏ.");
		}
		
		if(i == 10) break;
	} while (numComputer != numHuman); 
	}
}
