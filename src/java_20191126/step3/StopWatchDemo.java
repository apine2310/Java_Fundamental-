package java_20191126.step3;

public class StopWatchDemo {

	public static void main(String[] args) {
		StopMilliWatch s = new StopMilliWatch();
		s.start();
		for (long i = 0; i < 5_000_000_000l; i++) {
			
		}
		s.stop();
		double elapsedTime = s.getElaspsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
