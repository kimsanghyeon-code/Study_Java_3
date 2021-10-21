package String;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}


/*
package String;

public class ByteToStringExample {
   public static void main(String[] args) {
      byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97  };//byte배열데이터타입을 적용한 bytes배열에 byte값들을 입력함
      
      String str1 = new String(bytes); //new키워드 String클래스객체생성하는데, 매개변수가 bytes배열을 넣고 생성함. 
      //String클래스데이터타입을 적용한 str1객체변수에 할당함
      System.out.println(str1); //str1객체변수를 출력함
      
      String str2 = new String(bytes, 6, 4);
      //String클래스생성자에서 인덱스위치 6번인덱스 7번째자리에서 4개의 글자를 가져옴
      //str2객체변수에 할당함
      System.out.println(str2);
      //str2를 출력함
   }
}
*/