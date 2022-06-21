package project;

//���� Human Ŭ������ �߻� Ŭ������ �Ǿ���.
public class Teacher extends Human {
	// ��� ����
	String className;
	String name;
	int age;

	// ������
	public Teacher() {
		className = "";
		name = "";
		age = 0;
	}

	public Teacher(String className, char type, String name, int age) {
		this.className = className;
		this.name = name;
		this.age = age;
		
		// ����� �θ��� ��� ���� type ���� �����Ѵ�.
		// �θ� Ŭ�������� type�� private�� �Ǿ����Ƿ�
		// ���� ���̻� this.type���� ���� ������ �Ұ����ϴ�.
		// this.type = type;
		
		// ���� setter�� �̿��� �����ؾ� �Ѵ�.
		this.setType(type);
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
	
	// print �޼ҵ�
	public void print() {
		System.out.println("============ ���� ������ ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
		//System.out.println("������ " + type + "�Դϴ�."); // ���ٺҰ�
		System.out.println("������" + getType() + "�Դϴ�.");
		System.out.println("���̴� " + age + "�Դϴ�.");
		System.out.println("=====================================");
	}
}
