package java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b = 20;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		d = b / a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a=10;
		b=20;
		
		boolean isSuccess = false;
		isSuccess = a>b;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess);
	
		isSuccess = a>=b;
		System.out.println(isSuccess);
		
		isSuccess = a<=b;
		System.out.println(isSuccess);
		
		isSuccess = a==b;
		System.out.println(isSuccess);
		
		isSuccess = a!=b;
		System.out.println(isSuccess);
		
		System.out.println(a);
		System.out.println(b);
		isSuccess = (a==b) && (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		isSuccess = (a==b) || (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
