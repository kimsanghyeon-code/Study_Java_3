package String;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}
	}
}

/*
package String;

public class StringCharAtExample {
   public static void main(String[] args) {
      String ssn = "010624-2230123"; //StringŬ����Ÿ�������ؼ� ssn��ü������ �����ϰ� ���ڿ��� �־����
      char sex = ssn.charAt(7); //ssn��Ʈcharat�޼��� 7�ε����� �����ؿ��� ����. �װ��� sex���� charŸ���� �����
      switch (sex) { //switch������ sex�������� ����� �����͸� case�� ��Ī�� ��
         case '1':
         case '3':
            System.out.println("���� �Դϴ�.");
            break; //�ش�Ǵ� ��¹��� �����ϰ� �Ǹ� break�� �Ǽ� ���������� ����. 
         case '2':
         case '4':
            System.out.println("���� �Դϴ�.");
            break; //�ش�Ǵ� ��¹��� �����ϰ� �Ǹ� break�� �Ǽ� ���������� ����. 
      }
   }
}

*/
