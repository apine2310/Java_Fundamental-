package java_20191210;

public class MemoryLoad {
	public static String name;
	static{
		name ="성영한";
		System.out.println(name);
	}
	public static void run(){
		System.out.println("Test1");
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("java_20191210.MemoryLoad");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
