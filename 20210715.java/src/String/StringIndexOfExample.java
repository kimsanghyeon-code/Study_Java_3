package String;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바")!= -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}

/*
package String;


public class StringIndexOfExample {
   public static void main(String[] args) {
      String subject = "자바 프로그래밍"; //String 클래스타입을 적용한 subject객체변수에 문자열을 할당함
      
int location = subject.indexOf("프로그래밍"); //subject객체변수의 indexof메서드를 통해서 매개변수가 객체변수에 있는 문자열에서 몇번째 인덱스의 위치에 있는 지를 계산을 해줌
//그값을 리턴해서 location 정수형변수에 할당을 해줌
      System.out.println(location); //출력함 인덱스번호를
      
      if(subject.indexOf("자바") != -1) {
//만약에 subject객체변수에서 indexof 자바 이 변수안에서 몇번째 인덱스에 있는 파악함 
// -1 은 일치하는 값이 없을때 indexof에서 계산하고 리턴하는 값이예요. 쉽게 말해서 찾는 값이 없으면 -1을 출력해요
// 자바를 indexof메서드로 찾았는데 리턴값이 -1이 아닌 것이 맞지? 라는 뜻이예요.
// -1이 아니면 true가 되서 그래서 바로 아래에 있는 코드를 실행함         
         System.out.println("자바와 관련된 책이군요");
      } else {
         System.out.println("자바와 관련없는 책이군요");
      }
   }
}
*/