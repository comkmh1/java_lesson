package day14;

//  �⺻ Ŭ����
class Car {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSpeed() {
		return 100;
	}
}

// ���ƴٳ�� �Ѵٴ� ���� �� ������ ����ȭ�� �������̽��� �����.
interface FlyingConcept {
	public abstract void flying();	// ���ƴٴմϴ�.
	public abstract void landing();	// �����մϴ�.
}

// �ö���ī�� ���� ���
class FlyingCar extends Car implements FlyingConcept {
	FlyingCar(String name) {
		super(name);
	}

	@Override
	public void flying() {
		System.out.println("���� �ִ� �ڵ��� �Դϴ�.");
	}

	@Override
	public void landing() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
}

class FlyingJeep extends Car implements FlyingConcept {

	FlyingJeep(String name) {
		super(name);
	}

	@Override
	public void flying() {
		System.out.println("���� �ִ� ���� �Դϴ�.");
	}

	@Override
	public void landing() {
		System.out.println("������ �����մϴ�.");
	}
}

class FlyingTruck extends Car implements FlyingConcept {

	FlyingTruck(String name) {
		super(name);
	}

	@Override
	public void flying() {
		System.out.println("���� �ִ� Ʈ�� �Դϴ�.");
	}

	@Override
	public void landing() {
		System.out.println("Ʈ���� �����մϴ�.");
	}
}

public class InterfaceExam {
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar("�ö���ī");
		System.out.println(car.getName());
		
		car.flying();
		car.landing();
		
		FlyingJeep jeep = new FlyingJeep("�ö�������");
		FlyingTruck truck = new FlyingTruck("�ö���Ʈ��");
		
		// �������̽��� ���� Ȱ��.....
		System.out.println("=================================");
//		Car a = (Car)car;	// ����ȯ(��ĳ����)
		
//		FlyingConcept a1 = (FlyingConcept)car;
//		a1.flying();
		
		// ���� ������ ���ٷ� ���
		((FlyingConcept)car).flying();
		((FlyingConcept)jeep).flying();
		((FlyingConcept)truck).flying();
		
		System.out.println("=================================");
		
		print(car);
		print(jeep);
		print(truck);
	}
	
	public static void print(FlyingConcept fly) {
		System.out.println("\n====================");
		fly.flying();
		fly.landing();

		System.out.println(((Car)fly).getName());

		System.out.println("======================");
	}
}












