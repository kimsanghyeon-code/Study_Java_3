package objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);
		}
	}
}


/*
package objects;


import java.util.Objects;

public class HashCodeExample {
   public static void main(String[] args) {      
      Student s1 = new Student(1, "홍길동"); //student클래스에 매개변수로서 2개의 상이한 형태의 리터럴을 입력했고 객체를 생성한다
      Student s2 = new Student(1, "김길동");
      System.out.println(s1.hashCode());//s1에 대한 해시코드를 생성함 그리고 그것을 출력함
      System.out.println(Objects.hashCode(s2));//사용자정의 메서드를 쓰지않고 바로 오브젝트클래스의 해시코드를 s2를 매개변수를 넣고 작동시킴
   }
   
   static class Student {
      int sno; //sno
      String name;//name 필드가 선언됨
      Student(int sno, String name) { //2개의 매개변수가 들어오면 내부에 필드에 값을 전달한다
         this.sno = sno;
         this.name = name;
      }
      @Override
      public int hashCode() { 
         return Objects.hash(sno, name); //오브젝트클래스에서 hash메서드를 가져다가 쓴다는 것임
         //실제 API에 들어있는 메서드인데 필요에 따라 우리가 임의로 필요한 메서드를 만들고 , 옷의 편집샵처럼 필요한 다른클래스의 메서드들을 가져다가 집어넣어버리는경우가 있음
      }
   }
}
*/