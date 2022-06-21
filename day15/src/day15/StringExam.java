package day15;

import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		// 일반적으로 String 클래스 사용시 가장 많이 사용하는 자동 생성 방식
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 클래스 객체 생성 방식대로 new 연산자를 이용한 객체 생성 방식
		String nstr1 = new String("Hello");
		String nstr2 = new String("Hello");
		
		// 두 방식의 메모리 주소(상태) 비교
		System.out.println("String 객체의 메모리 주소 확인 ===============>");
		System.out.printf("str1 address : 0x%X\n", System.identityHashCode(str1));
		System.out.printf("str2 address : 0x%X\n", System.identityHashCode(str2));
		
		System.out.printf("nstr1 address : 0x%X\n", System.identityHashCode(nstr1));
		System.out.printf("nstr2 address : 0x%X\n", System.identityHashCode(nstr2));
		
		System.out.println("\n비교 연산자를 통한 String 객체 비교");
		System.out.println(str1 == str2);
		System.out.println(str1 == nstr1);
		System.out.println(str1 == nstr2);
		System.out.println(nstr1 == nstr2);
		
		System.out.println("\nequals() 메소드 이용 값 비교 ================>");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(nstr1));
		System.out.println(str1.equals(nstr2));
		System.out.println(nstr1.equals(nstr2));
		
		// char charAt(int index) 저장된 위치(index)에 있는 문자를 알려준다.
		System.out.println("===========================================");
		System.out.println(str1.charAt(1));
		 
		// int compareTo(String str) 매개변수 받은 문자열(str)과 사전순 비교, 동일 0을 앞 음수, 뒤 양수.
		System.out.println(str1.compareTo("Hello"));
		System.out.println(str1.compareTo("Gello"));
		System.out.println(str1.compareTo("Iello"));
		System.out.println(str1.compareTo("Aello"));
		System.out.println(str1.compareTo("Aello"));
		System.out.println(str1.compareTo("Hallo"));
		
		// int indexOf(int ch) 주어진 문자(ch)가 문자열에 존재하는지 확인 위치(index)반환, 없으면 -1반환
		System.out.println(str1.indexOf('H'));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf('L'));
		System.out.println(str1.indexOf("Hell"));
		System.out.println(str1.indexOf("llo"));
		
		// String substring(int begin)
		// String substring(int begin, int end)
		// 주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 반환
		// 단, 시작위치는 포함되지만 끝 위치는 포함되지 않는다.
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1, 3));
		System.out.println(str1.substring(2, 3));
		
		// int length() 문자열의 길이 반환
		System.out.println(str1.length());
		
		// String replace(char old, char nw) 문자열 안 문자(old)를 새로운 문자(new)로 치환
		System.out.println(str1.replace("l", "L"));
		System.out.println(str1.replace("el", "EL"));
		
		String text = "Welcome Hello Hello Hello Welcome";
		System.out.println(text);
		System.out.println(text.replace("Hello", "안녕하세요"));
		System.out.println(text.replaceAll("Hello", "안녕하세요"));
		
		System.out.println("===========================================");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(" 안녕 하세요   ".trim());
		System.out.println(" 안녕 하세요   ".replaceAll(" ", ""));
		
		String sp = "어마나#땅콩#놀이#반갑다!";
		String arr[] = sp.split("#");
		System.out.println(Arrays.toString(arr));
		
		String jointxt = String.join(" ", arr);
		System.out.println(jointxt);
	}
}
	












