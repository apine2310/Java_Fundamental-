package Java_20191121;

public class LotteryDemo {
	public static void main(String[] args) {
		//Math.random(); => 0보다 크거나 같고 1보다 작은 임의의 double 값을 반환
		int[] lotto = {0,0,0,0,0,0};
		double random;
		
		for(int i=0; i<lotto.length; i++){
			random = Math.random();
			int temp = (int)(random * 45) + 1;
			lotto[i] = temp;
			for(int j=0; j<i; j++){
				if(temp==lotto[j]){
					i--;
					break;
				}
			}
		}	
		for (int i : lotto) {
			System.out.print(i + "\t");
		}
	}
}