package java_20191126.step4;

public class StopWatchDemo {
	public static void execute(StopNanoWatch s){
		s.start();
		for (long i = 0; i < 5_000_000_000l; i++) {
			
		}
		s.stop();
		double elapsedTime = s.getElaspsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	
	public static void execute(StopMilliWatch s){
		s.start();
		for (long i = 0; i < 5_000_000_000l; i++) {
			
		}
		s.stop();
		double elapsedTime = s.getElaspsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	
	public static void main(String[] args) {
		//StopNanoWatch s = new StopNanoWatch();
		StopMilliWatch s1 = new StopMilliWatch();
		execute(s1);
		
		//
	}

}
