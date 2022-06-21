package koreait.day09a;

public class Dog extends Animal {
	
	public Dog(){
		System.out.println("새로운 동물 가족은dog");
	}
	protected int legs;
	
	public void run() {
		setName("강아지");
		setColor("브라운");
		System.out.println("특징 : 달리기");
		
	
	
	}
	
}




