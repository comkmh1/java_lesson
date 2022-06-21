package project;

public class Teacher extends Human {
	private String className;
	// age, name�� �θ� Ŭ������ �̵��ߴ�.

	public Teacher() {
		// super() �޼ҵ带 �̿��� �ʱ�ȭ�� �θ��� �������̿��Ͽ� �ʱ�ȭ�� �� �ִ�.
		// type, name, age�� ���� ���⼭ �ʱ�ȭ�ȴ�.
		super();

		this.className = "";
	}

	public Teacher(String className, char type, String name, int age) {
		// super() �޼ҵ带 �̿��� �ʱ�ȭ�� �θ��� �������̿��Ͽ� �ʱ�ȭ�� �� �ִ�.
		// type, name, age�� ���� ���⼭ �ʱ�ȭ�ȴ�.
		super(type, name, age);
		
		this.className = className;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}
	
	// setName, setAge�� Human Ŭ������ �ִ�.
	
	// getter
	public String getClassName() {
		return className;
	}
	
	// getName, getAge�� Human Ŭ������ �ִ�.

	// print �޼ҵ�(�߻� �޼ҵ� �������̵�)
	@Override
	public void print() {
		System.out.println("============ ���� ������ ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + this.getName() + "�Դϴ�.");
		System.out.println("���̴� " + this.getAge() + "�Դϴ�.");
		System.out.println("������ " + this.getType() + "�Դϴ�.");
		System.out.println("=====================================");
	}
}
