package day09;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * �Ʒ��� ���� 2���� �迭�� �����ϰ�
		 * {{"�ܹ���", "1��", "2000��"}, {"�ݶ�", "1��", "500��"}, {"��������", "1��", "1000��"}}
		 * �� ���� �̿��� ������ �޴��� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 *  ���
		 * 	========== �޴� ==========
			�ܹ���	1��	2000��	
			�ݶ�		1��	500��	
			��������	1��	1000��	
			========================
		 */
		
		
				
		
		
		String[][] menus = {
			{"�ܹ���", "1��", "2000��"}, 
			{"�ݶ�", "1��", "500��"}, 
			{"��������", "1��", "1000��"}
		}
		
		System.out.println("================ �޴� =================");
		for (int i = 0; i < menus.length; i++) {
			for (int j = 0; j < menus.length; j++) {
//				System.out.print(menus[i][j] + '\t');
				System.out.printf("%s\t", menus[i][j]);
			}
			System.out.println();
		}	

		System.out.println("======================================");

		/* 2.
		 * �μ��� �Է¹޾� ��Ģ����(+-/*)�� �ϴ� �޼ҵ带 ���弼��.
		 * 
		 * 
		   	��뿹 calc(6, 3) �޼ҵ带 ȣ���ϸ� �Ʒ��� ���� ���
		  	
		  	���ϱ� 		9	
		 	����			3	
		 	���ϱ�		18
		 	������		2
		 */
		
		
	    
		
//		calc(6, 3);
//		calc(5, 3);
//		calc(2, 5); 
		

		/* 3.
		 * �޴��� ǥ���ϴ� ����� �޼ҵ�(�Լ�)�� ����� �����Ͽ� �Ʒ�ó�� ����ϼ���.
		 * 
		 * hint)
		 * �޼ҵ��� �Է��Ķ���ͷ� �޴���� ������ �Է¹޴´�(String name, int price)
		 * ���� �����δ� price�� �ٽ� ���Ϲ޴´�.
		 * �� ���ϰ��� �Ѿ� ���� ����Ѵ�.
		 * menu("�����", 5000);	: ����
		 * 
		   	���

		  	�����	5000��	
		 	«��		6000��	
		 	������	10000��
		 	====================
		 	�Ѿ�		21000��
		 */
		
		int total 	= 0;
		
		total 	+= menu("�����", 5000);
		total 	+= menu("«��", 7000);
		total 	+= menu("������", 10000);
		
		System.out.println("======================");
		menu("�Ѿ�", total);
	}
	
	// ���� �����ϸ� �޼ҵ�� ������ ����ǳ���?

	public static int menu(String name, int price) {
		System.out.println(name + "\t" + price + "��");
		return price;
	}
	
	public static void calc(int a, int b) {
		System.out.println("���ϱ�\t" + (a + b));
		System.out.println("����\t" + (a - b));
		System.out.println("���ϱ�\t" + (a * b));
		System.out.println("������\t" + (a / b));
	} 
}












