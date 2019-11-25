package Homework;

public class Homework2 {
	public static void main(String[] args) {

		// 문자 reverse 하기
		// 1. input "abcd" => "dcba"
		// 2. input "abcde" => "edcba"

		String input = "abcdefg";
		char[] ch = input.toCharArray(); // 스트링문자열을 문자배열!로 바꾸는 함수
		char temp;

		for (int i = 0; i < ch.length / 2; i++) {
			temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		System.out.println(ch);

		// 1 ~ 100 까지 소수를 구하시오.
		// 1번 풀이법
		int i, j;
		for (i = 2; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j)
				System.out.printf("%d ", i);
		}
		System.out.println();

		// 2번 풀이법

		boolean[] ary = new boolean[101];

		for (int k = 2; k <= 100; k++) {
			if (ary[k] == false) {
				System.out.printf("%d ", k);
				for (int k2 = 1; k * k2 <= 100; k2++) {
					ary[k*k2] = true;
				}
			}
		}
		System.out.println();

	}
}
