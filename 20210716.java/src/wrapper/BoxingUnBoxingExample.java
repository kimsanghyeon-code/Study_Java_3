package wrapper;

public class BoxingUnBoxingExample {
   public static void main(String[] args) {
      //Boxing
      Integer obj1 = new Integer(100);
      Integer obj2 = new Integer("200");
      Integer obj3 = Integer.valueOf("300");
      
      //Unboxing
      int value1 = obj1.intValue();
      int value2 = obj2.intValue();
      int value3 = obj3.intValue();
      
      System.out.println(value1);
      System.out.println(value2);
      System.out.println(value3);
   }
}

/*
package wrapper;

public class BoxingUnBoxingExample {
   public static void main(String[] args) {
      //Boxing
      Integer obj1 = new Integer(100);//new키워드로 Integer클래스의 생성자통해서 객체를 만드는데, 이떄 매개변수는 100정수임.
      //그것을 매개변수로 넣고 Integer타입이 적용된 obj1객체변수에 할당을 함
      Integer obj2 = new Integer("200");
      //200을 매개변수로 넣어줌. obj2에 할당함
      Integer obj3 = Integer.valueOf("300");
      //위의 2개는 생성자로 객체를 만들었고.
      //Integer클래스의 정적메섣인 valueof로 300을 넣어줬다. 매개변수로 넣어줌. 그렇게 객체를 생성한다. 
      //그값을 obj3에 저장함.
      //이것이 데이터를 박싱한것임. 
      
      //Unboxing
      int value1 = obj1.intValue(); //obj1에서 intvalue메서드를 작동시켜서 값을 리턴시킴 그리고 value1에 값을 할당한다. 
      int value2 = obj2.intValue();//obj2도 마찬가지.
      int value3 = obj3.intValue();//obj3도 마찬가지임.
      
      System.out.println(value1);//출력
      System.out.println(value2);//출력
      System.out.println(value3);//출력
   }
}
*/