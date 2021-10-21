package array;

import java.util.Arrays;

public class SearchExample {
	public static void mian(String[] args) {
		//기본 타입값 검색
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores,99);
		System.out.println("찾은 인덱스: "+ index);
		
		//문자열 검색
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names,"홍길동");
		System.out.println("찾은 인덱스: "+index);
		
		//객체 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members,m1);
		System.out.println("찾은 인덱스:" + index);
	}
}

/*
package array;

import java.util.Arrays;

public class SearchExample {
   public static void main(String[] args) {
      //기본 타입값 검색
      int[] scores = { 99, 97, 98 };//정수배열로 3개의 값이 할당된다 scores객체배열
      Arrays.sort(scores); //arrays클래스의 sort메서드로 scores배열을 정렬을 해버린다. 
      int index = Arrays.binarySearch(scores, 99); //arrays클래스의 binarysearch메서드를 사용함. 
      //타겟배열은 scores로 찾으려는 값은 99로 해서 매개변수를 집어넣고 리턴을 받는다. 
      //그값이 정렬이후 인덱스 그래서 2번인덱스가 99니까. 그대로 2를 넣겨줌.
      System.out.println("찾은 인덱스: " + index);//출력을 해버림. 
      
      //문자열 검색
      String[] names = { "홍길동", "박동수", "김민수" };//문자열배열을 만들고, String클래스에서 names배열변수를 선언하고 그안에 문자열배열값을 할당
      Arrays.sort(names);//소팅 정렬작업을 함
      index = Arrays.binarySearch(names, "홍길동"); //바이너리서치메서드.
      //names배열변수준비시키고, 찾으려는 값을 두번쨰인수로 넣고 리서치연산을 시작함. 그결과 리턴값을 index배열에 할당함
      System.out.println("찾은 인덱스: " + index);
      
      //객체 검색
      Member m1 = new Member("홍길동"); //new키워드로 member객체를 생성해서 매개변수를 넣어주고 객체를 m1객체변수에 할당한다. 
      Member m2 = new Member("박동수"); //m2, m3 모두 같음. 
      Member m3 = new Member("김민수");
      Member[] members = { m1, m2, m3 };//member배열데이터타입을 적용한 members배열변수에 3개의 객체를 할당함.
      Arrays.sort(members);//문자열객체들을 정렬함. sort메서드가 있으니까. 가능함.
      index = Arrays.binarySearch(members, m1);//바이너리서치로 해서 메서드를 작동시킨다. 
      //members배열임.찾고 싶은 객체는 m1임. 그결과값을 index에 리턴시킨다. 
      System.out.println("찾은 인덱스: " + index);//그것을 출력시킴. 
   }
}
*/
