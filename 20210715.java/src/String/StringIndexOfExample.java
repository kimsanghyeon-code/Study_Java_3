package String;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�")!= -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
	}
}

/*
package String;


public class StringIndexOfExample {
   public static void main(String[] args) {
      String subject = "�ڹ� ���α׷���"; //String Ŭ����Ÿ���� ������ subject��ü������ ���ڿ��� �Ҵ���
      
int location = subject.indexOf("���α׷���"); //subject��ü������ indexof�޼��带 ���ؼ� �Ű������� ��ü������ �ִ� ���ڿ����� ���° �ε����� ��ġ�� �ִ� ���� ����� ����
//�װ��� �����ؼ� location ������������ �Ҵ��� ����
      System.out.println(location); //����� �ε�����ȣ��
      
      if(subject.indexOf("�ڹ�") != -1) {
//���࿡ subject��ü�������� indexof �ڹ� �� �����ȿ��� ���° �ε����� �ִ� �ľ��� 
// -1 �� ��ġ�ϴ� ���� ������ indexof���� ����ϰ� �����ϴ� ���̿���. ���� ���ؼ� ã�� ���� ������ -1�� ����ؿ�
// �ڹٸ� indexof�޼���� ã�Ҵµ� ���ϰ��� -1�� �ƴ� ���� ����? ��� ���̿���.
// -1�� �ƴϸ� true�� �Ǽ� �׷��� �ٷ� �Ʒ��� �ִ� �ڵ带 ������         
         System.out.println("�ڹٿ� ���õ� å�̱���");
      } else {
         System.out.println("�ڹٿ� ���þ��� å�̱���");
      }
   }
}
*/