package wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}

/*
package wrapper;

public class StringToPrimitiveValueExample {
   public static void main(String[] args) {
      int value1 = Integer.parseInt("10");//integer클래스에서 정적메서드인 parseInt메서드로 10이라는 리터럴을 int변수 value1에 할당한다. 
      //그래서 값을 int값으로 값을 넣어줌. 
      //integer클래스에서 정적메서드를 쓴다는 것은 10을 박싱으로 갖고 움직일수있는데. 이것을 파싱을 한다는 것임. 파싱은 던져주는것, 전달의 의미인데.
      //파라매터값을 int값을 전달해줌. 
      double value2 = Double.parseDouble("3.14");//더블클래스의 parsedouble메서드는 정적메서드이고 객체에 파라메터넣고.
      //그값을 value2에 넣어준다. 
      boolean value3 = Boolean.parseBoolean("true");
      //parseboolean메서드로 매개변수넣고 value3변수에 값을 넣고
      
      System.out.println("value1: " + value1);//출력
      System.out.println("value2: " + value2);//출력
      System.out.println("value3: " + value3);//출력
      //jsp, java servlet, parseInt, parsedoulbe 정수, 실수값들을 이것을 전달할떄가 있음. 
      
   }
}
*/
