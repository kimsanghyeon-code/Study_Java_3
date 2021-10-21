package objects;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: "+ osName);
		System.out.println("사용자 이름: "+ userName);
		System.out.println("사용자 홈디렉토리: "+ userHome);
		
		System.out.println("------------------------");
		System.out.println("[key] value");
		System.out.println("------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("["+key+"]"+value);
		}
		
	}
}


/*
package objects;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
   public static void main(String[] args) { //JVM속성들의정보를 가져옴
      String osName = System.getProperty("os.name"); //겟프로퍼티메서드는 키와 벨류로 되었는데
      //겟프로퍼티의 연산결과 키와 연결된 값을 osName과 같은 객체변수에 할당을 한다
      //os.name키임 그래서 현재 jvm설치된 운영체제의 이름을 출력한다
      String userName = System.getProperty("user.name");//운영체제에 대한 사용자계정
      String userHome = System.getProperty("user.home");//운영체제의 사용자가 가지고 있는 홈디렉토리이름
      
      System.out.println("운영체제 이름: " + osName);
      System.out.println("사용자 이름: " + userName);
      System.out.println("사용자 홈디렉토리: " + userHome);
      
      System.out.println("---------------------------------");
      System.out.println(" [ key ]  value");
      System.out.println("---------------------------------");
      Properties props = System.getProperties(); //매개변수를 넣지않고 그냥 비워두면 전체속성을 호출한다 
      //그래서 지금 props객체변수는 시스템정보를 모두 가지고 있음
      Set keys = props.keySet(); //props객체변수의 키들만 모아서 KeySet메서드를 통해서 Set세트를 얻음
      //Set클래스 데이터형을 적용한 Keys객체변수에 할당함
      for(Object objKey : keys) {//for문을 통해서 Keys 객체변수에 저장된 키들을 하나씩 objkey에 할당을 함
         //keys변수의 데이터가 문자이거나 숫자이거나 다양한 형태일텐데. 일단은 object클래스데이터타입을 적용하고 아래에서는 모두다 문자가 되도록 강제변환한것임. 
         String key = (String) objKey; //objKey를 문자열로 데이터를 강제변환하고 그것을 key객체변수에 할당을 한다
         //하나씩 데이터를 뽑음
         String value = System.getProperty(key); //getproperty메서드를 통해서 매개변수를 key객체변수에 들어있는 키로 벨류. 곧 값을 호출한다. 
         //그것을 value객체변수에 저장한다 
         System.out.println("[ " + key + " ]  " + value); //key변수와 value변수에 저장된 리터럴을 출력한다. 
      }

   }
}
*/