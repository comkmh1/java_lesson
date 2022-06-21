package day06;

public class Exam02 {

	public static void main(String[] args) {
		/*
		* switch문에서, case의 값으로 정수형과 문자열 값만 이용가능하다고 오늘 배웠습니다.
		* 대부분은 정수형 값을 많이 이용한다고 하셨습니다.
		* 
		* 그런데 만약 case의 값으로 문자열을 사용할 경우, 
		* 예를 들어 case "안녕" 이라고 작성하면, 
		* 
		* 해당 변수와 "안녕"이라는 문자열 사이에, 
		* 단순 문자열 비교를 하는지 객체의 주소를 비교하는 것인지 궁금합니다!! 
		*/

		// new 연산자를 통해 객체를 만들면 항상 다른 메모리 영역을 갖는다.
//		String str = "안녕하세요";
		String str1 = new String("안녕");	// 새로운 메모리 공간 생성
		String str2 = new String("안녕");	// 새로운 메모리 공간 생성

		// 위 객체들의 메모리 비교
		System.out.println("str1 주소 : " + System.identityHashCode(str1));	// 이 객체와
		System.out.println("str2 주소 : " + System.identityHashCode(str2));	// 이 객체는 다르다.

		// 상수의 경우는 값이 동일하다면 메모리 공간(주소)가 동일하다.
		System.out.println("안녕 상수 주소 1 : " + System.identityHashCode("안녕"));	// 안녕 메모리와
		System.out.println("안녕 상수 주소 2 : " + System.identityHashCode("안녕"));	// 안녕 메모리는 동일하다.
		System.out.println("반갑 상수 주소 3 : " + System.identityHashCode("반갑"));	// 하지만 값이 다르므로 메모리가 다르다.

		// String 메모리 주소 비교
		// 객체로 생성한 문자열의 메모리는 다르지만 값은 동일하다.
		System.out.println(str1 == str2);	// false
		System.out.println(str1.equals(str2));	// true

		// 상수로 생성한 "안녕" 문자열의 메모리는 동일하다.
		System.out.println("안녕" == "안녕");	// true
		System.out.println("안녕".equals("안녕"));
		System.out.println("안녕".equals(str2));
		System.out.println(System.identityHashCode("안녕"));

		// 결론 ----- 
		// str1의 메모리 주소와 "안녕" 상수의 메모리 주소는 다르다
		// 따라서, switch 문에서는 메모리 주소가 아닌 값으로 비교를 한다.
		switch (str1) {
		    case "안녕":
		        System.out.println("안녕하세요");
		        break;
		    default:
		        System.out.println("반갑습니다.");
		        break;
		}
		
//		안녕 이 담은 메모리주소는 안녕이 또 나올 때 까지 컴퓨터가 기억하고 있다는 말씀인가요?
		// "안녕"이라는 문자열을 가지고 있는 메모리 주소를 찾아서 반환한다.
		
		// 그럼 지금부터 예를 들어 String a = "안녕"; 
		// 보다 String a = new String("안녕"); 을 쓰는게 더 좋나요?

		//참조형인 String만 주소랑 값이 따로 저장되고 나머지 
		// 기본형(int, float, double 등등)들은 주소랑 
		// 값이 같은 곳에 저장되나요?

	}
}








