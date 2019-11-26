package java_20191126.step5;

public abstract class StopWatch {
	long startTime;
	long endTime;
	public abstract void run();
	
	/*public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElaspsedTime() {
		return (double) (endTime - startTime) / 1000000000;
	}*/
	
}
