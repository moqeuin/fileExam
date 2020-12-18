package fileExam;

import java.io.Serializable;

public class UserInfo implements Serializable{
	
	// Serializable를 구현하면 이 객체를 직렬화시킬 수 있고 자바에서 입출력 데이터로 이용할 수 있다.
	// *객체데이터는 메모리 상에서 인스턴스 변수들만 저장이 되어 있고 인스턴스 메서드는 저장을 하지 않는다.
	// 공통된 코드의 내용이기에 저장할 필요가 없고 별도의 데이터를 갖어야하는 인스턴스변수만 저장이 된다.
	
	
	String name;
	String password;
	int age;
	
	public UserInfo() {
		
	}

	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public String toString() {
		return "(name : " + name + " password : " + password + " age : " + age + ")";
	}
	
}
