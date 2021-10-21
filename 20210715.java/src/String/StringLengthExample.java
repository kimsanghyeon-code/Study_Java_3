package String;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}

/*
package String;

public class StringLengthExample {
   public static void main(String[] args) {
      String ssn = "7306241230123"; //string타입을 적용한 ssn객체변수에 문자열이 들어감
      int length = ssn.length(); //length변수에 ssn객체변수의 length메서드가 리턴한다
      //ssn에있는 문자열의 길이를 세서 그값을 리턴하는 상황임.
      if(length == 13) {
         //length변수의 값이 13과 같다면 바로아래에 있는 문자열을 출력
         System.out.println("주민번호 자리수가 맞습니다.");
      } else {
         System.out.println("주민번호 자리수가 틀립니다.");
      }
   }
}
*/