package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//how1:전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2: 남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

/*
 * package stringtokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample {
   public static void main(String[] args) {
      String text = "홍길동/이수홍/박연수"; //text스트링객체변수에 문자열 할당을 함
      
      //how1: 전체 토큰 수를 얻어 for문으로 루핑
      StringTokenizer st = new StringTokenizer(text, "/");
      //st객체변수에 new키워드로 스트링토크나이즈메서드의 객체를 생성시키는 생성자를 작동시키자 첫번째 타겟문자열이 들어있는 변수
      //두번째 인수는 구분자 슬러쉬가 있음
      //스트링토크나이저생성자를 통해서 객체를 만들고 st객체변수에 할당한다. 
      
      int countTokens = st.countTokens(); //st객체변수에 들어있는 남아있는 토큰의 수를 세어주는 메서드예요. 
      //Token == 문자열과 같다 문자열의 갯수가 토큰이라고 보면 됨
      //countTokens변수에 토큰의 갯수를 결과가 리턴되어서 할당된다
      
      for(int i=0; i<countTokens; i++) { 
         //i는 0이고 i는 카운트토큰변수에 있는 숫자 작을때까지 다시말해서 변수안에 들어있던 문자열의 갯수를 넘어서 for문이 돌지않도록 한다. 
         String token = st.nextToken(); //토큰 문자열을 하나씩 꺼내는 nextToken메서드를 작동시켜서 결과값을 리턴시킨다
         //그것을 token객체변수에 할당한다. 
         System.out.println(token); //token객체변수에 저장된 문자열토큰을 출력한다. 
      }
      
      System.out.println(); //한줄띄워주고.
      
      //how2: 남아 있는 토큰를 확인하고 while문으로 루핑
      st = new StringTokenizer(text, "/"); //스트링토크나이저객체가 생성됨 다시 st객체변수에 할당된다. 
      //오버라이팅되서 st객체변수는 새로운 객체가 들어간다. 
      
      while( st.hasMoreTokens() ) { //hasMoreTokens메서드인데, 가지고 있고 더 토큰 
         //토큰이 있는 판단하는 메서드예요. 그래서 있으면 true, 없으면 false가 되고 그래서 while종료가 된다. 토큰이 없으면.
         String token = st.nextToken(); //st객체변수에서 nextToken 한개의 뽑아서 token객체변수에 저장하고 
         //아래의 코드에서 해당 토큰을 출력한다. 
         System.out.println(token);
      }
   }
}
*/
