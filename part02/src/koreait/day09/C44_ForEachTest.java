package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
// �迭�� for ������ ������ �� �ε��� ������ ����մϴ�. �ڵ��� �� ȿ������ ���̱� ���� ���� for(for each) ���
		
		int[] itest = {1,2,3,4,5,6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		
		for(int i = 0; i < itest.length; i++)
			System.out.println("i = " + i +",itest[i] =" + itest[i]);

		for(int i = 0; i < stest.length; i++)
			System.out.println("i = " + i +",stest[i] =" + itest[i]);
		
		System.out.println("itest �迭��");
		for(int temp : itest)
			System.out.println(temp);
			
			
	}

}
