package objects;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")가 메모리에 생성됨");
	}
	
	public void finalize() {
		System.out.println("Employee(" + eno + ")이 메모리에서 제거됨");
	}
}


/*
package objects;

public class Employee {
   public int eno;   //사원번호를 필드로 두고
   
   public Employee(int eno) { //생성자는 객체의 필드를 초기화함
      this.eno = eno;
      System.out.println("Employee(" + eno + ") 가 메모리에 생성됨"); //이전에는 필드초기화만 했는데,
      //객체생성에서 대해서 파악히기위해 println메서드도 출력이 되겠함
   }

   public void finalize() { //파이널라이즈메서드가 나타남
      System.out.println("Employee(" + eno + ") 이 메모리에서 제거됨");
   }
}

*/