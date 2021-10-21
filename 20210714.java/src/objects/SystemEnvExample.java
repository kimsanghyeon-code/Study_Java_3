package objects;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME]"+javaHome);
	}
}


/*
package objects;

public class SystemEnvExample {
   public static void main(String[] args) {
      String javaHome = System.getenv("JAVA_HOME");   //getenv 환경변수에 대한 데이터를 리턴해줌
      //jdk를 설치할때 java_HOME이라는 환경변수를 설정하고는 해요. 
      //따로 설정안했으면 null이 뜨고, 설정이 하셨다면 경로가 뜰거예요. 
      //그것을 javaHome객체변수에 할당을 하고 아래의 명령문에서 출력을 함
      System.out.println("[ JAVA_HOME ]  " + javaHome);
   }
}
*/