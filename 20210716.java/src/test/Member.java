package test;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
}


/*
public class Member {
private String id;
private String name;
//2���� �ʵ�
public Member(String id, String name) { //������
//�ܺο��� �� �Ű������� �ʵ带 �ʱ�ȭ������
   this.id = id;
   this.name = name;
}

@Override //������̼�
public String toString() {
   return id + ": " + name;
//���ϰ��� id�ʵ�� �߰��� : name�ʵ尡 ����Ǽ� ��µǵ���
//toString�޼����� �߰�ȣ������ �ڵ带 �ۼ��ϸ� �ȴ�. 
}
}
*/