package java_20191119;

public class CharLiteralDemo {

	public static void main(String[] args) {
		//1. 유니코드 표현 => '\u0000'
		char c1 = '\uCD5C';
		char c2 = '\uC77C';
		char c3 = '\uC1A1';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//2. 아스키코드 표현
		// 48~57 : 0~9
		// 65~90 : A~Z
		// 97~122 : a~z
		
		char c4 = 65;
		System.out.println(c4);
		
		//3. 문자 표현 => ''
		char c5 = 'I';
		char c6 = '성';
		System.out.println(c5);
		System.out.println(c6);
		
		//4. escape char
		// \n => line feed
		// \t => tab
		
		// \\ => \
		// \" => "
		// \' => '
		
		System.out.println("Hello\n"+"World");
		System.out.println("Hello\t"+"World");
		System.out.println("Hello\\"+"World");
		System.out.println("Hello\""+"World");
		System.out.println("Hello\'"+"World");
		
		String path = "C:\\dev\\eclipse-jee-mars-R-win32-x86_64";
		System.out.println(path);
		String path2 = "C:\\dev\\\"eclipse-jee-mars-R-win32-x86_64\"";
		System.out.println(path2);
	}
	

}
