package java_20191126;

public class ChildDemo {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.age = 55;
		p1.work();
		p1.playBadook();
		
		Child c1 = new Child();
		c1.age = 25;
		c1.height = 155.24;
		c1.playBadook();
		c1.playGame();
		c1.work(); //부모,자식 오버라이딩된 메소드는 가까운 자식껄로 호출
	}

}