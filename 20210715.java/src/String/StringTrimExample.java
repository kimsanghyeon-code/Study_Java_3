package String;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123 ";
		String tel3 = " 1234 ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
				
	}
}

/*
package String;
public class StringTrimExample {
   public static void main(String[] args) {
      String tel1 = "  02"; //tel1객체변수에는 02를
      String tel2 = "123   ";//tel2객체변수에는 123을
      String tel3 = "   1234   "; //tel3객체변수에는 1234를
      
      String tel = tel1.trim() + tel2.trim() + tel3.trim(); //객체변수뒤에 trim메서드를 작동시킴
      //공백을 잘라버림 그결과를 리턴한다
      //리턴결과들을  + 연산자로 전부 합해서 산술연산자가 아님. 이어붙여줌
      //tel객체변수에 할당해준다
      System.out.println(tel); //tel를 출력함
   }
}
*/