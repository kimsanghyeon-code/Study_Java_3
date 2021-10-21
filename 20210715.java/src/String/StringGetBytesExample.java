package String;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}

/*
package String;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
   public static void main(String[] args) {
      String str = "안녕하세요";//String클래스타입이적용된 str객체변수선언과 동시에 문자열을 설정함
      
      byte[] bytes1 = str.getBytes();//str객체변수안에 getBytes로 bytes계산을 해줌. 바이트배열을 만듬. 
      //좌측에 있는 byte배열 데이터타입이 적용된 bytes1배열변수에 저장한다
      System.out.println("bytes1.length: " + bytes1.length); // bytes1.length 필드를 보면 
      String str1 = new String(bytes1); //String클래스생성자에 bytes1배열변수를 집어넣음
      //그래서 문자열객체를만들고 str1객체변수에 할당을 함
      System.out.println("bytes1->String: " + str1); //str1객체를 출력했음
      
      try {
         
         byte[] bytes2 = str.getBytes("EUC-KR"); //7행=7번라인 7행에 있는 문자열이 든 str스트링객체변수를
         //Bytes 바이트배열을 추출하는데 문자세트가 EUC-KR로 추출하게 됨. 
         //byte2배열변수에 할당을 함
         System.out.println("bytes2.length: " + bytes2.length);//byte2의 길이를 출력했고
         String str2 = new String(bytes2, "EUC-KR"); //String클래스객체를 생성하는데, bytes2 바이트배열을 원본으로 넣고 , 문자세트는 EUC-KR
         //로 설정함 String클래스에서는 매개변수가 저렇게 들어감 
         //str2 문자열객체변수에 bytes2문자열객체를 할당
         System.out.println("bytes2->String: " + str2);//str2를 출력함
         
         
         byte[] bytes3 = str.getBytes("UTF-8"); //getBytes 바이트배열을 문자셋UTF-8방식으로 함
         //bytes3에 들어감
         System.out.println("bytes3.length: " + bytes3.length);
         //bytes3바이트배열의 길이를 세고 출력함
         String str3 = new String(bytes3, "UTF-8");//문자열객체를 만들고 거기에 원본은 bytes3로 함
         //문자세트는 UTF-8로함 str3에 할당함
         System.out.println("bytes3->String: " + str3); //이것을 출력함      
         //html5를 공부할때. euc-kr, utf-8 문자세트를 웹문서 코딩할때 가장 상단에 head태그들어가기전에. 
         //문자셋에 설정작업을 하는데.
         //웹문서안의 콘텐츠 내용들이 웹에서 네트워크를 통해서 이동을 할때.
         //바이트단위로 이동하는 형태이다. 
         //그리고 표현할때는 utf-8 문자셋을 많이 쓴다고 설명을 드렸어요. 
         //한글자 한글자 바이트표기로 해서 배열을 이루었다보면됨. 바이트배열이란뜻은.
         //통신을 문자로 전달하고 표현하기위해서 . 이런 메서드를 쓴다고 보면됨.
         
      } catch (UnsupportedEncodingException e) { //문자셋을 작업할수없을때 작동되는 예외처리.
         e.printStackTrace();
      }
   }
}
*/
