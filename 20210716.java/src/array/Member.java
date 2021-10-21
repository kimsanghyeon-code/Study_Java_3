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
   //�񱳸� ���� �������̽��� ������ ����Ŭ������ Member
   
   String name; //�ʵ尡 �̸���
   Member(String name) {
      this.name = name; //�Ű������� �ʵ忡 �����
   }
   @Override
   public int compareTo(Member o) {//compareTo�񱳸޼���
      return name.compareTo(o.name);//�Ű����� o�� name�ʵ�� ���簴ü�� name�� ���� ���Ѵ�. 
      //name�� �Ű��������� ������ ������ ����ϰ�, ������ 0, ������ ����� ����Ѵ�. 
   }
}
*/