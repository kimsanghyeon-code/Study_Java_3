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
      Student s1 = new Student(1); //sno�� 1�� ��ü�� �����ؼ� s1��ü������ �־��� 
      Student s2 = new Student(1); //sno�� 1�� ��ü�� �����ؼ� s2��ü������ �־���
      Student s3 = new Student(2); //sno�� 2�� ��ü�� �����ؼ� s3��ü������ �־���
      
      int result = Objects.compare(s1, s2, new  StudentComparator());
      //������ƮŬ������ compare�޼��带 �۵���Ŵ
      //�Է°��� s1,s2,newŰ����� StudentComparator����Ŭ������ �Է���
      //������� result������ ��
      System.out.println(result); //�����
      result = Objects.compare(s1, s3, new  StudentComparator());
      //s1,s3�� ���� �񱳿����� ���� StudentComparator()Ŭ������ü�� ����
      //result�� ������� ��
      System.out.println(result);
   }
   
   
   //��ü���� ����Ŭ������ ����
   //�񱳿���� Ŭ������ ����Ŭ������ �����
   
   static class Student {
      int sno; //�ʵ�� SNO�� ����
      Student(int sno) { //������ sno�� �Է¹����� ���� ��ü�� sno�ʵ忡 sno�Ķ���Ͱ��� ����
         this.sno = sno;
      }
   }
   
   static class StudentComparator implements Comparator<Student> { //��ü���� ���ϴ� ����Ŭ������
      //�������̽��� ����Ŭ������ ���� �����Ҷ� Ŭ���������� ������ �ߴµ�, ���⼭�� ����Ŭ�������� ������ ���ٴ� ��
      //�Էµ����Ͱ� StudentŬ������ ���ü��ִٰ� ��������� ǥ����. 
      @Override
      public int compare(Student a, Student b) { //���۾��� �����ϴ� �޼���
         /*if(a.sno<b.sno) return -1; //2���� �����Ͱ� ������ �� a�ϰ� b ��ü�� sno�ʵ带 ���� �񱳸� �ϴµ� b�� ũ�� �ϸ� -1�� ������
         else if(a.sno == b.sno) return 0; //���� ������ 0�� �����Ѵ�
         else return 1;*/ //��𿡵� ������ ������ 1�� �����Ѵ�
        // return Integer.compare(a.sno, b.sno); //��Ƽ���������޼��带 ���� �Ȱ��� ����� ����
    //  }
 //  }
//}
