package java_20191126;

public class Child extends Parent{
	double height = 170.23;
	//overrding : 부모의 메서드를 재정의
	//1. 메서드 이름, 매개변수, 반환형 일치
	//2. 접근 한정자는 부모보다 자식이 상위ㅣ거나 같으면 됨
	public void work(){
		//super.work();
		System.out.println("Child work()");
	}
	public void playGame(){
		System.out.println("Child playGame()");
	}
}
