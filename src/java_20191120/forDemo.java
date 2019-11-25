package java_20191120;

public class forDemo {

	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%s, %d, %d, %.1f \n%n", str, a1, a2, d1);
		System.out.println(str + ", " + a1 + ", " + a2 + ", " + d1);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.printf("1부터 100까지 짝수의 합은 %d 입니다. \n\n", sum);

		sum = 0;
		long start = System.currentTimeMillis();
		for (int i = 1; i < 2_000_000_000; i++) {
			sum += i;
		}

		long end = System.currentTimeMillis();
		System.out.printf("경과 시간 : %.3f초\n", (double) (end - start) / 1000);

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 5; j++) {

				System.out.printf("%d*%d=%2d\t", j, i, j * i);

			}
			System.out.println();

		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {

			for (int j = 6; j <= 9; j++) {

				System.out.printf("%d*%d=%2d\t", j, i, j * i);

			}
			System.out.println();

		}
		
		System.out.println();
		for (int i = 9; i >= 1; i--) {

			for (int j = 1; j <= 9; j++) {

				System.out.printf("%d*%d=%2d\t", i, j, i*j);

			}
			System.out.println();

		}
	}

}
