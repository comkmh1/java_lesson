package day14;

//  기본 클래스
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

// 날아다녀야 한다는 개념 및 컨셉을 강제화한 인터페이스를 만든다.
interface FlyingConcept {
	public abstract void flying();	// 날아다닙니다.
	public abstract void landing();	// 착륙합니다.
}

// 플라이카를 만든 방법
class FlyingCar extends Car implements FlyingConcept {
	FlyingCar(String name) {
		super(name);
	}

	@Override
	public void flying() {
		System.out.println("날수 있는 자동차 입니다.");
	}

	@Override
	public void landing() {
		System.out.println("자동차가 착륙합니다.");
	}
}

class FlyingJeep extends Car implements FlyingConcept {

	FlyingJeep(String name) {
		super(name);
	}

	@Override
	public void flying() {
		System.out.println("날수 있는 지프 입니다.");
	}

	@Override
	public void landing() {
		System.out.println("지프가 착륙합니다.");
	}
}

class FlyingTruck extends Car implements FlyingConcept {

	FlyingTruck(String name) {
		super(name);
	}

	@Override
	public void flying() {
		System.out.println("날수 있는 트럭 입니다.");
	}

	@Override
	public void landing() {
		System.out.println("트럭이 착륙합니다.");
	}
}

public class InterfaceExam {
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar("플라잉카");
		System.out.println(car.getName());
		
		car.flying();
		car.landing();
		
		FlyingJeep jeep = new FlyingJeep("플라잉지프");
		FlyingTruck truck = new FlyingTruck("플라잉트럭");
		
		// 인터페이스를 통한 활용.....
		System.out.println("=================================");
//		Car a = (Car)car;	// 형변환(업캐스팅)
		
//		FlyingConcept a1 = (FlyingConcept)car;
//		a1.flying();
		
		// 위의 두줄을 한줄로 사용
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












