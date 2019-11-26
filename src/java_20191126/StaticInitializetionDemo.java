package java_20191126;

// I18N => '국제화'를 말하는거임 (Internationalization)
// L10N => '지역화' (Localization
public class StaticInitializetionDemo {
	int age;
	static String title;
	static{
		System.out.println("static block");
		title = "모기지론";
	}
	//생성자의 접근 한정자는 객체 생성과 관련있다.
	public StaticInitializetionDemo(int age){
		this.age = age;
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new StaticInitializetionDemo(10);
	}

}
