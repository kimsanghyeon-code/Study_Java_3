package objects;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2, "�̸��� �����ϴ�.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2, ()->"�̸��� ���ٴϱ��");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
package objects;

import java.util.Objects;

public class NullExample {
   public static void main(String[] args) {      
      String str1 = "ȫ�浿"; //��Ʈ��Ŭ������ ������ ���� str1�� ���ڸ��ͷ��� ����
      String str2 = null; //��Ʈ��Ŭ������ ������ ���� str2�� null���� ����
      
      System.out.println(Objects.requireNonNull(str1)); 
      //�����̾�θ޼���� not null���¸� ��ü�� ������ְ�
      //�װ��� �ƴ� null���´� �׷� ���������ͻ��� nullpointerException �ΰ��� ���� ����ó���� ��
      
      try {
         String name = Objects.requireNonNull(str2); //������θ޼��尡 �Ű������� str2�� ����
         //�ο� ���� ���� name������ �־����
      } catch(Exception e) {
         System.out.println(e.getMessage()); //null���̱⶧���� ĳġ������ ���ؼ� ���� �̰��� ���̶�� �˷��ִ� ����� �ϴ°ſ���.
      }
      
      try {
         String name = Objects.requireNonNull(str2, "�̸��� �����ϴ�.");
         
         //�μ��� 2���� �ִµ� �ϳ��� str2 �ΰ��� �ִ� ��ü������ �ϳ��� �ؽ�Ʈ�� �ִµ�, �� �ؽ�Ʈ�� ������ ������ ������ִ� �޽����μ� �۵���
         //�޼���ȿ��� �����Ǿ�����
         //catch������ �۵��� �ϴµ� null���� �߻��߱⶧���� ����ó���۵��� �ϴµ�. 2��° �μ��� �ִ� �����ؽ�Ʈ�� �������
      } catch(Exception e) {
         System.out.println(e.getMessage());
      }
      
      try {
         String name = Objects.requireNonNull(str2, ()->"�̸��� ���ٴϱ��");
         //�����̾�ڸ޼��带 �۵����״µ�, str2 �ΰ��� ����ִ� ��ü�����̰�, ���ٽ� ����޼��� �Լ� �۵��� �Ҷ� ��µǴ� �ؽ�Ʈ�� ��������
      } catch(Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
*/
