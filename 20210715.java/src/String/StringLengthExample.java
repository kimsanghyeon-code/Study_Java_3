package String;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}
	}
}

/*
package String;

public class StringLengthExample {
   public static void main(String[] args) {
      String ssn = "7306241230123"; //stringŸ���� ������ ssn��ü������ ���ڿ��� ��
      int length = ssn.length(); //length������ ssn��ü������ length�޼��尡 �����Ѵ�
      //ssn���ִ� ���ڿ��� ���̸� ���� �װ��� �����ϴ� ��Ȳ��.
      if(length == 13) {
         //length������ ���� 13�� ���ٸ� �ٷξƷ��� �ִ� ���ڿ��� ���
         System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
      } else {
         System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
      }
   }
}
*/