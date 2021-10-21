package objects;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("objects.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


/*
package objects;

public class ClassExample {
   public static void main(String[] args) {
      //객체를 만들어서 정보를 찾는 스타일임
      Car car = new Car(); //카객체를 생성해서 car객체변수에 저장을 함
      Class clazz1 = car.getClass(); //카닷getclass해서 클래스를 다루는 클래스객체를 생성해서 clazz1객체변수에 저장을 함
      //Class가 데이터타입을 적용된 객체변수 clazz1에 car객체변수에 대한 getclass메서드결과를 할당함
      System.out.println(clazz1.getName()); //clazz1닷getName메서드는 해당 클래스의 소속을 알려주고 해당 객체의 원 클래스명을 출력해줌
      System.out.println(clazz1.getSimpleName());//해당 클래스의 이름을 심플하게 출력해줌
      System.out.println(clazz1.getPackage().getName());//getclass메서드의 결과가 들어있는 clazz1객체변수의 getpackage메서드로 소속된 패키지를 찾아내고 getName로 패키지의 이름을 출력한다.
      //겟네임만 있다면 패키지하고 클래스명이 나오는데. 
      //겟패키지를 하고 겟네임을 했더니 패키지명이 나온다. 
      System.out.println();
      
      try {
         //Class타입을 적용해서 class객체를 생성했다. 
         //위에서는new키워드로 객체를 만들어서 getclass메서드를 썼는데.
         //아래에서는 class클래스의 forName이라는 정적메서드를 쓴것이 차이점임.
         Class clazz2 = Class.forName("objects.Car"); //class클래스안에 있는 정적메서드인 forName메서드로 objects클래스에서 상속을 전체클래스중에서 
         //Car라는 클래스를 매개변수넣어줌 그래서 Class객체를 생성을 함 그리고 clazz2객체변수에 할당을 함
         System.out.println(clazz2.getName());
         //getName으로 해서 이름을 출력하게 함. 
         System.out.println(clazz2.getSimpleName());//겟심플네임으로 클래스를 정보를 얻어냄
         System.out.println(clazz2.getPackage().getName());//위와 같이 패키지의 이름을 출력함
      } catch (ClassNotFoundException e) {//해당되는 클래스명으로 갔는데, 클래스가 없다 그러면 예외처리를 작동시킴
         e.printStackTrace();
      }
   }
}
*/