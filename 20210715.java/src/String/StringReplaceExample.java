package String;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 개체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바","JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

/*
package String;

public class StringReplaceExample {
   public static void main(String[] args) {
      String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다."; //문자열이 긴데..
      //oldstr객체변수에 들어감
      String newStr = oldStr.replace("자바", "JAVA");
      //oldstr객체변수에서 replace메서드에 자바와 JAVA가 들어감
      //replace교체작업을 해줘요. 
      //자바라는 문자를 JAVA로 바꿔줌.
      //그결과를 newStr객체변수에 저장을 해줌.
      //객체변수가 생기고 저기에 문자열이 들어가는 데.
      //replace메서드의 연산결과가 들어감.
      //내부적으로 내용을 변경했다기보다는 기존의 글씨에서 내용이 변경된 또다른 문자열객체가 힙영역 jvm메모리영역에 
      //나타났다고 봐야하는 거예요. 실제로 그렇게 됨. 
      //객체변수에 replace메서드가 내용을 변경을 해서 새로운 문자열 객체를 만들어낸것이 됨. 
      
      System.out.println(oldStr); //올드스트링
      System.out.println(newStr); //뉴스트링의 차이를 보여주는 상황이다. 
   }
}
*/