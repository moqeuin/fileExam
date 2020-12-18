package fileExam;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeReverseExam {

	public static void main(String[] args) {
		
		// 역직렬화 입력 예제
		
		String fileName = "UserInfo.ser";
		try {
			FileInputStream fs = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fs);
			
			// 역직렬화을 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(bis);

			// 순서대로 객체데이터를 가져오기 때문에 객체의 자료형을 확인할 코드가 필요하다.
			UserInfo ui1 = (UserInfo)ois.readObject();
			UserInfo ui2 = (UserInfo)ois.readObject(); 
			//UserInfo ui3 = (UserInfo)ois.readObject(); classCast예외 발생 
			
			@SuppressWarnings("unchecked")
			List<UserInfo> list = (ArrayList<UserInfo>)ois.readObject(); 
			
			System.out.println(ui1.toString());
			// (name : 홍길동 password : 1234 age : 36)
			System.out.println(ui2.toString());
			// (name : 김병건 password : 3456 age : 39)
			System.out.println(list);
			//[(name : 홍길동 password : 1234 age : 36), (name : 김병건 password : 3456 age : 39)]
			
			ois.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}