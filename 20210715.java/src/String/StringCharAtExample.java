package String;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}
}

/*
package String;

public class StringCharAtExample {
   public static void main(String[] args) {
      String ssn = "010624-2230123"; //String클래스타입적용해서 ssn객체변수를 정의하고 문자열을 넣어버림
      char sex = ssn.charAt(7); //ssn도트charat메서드 7인덱스을 리턴해오는 것임. 그것을 sex변수 char타입을 적용된
      switch (sex) { //switch문으로 sex변수값에 저장된 데이터를 case에 매칭을 함
         case '1':
         case '3':
            System.out.println("남자 입니다.");
            break; //해당되는 출력문을 선택하게 되면 break가 되서 빠져나가는 것임. 
         case '2':
         case '4':
            System.out.println("여자 입니다.");
            break; //해당되는 출력문을 선택하게 되면 break가 되서 빠져나가는 것임. 
      }
   }
}

*/
