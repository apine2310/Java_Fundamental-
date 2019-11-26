package java_20191126.step1;
//1. 요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요...
//2. 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요... 제발...
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	public double getElaspsedMilliTime(){
		return (double)(endTime-startTime)/1000;
	}
	
	public double getElaspsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/1000000000;
	}
	
	public static void main(String[] args){
		FootNanoStopWatch f = new FootNanoStopWatch();
		f.startNanoTime = System.nanoTime();
		
		for (int i = 0; i < 2_000_000_000; i++) {
			
		}
		
		f.endNanoTime = System.nanoTime();
		
		double elapsedTime = f.getElaspsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
