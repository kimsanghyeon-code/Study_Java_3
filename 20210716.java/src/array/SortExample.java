package array;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
	}
}

/*
package array;
import java.util.Arrays;

public class SortExample {
   public static void main(String[] args) {
      int[] scores = { 99, 97, 98 };//scores�����迭������ 3���� ���� �����
      Arrays.sort(scores); ArraysŬ������ �����޼��� sort�ε� scores�迭������ �Էµ�
      for(int i=0; i<scores.length; i++) {//scores���̺��� ª�� �ɋ����� �ݺ��Ѵ�. 
         System.out.println("scores[" + i + "]=" + scores[i]); //������������ �Ǿ�����
      }
      System.out.println();
      
      String[] names = { "ȫ�浿", "�ڵ���", "��μ�" }; names�迭������ 3���� ���ڿ��� �Է��ߴ�. 
      Arrays.sort(names);//���ڿ��迭�� �����߾��. 
      for(int i=0; i<names.length; i++) {//�ε����� 0���� 2����
         System.out.println("names[" + i + "]=" + names[i]);//�������
      }
      System.out.println();
      
      Member m1 = new Member("ȫ�浿");//MemberŬ������ ���ڿ��� �Ű������� �ְ� ��ü�� �����Ѵ�. �׸��� m1�� �Ҵ��Ѵ�. 
      Member m2 = new Member("�ڵ���");//m2�� �Ҵ�
      Member m3 = new Member("��μ�");//m3�� �Ҵ�
      Member[] members = { m1, m2, m3 };//MemberŬ�����迭�� Ÿ���� ���� members�迭������ 3���� ��ü�� �Ҵ�ȴ�. 
      Arrays.sort(members); //sort�޼��尡 ��ü�� ������� ������ �õ� ��. 
      for(int i=0; i<members.length; i++) {//��ü�� �迭�� ���̺��� ����������.
         System.out.println("members[" + i + "].name=" + members[i].name);
         //0���� 2���� �ݺ��� �Ѵ�. �ε����� 
      }
   }
}
*/