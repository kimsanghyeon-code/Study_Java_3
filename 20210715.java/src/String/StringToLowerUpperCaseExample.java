package String;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
/*
package String;

public class StringToLowerUpperCaseExample {
   public static void main(String[] args) {
      String str1 = "Java Programming"; //str1�� ù���ڸ� �ܾ���. �빮�ڰ� ��. �Ҵ���
      String str2 = "JAVA Programming"; //str2�� ��� �빮�ڸ� ����
      
      System.out.println(str1.equals(str2)); //���� ������ �Ǵ��ϴ� �޼���
      
      String lowerStr1 = str1.toLowerCase();//�ҹ��ڷ� ������ ��Ŵ �׸��� lowerStr1�� �Ҵ��� + toLowerCase ���ڿ��� ��ü�� �ҹ��ڷ� ������ ���ڿ��� ����
      String lowerStr2 = str2.toLowerCase(); //str2�� �ҹ��ڷ� ���� �������� lowerStr2��ü������ �Ҵ���
      System.out.println(lowerStr1.equals(lowerStr2));//�ΰ��� ������ ��ȯ�� ���ڿ��� ���� ����
      
      System.out.println(str1.equalsIgnoreCase(str2)); //���ڵ��� ���뿡�� ���� ���� �������̱׳븣���̽��޼��带 �Ἥ �����ϸ� ��.             
   }
}
*/