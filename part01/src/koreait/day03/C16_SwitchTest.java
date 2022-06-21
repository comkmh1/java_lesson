package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {

	public static void main(String[] args) {
		//switch문은 if~else if 를 대신하는 명령문입니다.
		Scanner sc = new Scanner(System.in);
		int item_no;
		int pay = 0;
		
		System.out.println("상품목록 : 1. 2200원🍕🍕2. 1900원🍓🍓3. 3600원🌷🌷4. 2870원🍇🍇");
		System.out.println("상품을 선택해서 장바구니에 넣으세요 >>>");
		item_no = sc.nextInt();
		
		
/*		switch (item_no) {  // 조건식과 작성 했을 때와 같이 비교할 변수
		case 1 : 
			pay = 2200;
			break;

		case 2 :
			pay = 1900;
			break;
		
		case 3 :
			pay = 3600;
			break;
		
		case 4 :
			pay = 2870;
			break;
		
		default :
			System.out.println("올바른 상품 선택이 아닙니다");
			pay=99999999;	
			break;
		}
		System.out.println("결제 금액 " + pay + " 입니다");
		*/
		if(item_no == 1) {
				pay = 2200;
		} else if(item_no == 2) {
				pay = 1900;
			}
			else if(item_no == 3) {
				pay = 3600;
			}	else if(item_no == 4) {
				pay = 2870;
				}
				else {
				pay = 9999999;
				}
		System.out.println("결제 금액 " + pay + " 입니다");	
	}
	
	

}
