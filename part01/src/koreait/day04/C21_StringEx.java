package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//작성자 :안동근 
	public static void main(String[] args) {
		
		
		/* 구글 이메일 계정을 체크하는 기능 구현 
		 * 1. gmail.com 으로 끝나야 합니다.
		 * 			ㄴ indexof 가 -1이 아니고 indexof 와 lastindexof 가 같은 값인가?
		 * 2. @기호가 포함 되어야 합니다.
		 * 			ㄴ '@' 의 indexof 를 구해서 그 뒤부터 끝(length()-1)까지 substring 추출한 문자열을 equals 비교
		 * 3. @ 앞까지 문자열이 계정이름만 추출합니다
		 * 			ㄴ '@' 의 indexof를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
		 * 4. 계정이름은 6글자 이상이어야 합니다.
		 * 			ㄴ 3번의 문자열이 length() 값 6인지 비교 
		 * 5. 계정이름에는 특수기호가 포함되면 안됩니다.	
		 * 			ㄴ indexof('$'), ,indexof('%')가 모두 -1이 아니면 허용안하는 기호 포함 
		 */
		
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid= true;
		System.out.println("사용할 이메일 입력하세요. >>> ");
		email = sc.nextLine();		
		
		
		
		
		// 처리조건 1,2,4,5에 해당하지 않으면 메세지 출력하고 isValid변수를 false로 합니다.
				
	
	}

}
