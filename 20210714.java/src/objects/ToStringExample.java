package objects;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�"));
	}
}


/*
package objects;


import java.util.Objects;

public class ToStringExample {
   public static void main(String[] args) {      
      String str1 = "ȫ�浿"; //str1�� ���ڸ��ͷ��� �ְ�
      String str2 = null; //str2�� null���� ����
      
      System.out.println(Objects.toString(str1)); //tostring�޼���� �Ű������� null���� �ƴϸ� �����ȿ� ����ִ� ������ �״�� ����� ��
      System.out.println(Objects.toString(str2)); //null�� ��쿡�� tostring�޼��尡 �ΰ��� �����
      System.out.println(Objects.toString(str2, "�̸��� �����ϴ�.")); // �Ű������� 2���̸� null�ϰ�쿡 2��° �ִ� �Ű������� �����޽����� ����ϵ��� �Ѵ�.
      //null default �� ����Ʈ ��� �θ�. 
   }
}
*/