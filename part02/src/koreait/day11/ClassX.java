package koreait.day11;

public class ClassX extends ClassAbs {
	// �߻�Ŭ���� ��ӹ��� �ڽ�(����)Ŭ������ �ݵ�� �߰��ؾ� �Ѵ�.
	private int num;
	
	@Override
	public void test() {
		System.out.println("ClassX �� test()");
		System.out.println("num = " + num);
	
	
	}


	public void setNum(int num) {
		this.num = num;
	}




}
