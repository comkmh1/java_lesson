package review;

// �߻� Ŭ����
public abstract class Human {
	private char type;

	// �̸��� ���̸� ����� �Ϲ�ȭ ����
	// ��� �ΰ��� �̸��� ���̰� �ִٰ� �����Ѵ�.
	private String name;
	private int age;

	public Human() {
		this.type = 0;
		
		// �ʱ�ȭ
		this.name = "";
		this.age = 0;
	}
	
	public Human(char type, String name, int age) {
		this.type = type;
		
		// �ʱ�ȭ
		this.name = name;
		this.age = age;
	}
	
	// �߻� �޼ҵ�
	public abstract void print();

	// getter
	public char getType() {
		return type;
	}

	// getName, getAge �޼ҵ� �߰�
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

	// setName, setAge �޼ҵ� �߰�
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}