package koreait.day11;

/*�߻�Ŭ���� : ��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�. new ���� ����.
�߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
�θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.
�߻�޼ҵ带 ������(����)�� �ڽ�Ŭ������ �����ؼ� ��ü�� �����մϴ�.
*/

public abstract class ClassAbs {

	protected String name;		//�ڽ� Ŭ������ �ٸ� ��Ű�������� ���� ����. 
	//�߻�޼ҵ� : �ڽĵ��� �������ϵ��� ���ĸ� �����մϴ�.  
	public abstract void test();
	
	public void print() {
		System.out.println("name = " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	












}
