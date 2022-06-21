package koreait.day05;

import java.util.Scanner;
// 작성자: 안동근
public class C28_IntArrayEx {

	// 1. int 배열크기를 5 선언하세요.이름은 nums
	// 2. 배열 요소의 값은 사용자 입력으로 지정합니다.
	// 3. 입력된 값의 합계 , 평균을 구합니다
	// 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	//					ㄴmaxOfArray, minOfArray : 인자는 int 배열, 반환값형식 int
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	int[] nums = new int[5];
	for(int i =0;i < 5; i++) {
		nums[i] = sc.nextInt();
	sum += nums[i];
	}
	
	int average = sum / nums.length;
	System.out.println("배열 nums 요소합 sum = " + sum);
	System.out.println("배열 nums 평균값 average = " + average);
	
	int max = maxOfArray(nums);
	System.out.println("배열 nums 최대값 max = " + max);
	int min = minOfArray(nums);
	System.out.println("배열 nums 최소값 max = " + min);
	
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
	
	//max,min 변수를 각각 배열의 0번 요소값으로 초기화 합니다.
	// 배열요소 1번 부터 마지막요소까지 max, min 과 순서대로 비교해서
	//max가 그값보다작으면 (min이 그값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
	// -> 비교가 끝나면 최종 max, min 결정이 됩니다.

