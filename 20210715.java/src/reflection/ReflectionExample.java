package reflection;

import java.lang.reflect.*;

public class ReflectionExample {
   public static void main(String[] args) throws Exception {
      Class clazz = Class.forName("reflection.Car");
      
      System.out.println("[Ŭ���� �̸�]");
      System.out.println(clazz.getName());
      System.out.println();      
      
      System.out.println("[������ ����]");
      Constructor[] constructors = clazz.getDeclaredConstructors();
      for(Constructor constructor : constructors) {
         System.out.print(constructor.getName() + "(");
         Class[] parameters = constructor.getParameterTypes();
         printParameters(parameters);
         System.out.println(")");
      }      
      System.out.println();
      
      System.out.println("[�ʵ� ����]");
      Field[] fields = clazz.getDeclaredFields();
      for(Field field : fields) {
         System.out.println(field.getType().getSimpleName() + " " + field.getName());
      }
      System.out.println();
      
      System.out.println("[�޼ҵ� ����]");
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

public class ReflectionExample { //Ŭ������ ������� ������ ������ �� �ִ� ���� ���÷����� ������
   public static void main(String[] args) throws Exception {
      Class clazz = Class.forName("reflection.Car");//�����Ӹ޼��带 ���ؼ� Ŭ������ ���� ��Ű����θ� ���� �ش�Ŭ������ ��ü�����ؼ� clazz��ü������ �Ҵ�
      
      System.out.println("[Ŭ���� �̸�]");
      System.out.println(clazz.getName()); //clazz��ü�������� getName�޼��带 ���ؼ� �̸������� ������
      System.out.println();      
      
      System.out.println("[������ ����]");
      Constructor[] constructors = clazz.getDeclaredConstructors();//�����ڹ迭������Ÿ���� ������ constructors�迭������ 
      //clazz��ü�������� getDelcaredConstructors�޼��带 ���ؼ� ������ �����͸� �����ؼ� constructors�迭�� �Ҵ��Ѵ�
      for(Constructor constructor : constructors) { //for������ Constructor������Ÿ������� constructor���������� constructors for���Ű��������� 
         //�迭�����͸� �ϳ��� �̾ƿ�
         System.out.print(constructor.getName() + "(");
         //�Ѱ��� �迭�����͸� ���� constructor��ü������ getName�޼��带 �۵���Ų��
         //�����ڿ��� �Ű������� �ִµ�.
         //�Ű������� ������ �ϼ������� ��ȣ���� �� ���� ǥ���ϰ� 
         //������ �����ε��� ��쿡 �پ��� �Ű������� ������ �� �����ϱ�. ��ȣ���µ����� ǥ���ϰ� 
         Class[] parameters = constructor.getParameterTypes(); //Class������Ÿ�� �迭�� ������Ÿ���� ������ parameters�迭������ 
         //constructor�Ű������� getParameterTypes�޼��� �Ű�����Ÿ���� �����ؿ���, �װ��� parameters�Ű������� ������ ��
         printParameters(parameters); //�Ķ���͸� �������. �ִٸ�. 
         System.out.println(")"); //��ȣ�� �ݾ��ְ�
         //for���̴ϱ�. �����ڰ� �ִ� ��ŭ �� �������
      }      
      System.out.println();
      
      System.out.println("[�ʵ� ����]");
      Field[] fields = clazz.getDeclaredFields();//�ʵ�迭������Ÿ���� ������ fields�迭������ clazz��ü������ getDeclaredFields�޼��带 �����ϰ�
      //������ ����� fields�迭�� �Ҵ��Ѵ�
      for(Field field : fields) { //for������ fields�Ķ���Ϳ��� �Ѱ��� �����͸� �̾� field for�� ���������ȿ� �Ҵ���
         System.out.println(field.getType().getSimpleName() + " " + field.getName());
         //getType�޼��忡 getSimpleName �̰Ͷ����� String�� ��µ� 
         //�����ϳ��־���
         //field.getName �ʵ� ���������� �̸��� ���Ͻ�����
      }
      System.out.println();
      
      System.out.println("[�޼ҵ� ����]");
      Method[] methods = clazz.getDeclaredMethods(); //Method�迭������Ÿ���� ������ methods�迭������ clazz��ü�������� getDeclaredMethods�޼��带
      //�۵����Ѽ� �޼��������� �������� methods�迭�� �Ҵ��Ѵ�
      for(Method method : methods) {
         //for������ clazz�� ������ �޼����� �������� �����
         //methods�Ű��������� method ���������� �Ѱ��� ������������
         System.out.print(method.getName() + "("); //method���������� ���� �޼����� �̸��� �˻��ؿͼ� ����Ѵ�
         Class[] parameters = method.getParameterTypes();
         //class�迭������Ÿ���� ������ parameters�迭������ method���������� getparameterTypes�޼��带 
         //�Ű������� ������ ������ �װ��� �迭�� �Ҵ���
         printParameters(parameters);
         //�Ҵ�� �Ű����������� printParameters�޼��带 ���ؼ� �Ű������� �̸������� �������� �����
         System.out.println(")");//��ȣ�� �ݾ���
      }         
   }
   
   private static void printParameters(Class[] parameters) {
      //�ܺο����� �� �޼��带 ��������. ���ο��� ������ �帧������ �̸޼��带 ��������. �ٽø��ؼ� Ŭ�������ο����� ��������.
      //�ܺο����� �� �޼��尡 �����ϴ����� ��.
      //�Ű������� class�迭������Ÿ���� ����� parameters�迭������ ���� �� �ִ�
      for(int i=0; i<parameters.length; i++) { //i�� 0���� parameters�迭�� ���� length ���� ����������.
         //�迭�� ����� �Ķ������ �������̸�ŭ ����ϰڴٴ� ����.
         System.out.print(parameters[i].getName()); //parameters�迭�� i�ε����� getName�޼���� �̸��� �˻��ϰ�
         if(i<(parameters.length-1)) { //���࿡ i�� parameters�� ���̿��� 1�� �� ���ں��� �۴ٸ� 
            //�ε�����ȣ�� �Ķ���͹迭�� ���̿��� 1�� �A ������ �۴ٸ� , �޸��� �����.
            //length-1�� ������ �۴ٸ� ������ ����Ұ��� �ֱ� ������ �޸��� ��� �����.
            System.out.print(",");
         }
      }
   }
}
*/