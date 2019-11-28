package java_20191127.step1;

public class FootStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime(){
		return (double)(endTime - startTime) / (double)1000;
	}
	
	public double getElapsedNanoTime(){
		return (double)(endNanoTime - startNanoTime) / (double)1000000000;
	}
	
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis();
		//f.startNanoTime = System.nanoTime();
		for (long i = 0; i < 5000000000l; i++) {
			
		}
		f.endTime = System.currentTimeMillis();
		//f.endNanoTime = System.nanoTime();
		double elapsedTime = f.getElapsedNanoTime();
		System.out.printf("경과시간 : %.3f %n", elapsedTime);

	}

}
