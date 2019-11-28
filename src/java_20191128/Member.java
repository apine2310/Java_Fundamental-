package java_20191128;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super(); // 부모의 디폴트 생성자를 호출(영향은 없음)
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
