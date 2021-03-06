package koreait.day11;

public class AShapeTest2 {
	//익명 클래스
	public static void main(String[] args) {
		
		//마름모꼴
		AShape sha = new AShape() {
			// 추상메소드 재정의 
			@Override
			public double getArea() {
				return width + height;
			}
		};
		
		AShape sha2 = new AShape(20,13) {
			
			@Override
			public double getArea() {
				return width + height;
			}
		};
			
		System.out.println("sha 넓이 = " + sha.getArea());
		System.out.println("sha2 넓이 = " + sha2.getArea());
	
		
	
	
	}

}
