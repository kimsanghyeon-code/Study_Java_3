package objects;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("1~1000000������ ��: "+sum);
		System.out.println("��꿡"+(time2 -time1)+"�����ʰ� �ҿ�Ǿ����ϴ�.");
	}
}

/*
package objects;

public class SystemTimeExample {
   public static void main(String[] args) {
      long time1 = System.nanoTime();//1/10^9 �� Ÿ�ӽ������� �� ����ð��� time1������ ������ ��
      
      int sum = 0; //sum������ �ʱ�ȭ�ϰ� 
      for(int i=1; i<=1000000; i++) { //for��
         //i�� 1, i�� �鸸���� ���������� �ݺ���
         sum += i;
         //sum = sum+i�� i�� �������� ����
      }
      
      long time2 = System.nanoTime(); //for���� ���������� nanoTIme�޼���� Ÿ�ӽ������� �޾Ƽ� �� ����ð��� time2�� �ְ�
      
      System.out.println("1~1000000������ ��: " + sum);
      //�������� ������
      System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
      //����ð��� ���ϱ� ���ؼ� time2���� time1�� ������ ����� ����Ѵ�. 
   }
}
*/