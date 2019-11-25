package Java_20191121;

import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		//1. 배열 선언
		int[] a = new int[4];
		
		//2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		//3. 배열의 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//배열 생성과 할당을 동시에 설정
		int[] b = {1,2,3,4};
		int[] c = new int[]{1,2,3,4,5,6,7,8};
		
		//enhanced for loop
		for(int temp :b){
			System.out.println(temp);
		}
		for (int i : c) {
			System.out.println(i);
		}
	}

}
