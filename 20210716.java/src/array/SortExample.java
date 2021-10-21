package array;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
	}
}

/*
package array;
import java.util.Arrays;

public class SortExample {
   public static void main(String[] args) {
      int[] scores = { 99, 97, 98 };//scores정수배열변수에 3개의 값이 저장됨
      Arrays.sort(scores); Arrays클래스의 정적메서드 sort인데 scores배열변수가 입력됨
      for(int i=0; i<scores.length; i++) {//scores길이보다 짧게 될떄까지 반복한다. 
         System.out.println("scores[" + i + "]=" + scores[i]); //오름차순으로 되어있음
      }
      System.out.println();
      
      String[] names = { "홍길동", "박동수", "김민수" }; names배열변수에 3개의 문자열을 입력했다. 
      Arrays.sort(names);//문자열배열을 정렬했어요. 
      for(int i=0; i<names.length; i++) {//인덱스는 0에서 2까지
         System.out.println("names[" + i + "]=" + names[i]);//출력해줌
      }
      System.out.println();
      
      Member m1 = new Member("홍길동");//Member클래스에 문자열을 매개변수로 넣고 객체를 생성한다. 그리고 m1에 할당한다. 
      Member m2 = new Member("박동수");//m2에 할당
      Member m3 = new Member("김민수");//m3에 할당
      Member[] members = { m1, m2, m3 };//Member클래스배열에 타입을 받은 members배열변수에 3개의 객체가 할당된다. 
      Arrays.sort(members); //sort메서드가 객체를 대상으로 정렬을 시도 함. 
      for(int i=0; i<members.length; i++) {//객체의 배열의 길이보다 작을떄까지.
         System.out.println("members[" + i + "].name=" + members[i].name);
         //0부터 2까지 반복을 한다. 인덱스를 
      }
   }
}
*/