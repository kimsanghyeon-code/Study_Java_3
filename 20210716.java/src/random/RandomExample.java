package random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택 번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}

/*
package random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
   public static void main(String[] args) {
      //선택번호
      int[] selectNumber = new int[6];//선택번호를 위해서 6개의 배열을 만듬. 
      //선택번호는 정수니까> int 배열6개. 
   //int배열타입이 selectNumber객체변수에 저장됨
      Random random = new Random(3);//종자값에 3을 넣었음.  
      //random클래스타입이 적용된 random객체변수에 할당함
      System.out.print("선택 번호: ");
      for(int i=0; i<6; i++) {
         //i는0, 6보다 작을떄까지 이지만 6번 돌리는 것임. 
         selectNumber[i] = random.nextInt(45) + 1;
         //random객체변수에 nextInt 랜덤으로해서 45개의 숫자중에 선택이 되는게. 1개 이 된다 
         //selectNumber i인덱스배열에 할당이 된다. 
         System.out.print(selectNumber[i] + " ");//출력이 된다. 
      }
      System.out.println();
      
      //당첨번호
      int[] winningNumber = new int[6];//new키워드로 6개의 숫자를 저장할 배열을 만듬
      //winningNumber객체변수에 저장한다
      random = new Random(5);
      //random객체를 생성하고 매개변수로 씨드밸류. 랜덤계산할때. 종자값. 을 5로 그냥 넣은 것임.
      //random변수에 저장함.
      System.out.print("당첨 번호: ");
      for(int i=0; i<6; i++) {
         winningNumber[i] = random.nextInt(45) + 1;
         //random클래스의 nextInt메서드를 통해서 45개의 숫자를 랜덤으로 1개 뽑아낸다. 
         //그것을 winningNumber의 인덱스를 따라서 뽑아낸 숫자를 저장해준다. 
         System.out.print(winningNumber[i] + " ");
         //출력을 함. 
      }
      System.out.println();
      
      //당첨여부
      Arrays.sort(selectNumber);//selectNumber선택번호가 배열이니까. 배열을 sort 정렬메서드로 정렬함.
      Arrays.sort(winningNumber);//winningNumber선택번호가 배열이니까. 배열을 sort정렬메서드로 정렬하마. 
      boolean result = Arrays.equals(selectNumber, winningNumber);
      //arrays클래스의 equals메서드로 selectNumber, winningNumber 내용을 같은지 비교함.
      //그결과를 result변수에 저장함.
      
      System.out.print("당첨 여부: ");
      if(result) { //만약에 result가 참이면 아래의 당첨메시지를 출력함.
         System.out.println("1등에 당첨되셨습니다.");
      } else {//아니면 비당첨메시지를 출력함. 
         System.out.println("당첨되지 않았습니다.");
      }
   }
}
*/
