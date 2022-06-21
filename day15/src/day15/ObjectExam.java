package day15;

class ObjectTest {
	int value;
	
	public ObjectTest(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		// �� �ڽ��� ��ü�� �Ķ���ͷ� �Ѿ�� ��ü�� ���Ͽ� true/false ��ȯ
//		return this.value == ((ObjectTest)obj).value;
		
		// ���ܻ�Ȳ ó���� �ʿ��ϴ�.
		if(obj instanceof ObjectTest) {
			// ���� ��� ������ 3�����....
//			ObjectTest obj1 = ((ObjectTest)obj);
//			
//			boolean a = this.name.equals(obj1.name);	// String���
//			boolean b = this.age == obj1.age;			// int
//			boolean c = this.type == obj1.type;			// char
//			
//			return a && b && c;
					
			return this.value == ((ObjectTest)obj).value;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.value + "";
	}
}

public class ObjectExam {
	public static void main(String[] args) {
		// String Ŭ�������� equals��  toString �׽�Ʈ
		String a = new String("10");
		String b = new String("10");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.toString());
		
		ObjectTest obj1 = new ObjectTest(10);
		ObjectTest obj2 = new ObjectTest(10);
		
		// ObjectTest�� equals �޼ҵ� �׽�Ʈ
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		System.out.println("==========================");
		System.out.println(obj1.equals(b));	
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
