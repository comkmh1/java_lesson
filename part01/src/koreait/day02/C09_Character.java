package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		
/* ������ �⺻���� : ������ char 
 * 	���ڵ����͸� �����ϴ� 2����Ʈ ����, ������ 0 ~ 65535 ���� ���嵵 �����մϴ�.
 *  ��ǻ�Ϳ��Լ� �ٷ�� ���ڴ� �����ڵ�� ó���Ǵµ� �ڵ�� �������Դϴ�.
 *  ���ڵ����ʹ� '' ��ȣ�� ����մϴ�. 
 *	������,����,Ư�����ڴ� ASCII	�ڵ�� ǥ���˴ϴ�.
 *  ������, ����,Ư������ ���� �ٱ���ڴ� ���ڸ� ó���ϴ� ���ڵ���Ŀ� ���� 
 *	�����ڵ尪�� �ٸ��ϴ�. ����ȭ ���ڵ����� utf-8 ����� ���� ����մϴ�.
 */
		
	char c1 = 'a';
	char c2 = 97; //�����ڵ�� ������

//	�� : �� �� �� (�ʼ�,�߼�,���� ������ �ڵ尪���� �����ϴ� ������)
//	�ѱۿ��� ���� �� �ִ� ��� �ʼ�/�߼�/������ ��� ǥ���� ���� ���� �ڵ尪�� �ο��ϴ� �ϼ��� -> utf-8 ����� �ϼ���
	
	System.out.println("c1 = " + c1);
	System.out.println("c2 = " + c2);
	
	c1 = (char)(c1 + 1); 
	System.out.println("c1 = " + c1);
	
	c1++; 			//++������ c1 = c1 + 1 , char�������� casting�� �մϴ�
	System.out.println("c1 = " + c1);
	
	
	//�ѱ� ���� �׽�Ʈ : �ѱ۹����ڵ�� 10�������� 44032 ~ 55203, 16����(2����) ac00 ~ d7a3 
	
	char h1 = '��';
	char h2 = 44032;
	char h3 = '\uac00';		// \\u�� 10���������ڵ�, ac00�� 16���� ��
	System.out.println("h1 = " + h1);
	System.out.println("h2 = " + h2);
	System.out.println("h3 = " + h3);
	
	h1++;
	System.out.println("h1 = " + h1);
	
	h1++;
	System.out.println("h1 = " + h1);	
	
	char h4 = 55203;
	char h5 = '\ud7a3';
	System.out.println("h4 = " + h4);
	System.out.println("h5 = " + h5);
	
	
	
	
	}

}