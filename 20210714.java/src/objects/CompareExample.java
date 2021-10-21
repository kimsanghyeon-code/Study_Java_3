package objects; 

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
   public static void main(String[] args) {
      Student s1 = new Student(1);
      Student s2 = new Student(1);
      Student s3 = new Student(2);
      
      int result = Objects.compare(s1, s2, new  StudentComparator());
      System.out.println(result);
      result = Objects.compare(s1, s3, new  StudentComparator());
      System.out.println(result);
   }
   
   static class Student {
      int sno;
      Student(int sno) {
         this.sno = sno;
      }
   }
   
   static class StudentComparator implements Comparator<Student> {
      @Override
      public int compare(Student a, Student b) {
         /*if(a.sno<b.sno) return -1;
         else if(a.sno == b.sno) return 0;
         else return 1;*/
         return Integer.compare(a.sno, b.sno);
      }
   }
}

/*
package objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
   public static void main(String[] args) {
      Student s1 = new Student(1); //sno가 1임 객체를 생성해서 s1객체변수에 넣어줌 
      Student s2 = new Student(1); //sno가 1인 객체를 생성해서 s2객체변수에 넣어줌
      Student s3 = new Student(2); //sno가 2인 객체를 생성해서 s3객체변수에 넣어줌
      
      int result = Objects.compare(s1, s2, new  StudentComparator());
      //오브젝트클래스의 compare메서드를 작동시킴
      //입력값이 s1,s2,new키워드로 StudentComparator정적클래스를 입력함
      //결과값이 result변수에 들어감
      System.out.println(result); //출력함
      result = Objects.compare(s1, s3, new  StudentComparator());
      //s1,s3를 비교함 비교연산을 위한 StudentComparator()클래스객체를 만듬
      //result로 결과값이 들어감
      System.out.println(result);
   }
   
   
   //객체에서 정적클래스를 쓰고
   //비교연산용 클래스도 정적클래스를 사용함
   
   static class Student {
      int sno; //필드는 SNO가 있음
      Student(int sno) { //생성자 sno를 입력받으면 현재 격체의 sno필드에 sno파라메터값을 넣음
         this.sno = sno;
      }
   }
   
   static class StudentComparator implements Comparator<Student> { //객체들을 비교하는 정적클래스임
      //인터페이스의 구현클래스는 보통 연습할때 클래스들한테 적용을 했는데, 여기서는 정적클래스에도 구현을 헀다는 것
      //입력데이터가 Student클래스만 들어올수있다고 명시적으로 표시함. 
      @Override
      public int compare(Student a, Student b) { //비교작업을 전담하는 메서드
         /*if(a.sno<b.sno) return -1; //2개의 데이터가 들어오는 데 a하고 b 객체가 sno필드를 서로 비교를 하는데 b가 크다 하면 -1을 리턴함
         else if(a.sno == b.sno) return 0; //서로 같으면 0을 리턴한다
         else return 1;*/ //어디에도 속하지 않으면 1을 리턴한다
        // return Integer.compare(a.sno, b.sno); //인티저닷컴페어메서드를 쓰면 똑같은 결과가 나옴
    //  }
 //  }
//}
