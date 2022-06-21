package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		
/* 데이터 기본형식 : 문자형 char 
 * 	문자데이터를 저장하는 2바이트 형식, 정수값 0 ~ 65535 범위 저장도 가능합니다.
 *  컴퓨터에게서 다루는 문자는 문자코드로 처리되는데 코드는 정수값입니다.
 *  문자데이터는 '' 기호를 사용합니다. 
 *	영문자,숫자,특수문자는 ASCII	코드로 표현됩니다.
 *  영문자, 숫자,특수문자 외의 다국어문자는 문자를 처리하는 인코딩방식에 따라 
 *	문자코드값이 다릅니다. 국제화 인코딩으로 utf-8 방식을 많이 사용합니다.
 */
		
	char c1 = 'a';
	char c2 = 97; //문자코드는 정수값

//	간 : ㄱ ㅏ ㄴ (초성,중성,종성 각각에 코드값으로 조합하는 조합형)
//	한글에서 나올 수 있는 모든 초성/중성/종성의 모든 표현을 만들어서 각각 코드값을 부여하는 완성형 -> utf-8 방식이 완성형
	
	System.out.println("c1 = " + c1);
	System.out.println("c2 = " + c2);
	
	c1 = (char)(c1 + 1); 
	System.out.println("c1 = " + c1);
	
	c1++; 			//++연산은 c1 = c1 + 1 , char형에서는 casting도 합니다
	System.out.println("c1 = " + c1);
	
	
	//한글 문자 테스트 : 한글문자코드는 10진수값을 44032 ~ 55203, 16진수(2진수) ac00 ~ d7a3 
	
	char h1 = '가';
	char h2 = 44032;
	char h3 = '\uac00';		// \\u는 10진수유니코드, ac00은 16진수 값
	System.out.println("h1 = " + h1);
	System.out.println("h2 = " + h2);
	System.out.println("h3 = " + h3);
	
	h1++;
	System.out.println("h1 = " + h1);
	
	h1++;
	System.out.println("h1 = " + h1);	
	
	char h4 = 55203;
	char h5 = '\ud7a3';
	System.out.println("h4 = " + h4);
	System.out.println("h5 = " + h5);
	
	
	
	
	}

}