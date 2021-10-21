package wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입시 자동 Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}

/*
package wrapper;

public class AutoBoxingUnBoxingExample {
   public static void main(String[] args) {
      //자동 Boxing
      Integer obj = 100;//integer클래스의 타입을 받은 obj객체변수에 100을 넣음
      //포장클래스, 래퍼클래스의 객체변수에 같은 타입으로 리터럴을 넣었을때.
      //자동박싱이 된다. 
      System.out.println("value: " + obj.intValue());//obj에서 intValue 정수값을 출력하는 메서드를 작동시킴
   
      //대입시 자동 Unboxing
      int value = obj;     //obj는 integer객체변수로서 값을 가지고 있는데.
      //int 기본타입으로 value변수가 선언됐음. 그런데 이퀄옆에 obj객체변수가 있을때는.
      //obj객체변수가 가지고 있는 데이터가 value변수로 할당된다. 곧 자동으로 언박싱된다. 
      System.out.println("value: " + value);//출력
      
      //연산시 자동 Unboxing
      int result = obj + 100; //obj에 100을 더하고 int result변수를 배치시키면 값이 저장된다. 
      System.out.println("result: " + result); //출력
   }
}
*/