package array;

import java.util.Arrays;

public class SearchExample {
	public static void mian(String[] args) {
		//�⺻ Ÿ�԰� �˻�
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores,99);
		System.out.println("ã�� �ε���: "+ index);
		
		//���ڿ� �˻�
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names,"ȫ�浿");
		System.out.println("ã�� �ε���: "+index);
		
		//��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members,m1);
		System.out.println("ã�� �ε���:" + index);
	}
}

/*
package array;

import java.util.Arrays;

public class SearchExample {
   public static void main(String[] args) {
      //�⺻ Ÿ�԰� �˻�
      int[] scores = { 99, 97, 98 };//�����迭�� 3���� ���� �Ҵ�ȴ� scores��ü�迭
      Arrays.sort(scores); //arraysŬ������ sort�޼���� scores�迭�� ������ �ع�����. 
      int index = Arrays.binarySearch(scores, 99); //arraysŬ������ binarysearch�޼��带 �����. 
      //Ÿ�ٹ迭�� scores�� ã������ ���� 99�� �ؼ� �Ű������� ����ְ� ������ �޴´�. 
      //�װ��� �������� �ε��� �׷��� 2���ε����� 99�ϱ�. �״�� 2�� �ְ���.
      System.out.println("ã�� �ε���: " + index);//����� �ع���. 
      
      //���ڿ� �˻�
      String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };//���ڿ��迭�� �����, StringŬ�������� names�迭������ �����ϰ� �׾ȿ� ���ڿ��迭���� �Ҵ�
      Arrays.sort(names);//���� �����۾��� ��
      index = Arrays.binarySearch(names, "ȫ�浿"); //���̳ʸ���ġ�޼���.
      //names�迭�����غ��Ű��, ã������ ���� �ι����μ��� �ְ� ����ġ������ ������. �װ�� ���ϰ��� index�迭�� �Ҵ���
      System.out.println("ã�� �ε���: " + index);
      
      //��ü �˻�
      Member m1 = new Member("ȫ�浿"); //newŰ����� member��ü�� �����ؼ� �Ű������� �־��ְ� ��ü�� m1��ü������ �Ҵ��Ѵ�. 
      Member m2 = new Member("�ڵ���"); //m2, m3 ��� ����. 
      Member m3 = new Member("��μ�");
      Member[] members = { m1, m2, m3 };//member�迭������Ÿ���� ������ members�迭������ 3���� ��ü�� �Ҵ���.
      Arrays.sort(members);//���ڿ���ü���� ������. sort�޼��尡 �����ϱ�. ������.
      index = Arrays.binarySearch(members, m1);//���̳ʸ���ġ�� �ؼ� �޼��带 �۵���Ų��. 
      //members�迭��.ã�� ���� ��ü�� m1��. �װ������ index�� ���Ͻ�Ų��. 
      System.out.println("ã�� �ε���: " + index);//�װ��� ��½�Ŵ. 
   }
}
*/
