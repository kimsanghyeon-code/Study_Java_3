package array;

public class Member implements Comparable<Member>{
	String name;
	Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}

/*
package array;
public class Member implements Comparable<Member> {
   //비교를 위한 인터페이스를 구현한 구현클래스인 Member
   
   String name; //필드가 이름임
   Member(String name) {
      this.name = name; //매개변수가 필드에 저장됨
   }
   @Override
   public int compareTo(Member o) {//compareTo비교메서드
      return name.compareTo(o.name);//매개변수 o의 name필드와 현재객체의 name를 서로 비교한다. 
      //name이 매개변수보다 낮으면 음수를 출력하고, 같으면 0, 높으면 양수를 출력한다. 
   }
}
*/