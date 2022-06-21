package day15;

class ObjectTest {
	int value;
	
	public ObjectTest(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 내 자신의 객체와 파라메터로 넘어온 객체를 비교하여 true/false 반환
//		return this.value == ((ObjectTest)obj).value;
		
		// 예외상황 처리가 필요하다.
		if(obj instanceof ObjectTest) {
			// 만약 멤버 변수가 3개라면....
//			ObjectTest obj1 = ((ObjectTest)obj);
//			
//			boolean a = this.name.equals(obj1.name);	// String라면
//			boolean b = this.age == obj1.age;			// int
//			boolean c = this.type == obj1.type;			// char
//			
//			return a && b && c;
					
			return this.value == ((ObjectTest)obj).value;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.value + "";
	}
}

public class ObjectExam {
	public static void main(String[] args) {
		// String 클래스에서 equals와  toString 테스트
		String a = new String("10");
		String b = new String("10");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.toString());
		
		ObjectTest obj1 = new ObjectTest(10);
		ObjectTest obj2 = new ObjectTest(10);
		
		// ObjectTest의 equals 메소드 테스트
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		System.out.println("==========================");
		System.out.println(obj1.equals(b));	
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
