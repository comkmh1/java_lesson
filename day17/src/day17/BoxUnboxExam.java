package day17;

public class BoxUnboxExam {
	public static void main(String[] args) {
		// Boxing
		Integer a1 = new Integer(10);
		Integer a2 = new Integer("100");
		
		// deprecated(비추? 삭제예정) version 9 부터
		Integer a3 = Integer.valueOf(10);
		Integer a4 = Integer.valueOf("100");
		
		System.out.println(a3);
		System.out.println(a4);
		
		// 변수를 이용해서도 동일
		int ab1 = 10;
		String ab2 = "100";
		System.out.println(Integer.valueOf(ab1));
		System.out.println(Integer.valueOf(ab2));
		
		// 만약 문자열에 문자가 포함된다면?
//		System.out.println(Integer.valueOf("123a"));
		
		// Unboxing
		int ab3 = a3.intValue();
		String ab4 = a4.toString();
		
		System.out.println(ab3);
		System.out.println(ab4);
		
		// 실수형
		Double d1 = new Double(10.1);	//deprecated
		
		// boxing
		Double d2 = Double.valueOf(10.1);
		Double d3 = Double.valueOf("100.1");
		
		// unboxing
		double ad1 = d2.doubleValue();
		int ad2 = d3.intValue();	// 소수점은 제거된다.
		
		System.out.println(ad1);
		System.out.println((double)ad2);	// 바꿔도 그대로 100만 남는다.
		
		// 오토 박싱 & 언박싱
		Integer au1 = 10;	//int
//		 Integer au2 = "100";	// 오토박싱 불가
		
		int au3 = au1; // 오토 언박싱
		int au4 = 100 + au1;	// 오토 언박싱
		
		System.out.println(au1);
		System.out.println(au3);
		System.out.println(au4);
		
//		Integer a = Integer.valueOf("123");
//		int b = Integer.parseInt("A12345");
//		System.out.println(a);
//		System.out.println(b);
	}
}













