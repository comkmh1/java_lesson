package project;

//extends�� ���� Human Ŭ������ ��� �޴´�.
//��, Human�� �θ� Ŭ������ �ǰ� Teacher�� �ڽ� Ŭ������ �ȴ�.
public class Teacher extends Human {
	// ��� ����
	String className;
	String name;
	int age;

	// ������(�⺻ ������)
	public Teacher() {
		className = "";
		name = "";
		age = 0;
	}

	// ������(�ʱ�ȭ ������)
	public Teacher(String className, char type, String name, int age) {
		this.className = className;
		this.name = name;
		this.age = age;
		
		// ����� �θ��� ��� ���� type ���� �����Ѵ�.
		this.type = type;
	}

	// setter �޼ҵ�
	public void setClassName(String className) {
		this.className = className;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// setType()�� �θ� ������ �����Ƿ� �������� �ʴ´�. 

	// getter �޼ҵ�
	public String getClassName() {
		return className;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// getType()�� �θ� ������ �����Ƿ� �������� �ʴ´�.
	
	// print �޼ҵ�
	public void print() {
		System.out.println("============ ���� ������ ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("������" + type + "�Դϴ�.");
		System.out.println("���̴� " + age + "�Դϴ�.");
		System.out.println("=====================================");
	}
}
