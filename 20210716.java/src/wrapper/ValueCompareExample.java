package wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals()결과: " + obj3.equals(obj4));
	}
}


/*
package wrapper;

public class ValueCompareExample {
   public static void main(String[] args) {
      System.out.println("[-128~127 초과값일 경우]");
      Integer obj1 = 300; //obj1에 300리터럴을 할당함 integer클래스데어터타입을 받은 객체변수임
      Integer obj2 = 300;//ojb2에 300리터럴을 할당함. interger클래스데이터타입을 받은 객체변수임
      //리터럴을 포장클래스의 데이터타입에 맞춰서 변수에 할당하면 자동으로 박싱이 됨. 
      System.out.println("==결과: " + (obj1 == obj2));
      //obj1==obj2가 같은가. 결과는 false가 떴어요.
      //객체변수2개가 생기고, 300할당하지만 객체가 다른 객체에 할당되기 때문에.
      //300이라는 같아도 실제 저장되는 객체가 가지고 있을 주소값은 서로 다름. false가 뜨게 됨.
      //obj1,obj2가 서로 다른 객체인데. 그저 같은 값을 넣어봤을뿐이예요. 실제 다른 객체임.
      System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
      //obj1의 intvalue메서드로 객체에서 값을 꺼냄. obj2도 객체에서 값을 꺼냄. 그리고 값끼리 비교함
      System.out.println("equals() 결과: " + obj1.equals(obj2));//equals메서드는 내부의 값을 비교함
      //obj1과 obj2는 서로 같다는 결과가 나옴. 
      System.out.println();
      
      System.out.println("[-128~127 범위값일 경우]");
      //포장클래스에서 -128에서 127사이의 수를 넣을경우에는 파라매터가 매개변수가 위의 범주에 해당이 되면 값끼리를 계산을 함. 
      Integer obj3 = 10;
      Integer obj4 = 10;//두개의 obj3,obj4객체변수가 생성된다 그값을 서로 비교하게 됨. 
      System.out.println("==결과: " + (obj3 == obj4)); 
      System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
      //obj3와 obj4에서 정수값을 추출함. 그래서 서로 비교하니 true됨
      System.out.println("equals() 결과: " + obj3.equals(obj4));
   }
}
*/