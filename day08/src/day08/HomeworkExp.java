package day08;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * { 10, 50, 30 } �̷������� �ʱ�ȭ�� �迭���� ����ū �� ã�Ƴ���
		 * 3���� �� �߿��� ���� ū ���� ã�Ƴ��� �˰���
		 * 
		 * ���� ū ���� 50�Դϴ�.
		 */
//		int[] nums = { 10, 50, 30, 10, 100, 40 };
//		int big = 0;
//		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(big + " < " + nums[i]);
//			if(nums[i] > big) {
//				big = nums[i];
//			}
//			System.out.println("big = " + big);
		}
		
		/* 2.
		 * { 10, 50, 30, 4, 100 } �̷������� �ʱ�ȭ�� �迭���� 
		 * ����ū ���� ���� ���� �� ã�Ƴ���
		 * ū ���� ���� �� ã�� �˰��� ����
		 * 
		 * ���� ū ���� 100�̰�, ���� �������� 4�Դϴ�.
		 */
		
		int[] nums1 = { 10, 50, 30, 4, 100 };
		int big1 = nums1[0];
		int small = nums1[0];
		
		for(int i = 0; i < nums1.length; i++) {
			System.out.println(big1 + " < " + nums1[i]);
			
			// ū�� ã�Ƴ��� ũ�� ������ �� ����
			if(nums1[i] > big1) {
				big1 = nums1[i];
			}
			
			// ������ ã�Ƴ��� ������ ������ �� ����
			if(nums1[i] < small) {
				small = nums1[i];
			}
			
			System.out.println("big1 = " + big1);
			System.out.println("small = " + small);
		}
		

		/* 3.
		 * ===== �ֹ� �޴� =====
		 * 1. �ܹ��� 2000��
		 * 2. ����Ƣ�� 500��
		 * 3. �ݶ� 1000��
		 * 4. �ֹ��ϱ� 
		 * 
		 * �� �迭�� �����Ͽ� ����ϰ�.
		 * �ش� �޴��� ����ڰ� �����ϸ� �迭�� �����Ͽ�
		 * 4. �ֹ��ϱ� ���ý� ����Ͽ� �ֹ� �ݾ��� ����Ѵ�.
		 *  
		 * �ֹ� �޴��� �����ϼ��� : 1
		 * 		�ֹ� �޴� ��� ....
		 * �ֹ� �޴��� �����ϼ��� : 2
		 * 		�ֹ� �޴� ��� ....
		 * 
		 * ��, �ִ� �ֹ� ������ �ִ� Ƚ���� 5ȸ ������ �Ѵ�.
		 * 
		 * �� ���� �ݾ��� XXX ���Դϴ�.
		 */
//		String[] menus = {"1. �ܹ��� 2000��", "2. ����Ƣ�� 500��", "3. �ݶ� 1000��", "4. ����ϱ�"};
//		System.out.println(Arrays.toString(menus));
//		int[] items = new int[5];	// ����ڰ� �Է��� ���� �ִ´�.(����)
//		int[] money = {2000, 500, 1000, 0};
//		
//		
//		for(int count = 0; count < 5; count++) {
//			System.out.println("===== �ֹ� �޴� ======");
//			System.out.println(Arrays.toString(menus));
//			for(int i = 0; i < menus.length; i++) {
//				System.out.println(menus[i]);
//			}
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("�ֹ� �޴��� �����ϼ���.");
//			
//			int no = sc.nextInt();
//			if(no >= 4) {
//				break;
//			}
//			
//			if(no == 1) {
//				items[count] = 2000;
//			} else if(no == 2) {
//				items[count] = 500;
//			} else if(no == 3) {
//				items[count] = 1000;
//			} else {
//				items[count] = 0;
//			}
//			
//			items[count] = money[no-1];
//
//			System.out.println(menus[no-1]);
//			System.out.println(Arrays.toString(items));
//		}
//		
//		int total = 0;
//		for (int i = 0; i < items.length; i++) {
//			total += items[i];
//		}
//		
//		System.out.println("��� �Ѿ��� " + total + "���Դϴ�.");
	}
}
















