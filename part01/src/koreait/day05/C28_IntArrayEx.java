package koreait.day05;

import java.util.Scanner;
// �ۼ���: �ȵ���
public class C28_IntArrayEx {

	// 1. int �迭ũ�⸦ 5 �����ϼ���.�̸��� nums
	// 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	// 3. �Էµ� ���� �հ� , ����� ���մϴ�
	// 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	//					��maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ������ int
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	int[] nums = new int[5];
	for(int i =0;i < 5; i++) {
		nums[i] = sc.nextInt();
	sum += nums[i];
	}
	
	int average = sum / nums.length;
	System.out.println("�迭 nums ����� sum = " + sum);
	System.out.println("�迭 nums ��հ� average = " + average);
	
	int max = maxOfArray(nums);
	System.out.println("�迭 nums �ִ밪 max = " + max);
	int min = minOfArray(nums);
	System.out.println("�迭 nums �ּҰ� max = " + min);
	
	}
	
	
	public static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
		if(max < array[i])	
			max = array[i];
	}
	return max;
	}
	public static int minOfArray(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
		if(min > array[i])
			min = array[i];
		}
	return min;
	}
	
}
	
	//max,min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
	// �迭��� 1�� ���� ��������ұ��� max, min �� ������� ���ؼ�
	//max�� �װ����������� (min�� �װ����� ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
	// -> �񱳰� ������ ���� max, min ������ �˴ϴ�.

