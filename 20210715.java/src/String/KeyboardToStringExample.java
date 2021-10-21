package String;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		
		System.out.println("�Է�: ");
		int readyByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readyByteNo-2);
		System.out.println(str);
	}
}

/*
package String;

import java.io.IOException;

public class KeyboardToStringExample {
   public static void main(String[] args) throws IOException {
      byte[] bytes = new byte[100]; //newŰ����� ����Ʈ������Ÿ���� 100�� ���� �迭��ü�� �����ؼ� 
      //byte�迭������Ÿ���� ����� bytes�迭������ �Ҵ��� �Ѵ�. 
      
      System.out.print("�Է�: "); //�Է�����ϰ�.
      int readByteNo = System.in.read(bytes); //�Է¿� ���ؼ� read�޼���� �о���̴µ� �װ��� bytes�迭�� �д´�
      //�����ؼ� �о���� ����� readByteNo int������ �Ҵ���

      String str = new String(bytes, 0, readByteNo-2);
      //newŰ����� String�����ڷ� ù��°�Ķ���ʹ� ���Ÿ���̰� bytes�迭�� �ι�°�Ķ���ʹ� ������ġ�̰�( 0���ε�������) ����°�Ķ���ʹ� ������ġ
      //������ġ�� readByteNo�� �ִµ� ���⼭�� 2�� ���� ������ ���ڸ� �Է¹��� �迭�� ������ ĳ�������ϰ� �����ǵ� 2���� ���ڰ� ������ ��. 
      //�׷��� -2�� �ϸ� ������ ������ ���̸� �߰� ��.
      //bytes�迭�� ����ִ� 0������, ���ڵ������� ���������� StringŬ������ü�� �ؼ� ���ڰ�üȭ��Ų�ٴ°�
      //�װ��� str������ ������ ��
      System.out.println(str); //�����
   }
}
*/
