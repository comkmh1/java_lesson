package day08;

public class MethodExam {

	public static void main(String[] args) {
//		// 홍길동 32세
//		print("홍길동", 32);
//		// 김유신 33세
//		print("김유신", 33);
//		// 이순신 40세
//		print("이순신", 40);
//		print("이순신1", 41);
//		print("이순신2", 42);
//		print("이순신3", 43);
//		
		int result = sum(3, 4);
		System.out.println(result);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	// 출력을 위한 메소드를 만들어 매개변수로 이름과 나이를 입력받아 사용한다.
	public static void print(String name, int age) {
		System.out.println("===============================");
		System.out.println(name);
		System.out.println(age + "세 입니다.");
		System.out.println("저는 대한민국 사람입니다.");
		System.out.println("저는 대한민국 사람입니다.");
		System.out.println("저는 대한민국 사람입니다.");	
		System.out.println("저는 대한민국 사람입니다.");
		System.out.println("반갑습니다.");
		System.out.println("===============================");
	}
}
