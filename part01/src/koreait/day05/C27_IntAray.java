package koreait.day05;

import java.util.Arrays;

public class C27_IntAray {

	public static void main(String[] args) {

		
		//배열선언
		int[] arr1 = {67,45,98,12,45,66,95};
		int[] arr2 = new int[7];
		
		
		System.out.println("\n배열이름(참조형 변수)출력하기");
		System.out.println(arr1);			 //16진수. 참조값과 연관있는 해쉬콛콛값
		System.out.println(arr1.hashCode()); //10진수
		
		
		// 배열 요소값 1개 출력
		System.out.println("\n배열 요소값 1개 출력(인덱스 3번)");
		System.out.println("arr1 = ?" + arr1[3]);
		System.out.println("arr2 = ?" + arr2[3]);
	 
		System.out.println("\n배열 요소값 1개 저장(인덱스 3번");
		arr1[3] = 999;
		arr2[3] = 999;

		//선언된 배열의 값을 모두 출력할 수 있는 문자열로 변환시키는 메소드
		String temp = Arrays.toString(arr1);
		System.out.println(temp);
        System.out.println(Arrays.toString(arr2));	
        
        //출력예시 : arr1[0] = 67 형식으로 모든 값을 출력하고 싶다. -> for문
        System.out.println("\nfor문으로 배열요소값 출력(arr1)");
        for(int i =0;i < 7;i++)
        	System.out.println("arr1["+i+"] = " + arr1[i]);
        
        System.out.println("\nfor문으로 배열요소값 출력(arr2)");
        for(int i = 0;i < arr2.length;i++) {
        	String t = String.format("arr2[%d] = %d\n",i,arr2[i]);
        	System.out.printf("arr2[%d] = %d\n",i,arr2[i]);
        }	
        	
        System.out.println("\n내가 만든 메소드로 배열값 출력");
        arrayPrint(arr1, "arr1");
        arrayPrint(arr2, "arr2");
	}
        
        
	
	    
       

public static void arrayPrint(int[] array,String name) {
	 for(int i = 0;i < array.length;i++) {
    	String t = String.format("arr2[%d] = %d\n",i,array[i]);
    System.out.println(t);
    }
	}
}