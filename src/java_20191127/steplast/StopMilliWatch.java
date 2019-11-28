package java_20191127.steplast;

public class StopMilliWatch extends StopWatch {
	private void start() {
		setStartTime(System.currentTimeMillis());
	}

	private void end() {
		setEndTime(System.currentTimeMillis());
	}

	public void run() {
		start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		end();

		System.out.printf("결과시간 : %.3f\n", ((double) getEndTime() - getStartTime()) / (double) 1000);
	}
}
