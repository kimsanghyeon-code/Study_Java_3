package objects;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다"));
	}
}


/*
package objects;


import java.util.Objects;

public class ToStringExample {
   public static void main(String[] args) {      
      String str1 = "홍길동"; //str1에 문자리터럴을 넣고
      String str2 = null; //str2에 null값을 넣음
      
      System.out.println(Objects.toString(str1)); //tostring메서드는 매개변수가 null값이 아니면 변수안에 들어있는 내용을 그대로 출력을 함
      System.out.println(Objects.toString(str2)); //null일 경우에는 tostring메서드가 널값을 출력함
      System.out.println(Objects.toString(str2, "이름이 없습니다.")); // 매개변수가 2개이면 null일경우에 2번째 있는 매개변수를 에러메시지를 출력하도록 한다.
      //null default 널 디폴트 라고 부름. 
   }
}
*/