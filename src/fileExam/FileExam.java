package fileExam;

import java.io.File;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args) {
		
		// 스트림은 파일의 데이터를 다루지만 파일객체는 파일자체를 다루는 객체이다.
		
		// 지정경로나 지정한 파일명(실행중인 경로에 찾음)의 파일의 인스턴스를 생성한다.
		// 인스턴스 생성시 파일은 생성되지않는다. 출력스트림이나 createFile메서드를 사용해서 생성해야한다.
		File f = new File("C:\\project\\FilePathExam\\AbstractExam.java");
		String fileName = f.getName();
		int pos = f.getName().indexOf(".");
		
		System.out.println("경로를 제외한 파일이름 : " + f.getName());
		// AbstractExam.java
		
		System.out.println("확장자를 제외한 파일이름 : " + fileName.substring(0, pos) );
		// AbstractExam
		
		System.out.println("확장자명 : " + fileName.substring(pos+1));
		// java
		
		
		System.out.println("경로를 포함한 파일이름 : " + f.getPath());
		// C:\project\FilePathExam\AbstractExam.java
		
		System.out.println("파일의 절대경로 : " + f.getAbsolutePath());
		// C:\project\FilePathExam\AbstractExam.java
		
		try {
			System.out.println("파일의 정규경로 : " + f.getCanonicalPath());
			// 현재경로나 상위경로를 표현하는 .과 ..을 포함하지 않는 유일한 경로, .과 ..은 정규경로에서는 사용할 수 없다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일이 속해있는 디렉토리 : " + f.getParent());
		// C:\project\FilePathExam
		
		System.out.println(File.separator);
		// \, 이름 구분자(문자열)
		
		System.out.println(File.separatorChar);
		// \, 이름 구분자(문자)
		
		System.out.println(File.pathSeparator);
		// ;, 경로 구분자
		System.out.println(File.pathSeparatorChar);
		// ;, 경로 구분자
		
		System.out.println(System.getProperty("user.dir"));
		//현재 실행중인 디렉토리, C:\project\first\java5\fileExam
		System.out.println(System.getProperty("sun.boot.class.path"));
		
		/*
		 C:\Program Files\Java\jre1.8.0_251\lib\resources.jar;C:\Program Files\Java\jre1.8.0_251\lib\rt.jar;
		 C:\Program Files\Java\jre1.8.0_251\lib\sunrsasign.jar;C:\Program Files\Java\jre1.8.0_251\lib\jsse.jar;
		 C:\Program Files\Java\jre1.8.0_251\lib\jce.jar;C:\Program Files\Java\jre1.8.0_251\lib\charsets.jar;
		 C:\Program Files\Java\jre1.8.0_251\lib\jfr.jar;C:\Program Files\Java\jre1.8.0_251\classes 
		 
		 */
	}

}