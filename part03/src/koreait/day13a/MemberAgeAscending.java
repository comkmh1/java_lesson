package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

//Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자 구현체를 만듭니다
public class MemberAgeAscending implements Comparator<Member>{
	
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age1.compareTo(age2);	//오름차순	 age1<age2일떄 -1을 리턴
	}
	
	
}
