package day05;

public class ConditionSwitch {
	public static void main(String[] args) {
		int num = 3;
		
		// switch 조건문 실행
		switch(num) {
		case 1:
			System.out.println("값은 1입니다.");
			break;
		case 3:
			System.out.println("값은 3입니다.");
			System.out.println("홀수입니다.");
			break;
		case 5:
			System.out.println("값은 5입니다.");
			break;
		default:
			System.out.println("기본 문장을 실행한다.");
			break;
		}
		
		// 위의 내용을 if문으로 바꿔본다면
		if(num == 1) {
			System.out.println("1");
		} else if(num == 3) {
			System.out.println("3");
		} else if(num == 5) {
			System.out.println("5");
		} else {
			System.out.println("기본");
		}
		
		
		// String 변수를 사용해보자
		
		String a = "하세요.";		
		switch(a) {
		case "안녕":
			System.out.println("값은 1입니다.");
			break;
		case "하세요":
			System.out.println("값은 3입니다.");
			System.out.println("홀수입니다.");
			break;
		case "반가워":
			System.out.println("값은 5입니다.");
			break;
		default:
			System.out.println("기본 문장을 실행한다.");
			break;
		}
		
//		double score = 1.5;	// double 변수로 switch는 안된다.
//		switch(score) {
//		case 1.5:
//			System.out.println("1.5 입니다.");
//			break;
//		default:
//			System.out.println("기본 문장 실행");
//			break;
//		}
		
		char ch = 'a';
		switch(ch) {
		case 97:	// int->number
			System.out.println("a 입니다.");
			break;
		default:
			break;
		}
	}
}
