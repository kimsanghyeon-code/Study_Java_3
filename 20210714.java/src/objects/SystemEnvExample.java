package objects;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]"+javaHome);
	}
}


/*
package objects;

public class SystemEnvExample {
   public static void main(String[] args) {
      String javaHome = System.getenv("JAVA_HOME");   //getenv ȯ�溯���� ���� �����͸� ��������
      //jdk�� ��ġ�Ҷ� java_HOME�̶�� ȯ�溯���� �����ϰ�� �ؿ�. 
      //���� ������������ null�� �߰�, ������ �ϼ̴ٸ� ��ΰ� ��ſ���. 
      //�װ��� javaHome��ü������ �Ҵ��� �ϰ� �Ʒ��� ��ɹ����� ����� ��
      System.out.println("[ JAVA_HOME ]  " + javaHome);
   }
}
*/