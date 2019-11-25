package java_20191119;

import java.util.Scanner;

public class SsnDemoUp {

	public static void main(String[] args) {
		int number[] = new int[13];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<13; i++){
			number[i] = scan.nextInt();
		}
		int temp=0;
		//1. 각 자리수를 2부터 9까지 곱하고 다시 2-5까지 곱해서 합을 구함
		int sum = 0;
		
		//2. 총합을 11로 나눈 나머지를 구한다.
		sum = number[0]*2 + number[1]*3 + number[2]*4 + number[3]*5 + number[4]*6 + number[5]*7 + number[6]*8 + number[7]*9 + number[8]*2 + number[9]*3 + number[10]*4 + number[11]*5;
		sum %=11;
		//3. 11에서 나머지를 뺀다.
		temp=11-sum;
		//4. 3의 결과를 다시 10으로 나눈 나머지를 구한다.
		temp %=10;
		//5. 4의 결과와 맨 마지막 숫자가 같으면 "정상적인 주민번호"
		System.out.println(temp);
		if(temp==number[12]){
			System.out.println("정상적인 주민번호");
		}
		else{
			System.out.println("비정상적인 주민번호");
		}
	}

}
