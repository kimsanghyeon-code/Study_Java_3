package String;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}

/*
package String;

public class StringSubstringExample {
   public static void main(String[] args) {   
      String ssn = "880815-1234567 "; //ssn ���ڿ�Ŭ����Ÿ���� ���� ��ü�����̰� �ű⿡ ���ڿ��� ��
      
      String firstNum = ssn.substring(0, 6); //ssn��ü������ substring�޼��尡 0���ε��� 6���ε��� ��¸����ϰڴٰ� �߰�.
      //�װ���� firstNum������ �����
      System.out.println(firstNum);      //������
      //substring�޼���� (0, 6) ù��°�μ��� ������ġ�ε�����ȣ��. �׷��� �ι�° �μ��� �߶󳻷��� �ϴ� �ε��� ��������ȣ��. 
      //Ư���ϰԵ� 6���ε��� - ��. �ι�°�μ��� 6���ε����� ������������. �� ���ڸ������� ���. �ش繮�ڿ����� ���ڸ� �����ؿ��� �޼����� ���ø� �ǿ�. 
      
      String secondNum = ssn.substring(7);//substring�޼��尡 �μ��� 1���϶���
      //�ش�Ǵ� �ε�����ȣ���� ���������ڸ����� �ϴ� �����Ѵ�. 
      //�����ؼ� secondNum������ �Ҵ��Ѵ�. 
      System.out.println(secondNum); //�װ��� �����.
   } 
}
*/