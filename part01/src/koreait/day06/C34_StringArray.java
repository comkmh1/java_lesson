package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
	
	public static void main(String[] args) {
	
		String massage = "hi java!";
				
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char 배열에서는 요소를 나타내는 nums[2], carr[1], point[2]
		//											ㄴㄴ기본형 데이터 타입
		//
		//engKey[2]는 참조형
		
		
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);
		
		String[] koreans = new String[5];	//배열요소 값이 기본형 데이터가 X, 참조값 저장
		
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		System.out.println("1. 배열요소 값이 참조하는 문자열의 길이");
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		koreans[0] = "계속하다";
		koreans[1] = "멈추다"	;
		koreans[2] = "공용의";
	
		System.out.println("2. koreans 배열요소값이 참조하는 문자열의 길이");
		for(int i = 0; i < koreans.length;i++) {
			if(koreans[i] != null) //***
			System.out.println(koreans[i] + ":" + koreans[i].length());
		//참조하고 있는 객체가 없을 때 메소드/피들 참조며며며 오류 
		}
   
		Scanner sc = new Scanner(System.in);
		System.out.print("static 뜻? >>>");
		koreans[3] = sc.nextLine();
		System.out.print("dynamic 뜻? >>>");
		koreans[4] = sc.nextLine();
		
		System.out.println("3. 모두 입력된 koreans 배열 확인");
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		// 사용자가 입력한 영어단어가 engKey 배열 인덱스 몇번인지?
		System.out.print("찾을 단어는 >>>  ");
		String find = sc.nextLine();
		int index = -1;
		
		for(int i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])){
			index = i;
			break;
			}
		}
		System.out.println("찾은 단어 위치 :" + index);
		if(index == -1)
			System.out.println("찾는 단어가 engKey에 없습니다!");
		else
			System.out.println("한글 뜻 : " + koreans[index]);
			
			
	
	
	}
	}		
		
		
		
		
		
		
		
		
		
		
		
