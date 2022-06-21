package koreait.day11;

public class AShapeTest {
// �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
// 
	public static void main(String[] args) {
		
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "�����ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
	
		Circle cir = new Circle();
		cir.setRadius(89);
		cir.shapeName = "��";
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
	
	
	}

}
//���� : �޼ҵ� ������ �� �� ���������� �θ� public -> �ڽ��� default x / �θ� default �ڽ��� public o 
abstract class AShape{
	protected String shapeName;
	protected int width;
	protected int height;
	
	// �߻�Ŭ������ Ŀ���һ����� ���峪��?
	public AShape() {		//AShape()�� ��ü�� ���� ������� �ڽ� ��ü ��������� ����	
		System.out.println("AShape ����Ʈ ������ �����մϴ�.");
	}
	
	public AShape(int width, int height) {
		System.out.println("AShape Ŀ����	������ �����մϴ�.");
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
	private int radius; // ������
	public double getArea() {
		return radius*radius*3.14; //������*������*3.14
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