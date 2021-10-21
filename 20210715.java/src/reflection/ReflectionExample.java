package reflection;

import java.lang.reflect.*;

public class ReflectionExample {
   public static void main(String[] args) throws Exception {
      Class clazz = Class.forName("reflection.Car");
      
      System.out.println("[클래스 이름]");
      System.out.println(clazz.getName());
      System.out.println();      
      
      System.out.println("[생성자 정보]");
      Constructor[] constructors = clazz.getDeclaredConstructors();
      for(Constructor constructor : constructors) {
         System.out.print(constructor.getName() + "(");
         Class[] parameters = constructor.getParameterTypes();
         printParameters(parameters);
         System.out.println(")");
      }      
      System.out.println();
      
      System.out.println("[필드 정보]");
      Field[] fields = clazz.getDeclaredFields();
      for(Field field : fields) {
         System.out.println(field.getType().getSimpleName() + " " + field.getName());
      }
      System.out.println();
      
      System.out.println("[메소드 정보]");
      Method[] methods = clazz.getDeclaredMethods();
      for(Method method : methods) {
         System.out.print(method.getName() + "(");
         Class[] parameters = method.getParameterTypes();
         printParameters(parameters);
         System.out.println(")");
      }         
   }
   
   private static void printParameters(Class[] parameters) {
      for(int i=0; i<parameters.length; i++) {
         System.out.print(parameters[i].getName());
         if(i<(parameters.length-1)) {
            System.out.print(",");
         }
      }
   }
}

/*
package reflection;

import java.lang.reflect.*;

public class ReflectionExample { //클래스의 구성요소 정보를 가져올 수 있는 것이 리플렉션의 개념임
   public static void main(String[] args) throws Exception {
      Class clazz = Class.forName("reflection.Car");//포네임메서드를 통해서 클래스가 속한 패키지경로를 따라서 해당클래스를 객체생성해서 clazz객체변수에 할당
      
      System.out.println("[클래스 이름]");
      System.out.println(clazz.getName()); //clazz객체변수에서 getName메서드를 통해서 이름정보를 가져옴
      System.out.println();      
      
      System.out.println("[생성자 정보]");
      Constructor[] constructors = clazz.getDeclaredConstructors();//생성자배열데이터타입을 적용한 constructors배열변수에 
      //clazz객체변수에서 getDelcaredConstructors메서드를 통해서 생성자 데이터를 리턴해서 constructors배열에 할당한다
      for(Constructor constructor : constructors) { //for문으로 Constructor데이터타입적용된 constructor지역변수가 constructors for문매개변수에서 
         //배열데이터를 하나씩 뽑아옴
         System.out.print(constructor.getName() + "(");
         //한개의 배열데이터를 받은 constructor객체변수의 getName메서드를 작동시킨다
         //생성자에는 매개변수가 있는데.
         //매개변수가 여러개 일수있으니 괄호여는 데 까지 표기하고 
         //생성자 오버로딩일 경우에 다양한 매개변수가 존재할 수 있으니까. 괄호여는데까지 표기하고 
         Class[] parameters = constructor.getParameterTypes(); //Class데이터타입 배열의 데이터타입을 적용한 parameters배열변수에 
         //constructor매개변수의 getParameterTypes메서드 매개변수타입을 리턴해오고, 그것을 parameters매개변수에 저장을 함
         printParameters(parameters); //파라메터를 출력해줌. 있다면. 
         System.out.println(")"); //괄호를 닫아주고
         //for문이니까. 생성자가 있는 만큼 다 출력해줌
      }      
      System.out.println();
      
      System.out.println("[필드 정보]");
      Field[] fields = clazz.getDeclaredFields();//필드배열데이터타입을 적용한 fields배열변수에 clazz객체변수의 getDeclaredFields메서드를 실행하고
      //리턴한 결과를 fields배열에 할당한다
      for(Field field : fields) { //for문으로 fields파라메터에서 한개씩 데이터를 뽑아 field for문 지역변수안에 할당함
         System.out.println(field.getType().getSimpleName() + " " + field.getName());
         //getType메서드에 getSimpleName 이것때문에 String이 출력됨 
         //공백하나넣어줌
         //field.getName 필드 지역변수의 이름을 리턴시켜줌
      }
      System.out.println();
      
      System.out.println("[메소드 정보]");
      Method[] methods = clazz.getDeclaredMethods(); //Method배열데이터타입을 적용한 methods배열변수에 clazz객체변수에서 getDeclaredMethods메서드를
      //작동시켜서 메서드정보를 가져오고 methods배열에 할당한다
      for(Method method : methods) {
         //for문으로 clazz가 보유한 메서드의 정보들을 출력함
         //methods매개변수에서 method 지역변수에 한개씩 데이터전달함
         System.out.print(method.getName() + "("); //method지역변수의 현재 메서드의 이름을 검색해와서 출력한다
         Class[] parameters = method.getParameterTypes();
         //class배열데이터타입을 적용한 parameters배열변수에 method지역변수의 getparameterTypes메서드를 
         //매개변수의 정보를 가져옴 그것을 배열에 할당함
         printParameters(parameters);
         //할당된 매개변수정보를 printParameters메서드를 통해서 매개변수의 이름정보를 가져오고 출력함
         System.out.println(")");//괄호를 닫아줌
      }         
   }
   
   private static void printParameters(Class[] parameters) {
      //외부에서는 이 메서드를 쓸수없음. 내부에서 로직의 흐름때문에 이메서드를 쓸수있음. 다시말해서 클래서내부에서는 쓸수있음.
      //외부에서는 이 메서드가 존재하는지를 모름.
      //매개변수는 class배열데이터타입이 적용된 parameters배열변수가 들어올 수 있다
      for(int i=0; i<parameters.length; i++) { //i는 0부터 parameters배열의 길이 length 보다 작을때까지.
         //배열에 저장된 파라메터의 갯수길이만큼 출력하겠다는 뜻임.
         System.out.print(parameters[i].getName()); //parameters배열의 i인덱스의 getName메서드로 이름을 검색하고
         if(i<(parameters.length-1)) { //만약에 i가 parameters의 길이에서 1을 뺀 숫자보다 작다면 
            //인덱스번호가 파라메터배열의 길이에서 1을 뺸 값보다 작다면 , 콤마를 찍어줌.
            //length-1한 값보다 작다면 아직은 출력할것이 있기 때문에 콤마로 계속 찍어줌.
            System.out.print(",");
         }
      }
   }
}
*/