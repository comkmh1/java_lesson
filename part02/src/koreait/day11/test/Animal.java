package koreait.day11.test;

public abstract class Animal {
	
	// �̸� ��ӵ� ��������� type�� ���ϴ� ����.
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG = 4;
	static final int SNAKE = 5;

	private String name;
	private String color;
	protected int type;
	
	public Animal() {		// �⺻������!
		System.out.println("���ο� Animal ������ ������ϴ�.");
	}
	
	public abstract void act();		// Animal �ൿ, �߻�޼ҵ�
	
	// �߰��Ҹ��� �߻�޼ҵ�?
	public abstract String eat(Object object);
	
	public void print() {
		System.out.println("name = " + name + ", color = " + color);
	}
	
	@Override
	public String toString() {
		return "Animal [name = " + name + ", color = " + color + "]";
	}

	// getter, setter
	public String getName() {		// ���� private�ϰ� getter, setter ����� ������ �ѹ� �� Ȯ���϶��!
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
