package String;

public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}

/*
package String;

public class StringValueOfExample {
   public static void main(String[] args) {
      String str1 = String.valueOf(10); //valueof메서드는 매개변수를 10을 넣었는데. 
      //매개변수를 문자열로 바꾸는 메서드 valueof
      String str2 = String.valueOf(10.5);
      String str3 = String.valueOf(true);      
      
      System.out.println(str1);
      System.out.println(str2);
      System.out.println(str3);
   }
}
*/