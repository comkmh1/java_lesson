package day08;

import java.util.Arrays;
import java.util.Iterator;

public class Array2D {

	public static void main(String[] args) {
//		int[][] arr = new int[4][3];
		
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(arr.length); // ?1.4, 2.3 3. 12
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
//		System.out.println(arr[3].length);
		
//		int count = 1;
//	    for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i][0]);
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j] = count;
//				count++;
//				System.out.println(arr[i][j]);
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(arr));
		
		
		
		/*
		 * 1.
		 * 3 x 3 2���� �迭�� �����ϰ� �Ʒ��� ���� �ʱ�ȭ �Ѵ�.
		 * {{90, 70, 90}, {100, 90, 100}, {30, 90, 70}}
		 * �Ʒ��� ���� ����� ��µǵ��� �Ͻÿ�.
		 * 
		 * ���
		 * 
		 
		 ��ȣ	����	����	����	����	���
		 ================================
		 1	90	70	90	250	83
		 2  100	90	100	290	96
		 3  30	90	70	190	63
		 ================================
		 */
		
		int[][] arrs = {{90, 70, 90}, {100, 90, 100}, {30, 90, 70}};
		
		System.out.println("��ȣ	����	����	����	����	���");
		System.out.println("================================");
		
		int total;
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(i+1);
			
			total = 0;
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("\t%d", arrs[i][j]);
				total += arrs[i][j];
			}
			System.out.printf("\t%d\t%d", total, total/3);
			System.out.println();
		} 
		
		
		System.out.println("================================");
		
		
	}

}








