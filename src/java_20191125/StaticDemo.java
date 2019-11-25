package java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	public void m1(){
		name = "sung";
		age = 10;
		m2();
	}
	public void m2(){
		System.out.println("Instance method m2()");
	}
	public static void m3(){
		name = "sung";
		//age = 10;
		//m2();
		m4();
		StaticDemo sd = new StaticDemo();
		sd.age=10;
		sd.m2();
	}
	public static void m4(){
		System.out.println("static method m4()");
	}
}
