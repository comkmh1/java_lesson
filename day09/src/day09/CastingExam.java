package day09;

public class CastingExam {
	public static void main(String[] args) {
		// 문자를 정수형으로 형변환.
		int num = Integer.parseInt("10");
		System.out.println(num);
		
		// 문자를 실수형으로 형변환.
		double pi = Double.parseDouble("3.14159");
		System.out.println(pi);
		
		System.out.println("10" + "3.14159");	// 문자열이다.
		System.out.println(num + pi);	// 숫자로 계산하기를 원한다.
		
		// 정수형을 문자열로 형변환.
		String a = Integer.toString(num);
		// 실수형을 문자열로 형변환.
		String b = Double.toString(pi);
		
		// 자동 형변환을 이용한 문자열로 변환
		String c = 1234 + "";
		String d = num + "";
		System.out.println(d);		
	}
}







