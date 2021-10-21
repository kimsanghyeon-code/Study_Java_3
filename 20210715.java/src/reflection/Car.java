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
   //2개의 필드가 존재함
   
   public Car() { //객체만 생성됨
   }
   
   public Car(String model) { //생성자로서 매개변수로 모델이 들어오면 필드를 채우는 형태임
      this.model = model;
   }
   
   public void setModel(String model) { //셋모델 세터메서드로 매개변수를 넣으면 private접근자를 쓰지만 객체의 필드에 데이터를 저장할수있다.
      this.model = model;
   }
   
   public String getModel() { //겟모델은 게터메서드기 떄문에 모델의 정보를 가져올수있음
      return model;
   }
   
   private void setOwner(String owner) { //셋오너는 세터메서드로 매개변수를 넣으면 데이터를 쓸수가 있음. 
      this.owner = owner;
   }
   
   public String getOwner() { //겟오너는 게터메서드로 필드값을 리턴할수있음
      return owner;
   }
 }
*/