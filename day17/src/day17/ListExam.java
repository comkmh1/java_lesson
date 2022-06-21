package day17;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExam {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr = new int[]{1, 2, 3, 4, 5};
		
//		arr[5]  = 10; // ????
		System.out.println(arr.length);
		
		// 원시 타입 변수는 불가
//		ArrayList<int> list = new ArrayList<E>();
		// Wrapper 클래스 자료형만 가능
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		
		// 리스트에 값을 추가하면 크기가 자동으로 늘어난다.
		list.add(Integer.valueOf(10));	// 본래의 타입으로 넣어야 한다.
		System.out.println(list.size());
		list.add(Integer.valueOf(11));	// 그러나 오토박싱으로 자동 변환해서 넣어준다.
		list.add(Integer.valueOf(12));
		list.add(Integer.valueOf(11));
		System.out.println(list.size());
		System.out.println(list.toString());
		
		// 현재 크기 내의 index의 값을 변경하는 것은 가능
		list.set(1, 20);
		System.out.println(list.toString());
		
		// 크기를 벗어난 set은 오류.
//		list.set(5, 40);
//		System.out.println(list.toString());
		
		// 데이터 읽어오기
		System.out.println(list.get(0));
		System.out.println(list.get(2));
//		System.out.println(list.get(5));
		
		System.out.println("============================");
		// 컬렉션을 반복하는 방법 1
		for (int i = 0; i < list.size(); i++) {
			Integer item = list.get(i);
			System.out.println(item);
		}
		
		// 컬렉션을 반복하는 방법 2
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		// 컬렉션을 반복하는 방법 3
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("=============================");
		
		// 그리고 삭제도 가능하다.
		list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		// 마지막 저장된 모든 객체 삭제(클리어)
		list.clear();
		System.out.println(list.size());
		
		// 사용 방법 및 메소드 정리
		// 객체 생성(List는 인터레이스이므로 상속한 자식 클래스로 객체를 생성해야 한다.
		ArrayList<String> strlist = new ArrayList<String>();
		
		strlist.add("123");		// 마지막에 데이터 추가
		strlist.add(0, "abc"); 	// 해당 인덱스 위치에 데이터를 삽입(중간삽입)
		System.out.println(strlist);
		strlist.set(0, "234");	// 해당 인덱스의 값 수정
		strlist.get(0); 		// 해당 인덱스의 값 읽기
		strlist.remove(0); 		// 해당 인덱스의 값 삭제
		strlist.size();			// 컬렉션의 요소 개수 확인
		strlist.clear();		// 모든 데이터 삭제
		strlist.toString();		// 컬렉션의 값을 문자열로 출력
			
	}
}












