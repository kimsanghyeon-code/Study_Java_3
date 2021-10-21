package String;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6,  13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: "+length);
		
		String result = sb.toString();
		System.out.println(result);
	}
}

/*
package String;

public class StringBuilderExample {
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder();//Stringbuilder��ü������ �ϰ� sb��ü������ �Ҵ�
      //���ڿ��� �����ϰ� �����ϴ� Ŭ����
      //��Ʈ������Ŭ������ ���� ���� ������. 
      
      sb.append("Java "); //sb��ü������ ���뿡 �ڹٶ�� ���ڿ��� �߰�
      sb.append("Program Study");//append�޼���� ���ڿ��� �߰��Ҽ��ֵ��� ���ش�. 
      System.out.println(sb.toString()); //sb��ü������ ������ �������
      
      sb.insert(4, "2"); //insert�޼���� �ش�Ǵ� �ε����� ���� 2�� ������
      System.out.println(sb.toString());//�״�� �������

      sb.setCharAt(4, '6');//�ε���4���� ��ġ�� 6�̶�� ���ڸ� �����سִ´�
      //�ε����� �ֱ⋚���� ���� �Էµ� 2�� �ڷ� �и��� �ԷµǴ°� �ƴ϶� �������� ���������� ����⸦ ��
      System.out.println(sb.toString());//���
      
      sb.replace(6, 13, "Book");//replace�޼���� 6���ε������� 13���� �ε������� 3�Ű������� ��ü, �����Էµȴ�.
      System.out.println(sb.toString());
      
      sb.delete(4, 5);//�ε���4�� 5���̿��� �ִ� ���ڸ� �����Ѵ�
      System.out.println(sb.toString());
      
      int length = sb.length();//������ ���̸� �����ִ� �޼���
      //sb�� ���ڿ��� ���̸� ��� �����Ѵ� ��� ? length�� 
      System.out.println("�ѹ��ڼ�: " + length); //�ѹ��ڼ��� ���
      
      String result = sb.toString(); //sb��ü������ �ִ� ���ڿ��� result������ �Ҵ���
      System.out.println(result);      //�״�� ����� ��
   }
}
*/
