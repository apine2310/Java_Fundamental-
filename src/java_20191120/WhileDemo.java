package java_20191120;

public class WhileDemo {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1; //초기값 바깥에 선언!
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.printf("1부터 100까지 합은 %,d 입니다.", sum);
		System.out.println();
		
		int first = 2;
		
		while (first <= 9) {
			
			int second = 1;
			while(second <= 9){
				System.out.printf("%d*%d=%2d ", first, second, first*second);
				second++;
			}
			first++;
			System.out.println();
			
		}
	}

}
