package objects;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("objects.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


/*
package objects;

public class ClassExample {
   public static void main(String[] args) {
      //��ü�� ���� ������ ã�� ��Ÿ����
      Car car = new Car(); //ī��ü�� �����ؼ� car��ü������ ������ ��
      Class clazz1 = car.getClass(); //ī��getclass�ؼ� Ŭ������ �ٷ�� Ŭ������ü�� �����ؼ� clazz1��ü������ ������ ��
      //Class�� ������Ÿ���� ����� ��ü���� clazz1�� car��ü������ ���� getclass�޼������� �Ҵ���
      System.out.println(clazz1.getName()); //clazz1��getName�޼���� �ش� Ŭ������ �Ҽ��� �˷��ְ� �ش� ��ü�� �� Ŭ�������� �������
      System.out.println(clazz1.getSimpleName());//�ش� Ŭ������ �̸��� �����ϰ� �������
      System.out.println(clazz1.getPackage().getName());//getclass�޼����� ����� ����ִ� clazz1��ü������ getpackage�޼���� �Ҽӵ� ��Ű���� ã�Ƴ��� getName�� ��Ű���� �̸��� ����Ѵ�.
      //�ٳ��Ӹ� �ִٸ� ��Ű���ϰ� Ŭ�������� �����µ�. 
      //����Ű���� �ϰ� �ٳ����� �ߴ��� ��Ű������ ���´�. 
      System.out.println();
      
      try {
         //ClassŸ���� �����ؼ� class��ü�� �����ߴ�. 
         //��������newŰ����� ��ü�� ���� getclass�޼��带 ��µ�.
         //�Ʒ������� classŬ������ forName�̶�� �����޼��带 ������ ��������.
         Class clazz2 = Class.forName("objects.Car"); //classŬ�����ȿ� �ִ� �����޼����� forName�޼���� objectsŬ�������� ����� ��üŬ�����߿��� 
         //Car��� Ŭ������ �Ű������־��� �׷��� Class��ü�� ������ �� �׸��� clazz2��ü������ �Ҵ��� ��
         System.out.println(clazz2.getName());
         //getName���� �ؼ� �̸��� ����ϰ� ��. 
         System.out.println(clazz2.getSimpleName());//�ٽ��ó������� Ŭ������ ������ ��
         System.out.println(clazz2.getPackage().getName());//���� ���� ��Ű���� �̸��� �����
      } catch (ClassNotFoundException e) {//�ش�Ǵ� Ŭ���������� ���µ�, Ŭ������ ���� �׷��� ����ó���� �۵���Ŵ
         e.printStackTrace();
      }
   }
}
*/