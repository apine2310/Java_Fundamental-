package Java_20191121;

public class Test {

	public static void main(String[] args) {
		int[][] ary = new int[3][3];
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				ary[i][j]=i+j;
			}
		}
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.println(ary[i][j]);
			}
		}
	}

}
