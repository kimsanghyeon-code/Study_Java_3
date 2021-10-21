package stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}

/*
package stringtokenizer;

public class StringSplitExample {
   public static void main(String[] args) {
      String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ"; //text��ü������ ���ڿ��� ��
      String[] names = text.split("&|,|-"); //split�޼���� Ÿ���� �Ǵ� ���ڸ� �������ִ� �޼����̴�. 
      
      
      //&|,|-   
      // | �� ��������� �ҷ���. ���� ���⼭�� ����ǥ���Ŀ����� OR���꿡 �ش�ǿ�. 
      //text��ü������ ����� ���ڸ� split�޼���� �ڸ��µ�. & �̰ų� , �̰ų� - �̰ų� �ϳ��� ������ �װ��� �߽����� ���ڸ� �߶������� ����.
      // ����ȭǥ����.
      
      //names�迭�� ���ڸ� �ϳ��� �߶� ����־����. 
      //names�迭�� �ִ� �۾��� �Ʒ��� for������ 
      for(String name : names) {
         //names�迭���� �������� StringŬ����Ÿ���� ������ name�� �Ѱ��� �־���
         System.out.println(name); //��������name�� �ִ� ���� �ϳ��� �������. 
      }
   }
}
*/