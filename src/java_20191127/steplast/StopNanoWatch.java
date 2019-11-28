package java_20191127.steplast;

public class StopNanoWatch extends StopWatch {
	private void start() {
		setStartTime(System.nanoTime());
	}

	private void end() {
		setEndTime(System.nanoTime());
	}

	public void run() {
		start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		end();

		System.out.printf("결과시간 : %.6f\n", ((double) getEndTime() - getStartTime()) / (double) 1000000000);
	}
}
