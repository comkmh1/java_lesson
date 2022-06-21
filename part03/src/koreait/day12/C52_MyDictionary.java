package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.IntConsumer;

public class C52_MyDictionary {
//작성자 안동근
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeMap<String,String> map = new TreeMap<>();
		
		boolean run = true;
		String sel,eng,kor;
		System.out.println("선택 기능 -> 1.단어 저장 2.단어 검색 3. 단어장 보기 4. 프로그램 끝내기");
		while(run) {
			System.out.print("선택 ->");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 
				System.out.println("English -> ");
				eng = sc.nextLine();
				System.out.println("Korean -> ");
				kor = sc.nextLine();
				map.put(eng,kor);
				break;
			
			case "2":
				System.out.println("English -> ");
				eng =sc.nextLine();
				if(!map.containsKey(eng)) {
				System.out.println("없는 단어입니다.");
				} 
				else{
				System.out.println("단어장 검색했습니다." + map.get(eng));
				}
				break;
			case "3":	
				System.out.println("단어장 전체보기 : " + map);
				break;
			case "4":
				run=false;
				break;
			
				
				
			}
		}	
		
		System.out.println(map);
		
			//참고 : 정수	데이터 입력을 받아야 한다면 문자열 	nextLine() 받아서 정수로 변환합니다. 	Integer.parseInt(sc.nextLine())
		 	// 이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextInt()전달 되어 입력 흐름에 방해가 됩니다.
				
				
		 
		 
			
		
		
		
		
	
	
	}
	
	
}
