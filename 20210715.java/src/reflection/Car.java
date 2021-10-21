package reflection;

public class Car {
	private String model;
	public String owner;
	
	public Car() {
	}
	
	public Car(String model) {
		this.model = model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	private void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
}


/*
package reflection;

public class Car {
   private String model;
   public String owner;
   //2���� �ʵ尡 ������
   
   public Car() { //��ü�� ������
   }
   
   public Car(String model) { //�����ڷμ� �Ű������� ���� ������ �ʵ带 ä��� ������
      this.model = model;
   }
   
   public void setModel(String model) { //�¸� ���͸޼���� �Ű������� ������ private�����ڸ� ������ ��ü�� �ʵ忡 �����͸� �����Ҽ��ִ�.
      this.model = model;
   }
   
   public String getModel() { //�ٸ��� ���͸޼���� ������ ���� ������ �����ü�����
      return model;
   }
   
   private void setOwner(String owner) { //�¿��ʴ� ���͸޼���� �Ű������� ������ �����͸� ������ ����. 
      this.owner = owner;
   }
   
   public String getOwner() { //�ٿ��ʴ� ���͸޼���� �ʵ尪�� �����Ҽ�����
      return owner;
   }
 }
*/