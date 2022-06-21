package review;

// �߻� Ŭ����
abstract class Human {
	private char type; // ����
	private String name;
	private int age;

	public Human() {
		this.type = 0;
		this.name = "";
		this.age = 0;
	}
	
	public Human(char type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}
	
	// �߻� �޼ҵ� ��� �ڽ��� �ϴ� ������ �����ؾ��Ѵ�.
	public abstract void print();

	// getter
	public char getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}