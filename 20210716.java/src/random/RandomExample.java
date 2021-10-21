package random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//���ù�ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("���� ��ȣ: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷ ��ȣ: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		//��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷ ����: ");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}
}

/*
package random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
   public static void main(String[] args) {
      //���ù�ȣ
      int[] selectNumber = new int[6];//���ù�ȣ�� ���ؼ� 6���� �迭�� ����. 
      //���ù�ȣ�� �����ϱ�> int �迭6��. 
   //int�迭Ÿ���� selectNumber��ü������ �����
      Random random = new Random(3);//���ڰ��� 3�� �־���.  
      //randomŬ����Ÿ���� ����� random��ü������ �Ҵ���
      System.out.print("���� ��ȣ: ");
      for(int i=0; i<6; i++) {
         //i��0, 6���� ���������� ������ 6�� ������ ����. 
         selectNumber[i] = random.nextInt(45) + 1;
         //random��ü������ nextInt ���������ؼ� 45���� �����߿� ������ �Ǵ°�. 1�� �� �ȴ� 
         //selectNumber i�ε����迭�� �Ҵ��� �ȴ�. 
         System.out.print(selectNumber[i] + " ");//����� �ȴ�. 
      }
      System.out.println();
      
      //��÷��ȣ
      int[] winningNumber = new int[6];//newŰ����� 6���� ���ڸ� ������ �迭�� ����
      //winningNumber��ü������ �����Ѵ�
      random = new Random(5);
      //random��ü�� �����ϰ� �Ű������� ������. ��������Ҷ�. ���ڰ�. �� 5�� �׳� ���� ����.
      //random������ ������.
      System.out.print("��÷ ��ȣ: ");
      for(int i=0; i<6; i++) {
         winningNumber[i] = random.nextInt(45) + 1;
         //randomŬ������ nextInt�޼��带 ���ؼ� 45���� ���ڸ� �������� 1�� �̾Ƴ���. 
         //�װ��� winningNumber�� �ε����� ���� �̾Ƴ� ���ڸ� �������ش�. 
         System.out.print(winningNumber[i] + " ");
         //����� ��. 
      }
      System.out.println();
      
      //��÷����
      Arrays.sort(selectNumber);//selectNumber���ù�ȣ�� �迭�̴ϱ�. �迭�� sort ���ĸ޼���� ������.
      Arrays.sort(winningNumber);//winningNumber���ù�ȣ�� �迭�̴ϱ�. �迭�� sort���ĸ޼���� �����ϸ�. 
      boolean result = Arrays.equals(selectNumber, winningNumber);
      //arraysŬ������ equals�޼���� selectNumber, winningNumber ������ ������ ����.
      //�װ���� result������ ������.
      
      System.out.print("��÷ ����: ");
      if(result) { //���࿡ result�� ���̸� �Ʒ��� ��÷�޽����� �����.
         System.out.println("1� ��÷�Ǽ̽��ϴ�.");
      } else {//�ƴϸ� ���÷�޽����� �����. 
         System.out.println("��÷���� �ʾҽ��ϴ�.");
      }
   }
}
*/
