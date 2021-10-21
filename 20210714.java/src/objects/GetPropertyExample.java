package objects;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� �̸�: "+ osName);
		System.out.println("����� �̸�: "+ userName);
		System.out.println("����� Ȩ���丮: "+ userHome);
		
		System.out.println("------------------------");
		System.out.println("[key] value");
		System.out.println("------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("["+key+"]"+value);
		}
		
	}
}


/*
package objects;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
   public static void main(String[] args) { //JVM�Ӽ����������� ������
      String osName = System.getProperty("os.name"); //��������Ƽ�޼���� Ű�� ������ �Ǿ��µ�
      //��������Ƽ�� ������ Ű�� ����� ���� osName�� ���� ��ü������ �Ҵ��� �Ѵ�
      //os.nameŰ�� �׷��� ���� jvm��ġ�� �ü���� �̸��� ����Ѵ�
      String userName = System.getProperty("user.name");//�ü���� ���� ����ڰ���
      String userHome = System.getProperty("user.home");//�ü���� ����ڰ� ������ �ִ� Ȩ���丮�̸�
      
      System.out.println("�ü�� �̸�: " + osName);
      System.out.println("����� �̸�: " + userName);
      System.out.println("����� Ȩ���丮: " + userHome);
      
      System.out.println("---------------------------------");
      System.out.println(" [ key ]  value");
      System.out.println("---------------------------------");
      Properties props = System.getProperties(); //�Ű������� �����ʰ� �׳� ����θ� ��ü�Ӽ��� ȣ���Ѵ� 
      //�׷��� ���� props��ü������ �ý��������� ��� ������ ����
      Set keys = props.keySet(); //props��ü������ Ű�鸸 ��Ƽ� KeySet�޼��带 ���ؼ� Set��Ʈ�� ����
      //SetŬ���� ���������� ������ Keys��ü������ �Ҵ���
      for(Object objKey : keys) {//for���� ���ؼ� Keys ��ü������ ����� Ű���� �ϳ��� objkey�� �Ҵ��� ��
         //keys������ �����Ͱ� �����̰ų� �����̰ų� �پ��� �������ٵ�. �ϴ��� objectŬ����������Ÿ���� �����ϰ� �Ʒ������� ��δ� ���ڰ� �ǵ��� ������ȯ�Ѱ���. 
         String key = (String) objKey; //objKey�� ���ڿ��� �����͸� ������ȯ�ϰ� �װ��� key��ü������ �Ҵ��� �Ѵ�
         //�ϳ��� �����͸� ����
         String value = System.getProperty(key); //getproperty�޼��带 ���ؼ� �Ű������� key��ü������ ����ִ� Ű�� ����. �� ���� ȣ���Ѵ�. 
         //�װ��� value��ü������ �����Ѵ� 
         System.out.println("[ " + key + " ]  " + value); //key������ value������ ����� ���ͷ��� ����Ѵ�. 
      }

   }
}
*/