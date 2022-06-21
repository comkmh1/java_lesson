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
	Animal temp = dog; //�ڽ� ��ü�ºθ�Ŭ���� Ÿ������ ������ �� �ֽ��ϴ�.
	temp.print();  
	temp = crow;
	temp.print();
	
	System.out.println("-------------------------------");
	Animal puppy = new Dog();
	puppy.print();
	
	Dog puddle = (Dog)puppy; 	// Aaniaml Ÿ���� Dog Ÿ������ casting 
	puddle.run();
	puddle.print();
	
	
	
	
	
	
	}

}
