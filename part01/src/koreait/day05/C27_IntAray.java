package koreait.day05;

import java.util.Arrays;

public class C27_IntAray {

	public static void main(String[] args) {

		
		//�迭����
		int[] arr1 = {67,45,98,12,45,66,95};
		int[] arr2 = new int[7];
		
		
		System.out.println("\n�迭�̸�(������ ����)����ϱ�");
		System.out.println(arr1);			 //16����. �������� �����ִ� �ؽ�������
		System.out.println(arr1.hashCode()); //10����
		
		
		// �迭 ��Ұ� 1�� ���
		System.out.println("\n�迭 ��Ұ� 1�� ���(�ε��� 3��)");
		System.out.println("arr1 = ?" + arr1[3]);
		System.out.println("arr2 = ?" + arr2[3]);
	 
		System.out.println("\n�迭 ��Ұ� 1�� ����(�ε��� 3��");
		arr1[3] = 999;
		arr2[3] = 999;

		//����� �迭�� ���� ��� ����� �� �ִ� ���ڿ��� ��ȯ��Ű�� �޼ҵ�
		String temp = Arrays.toString(arr1);
		System.out.println(temp);
        System.out.println(Arrays.toString(arr2));	
        
        //��¿��� : arr1[0] = 67 �������� ��� ���� ����ϰ� �ʹ�. -> for��
        System.out.println("\nfor������ �迭��Ұ� ���(arr1)");
        for(int i =0;i < 7;i++)
        	System.out.println("arr1["+i+"] = " + arr1[i]);
        
        System.out.println("\nfor������ �迭��Ұ� ���(arr2)");
        for(int i = 0;i < arr2.length;i++) {
        	String t = String.format("arr2[%d] = %d\n",i,arr2[i]);
        	System.out.printf("arr2[%d] = %d\n",i,arr2[i]);
        }	
        	
        System.out.println("\n���� ���� �޼ҵ�� �迭�� ���");
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