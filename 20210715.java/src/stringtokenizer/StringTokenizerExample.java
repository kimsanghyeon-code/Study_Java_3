package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		
		//how1:��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2: ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

/*
 * package stringtokenizer;
import java.util.StringTokenizer;

public class StringTokenizerExample {
   public static void main(String[] args) {
      String text = "ȫ�浿/�̼�ȫ/�ڿ���"; //text��Ʈ����ü������ ���ڿ� �Ҵ��� ��
      
      //how1: ��ü ��ū ���� ��� for������ ����
      StringTokenizer st = new StringTokenizer(text, "/");
      //st��ü������ newŰ����� ��Ʈ����ũ������޼����� ��ü�� ������Ű�� �����ڸ� �۵���Ű�� ù��° Ÿ�ٹ��ڿ��� ����ִ� ����
      //�ι�° �μ��� ������ �������� ����
      //��Ʈ����ũ�����������ڸ� ���ؼ� ��ü�� ����� st��ü������ �Ҵ��Ѵ�. 
      
      int countTokens = st.countTokens(); //st��ü������ ����ִ� �����ִ� ��ū�� ���� �����ִ� �޼��忹��. 
      //Token == ���ڿ��� ���� ���ڿ��� ������ ��ū�̶�� ���� ��
      //countTokens������ ��ū�� ������ ����� ���ϵǾ �Ҵ�ȴ�
      
      for(int i=0; i<countTokens; i++) { 
         //i�� 0�̰� i�� ī��Ʈ��ū������ �ִ� ���� ���������� �ٽø��ؼ� �����ȿ� ����ִ� ���ڿ��� ������ �Ѿ for���� �����ʵ��� �Ѵ�. 
         String token = st.nextToken(); //��ū ���ڿ��� �ϳ��� ������ nextToken�޼��带 �۵����Ѽ� ������� ���Ͻ�Ų��
         //�װ��� token��ü������ �Ҵ��Ѵ�. 
         System.out.println(token); //token��ü������ ����� ���ڿ���ū�� ����Ѵ�. 
      }
      
      System.out.println(); //���ٶ���ְ�.
      
      //how2: ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
      st = new StringTokenizer(text, "/"); //��Ʈ����ũ��������ü�� ������ �ٽ� st��ü������ �Ҵ�ȴ�. 
      //���������õǼ� st��ü������ ���ο� ��ü�� ����. 
      
      while( st.hasMoreTokens() ) { //hasMoreTokens�޼����ε�, ������ �ְ� �� ��ū 
         //��ū�� �ִ� �Ǵ��ϴ� �޼��忹��. �׷��� ������ true, ������ false�� �ǰ� �׷��� while���ᰡ �ȴ�. ��ū�� ������.
         String token = st.nextToken(); //st��ü�������� nextToken �Ѱ��� �̾Ƽ� token��ü������ �����ϰ� 
         //�Ʒ��� �ڵ忡�� �ش� ��ū�� ����Ѵ�. 
         System.out.println(token);
      }
   }
}
*/
