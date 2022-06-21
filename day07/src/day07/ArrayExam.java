package day07;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
//		int[] arr;				// int형 배열 선언
//		arr = new int[5];		// 배열 저장공간 5개 생성
//		
//		System.out.println(arr);
//		
//		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법
////		System.out.printf("%o\n", arr.hashCode());	// 8진수
//		System.out.printf("%d\n", arr.hashCode());	// 10진수
//		System.out.printf("%x\n", arr.hashCode());	// 16진수
//		
////		System.out.println(System.identityHashCode(arr));
//		System.out.printf("%x\n", System.identityHashCode(arr));	// 16진수
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(Arrays.toString(arr));
//		
//		arr[0] = 1;	// 배열 0번지에 값 1을 저장
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		
//		arr[1] = 10;
//		System.out.println(Arrays.toString(arr));
		
		
		int[] nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.println(nums[i]);
		}
		
		System.out.println("======================");
		
		// 배열의 길이를 알수 있는 방법
		System.out.println(nums.length);
		System.out.println(Arrays.toString(nums));
		
		// 제일 마지막 배열 요소의 값을 출력해주려면?
//		System.out.println(nums[9]);
		System.out.println(nums[nums.length-1]);
		
		// 배열 선언과 초기화를 동시에
		char[] ch = {'A', 'B', 'C', 'D'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);	
		}
	}
}














