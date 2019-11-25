package Java_20191121;

public class ArrayCopyDemo {

	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "watermelon", "peach"};
		
		String[] temp = new String[6];
		
		System.arraycopy(fruits, 0, temp, 2, 4);
		
		temp[0]="blueberry";
		temp[1]="rasberry";
		
		/*for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println();*/
		
		for (String fruit : temp) {
			System.out.println(fruit);
		}
		
		String[] ref = fruits;
		ref[0] = "jobs";
		//원본 손상됨
		
		System.out.println();
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}		
		
		String[] ref2 = ref;
		ref[0] = "goods";
		
		System.out.println();
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		int[] c = b;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println();
	
	}

}
