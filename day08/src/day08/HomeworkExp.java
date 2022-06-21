package day08;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * { 10, 50, 30 } 이런식으로 초기화한 배열에서 가장큰 수 찾아내기
		 * 3개의 값 중에서 가장 큰 수를 찾아내는 알고리즘
		 * 
		 * 가장 큰 수는 50입니다.
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
		 * { 10, 50, 30, 4, 100 } 이런식으로 초기화한 배열에서 
		 * 가장큰 수와 가장 작은 수 찾아내기
		 * 큰 수와 작은 수 찾기 알고리즘 문제
		 * 
		 * 가장 큰 수는 100이고, 가장 작은수는 4입니다.
		 */
		
		int[] nums1 = { 10, 50, 30, 4, 100 };
		int big1 = nums1[0];
		int small = nums1[0];
		
		for(int i = 0; i < nums1.length; i++) {
			System.out.println(big1 + " < " + nums1[i]);
			
			// 큰수 찾아내기 크면 변수에 값 저장
			if(nums1[i] > big1) {
				big1 = nums1[i];
			}
			
			// 작은수 찾아내기 작으면 변수에 값 저장
			if(nums1[i] < small) {
				small = nums1[i];
			}
			
			System.out.println("big1 = " + big1);
			System.out.println("small = " + small);
		}
		

		/* 3.
		 * ===== 주문 메뉴 =====
		 * 1. 햄버거 2000원
		 * 2. 감자튀김 500원
		 * 3. 콜라 1000원
		 * 4. 주문하기 
		 * 
		 * 을 배열로 생성하여 출력하고.
		 * 해당 메뉴를 사용자가 선택하면 배열에 저장하여
		 * 4. 주문하기 선택시 계산하여 주문 금액을 출력한다.
		 *  
		 * 주문 메뉴를 선택하세요 : 1
		 * 		주문 메뉴 출력 ....
		 * 주문 메뉴를 선택하세요 : 2
		 * 		주문 메뉴 출력 ....
		 * 
		 * 단, 최대 주문 받을수 있는 횟수는 5회 까지로 한다.
		 * 
		 * 총 결제 금액은 XXX 원입니다.
		 */
//		String[] menus = {"1. 햄버거 2000원", "2. 감자튀김 500원", "3. 콜라 1000원", "4. 계산하기"};
//		System.out.println(Arrays.toString(menus));
//		int[] items = new int[5];	// 사용자가 입력한 값을 넣는다.(가격)
//		int[] money = {2000, 500, 1000, 0};
//		
//		
//		for(int count = 0; count < 5; count++) {
//			System.out.println("===== 주문 메뉴 ======");
//			System.out.println(Arrays.toString(menus));
//			for(int i = 0; i < menus.length; i++) {
//				System.out.println(menus[i]);
//			}
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("주문 메뉴를 선택하세요.");
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
//		System.out.println("계산 총액은 " + total + "원입니다.");
	}
}
















