package day12;

public abstract class Human {
	// �Ϲ������� Ŭ���� ������ ���� ���� �������� �ʴ´�. �׷��� ��ȣ(����)�Ѵ�.
	// �� �̿ܿ��� ���� �Ұ�
	private String type;
	
	protected int age;	// ����
	public String name;

	public Human() {
		this.type = "����"; 
	}

	public abstract void print();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

