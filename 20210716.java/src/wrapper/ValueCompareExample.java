package wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2));
		System.out.println("��ڽ��� ==���: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() ���: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���: " + (obj3 == obj4));
		System.out.println("��ڽ��� ==���: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals()���: " + obj3.equals(obj4));
	}
}


/*
package wrapper;

public class ValueCompareExample {
   public static void main(String[] args) {
      System.out.println("[-128~127 �ʰ����� ���]");
      Integer obj1 = 300; //obj1�� 300���ͷ��� �Ҵ��� integerŬ����������Ÿ���� ���� ��ü������
      Integer obj2 = 300;//ojb2�� 300���ͷ��� �Ҵ���. intergerŬ����������Ÿ���� ���� ��ü������
      //���ͷ��� ����Ŭ������ ������Ÿ�Կ� ���缭 ������ �Ҵ��ϸ� �ڵ����� �ڽ��� ��. 
      System.out.println("==���: " + (obj1 == obj2));
      //obj1==obj2�� ������. ����� false�� �����.
      //��ü����2���� �����, 300�Ҵ������� ��ü�� �ٸ� ��ü�� �Ҵ�Ǳ� ������.
      //300�̶�� ���Ƶ� ���� ����Ǵ� ��ü�� ������ ���� �ּҰ��� ���� �ٸ�. false�� �߰� ��.
      //obj1,obj2�� ���� �ٸ� ��ü�ε�. ���� ���� ���� �־�������̿���. ���� �ٸ� ��ü��.
      System.out.println("��ڽ��� ==���: " + (obj1.intValue() == obj2.intValue()));
      //obj1�� intvalue�޼���� ��ü���� ���� ����. obj2�� ��ü���� ���� ����. �׸��� ������ ����
      System.out.println("equals() ���: " + obj1.equals(obj2));//equals�޼���� ������ ���� ����
      //obj1�� obj2�� ���� ���ٴ� ����� ����. 
      System.out.println();
      
      System.out.println("[-128~127 �������� ���]");
      //����Ŭ�������� -128���� 127������ ���� ������쿡�� �Ķ���Ͱ� �Ű������� ���� ���ֿ� �ش��� �Ǹ� �������� ����� ��. 
      Integer obj3 = 10;
      Integer obj4 = 10;//�ΰ��� obj3,obj4��ü������ �����ȴ� �װ��� ���� ���ϰ� ��. 
      System.out.println("==���: " + (obj3 == obj4)); 
      System.out.println("��ڽ��� ==���: " + (obj3.intValue() == obj4.intValue()));
      //obj3�� obj4���� �������� ������. �׷��� ���� ���ϴ� true��
      System.out.println("equals() ���: " + obj3.equals(obj4));
   }
}
*/