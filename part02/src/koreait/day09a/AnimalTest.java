package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {

	Animal animal = new Animal();
	animal.act();
	animal.print();
	System.out.println("-------------------------------");
	
	Dog dog = new Dog();
	dog.run();
	dog.print();
	System.out.println("-------------------------------");
	
	Crow crow = new Crow();
	crow.fly();
	crow.print();
	
	System.out.println("-------------------------------");
	Animal temp = dog; //자식 객체는부모클래스 타입으로 참조할 수 있습니다.
	temp.print();  
	temp = crow;
	temp.print();
	
	System.out.println("-------------------------------");
	Animal puppy = new Dog();
	puppy.print();
	
	Dog puddle = (Dog)puppy; 	// Aaniaml 타입을 Dog 타입으로 casting 
	puddle.run();
	puddle.print();
	
	
	
	
	
	
	}

}
