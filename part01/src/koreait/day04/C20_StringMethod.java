package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "Hello~";
		
//		message.length();
//		message.charAt(0);
		
//		message.equals("Hello~")
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello\") = " + isState);
	
		message.indexOf('e');
		message.indexOf("lo");
		message.substring(2);
		message.substring(2,4);
		message.replace("11", "*@");
// 메소드 오버로딩: 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.	
		
		System.out.println("indexOf('e') " + message.indexOf('e')); //1번위치 
		System.out.println("indexOf(\"lo\") " + message.indexOf("lo")); // 3번 위치
		System.out.println("indexOf(\"ol\") " + message.indexOf("ol")); // -1 : 찾는 문자열이 없을 때 
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") " + test.indexOf("lo")); // 3번 위치
		System.out.println("test.lastIndexOf(\"lo\") " + test.lastIndexOf("lo")); // 일치하는 마지막위치 9번
		System.out.println("substring(2) " + message.substring(2)); //부분추출: llo~
		System.out.println("substring(2,4) " + message.substring(2,4)); // ll 2개(4-2)
		System.out.println("replace(\"11\", \"*@\") " + message.replace("ll", "*@")); // ll을 *@로 변경
		System.out.println("startsWith(\"H\") = " + message.startsWith("H")); 
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));
	}

}
