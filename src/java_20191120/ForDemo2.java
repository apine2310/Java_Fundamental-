package java_20191120;

public class ForDemo2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i >= j) {
					System.out.printf("* ");
				} else {
					System.out.printf("  ");
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= j) {
					System.out.printf("* ");
				} else {
					System.out.printf("  ");
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i-1; j++) {
				System.out.printf("  ");
			}
			for (int j2 = 0; j2<i*2-1; j2++){
				System.out.printf("* ");
			}
			System.out.println();
		}
		
		
		/*
		 * int N, i, j, center; 


int main(int argc, char *argv[]) {
	scanf("%d", &N);
	center=N;
	
	for(i=1; i<=N; i++){
		for(j=1; j<2*N+1; j++){
			if(j>(center-i) && j<(center+i)){
				printf("*");
			}
			else if(j>=(center+i)){
				break;
			}
			else{
				printf(" ");
			}
		}
		printf("\n"); 
	}
	
	for(i=2; i<=N; i++){
		for(j=1; j<2*N+1; j++){
			if(j<i){
				printf(" ");
			}
			else if(j>(2*N-i)){
				break;
			}
			else{
				printf("*");
			}
		}
		printf("\n");
	}
	
	
	return 0;
}
		 * 
		 */


	}

}
