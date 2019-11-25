package java_20191122.bb;

import java_20191122.aa.Notice;
//서로 다른 패키지의 클래스를 사용하기 위해서는 반드시 import 해줘야 한다.
public class NoticeDemo2 extends Notice{
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		//n.title = "title";
		//n.hit = 100;
		//n.regdate = "2019-11-22";
		
		NoticeDemo2 N = new NoticeDemo2();
		N.number = 10;
		N.title = "title";
		//N.hit = 100;
		//3N.regdate = "2019-11-22";
	}
}
