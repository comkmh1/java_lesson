package review;

public class Teacher extends Human {
	// final Ű����� ����� ����� ���� Ű�����̴�.
	// static Ű����� ���� ������ ����� ���� Ű�����̴�.
	// ��, �Ʒ��� ���� ����� JOB ����� ���� �� �ʱ�ȭ �� ���̴�.
	final static String JOB = "������";

	// ��� ����
	private String className;

	// ������
	public Teacher() {
		super();
		this.className = "";
	}

	public Teacher(String className, char type, String name, int age) {
		super(type, name, age);
		this.className = className;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}
	
	// getter
	public String getClassName() {
		return className;
	}

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
