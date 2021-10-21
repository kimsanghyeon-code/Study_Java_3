package String;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}

/*
package String;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
   public static void main(String[] args) {
      String str = "�ȳ��ϼ���";//StringŬ����Ÿ��������� str��ü��������� ���ÿ� ���ڿ��� ������
      
      byte[] bytes1 = str.getBytes();//str��ü�����ȿ� getBytes�� bytes����� ����. ����Ʈ�迭�� ����. 
      //������ �ִ� byte�迭 ������Ÿ���� ����� bytes1�迭������ �����Ѵ�
      System.out.println("bytes1.length: " + bytes1.length); // bytes1.length �ʵ带 ���� 
      String str1 = new String(bytes1); //StringŬ���������ڿ� bytes1�迭������ �������
      //�׷��� ���ڿ���ü������� str1��ü������ �Ҵ��� ��
      System.out.println("bytes1->String: " + str1); //str1��ü�� �������
      
      try {
         
         byte[] bytes2 = str.getBytes("EUC-KR"); //7��=7������ 7�࿡ �ִ� ���ڿ��� �� str��Ʈ����ü������
         //Bytes ����Ʈ�迭�� �����ϴµ� ���ڼ�Ʈ�� EUC-KR�� �����ϰ� ��. 
         //byte2�迭������ �Ҵ��� ��
         System.out.println("bytes2.length: " + bytes2.length);//byte2�� ���̸� ����߰�
         String str2 = new String(bytes2, "EUC-KR"); //StringŬ������ü�� �����ϴµ�, bytes2 ����Ʈ�迭�� �������� �ְ� , ���ڼ�Ʈ�� EUC-KR
         //�� ������ StringŬ���������� �Ű������� ������ �� 
         //str2 ���ڿ���ü������ bytes2���ڿ���ü�� �Ҵ�
         System.out.println("bytes2->String: " + str2);//str2�� �����
         
         
         byte[] bytes3 = str.getBytes("UTF-8"); //getBytes ����Ʈ�迭�� ���ڼ�UTF-8������� ��
         //bytes3�� ��
         System.out.println("bytes3.length: " + bytes3.length);
         //bytes3����Ʈ�迭�� ���̸� ���� �����
         String str3 = new String(bytes3, "UTF-8");//���ڿ���ü�� ����� �ű⿡ ������ bytes3�� ��
         //���ڼ�Ʈ�� UTF-8���� str3�� �Ҵ���
         System.out.println("bytes3->String: " + str3); //�̰��� �����      
         //html5�� �����Ҷ�. euc-kr, utf-8 ���ڼ�Ʈ�� ������ �ڵ��Ҷ� ���� ��ܿ� head�±׵�������. 
         //���ڼ¿� �����۾��� �ϴµ�.
         //���������� ������ ������� ������ ��Ʈ��ũ�� ���ؼ� �̵��� �Ҷ�.
         //����Ʈ������ �̵��ϴ� �����̴�. 
         //�׸��� ǥ���Ҷ��� utf-8 ���ڼ��� ���� ���ٰ� ������ ��Ⱦ��. 
         //�ѱ��� �ѱ��� ����Ʈǥ��� �ؼ� �迭�� �̷���ٺ����. ����Ʈ�迭�̶�����.
         //����� ���ڷ� �����ϰ� ǥ���ϱ����ؼ� . �̷� �޼��带 ���ٰ� �����.
         
      } catch (UnsupportedEncodingException e) { //���ڼ��� �۾��Ҽ������� �۵��Ǵ� ����ó��.
         e.printStackTrace();
      }
   }
}
*/
