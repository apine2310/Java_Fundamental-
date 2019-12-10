package java_20191210.Gdto;

public class GradeDto {
	private int grade;
	private int losal;
	private int hisal;
	public GradeDto(int grade, int losal, int hisal) {
		super();
		this.grade = grade;
		this.losal = losal;
		this.hisal = hisal;
	}
	public GradeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getLosal() {
		return losal;
	}
	public void setLosal(int losal) {
		this.losal = losal;
	}
	public int getHisal() {
		return hisal;
	}
	public void setHisal(int hisal) {
		this.hisal = hisal;
	}
	
	
}
