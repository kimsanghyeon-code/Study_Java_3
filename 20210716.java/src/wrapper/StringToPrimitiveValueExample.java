package wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}

/*
package wrapper;

public class StringToPrimitiveValueExample {
   public static void main(String[] args) {
      int value1 = Integer.parseInt("10");//integerŬ�������� �����޼����� parseInt�޼���� 10�̶�� ���ͷ��� int���� value1�� �Ҵ��Ѵ�. 
      //�׷��� ���� int������ ���� �־���. 
      //integerŬ�������� �����޼��带 ���ٴ� ���� 10�� �ڽ����� ���� �����ϼ��ִµ�. �̰��� �Ľ��� �Ѵٴ� ����. �Ľ��� �����ִ°�, ������ �ǹ��ε�.
      //�Ķ���Ͱ��� int���� ��������. 
      double value2 = Double.parseDouble("3.14");//����Ŭ������ parsedouble�޼���� �����޼����̰� ��ü�� �Ķ���ͳְ�.
      //�װ��� value2�� �־��ش�. 
      boolean value3 = Boolean.parseBoolean("true");
      //parseboolean�޼���� �Ű������ְ� value3������ ���� �ְ�
      
      System.out.println("value1: " + value1);//���
      System.out.println("value2: " + value2);//���
      System.out.println("value3: " + value3);//���
      //jsp, java servlet, parseInt, parsedoulbe ����, �Ǽ������� �̰��� �����ҋ��� ����. 
      
   }
}
*/
