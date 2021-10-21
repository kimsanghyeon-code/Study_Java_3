package objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
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
      Student s1 = new Student(1, "ȫ�浿"); //studentŬ������ �Ű������μ� 2���� ������ ������ ���ͷ��� �Է��߰� ��ü�� �����Ѵ�
      Student s2 = new Student(1, "��浿");
      System.out.println(s1.hashCode());//s1�� ���� �ؽ��ڵ带 ������ �׸��� �װ��� �����
      System.out.println(Objects.hashCode(s2));//��������� �޼��带 �����ʰ� �ٷ� ������ƮŬ������ �ؽ��ڵ带 s2�� �Ű������� �ְ� �۵���Ŵ
   }
   
   static class Student {
      int sno; //sno
      String name;//name �ʵ尡 �����
      Student(int sno, String name) { //2���� �Ű������� ������ ���ο� �ʵ忡 ���� �����Ѵ�
         this.sno = sno;
         this.name = name;
      }
      @Override
      public int hashCode() { 
         return Objects.hash(sno, name); //������ƮŬ�������� hash�޼��带 �����ٰ� ���ٴ� ����
         //���� API�� ����ִ� �޼����ε� �ʿ信 ���� �츮�� ���Ƿ� �ʿ��� �޼��带 ����� , ���� ������ó�� �ʿ��� �ٸ�Ŭ������ �޼������ �����ٰ� ����־�����°�찡 ����
      }
   }
}
*/