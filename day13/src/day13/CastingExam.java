package day13;

// 기본 클래스(동물)
class Animal {
	String name = "안녕";
	
	public void print() {
		System.out.println("나는 동물입니다.");
	}
}

// 원숭이 클래스
class Monkey extends Animal {
	@Override
	public void print() {
		System.out.println("나는 원숭이입니다.");
	}
}

// 개 클래스
class Dog extends Animal {
	@Override
	public void print() {
		System.out.println("나는 개입니다.");
	}
	
	public void sound() {
		System.out.println("개는 멍멍");
	}
	
	
}

// 고양이 클래스
class Cat extends Animal {
	@Override
	public void print() {
		System.out.println("나는 고양이입니다.");
	}
	
	public void sound() {
		System.out.println("고양이는 야옹 야옹");
	}
}


public class CastingExam {
	public static void main(String[] args) {
		// 위의 원숭이/고양이/개 객체를 생성하고 출력하려면?
		Monkey monkey = new Monkey();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// 출력
		monkey.print();
		dog.print();
		dog.sound();// 당연히 자신거는 된다.
		cat.print();
		
		// 그런데 이런 타입이 10개라면? 상상만해도 짜증이...확...
		// 그래서 좀 편리한 방법을 생각하게 되죠(개발자들은 편리미움 추구한다)....
		// 일단 형변환이라걸 사용해 보자...
		// 먼저 형변환 중 자식 클래스를 부모 클래스로 형변환하는 업 캐스팅(위로[부모로] 형변환)
		Animal a1 = (Animal)monkey;	// 명시적 형변환
		Animal a2 = dog;	// 자동 형변환
		Animal a3 = cat;
		
		// 하지만 무슨 의미가 있지? 라고 생각할수 있습니다.
		System.out.println("=================");
		a1.print();
		a2.print();
		a3.print();
		
		System.out.println("=================");
		
//		Animal[] arr = new Animal[3];
//		arr[0] = monkey;
//		arr[1] = dog;
//		arr[2] = cat;

		Animal[] arr = new Animal[] {monkey, dog, cat};
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		
		System.out.println("=================");
		// 만약 메소드와 결합하여 사용한다면...
		print(monkey);
//		print(dog);
		
		System.out.println("=================");
		cprint(monkey);
		cprint(dog);
		cprint(cat);
		
		System.out.println("=================");
		a2.print(); // 개
		
		// 업 캐스팅된 객체에서는 사라졌으므로 호출할수 없다.
//		a2.sound();
		
		// 다운 캐스팅(원래의 클래스로 복원)
		Dog d1 = (Dog)a2;	// 개
		d1.sound();
		
		Cat c1 = (Cat)a3;	// 고양이
		c1.sound();
		
//		a2.print();
//		
//		Animal a4 = d1;
//		a4.print();

//		System.out.println(d1.name);
//		a2.name = "안녕하세요";
//		System.out.println(a2.name);
//		System.out.println(d1.name);
		
		sound(a2);	// 개
		sound(a3);	// 고양이
		sound(a1);	// 원숭이
	}
	
	static public void print(Monkey monkey) {
		monkey.print();
	}
	
	static public void cprint(Animal ani) {
		ani.print();
	}
	
	static public void sound(Animal ani) {
		System.out.println("================");
		System.out.println("안녕하세요");
		System.out.println("반갑습니다.");

		ani.print();

		// 각각의 클래스에 맞도록 아래의 부분에 대한 기능만 해줄경우
		// 각각의 클래스로 다운 캐스팅을 한 후 기능을 실행한다.
		if(ani instanceof Dog) {			
			Dog dog = (Dog)ani;
			dog.sound();
		} else if(ani instanceof Cat) {
			Cat cat = (Cat)ani;
			cat.sound();
		}
		
		ani.print();
		

		System.out.println("================");
	}
}








