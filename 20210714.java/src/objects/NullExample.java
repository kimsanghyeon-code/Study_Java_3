package objects;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
package objects;

import java.util.Objects;

public class NullExample {
   public static void main(String[] args) {      
      String str1 = "홍길동"; //스트링클래스의 적용을 받은 str1에 문자리터럴을 넣음
      String str2 = null; //스트링클래스의 적용을 받은 str2에 null값을 넣음
      
      System.out.println(Objects.requireNonNull(str1)); 
      //리콰이어낫널메서드는 not null상태면 객체를 출력해주고
      //그것이 아닌 null상태다 그럼 널포인터익샙션 nullpointerException 널값에 대한 예외처리를 함
      
      try {
         String name = Objects.requireNonNull(str2); //리퀘어낫널메서드가 매개변수로 str2를 받음
         //널에 대한 값을 name변수에 넣어버림
      } catch(Exception e) {
         System.out.println(e.getMessage()); //null값이기때문에 캐치구문에 의해서 현재 이값이 널이라는 알려주는 출력을 하는거예요.
      }
      
      try {
         String name = Objects.requireNonNull(str2, "이름이 없습니다.");
         
         //인수가 2개가 있는데 하나는 str2 널값이 있는 객체변수고 하나는 텍스트가 있는데, 이 텍스트는 오류가 있을때 출력해주는 메시지로서 작동됨
         //메서드안에서 설정되어있음
         //catch구문이 작동을 하는데 null값이 발생했기때문에 예외처리작동을 하는데. 2번째 인수로 있는 에러텍스트를 출력해줌
      } catch(Exception e) {
         System.out.println(e.getMessage());
      }
      
      try {
         String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");
         //리콰이어낫넬메서드를 작동시켰는데, str2 널값이 들어있는 객체변수이고, 람다식 현재메서드 함수 작동을 할때 출력되는 텍스트를 연결해줌
      } catch(Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
*/
