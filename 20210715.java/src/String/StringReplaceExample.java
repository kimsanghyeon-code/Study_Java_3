package String;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�","JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}

/*
package String;

public class StringReplaceExample {
   public static void main(String[] args) {
      String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�."; //���ڿ��� �䵥..
      //oldstr��ü������ ��
      String newStr = oldStr.replace("�ڹ�", "JAVA");
      //oldstr��ü�������� replace�޼��忡 �ڹٿ� JAVA�� ��
      //replace��ü�۾��� �����. 
      //�ڹٶ�� ���ڸ� JAVA�� �ٲ���.
      //�װ���� newStr��ü������ ������ ����.
      //��ü������ ����� ���⿡ ���ڿ��� ���� ��.
      //replace�޼����� �������� ��.
      //���������� ������ �����ߴٱ⺸�ٴ� ������ �۾����� ������ ����� �Ǵٸ� ���ڿ���ü�� ������ jvm�޸𸮿����� 
      //��Ÿ���ٰ� �����ϴ� �ſ���. ������ �׷��� ��. 
      //��ü������ replace�޼��尡 ������ ������ �ؼ� ���ο� ���ڿ� ��ü�� �������� ��. 
      
      System.out.println(oldStr); //�õ彺Ʈ��
      System.out.println(newStr); //����Ʈ���� ���̸� �����ִ� ��Ȳ�̴�. 
   }
}
*/