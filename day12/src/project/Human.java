package project;

// �߻� Ŭ���� : �߻� �޼ҵ尡 ������ �ݵ�� �߻� Ŭ������ �Ǿ� �Ѵ�.
abstract class Human {
	// ��� ������ private�� ĸ��ȭ �Ѵ�.
	private char type; // ����

	public Human() {
		this.type = 0;
	}
	
	public Human(char type) {
		this.type = type;
	}
	
	// �߻� �޼ҵ�� ��� �ڽ��� �ϴ� ������ �����ؾ��Ѵ�.
	public abstract void print();

	// getter
	public char getType() {
		return type;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}
}