package String;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123 ";
		String tel3 = " 1234 ";
		
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
				
	}
}

/*
package String;
public class StringTrimExample {
   public static void main(String[] args) {
      String tel1 = "  02"; //tel1��ü�������� 02��
      String tel2 = "123   ";//tel2��ü�������� 123��
      String tel3 = "   1234   "; //tel3��ü�������� 1234��
      
      String tel = tel1.trim() + tel2.trim() + tel3.trim(); //��ü�����ڿ� trim�޼��带 �۵���Ŵ
      //������ �߶���� �װ���� �����Ѵ�
      //���ϰ������  + �����ڷ� ���� ���ؼ� ��������ڰ� �ƴ�. �̾�ٿ���
      //tel��ü������ �Ҵ����ش�
      System.out.println(tel); //tel�� �����
   }
}
*/