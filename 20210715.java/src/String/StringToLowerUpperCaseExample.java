package String;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
/*
package String;

public class StringToLowerUpperCaseExample {
   public static void main(String[] args) {
      String str1 = "Java Programming"; //str1에 첫글자만 단어의. 대문자가 됨. 할당함
      String str2 = "JAVA Programming"; //str2에 모두 대문자만 넣음
      
      System.out.println(str1.equals(str2)); //서로 같은지 판단하는 메서드
      
      String lowerStr1 = str1.toLowerCase();//소문자로 변경을 시킴 그리고 lowerStr1에 할당함 + toLowerCase 문자열을 전체를 소문자로 변경한 문자열을 생성
      String lowerStr2 = str2.toLowerCase(); //str2의 소문자로 전부 변경결과를 lowerStr2객체변수에 할당함
      System.out.println(lowerStr1.equals(lowerStr2));//두개의 내용이 변환된 문자열을 서로 비교함
      
      System.out.println(str1.equalsIgnoreCase(str2)); //글자들의 내용에서 같은 것은 이퀄즈이그노르케이스메서드를 써서 리턴하면 됨.             
   }
}
*/