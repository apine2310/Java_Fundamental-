package java_20191119;

public class IfDemo {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		// Run - Configurations - Arguments - Program argument
		// java java_20191119.IfDemo 12(args[0]) 1998(args[1])
		String season = null;
		if(month>=1 & month<=12){
			if(month<=2 || month ==12){
				season ="겨울";
			}else if(month<=5){
				season ="봄";
			}else if(month<=8){
				season ="여름";
			}else{
				season ="가을";
			}
		}
		else{
			season ="없는 계절";
		}
		System.out.println(month + "월은 " + season + "입니다.");
	}
}
