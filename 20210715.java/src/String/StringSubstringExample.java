package String;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}

/*
package String;

public class StringSubstringExample {
   public static void main(String[] args) {   
      String ssn = "880815-1234567 "; //ssn 문자열클래스타입을 받은 객체변수이고 거기에 문자열이 들어감
      
      String firstNum = ssn.substring(0, 6); //ssn객체변수의 substring메서드가 0번인덱스 6번인덱스 출력리턴하겠다고 했고.
      //그결과는 firstNum변수에 저장됨
      System.out.println(firstNum);      //결과출력
      //substring메서드는 (0, 6) 첫번째인수는 시작위치인덱스번호임. 그런데 두번째 인수는 잘라내려고 하는 인덱스 마지막번호임. 
      //특이하게도 6번인덱스 - 임. 두번째인수는 6번인덱스는 포함하지않음. 그 앞자리까지만 끊어냄. 해당문자열에서 문자를 추출해오는 메서드라고 보시면 되요. 
      
      String secondNum = ssn.substring(7);//substring메서드가 인수가 1개일때는
      //해당되는 인덱스번호부터 마지막끝자리까지 싹다 추출한다. 
      //추출해서 secondNum변수에 할당한다. 
      System.out.println(secondNum); //그것을 출력함.
   } 
}
*/