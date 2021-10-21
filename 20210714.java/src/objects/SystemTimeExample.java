package objects;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 합: "+sum);
		System.out.println("계산에"+(time2 -time1)+"나노초가 소요되었습니다.");
	}
}

/*
package objects;

public class SystemTimeExample {
   public static void main(String[] args) {
      long time1 = System.nanoTime();//1/10^9 초 타임스탬프를 찍어서 현재시각을 time1변수에 저장을 함
      
      int sum = 0; //sum변수를 초기화하고 
      for(int i=1; i<=1000000; i++) { //for문
         //i는 1, i는 백만보다 작을때까지 반복함
         sum += i;
         //sum = sum+i가 i의 누적합을 구함
      }
      
      long time2 = System.nanoTime(); //for문을 빠져나오면 nanoTIme메서드로 타임스탬프를 받아서 그 현재시각을 time2에 넣고
      
      System.out.println("1~1000000까지의 합: " + sum);
      //누적합의 결과출력
      System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
      //경과시간을 구하기 위해서 time2에서 time1을 빼버린 결과를 출력한다. 
   }
}
*/