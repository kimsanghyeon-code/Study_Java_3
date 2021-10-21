package objects;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();
	}
}

/*
package objects;
public class GcExample {
   public static void main(String[] args) {
      Employee emp; //객체변수를 선언을 하고 employee클래스데이터타입을 적용함
      
      emp = new Employee(1); //뉴키워드로 employee 생성자를 통해서 객체를 만드는데 이떄 매개변수로 1을 넣음 그것을 emp변수에 넣음
      //출력이 됨 객체가 생성됐기때문에
      emp = null;      //객체변수에 널값을 넣으면 객체의 주소번지가 날라가버림. 그래서 객체를 쓸수없게 되어버림
      //널값을 넣어서 emp는 객체를 효과가 나타남
      emp = new Employee(2);      //employee에는 2가 매개변수가 되고 emp객체변수에 저장되고 또 출력하고 
      emp = new Employee(3); //employee에는 3이 매개변수가 되고 emp객체변수에 저장되고 또 출력됨
      //새로운 객체들이 들어가면서 emp객체변수는 매번 객체가 주소와 변수간의 연결고리를 잃어버림
      
      System.out.print("emp가 최종적으로 참조하는 사원번호: "); //마지막에 들어간것이 살아있는 객체이고 현재 최종참고하는 사원번호가 됨. 
      System.out.println(emp.eno); //emp의 사원번호는 3을 출력함.
      System.gc();   //gc 가버지컬렉터, 쓰레기수집기 죽은 객체를 메모리에서 제거하는 일을 함. 
      //자바는 jVM 자바가상머신은 삭제나 메모리를 컨트롤하는 능력이 개발자한테 우선권을 주지않아요.
      //C,C++ 언어는 메모리컨트롤언어라고 부르고 자바와 같은 언어는 비메모리컨트롤언어라고도 해요. 
      //gc메서드를 바로 결과가 나오지는 않고 놀고있는 객체나 비활동객체를 최대한 메모리제거하도록 스케쥴을 짬. jvm이. 그래서 보면 명령을 주고 기다려야함
      //jvm에 의해서 객체가 진짜 사라지기 전에 소멸자가 문장을 출력하게 함. 
   }
}

*/