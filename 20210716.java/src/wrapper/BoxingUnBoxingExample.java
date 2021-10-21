package wrapper;

public class BoxingUnBoxingExample {
   public static void main(String[] args) {
      //Boxing
      Integer obj1 = new Integer(100);
      Integer obj2 = new Integer("200");
      Integer obj3 = Integer.valueOf("300");
      
      //Unboxing
      int value1 = obj1.intValue();
      int value2 = obj2.intValue();
      int value3 = obj3.intValue();
      
      System.out.println(value1);
      System.out.println(value2);
      System.out.println(value3);
   }
}

/*
package wrapper;

public class BoxingUnBoxingExample {
   public static void main(String[] args) {
      //Boxing
      Integer obj1 = new Integer(100);//newŰ����� IntegerŬ������ ���������ؼ� ��ü�� ����µ�, �̋� �Ű������� 100������.
      //�װ��� �Ű������� �ְ� IntegerŸ���� ����� obj1��ü������ �Ҵ��� ��
      Integer obj2 = new Integer("200");
      //200�� �Ű������� �־���. obj2�� �Ҵ���
      Integer obj3 = Integer.valueOf("300");
      //���� 2���� �����ڷ� ��ü�� �������.
      //IntegerŬ������ �����޼��� valueof�� 300�� �־����. �Ű������� �־���. �׷��� ��ü�� �����Ѵ�. 
      //�װ��� obj3�� ������.
      //�̰��� �����͸� �ڽ��Ѱ���. 
      
      //Unboxing
      int value1 = obj1.intValue(); //obj1���� intvalue�޼��带 �۵����Ѽ� ���� ���Ͻ�Ŵ �׸��� value1�� ���� �Ҵ��Ѵ�. 
      int value2 = obj2.intValue();//obj2�� ��������.
      int value3 = obj3.intValue();//obj3�� ����������.
      
      System.out.println(value1);//���
      System.out.println(value2);//���
      System.out.println(value3);//���
   }
}
*/