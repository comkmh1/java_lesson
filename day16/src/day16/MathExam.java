package day16;

public class MathExam {
	public static void main(String[] args) {
		// abs 절대값을 반환한다.
		System.out.println("abs ================== ");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1));
		
		// ceil 올림을 반환
		System.out.println("ceil ====================");
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.ceil(10.7));
		System.out.println(Math.ceil(10.456));
		System.out.println(Math.ceil(10.123));
		
		// 소수 2번째자리에서 올림 하는 방법
		System.out.println(Math.ceil(10.456 * 100));
		System.out.println(Math.ceil(10.456 * 100) / 100.0);
		
		// floor 버림을 반환
		System.out.println("floor ====================");
		System.out.println(Math.floor(10.1));
		System.out.println(Math.floor(10.7));
		System.out.println(Math.floor(10.456));
		System.out.println(Math.floor(10.456 * 100) / 100.0);
		
		// round 반올림 반환
		System.out.println("found ===================");
		System.out.println(Math.round(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.456));
		System.out.println(Math.round(10.456 * 100) / 100.0);
		
		// max 비교후 큰 값 반환
		System.out.println("max =====================");
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(10.1, 10.12));
		
		// min 비교후 작은 값 반환
		System.out.println("min =====================");
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(10.1, 10.12));
		
		// random 랜덤한 값을 반환(0.0 ~ 1.0)
		System.out.println("random ==================");
		System.out.println(Math.random());
		
		// 그럼 0 ~ 10까지의 숫자중 정수의 랜덤 값을 얻고싶다.
		// random 으로 랜덤 소수 만들고 > floor로 소수 아래 버리고 > 정수형으로 형변환
		double rand = Math.random() * 10;
		System.out.println(rand);
		System.out.println(Math.floor(rand));
		System.out.println((int)Math.floor(rand));
	}
}















