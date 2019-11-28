package java_20191127;

//인터페이스간 상속은 다중 상속이 가능하다.
public interface InterA extends InterB, InterC{
	//인터페이스 변수는 public static final 생략가능
	//public static final PI =3.14;  //default값이 아니다!
	double PI = 3.14;
		
	//public abstract 생략가능
	//public abstract void mA();
	void mA();
	void mB();
	void mC();
}
