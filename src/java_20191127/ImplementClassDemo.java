package java_20191127;
/**
 이 클래스는 인터페이스를 테스트 하는 클래스 입니다.
 */

public class ImplementClassDemo {

	/**
	 이 메서드는 JVM이 해출해주는 메서드 입니다.
	 */
	public static void main(String[] args) {
		java.util.Date d = new java.util.Date();
		InterA a = new ImplementClass();
		a.mA();
		a.mB();
		a.mC();
	}
	
}
