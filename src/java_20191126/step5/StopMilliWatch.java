package java_20191126.step5;

public class StopMilliWatch extends StopWatch {
	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public double getElaspsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public void run() {
		start();
		for (long i = 0; i < 5_000_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElaspsedTime();
		System.out.printf("경과시간 : %.3f\n", elapsedTime);
	}
}
