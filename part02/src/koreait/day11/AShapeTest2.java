package koreait.day11;

public class AShapeTest2 {
	//�͸� Ŭ����
	public static void main(String[] args) {
		
		//�������
		AShape sha = new AShape() {
			// �߻�޼ҵ� ������ 
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
			
		System.out.println("sha ���� = " + sha.getArea());
		System.out.println("sha2 ���� = " + sha2.getArea());
	
		
	
	
	}

}
