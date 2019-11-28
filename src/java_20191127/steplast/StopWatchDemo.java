package java_20191127.steplast;

public class StopWatchDemo {
	public void execute(StopWatch s) {
		s.run();
	}

	public static void main(String[] args) throws Exception{
		String input = args[0];
		String className = "java_20191127.step6." + input;
		StopWatch s = (StopWatch)Class.forName(className).newInstance();
		
		StopWatchDemo swd = new StopWatchDemo();
		swd.execute(s);
		
		/*StopMilliWatch f = new StopMilliWatch();
		execute(f);
		StopNanoWatch n = new StopNanoWatch();
		execute(n);
		StopMicroWatch m = new StopMicroWatch();
		execute(m);*/
	}

}
