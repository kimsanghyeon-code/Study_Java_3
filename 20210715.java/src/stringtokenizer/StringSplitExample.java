package stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}

/*
package stringtokenizer;

public class StringSplitExample {
   public static void main(String[] args) {
      String text = "홍길동&이수홍,박연수,김자바-최명호"; //text객체변수에 문자열이 들어감
      String[] names = text.split("&|,|-"); //split메서드는 타겟이 되는 글자를 추출해주는 메서드이다. 
      
      
      //&|,|-   
      // | 은 파이프라고 불러요. 현재 여기서는 정규표현식에서는 OR연산에 해당되요. 
      //text객체변수에 저장된 글자를 split메서드로 자르는데. & 이거나 , 이거나 - 이거나 하나라도 있으면 그것을 중심으로 글자를 잘라버려라는 뜻임.
      // 정규화표현식.
      
      //names배열에 글자를 하나씩 잘라서 집어넣어버림. 
      //names배열에 있는 글씨를 아래의 for문에서 
      for(String name : names) {
         //names배열에서 지역변수 String클래스타입을 적용한 name에 한개씩 넣어줌
         System.out.println(name); //지역변수name에 있는 값을 하나씩 출력해줌. 
      }
   }
}
*/