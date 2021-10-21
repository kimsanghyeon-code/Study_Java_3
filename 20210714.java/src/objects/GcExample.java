package objects;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ: ");
		System.out.println(emp.eno);
		System.gc();
	}
}

/*
package objects;
public class GcExample {
   public static void main(String[] args) {
      Employee emp; //��ü������ ������ �ϰ� employeeŬ����������Ÿ���� ������
      
      emp = new Employee(1); //��Ű����� employee �����ڸ� ���ؼ� ��ü�� ����µ� �̋� �Ű������� 1�� ���� �װ��� emp������ ����
      //����� �� ��ü�� �����Ʊ⶧����
      emp = null;      //��ü������ �ΰ��� ������ ��ü�� �ּҹ����� ���󰡹���. �׷��� ��ü�� �������� �Ǿ����
      //�ΰ��� �־ emp�� ��ü�� ȿ���� ��Ÿ��
      emp = new Employee(2);      //employee���� 2�� �Ű������� �ǰ� emp��ü������ ����ǰ� �� ����ϰ� 
      emp = new Employee(3); //employee���� 3�� �Ű������� �ǰ� emp��ü������ ����ǰ� �� ��µ�
      //���ο� ��ü���� ���鼭 emp��ü������ �Ź� ��ü�� �ּҿ� �������� ������� �Ҿ����
      
      System.out.print("emp�� ���������� �����ϴ� �����ȣ: "); //�������� ������ ����ִ� ��ü�̰� ���� ���������ϴ� �����ȣ�� ��. 
      System.out.println(emp.eno); //emp�� �����ȣ�� 3�� �����.
      System.gc();   //gc �������÷���, ����������� ���� ��ü�� �޸𸮿��� �����ϴ� ���� ��. 
      //�ڹٴ� jVM �ڹٰ���ӽ��� ������ �޸𸮸� ��Ʈ���ϴ� �ɷ��� ���������� �켱���� �����ʾƿ�.
      //C,C++ ���� �޸���Ʈ�Ѿ���� �θ��� �ڹٿ� ���� ���� ��޸���Ʈ�Ѿ���� �ؿ�. 
      //gc�޼��带 �ٷ� ����� �������� �ʰ� ����ִ� ��ü�� ��Ȱ����ü�� �ִ��� �޸������ϵ��� �������� «. jvm��. �׷��� ���� ����� �ְ� ��ٷ�����
      //jvm�� ���ؼ� ��ü�� ��¥ ������� ���� �Ҹ��ڰ� ������ ����ϰ� ��. 
   }
}

*/