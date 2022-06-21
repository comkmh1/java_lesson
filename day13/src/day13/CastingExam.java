package day13;

// �⺻ Ŭ����(����)
class Animal {
	String name = "�ȳ�";
	
	public void print() {
		System.out.println("���� �����Դϴ�.");
	}
}

// ������ Ŭ����
class Monkey extends Animal {
	@Override
	public void print() {
		System.out.println("���� �������Դϴ�.");
	}
}

// �� Ŭ����
class Dog extends Animal {
	@Override
	public void print() {
		System.out.println("���� ���Դϴ�.");
	}
	
	public void sound() {
		System.out.println("���� �۸�");
	}
	
	
}

// ����� Ŭ����
class Cat extends Animal {
	@Override
	public void print() {
		System.out.println("���� ������Դϴ�.");
	}
	
	public void sound() {
		System.out.println("����̴� �߿� �߿�");
	}
}


public class CastingExam {
	public static void main(String[] args) {
		// ���� ������/�����/�� ��ü�� �����ϰ� ����Ϸ���?
		Monkey monkey = new Monkey();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// ���
		monkey.print();
		dog.print();
		dog.sound();// �翬�� �ڽŰŴ� �ȴ�.
		cat.print();
		
		// �׷��� �̷� Ÿ���� 10�����? ����ص� ¥����...Ȯ...
		// �׷��� �� ���� ����� �����ϰ� ����(�����ڵ��� ���̿� �߱��Ѵ�)....
		// �ϴ� ����ȯ�̶�� ����� ����...
		// ���� ����ȯ �� �ڽ� Ŭ������ �θ� Ŭ������ ����ȯ�ϴ� �� ĳ����(����[�θ��] ����ȯ)
		Animal a1 = (Animal)monkey;	// ����� ����ȯ
		Animal a2 = dog;	// �ڵ� ����ȯ
		Animal a3 = cat;
		
		// ������ ���� �ǹ̰� ����? ��� �����Ҽ� �ֽ��ϴ�.
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
		// ���� �޼ҵ�� �����Ͽ� ����Ѵٸ�...
		print(monkey);
//		print(dog);
		
		System.out.println("=================");
		cprint(monkey);
		cprint(dog);
		cprint(cat);
		
		System.out.println("=================");
		a2.print(); // ��
		
		// �� ĳ���õ� ��ü������ ��������Ƿ� ȣ���Ҽ� ����.
//		a2.sound();
		
		// �ٿ� ĳ����(������ Ŭ������ ����)
		Dog d1 = (Dog)a2;	// ��
		d1.sound();
		
		Cat c1 = (Cat)a3;	// �����
		c1.sound();
		
//		a2.print();
//		
//		Animal a4 = d1;
//		a4.print();

//		System.out.println(d1.name);
//		a2.name = "�ȳ��ϼ���";
//		System.out.println(a2.name);
//		System.out.println(d1.name);
		
		sound(a2);	// ��
		sound(a3);	// �����
		sound(a1);	// ������
	}
	
	static public void print(Monkey monkey) {
		monkey.print();
	}
	
	static public void cprint(Animal ani) {
		ani.print();
	}
	
	static public void sound(Animal ani) {
		System.out.println("================");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ݰ����ϴ�.");

		ani.print();

		// ������ Ŭ������ �µ��� �Ʒ��� �κп� ���� ��ɸ� ���ٰ��
		// ������ Ŭ������ �ٿ� ĳ������ �� �� ����� �����Ѵ�.
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








