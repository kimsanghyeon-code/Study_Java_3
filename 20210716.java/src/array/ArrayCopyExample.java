package array;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1,  arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1,  1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//방법3
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
      char[] arr1 = {'J', 'A', 'V', 'A'}; //각각의 글자들이 arr1이라는char 문자배열에 할당된다. 
      
      //방법1
      char[] arr2 = Arrays.copyOf(arr1, arr1.length);//copyof메서드
      //복사할타겟배열, 길이
      //복사원본에서 길이만큼 카피를 뜨고 그것을 리턴값으로 가져와서 arr2에 붙여넣음. 
      System.out.println(Arrays.toString(arr2));
      
      //방법2
      char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);//범위복사
      //타겟이 arr1인데 두번째인수인 1은 1인덱스에서 3이 있는 3전까지. 2번인덱스까지 복사를 함
      //카피해서 arr3에 할당함
      System.out.println(Arrays.toString(arr3));      
      
      //방법3
      char[] arr4 = new char[arr1.length]; char객체 arr1의 길이 
      // arr4에 할당된다.
      System.arraycopy(arr1, 0, arr4, 0, arr1.length);
      //arraycopy ( 원본배열, 원본시작인덱스 , 타겟배열, 타겟시작인덱스, 복사개수)
      //전체인덱스를 다 가지고 옴.
      for(int i=0; i<arr4.length; i++) {
         //i는 0 i가 arr4의 길이보다 작을 때까지 
         //인덱스0번부터 3번까지 반복함.
         System.out.println("arr4[" + i + "]=" + arr4[i]); //출력을 해줌
         //i는 인덱스니까. 인덱스출력하고 해당 인덱스의 내용을 출력함
      }
   }
}
*/
