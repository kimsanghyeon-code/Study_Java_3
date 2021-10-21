package wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//�ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//���Խ� �ڵ� Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//����� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}

/*
package wrapper;

public class AutoBoxingUnBoxingExample {
   public static void main(String[] args) {
      //�ڵ� Boxing
      Integer obj = 100;//integerŬ������ Ÿ���� ���� obj��ü������ 100�� ����
      //����Ŭ����, ����Ŭ������ ��ü������ ���� Ÿ������ ���ͷ��� �־�����.
      //�ڵ��ڽ��� �ȴ�. 
      System.out.println("value: " + obj.intValue());//obj���� intValue �������� ����ϴ� �޼��带 �۵���Ŵ
   
      //���Խ� �ڵ� Unboxing
      int value = obj;     //obj�� integer��ü�����μ� ���� ������ �ִµ�.
      //int �⺻Ÿ������ value������ �������. �׷��� �������� obj��ü������ ��������.
      //obj��ü������ ������ �ִ� �����Ͱ� value������ �Ҵ�ȴ�. �� �ڵ����� ��ڽ̵ȴ�. 
      System.out.println("value: " + value);//���
      
      //����� �ڵ� Unboxing
      int result = obj + 100; //obj�� 100�� ���ϰ� int result������ ��ġ��Ű�� ���� ����ȴ�. 
      System.out.println("result: " + result); //���
   }
}
*/