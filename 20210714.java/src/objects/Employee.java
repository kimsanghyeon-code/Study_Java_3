package objects;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")�� �޸𸮿� ������");
	}
	
	public void finalize() {
		System.out.println("Employee(" + eno + ")�� �޸𸮿��� ���ŵ�");
	}
}


/*
package objects;

public class Employee {
   public int eno;   //�����ȣ�� �ʵ�� �ΰ�
   
   public Employee(int eno) { //�����ڴ� ��ü�� �ʵ带 �ʱ�ȭ��
      this.eno = eno;
      System.out.println("Employee(" + eno + ") �� �޸𸮿� ������"); //�������� �ʵ��ʱ�ȭ�� �ߴµ�,
      //��ü�������� ���ؼ� �ľ��������� println�޼��嵵 ����� �ǰ���
   }

   public void finalize() { //���̳ζ�����޼��尡 ��Ÿ��
      System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
   }
}

*/