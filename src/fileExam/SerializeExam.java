package fileExam;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeExam {

	public static void main(String[] args) {
		
		// 파일에 객체데이터를 입력하는 예제
		
		String fileName = "UserInfo.ser";
		try {
			
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 직렬화 하기위한 보조스트림, 다른 기반스트림을 필요로 한다.
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				
			UserInfo ui1 = new UserInfo("홍길동", "1234", 36);
			UserInfo ui2 = new UserInfo("김병건", "3456", 39);
			
			List<UserInfo> list = new ArrayList<UserInfo>();
			list.add(ui1);
			list.add(ui2);
			
			oos.writeObject(ui1);
			oos.writeObject(ui2);
			oos.writeObject(list);
			
			oos.close();
			System.out.println("직렬화 끝~");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
