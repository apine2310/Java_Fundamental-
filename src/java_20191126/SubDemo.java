package java_20191126;

public class SubDemo {
	public SubDemo(){
		super();
	}
	
	public static void main(String[] args) {
		Sub s1 = new Sub();
		int money = 500;
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");

		s1.money = 10000;
		s1.chicken = "교촌치킨 2마리";
	}

}
