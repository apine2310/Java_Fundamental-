package java_20191126;

public class CallbyRefDemo {
	public static void change(int i, int[] j){
		i = 20;
		j[3] = 400;
	}
	public static void main(String[] args) {
		int a = 10;
		int b[] = {1,2,3,4};
		
		System.out.println(a);
		System.out.println(b[3]);
		
		change(a, b);
		//CallbyRefDemo.change(a,b);
		
		System.out.println(a);
		System.out.println(b[3]);
		
		int[] c;
		c = new int[4];
		
		int[] d = null;
		System.out.println(d);
		d = new int[4];
		
		int age=0;
		int t = age + 20;
		System.out.println(age);
		age = 10;
	}

}
