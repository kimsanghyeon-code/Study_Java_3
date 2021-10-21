package String;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6,  13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: "+length);
		
		String result = sb.toString();
		System.out.println(result);
	}
}

/*
package String;

public class StringBuilderExample {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder();//Stringbuilder객체생성을 하고 sb객체변수에 할당
      //문자열을 생성하고 가공하는 클래스
      //스트링빌더클래스에 대한 것을 보셨음. 
      
      sb.append("Java "); //sb객체변수의 내용에 자바라는 문자열을 추가
      sb.append("Program Study");//append메서드는 문자열을 추가할수있도록 해준다. 
      System.out.println(sb.toString()); //sb객체변수의 내용을 출력해줌
      
      sb.insert(4, "2"); //insert메서드는 해당되는 인덱스에 숫자 2를 삽입함
      System.out.println(sb.toString());//그대로 출력했음

      sb.setCharAt(4, '6');//인덱스4번의 위치에 6이라는 문자를 삽입해넣는다
      //인덱스에 넣기떄문에 전에 입력된 2가 뒤로 밀리고 입력되는게 아니라 이전것을 오버라이팅 덮어쓰기를 함
      System.out.println(sb.toString());//출력
      
      sb.replace(6, 13, "Book");//replace메서드는 6번인덱스에서 13전의 인덱스까지 3매개변수를 대체, 변경입력된다.
      System.out.println(sb.toString());
      
      sb.delete(4, 5);//인덱스4와 5사이에서 있는 글자를 삭제한다
      System.out.println(sb.toString());
      
      int length = sb.length();//랭스는 길이를 세어주는 메서드
      //sb의 문자열의 길이를 세어서 리턴한다 어디에 ? length에 
      System.out.println("총문자수: " + length); //총문자수를 출력
      
      String result = sb.toString(); //sb객체변수에 있는 문자열을 result변수에 할당함
      System.out.println(result);      //그대로 출력을 함
   }
}
*/
