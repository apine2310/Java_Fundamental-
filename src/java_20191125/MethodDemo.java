package java_20191125;

public class MethodDemo {
	public int plus(int first, int second){ //여기서 int first와 second는 [매개변수]라고 부름(Parameter)
		return first + second;
	}
	
	public double divide(int first, int second){
		return (double)first/(double)second;
	}
	
	public int[] ascending(int[] array){
		for(int i=0; i<array.length; i++){
			for (int j = 0; j < array.length - (i+1); j++) {
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public void ascending2(int[] array){
		for(int i=0; i<array.length; i++){
			for (int j = 0; j < array.length - (i+1); j++) {
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public boolean isLeafYear(int year){
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	public void print(String str){
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		
		int temp1 = md.plus(10, 20);  //여기서 10과 20은 [전달인자]라고 부름(Argument)
		
		System.out.println(temp1);
		
		double temp2 = md.divide(22, 5);
		
		System.out.println(temp2);
		
		int[] temp4 = {1,42,45,3,10,9,80,34};
		int[] tempx = {5,100,95,70,55,40,35,25};
		md.ascending2(tempx);
		int[] temp5 = md.ascending(temp4);
		
		
		for (int value : temp5){
			System.out.print(value + "\t");
		}
		System.out.println();
		
		for (int value : tempx){
			System.out.print(value + "\t");
		}
		System.out.println();
		boolean temp6 = md.isLeafYear(2020);
		if(temp6){
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}
		
		md.print("안녕 나는 고구마야!");
	}

}
