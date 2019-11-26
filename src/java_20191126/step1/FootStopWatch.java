package java_20191126.step1;
//1. 요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요...
//2. 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요... 제발...
public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElaspsedMilliTime(){
		return (double)(endTime-startTime)/1000;
	}
	
	public static void main(String[] args){
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 3_000_000_000l; i++) {
			
		}
		
		f.endTime = System.currentTimeMillis();
		
		double elapsedTime = f.getElaspsedMilliTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
