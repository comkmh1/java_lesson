package day07;

import java.util.Arrays;

public class ArrayExam {

	public static void main(String[] args) {
//		int[] arr;				// int�� �迭 ����
//		arr = new int[5];		// �迭 ������� 5�� ����
//		
//		System.out.println(arr);
//		
//		// �ڹٿ��� ������ ������ �޸� �ּҸ� ǥ���ϴ� ���
////		System.out.printf("%o\n", arr.hashCode());	// 8����
//		System.out.printf("%d\n", arr.hashCode());	// 10����
//		System.out.printf("%x\n", arr.hashCode());	// 16����
//		
////		System.out.println(System.identityHashCode(arr));
//		System.out.printf("%x\n", System.identityHashCode(arr));	// 16����
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(Arrays.toString(arr));
//		
//		arr[0] = 1;	// �迭 0������ �� 1�� ����
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
		
		// �迭�� ���̸� �˼� �ִ� ���
		System.out.println(nums.length);
		System.out.println(Arrays.toString(nums));
		
		// ���� ������ �迭 ����� ���� ������ַ���?
//		System.out.println(nums[9]);
		System.out.println(nums[nums.length-1]);
		
		// �迭 ����� �ʱ�ȭ�� ���ÿ�
		char[] ch = {'A', 'B', 'C', 'D'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);	
		}
	}
}














