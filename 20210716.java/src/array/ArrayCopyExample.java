package array;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//���1
		char[] arr2 = Arrays.copyOf(arr1,  arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//���2
		char[] arr3 = Arrays.copyOfRange(arr1,  1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//���3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}
}

/*
package array;

import java.util.Arrays;

public class ArrayCopyExample {
   public static void main(String[] args) {
      char[] arr1 = {'J', 'A', 'V', 'A'}; //������ ���ڵ��� arr1�̶��char ���ڹ迭�� �Ҵ�ȴ�. 
      
      //���1
      char[] arr2 = Arrays.copyOf(arr1, arr1.length);//copyof�޼���
      //������Ÿ�ٹ迭, ����
      //����������� ���̸�ŭ ī�Ǹ� �߰� �װ��� ���ϰ����� �����ͼ� arr2�� �ٿ�����. 
      System.out.println(Arrays.toString(arr2));
      
      //���2
      char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);//��������
      //Ÿ���� arr1�ε� �ι�°�μ��� 1�� 1�ε������� 3�� �ִ� 3������. 2���ε������� ���縦 ��
      //ī���ؼ� arr3�� �Ҵ���
      System.out.println(Arrays.toString(arr3));      
      
      //���3
      char[] arr4 = new char[arr1.length]; char��ü arr1�� ���� 
      // arr4�� �Ҵ�ȴ�.
      System.arraycopy(arr1, 0, arr4, 0, arr1.length);
      //arraycopy ( �����迭, ���������ε��� , Ÿ�ٹ迭, Ÿ�ٽ����ε���, ���簳��)
      //��ü�ε����� �� ������ ��.
      for(int i=0; i<arr4.length; i++) {
         //i�� 0 i�� arr4�� ���̺��� ���� ������ 
         //�ε���0������ 3������ �ݺ���.
         System.out.println("arr4[" + i + "]=" + arr4[i]); //����� ����
         //i�� �ε����ϱ�. �ε�������ϰ� �ش� �ε����� ������ �����
      }
   }
}
*/
