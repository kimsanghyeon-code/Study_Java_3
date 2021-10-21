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
//2개의 필드
public Member(String id, String name) { //생성자
//외부에서 온 매개변수가 필드를 초기화시켜줌
   this.id = id;
   this.name = name;
}

@Override //어노테이션
public String toString() {
   return id + ": " + name;
//리턴값을 id필드와 중간에 : name필드가 연결되서 출력되도록
//toString메서드의 중괄호안쪽의 코드를 작성하면 된다. 
}
}
*/