package String;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}


/*
package String;

public class ByteToStringExample {
   public static void main(String[] args) {
      byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97  };//byte�迭������Ÿ���� ������ bytes�迭�� byte������ �Է���
      
      String str1 = new String(bytes); //newŰ���� StringŬ������ü�����ϴµ�, �Ű������� bytes�迭�� �ְ� ������. 
      //StringŬ����������Ÿ���� ������ str1��ü������ �Ҵ���
      System.out.println(str1); //str1��ü������ �����
      
      String str2 = new String(bytes, 6, 4);
      //StringŬ���������ڿ��� �ε�����ġ 6���ε��� 7��°�ڸ����� 4���� ���ڸ� ������
      //str2��ü������ �Ҵ���
      System.out.println(str2);
      //str2�� �����
   }
}
*/