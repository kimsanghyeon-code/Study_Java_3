package objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		//integer Ÿ���� ������ o1 ������ 1000�� ����
		Integer o2 = 1000;
		//integer Ÿ���� ������ o2 ������ 1000�� ����
		System.out.println(Objects.equals(o1,  o2));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ -> true
		System.out.println(Objects.equals(o1,  null));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ -> false
		System.out.println(Objects.equals(null, o2));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ -> false
		System.out.println(Objects.equals(null,null));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ -> true
		System.out.println(Objects.deepEquals(o1,o2)+"\n");
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ �� ��, ������ ���� ����-> true
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.equals(arr1, arr2));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ �迭�� ������, ��ü�� �ٸ�-> false
		System.out.println(Objects.deepEquals(arr1, arr2));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ. ���� ���� ����> true
		System.out.println(Arrays.deepEquals(arr1, arr2));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ. �迭�� ������� -> true
		System.out.println(Objects.deepEquals(null, arr2));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ ���� ���� �ٸ� -> false
		System.out.println(Objects.deepEquals(arr1, null));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ ���� ���� �ٸ� -> false
		System.out.println(Objects.deepEquals(null, null));
		//objects Ŭ�������� equals�޼ҵ带 �۵���Ŵ ���� ���� null�� ����-> true
	}
}


/*
package objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
   public static void main(String[] args) {
      Integer o1 = 1000; //��Ƽ��Ŭ������ ������Ÿ���� ������ o1��ü������ 1000�� �Ű������� ����
      Integer o2 = 1000; //��Ƽ��Ŭ������ ������Ÿ���� ������ o2��ü������ 1000�� �Ű������� ����
      System.out.println(Objects.equals(o1, o2));
      //ObjectsŬ�������� equals�޼��带 �۵���Ŵ o1,o2�� ���� �񱳿����� ��
      //�񱳿����� ��ü�񱳿�����
      //�� �� ������ ��������ϱ�. true
      System.out.println(Objects.equals(o1, null));
      //������ ����ִ� o1�ϰ� �ΰ��� ���� �񱳸� ������.
      //������ ������ not null�� 
      //not null, null�� �־ ���� ���� �ʱ� ������ false
      System.out.println(Objects.equals(null, o2));
      //������ null, ������ o2 ��. false�� �� 
      System.out.println(Objects.equals(null, null));
      //null�� ���϶�, �ΰ��̴ϱ� false��� ������������ �Ѵ� ���� ���� ������ true
      System.out.println(Objects.deepEquals(o1, o2) + "\n");
      //deepequls�޼���� ������ ���� ���� �迭�� ��쿡�� ������ ��Ҹ� �ϳ��� ���� 
      //�Ѵ� ���� ���� ������ true�� ��
      //���� ������ �׳� ������ ���ͷ�(�Ϲݰ�) �ε� �Ѵ� ���� ���� ��
      //�Ʒ��� ������ �������ͷ��� ����ִ� �迭�� ������� ��
      
      Integer[] arr1 = { 1, 2 }; //integerŬ������ �迭������Ÿ���� ������ arr1�迭������ 1,2�����Ͱ� �� �迭�� �Ҵ�
      Integer[] arr2 = { 1, 2 }; //integerŬ������ �迭������Ÿ���� ������ arr2�迭������ 1,2�����Ͱ� �� �迭�� �Ҵ�
      System.out.println(Objects.equals(arr1, arr2));//equals�޼���� ��ü�� ���ϱ�� �ϴµ�. 
      //�ΰ��� �迭���� ������ ��ü�� �ٸ��ٴ� ���� �׷��� false���� ��
      System.out.println(Objects.deepEquals(arr1, arr2));
      //��������޼���� �迭�ϰ�� ������ ���� ���� �ϳ��� ���ؼ� �������� �Ǵ��� 
      System.out.println(Arrays.deepEquals(arr1, arr2));
      //objectŬ�������� ���� �迭�� ���� �����ϱ� arraysŬ������ deepEquals�޼��带 ��ôµ� ����� �Ȱ���
      System.out.println(Objects.deepEquals(null, arr2));
      //������ ���̶� ������� false�� ����
      System.out.println(Objects.deepEquals(arr1, null));
      //������ �ΰ��� �� ��� ���� �ٸ��� ������ false
      System.out.println(Objects.deepEquals(null, null));
      //���⶧���� true�� �ȴٴ� ����. 
      
   }
}
*/