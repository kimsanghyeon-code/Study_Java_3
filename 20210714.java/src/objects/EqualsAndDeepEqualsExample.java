package objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		//integer 타입을 적용한 o1 변수에 1000을 넣음
		Integer o2 = 1000;
		//integer 타입을 적용한 o2 변수에 1000을 넣음
		System.out.println(Objects.equals(o1,  o2));
		//objects 클래스에서 equals메소드를 작동시킴 -> true
		System.out.println(Objects.equals(o1,  null));
		//objects 클래스에서 equals메소드를 작동시킴 -> false
		System.out.println(Objects.equals(null, o2));
		//objects 클래스에서 equals메소드를 작동시킴 -> false
		System.out.println(Objects.equals(null,null));
		//objects 클래스에서 equals메소드를 작동시킴 -> true
		System.out.println(Objects.deepEquals(o1,o2)+"\n");
		//objects 클래스에서 equals메소드를 작동시킴 이 때, 내부의 값을 비교함-> true
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.equals(arr1, arr2));
		//objects 클래스에서 equals메소드를 작동시킴 배열은 같으나, 객체가 다름-> false
		System.out.println(Objects.deepEquals(arr1, arr2));
		//objects 클래스에서 equals메소드를 작동시킴. 내부 값이 같음> true
		System.out.println(Arrays.deepEquals(arr1, arr2));
		//objects 클래스에서 equals메소드를 작동시킴. 배열을 물어봤음 -> true
		System.out.println(Objects.deepEquals(null, arr2));
		//objects 클래스에서 equals메소드를 작동시킴 내부 값이 다름 -> false
		System.out.println(Objects.deepEquals(arr1, null));
		//objects 클래스에서 equals메소드를 작동시킴 내부 값이 다름 -> false
		System.out.println(Objects.deepEquals(null, null));
		//objects 클래스에서 equals메소드를 작동시킴 내부 값이 null로 같음-> true
	}
}


/*
package objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
   public static void main(String[] args) {
      Integer o1 = 1000; //인티져클래스의 데이터타입을 적용한 o1객체변수에 1000을 매개변수로 넣음
      Integer o2 = 1000; //인티져클래스의 데이터타입을 적용한 o2객체변수에 1000을 매개변수로 넣음
      System.out.println(Objects.equals(o1, o2));
      //Objects클래스에서 equals메서드를 작동시킴 o1,o2를 서로 비교연산을 함
      //비교연산이 객체비교연산임
      //둘 다 내용이 들어있으니까. true
      System.out.println(Objects.equals(o1, null));
      //내용이 들어있는 o1하고 널값을 서로 비교를 시켰음.
      //내용이 있으면 not null임 
      //not null, null이 있어서 서로 같지 않기 때문에 false
      System.out.println(Objects.equals(null, o2));
      //좌측이 null, 우측은 o2 임. false가 됨 
      System.out.println(Objects.equals(null, null));
      //null이 둘일때, 널값이니까 false라고 생각할지몰라도 둘다 값이 같기 때문에 true
      System.out.println(Objects.deepEquals(o1, o2) + "\n");
      //deepequls메서드는 내부의 값을 비교함 배열일 경우에는 내부의 요소를 하나씩 비교함 
      //둘다 값이 같기 때문에 true가 됨
      //위의 내용은 그냥 정수의 리터럴(일반값) 인데 둘다 같은 값이 들어감
      //아래의 내용은 정수리터럴이 들어있는 배열을 대상으로 함
      
      Integer[] arr1 = { 1, 2 }; //integer클래스의 배열데이터타입을 적용한 arr1배열변수에 1,2데이터가 든 배열을 할당
      Integer[] arr2 = { 1, 2 }; //integer클래스의 배열데이터타입을 적용한 arr2배열변수에 1,2데이터가 든 배열을 할당
      System.out.println(Objects.equals(arr1, arr2));//equals메서드는 객체를 비교하기는 하는데. 
      //두개의 배열값은 같지만 객체는 다르다는 것임 그래서 false값이 뜸
      System.out.println(Objects.deepEquals(arr1, arr2));
      //딥이퀄즈메서드는 배열일경우 내부의 값을 서로 하나씩 비교해서 같은지를 판단함 
      System.out.println(Arrays.deepEquals(arr1, arr2));
      //object클래스말고 지금 배열을 쓰고 있으니까 arrays클래스의 deepEquals메서드를 써봤는데 결과가 똑같다
      System.out.println(Objects.deepEquals(null, arr2));
      //한쪽이 널이라서 결과값은 false가 나옴
      System.out.println(Objects.deepEquals(arr1, null));
      //우측이 널값이 된 경우 서로 다르기 때문에 false
      System.out.println(Objects.deepEquals(null, null));
      //같기때문에 true가 된다는 것임. 
      
   }
}
*/