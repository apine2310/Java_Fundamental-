package java_20191126.step5;

public class StopNanoWatch extends StopWatch {
	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}

	public void run() {
		start();
		for (long i = 0; i < 5_000_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElaspsedTime();
		System.out.printf("경과시간 : %.9f\n", elapsedTime);
	}
}
