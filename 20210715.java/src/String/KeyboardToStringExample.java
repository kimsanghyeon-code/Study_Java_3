package String;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int readyByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readyByteNo-2);
		System.out.println(str);
	}
}

/*
package String;

import java.io.IOException;

public class KeyboardToStringExample {
   public static void main(String[] args) throws IOException {
      byte[] bytes = new byte[100]; //new키워드로 바이트데이터타입의 100개 방을 배열객체를 생성해서 
      //byte배열데이터타입이 적용된 bytes배열변수에 할당을 한다. 
      
      System.out.print("입력: "); //입력출력하고.
      int readByteNo = System.in.read(bytes); //입력에 대해서 read메서드로 읽어들이는데 그것이 bytes배열을 읽는다
      //리턴해서 읽어들인 결과를 readByteNo int변수에 할당함

      String str = new String(bytes, 0, readByteNo-2);
      //new키워드로 String생성자로 첫번째파라메터는 출력타겟이고 bytes배열에 두번째파라메터는 시작위치이고( 0번인덱스부터) 세번째파라메터는 종료위치
      //종료위치는 readByteNo가 있는데 여기서를 2를 빼는 이유는 문자를 입력받은 배열의 끝에는 캐리지리턴과 라인피드 2개의 문자가 포함이 됨. 
      //그래서 -2를 하면 순수한 문자의 길이만 뜨게 됨.
      //bytes배열에 들어있는 0번부터, 문자데이터의 끝번까지를 String클래스객체로 해서 문자객체화시킨다는것
      //그것을 str변수에 저장을 함
      System.out.println(str); //출력함
   }
}
*/
