package koreait.day11;

public class AShapeTest {
// 추상클래스로 완성된 애플리케이션에서 새로운 추상메소드를 추가하면?
// 
	public static void main(String[] args) {
		
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "직각삼각형";
		System.out.println(tri);
		System.out.println("넓이 = " + tri.getArea());
	
		Circle cir = new Circle();
		cir.setRadius(89);
		cir.shapeName = "원";
		System.out.println(cir);
		System.out.println("넓이 = " + cir.getArea());
	
	
	}

}
//참고 : 메소드 재정의 할 때 접근한정자 부모가 public -> 자식이 default x / 부모가 default 자식이 public o 
abstract class AShape{
	protected String shapeName;
	protected int width;
	protected int height;
	
	// 추상클래스는 커스텀생성자 만드나요?
	public AShape() {		//AShape()는 객체는 직접 못만들고 자식 객체 만들어질때 실행	
		System.out.println("AShape 디폴트 생성자 동작합니다.");
	}
	
	public AShape(int width, int height) {
		System.out.println("AShape 커스텀	생성자 동작합니다.");
		this.width = width;
		this.height = height;
	}
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "Triangle [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}

}

class Triangle extends AShape{
	
	public Triangle(int width, int height) {
		super(width,height);
	}
	
	public double getArea() {
		return width * height / 2; 
	}

	
	
}	

class Circle extends AShape{
	private int radius; // 반지름
	public double getArea() {
		return radius*radius*3.14; //반지름*반지름*3.14
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}	
	
	

}

class Rectangle extends AShape{
	public double getArea() {
		return width*height;// width*height
	}
}