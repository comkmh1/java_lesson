package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
//작성자 안동근
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // TreeMap 를 List로 바꿔서 구현해보기
		boolean run = true;
		String sel,eng,kor;
		int level;
		System.out.println("선택 기능 -> 1.단어 저장 2.단어 검색 3. 단어장 보기 4.레벨로 검색 5. 프로그램 끝내기");
		while(run) {
			System.out.print("선택 ->");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 
				System.out.println("English -> ");
				eng = sc.nextLine();
				System.out.println("한글 뜻 -> ");
				kor = sc.nextLine();
				System.out.println("레벨  -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);
				break;
			
			case "2":
				System.out.print("단어 검색 English -> ");
				eng =sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
				System.out.println("단어장 검색했습니다." + w );
				
				break;
			case "3":	
				System.out.println("단어장 전체보기 : " + mywords);
				all(mywords);	//정렬하고 출력하기
				break;
			case "4": 
				System.out.println("검색할 레벨 입력(1~3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				break;
			case "5":
				run=false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다.");
				
				
			}
		}	
		
		System.out.println();
		
			//참고 : 정수	데이터 입력을 받아야 한다면 문자열 	nextLine() 받아서 정수로 변환합니다. 	Integer.parseInt(sc.nextLine())
		 	// 이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextInt()전달 되어 입력 흐름에 방해가 됩니다.
	}
	
	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel() == no)
				System.out.println(w);
	}
		
		

	private static void all(List<Word> mywords) {	//mywords 의 참조값 전달받아 동일한 객체를 가리킵니다
		mywords.sort(new Comparator<Word>(){
			@Override
			public int compare(Word o1,Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s %10s","English","Korean","Level"));	
		System.out.println("------------------");	
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %10d" , w.getEnglish(),w.getKorean(),w.getLevel()));
		}
	}
}
				
				
		 
		 
			
		
		
		
		
	
	
	
	
