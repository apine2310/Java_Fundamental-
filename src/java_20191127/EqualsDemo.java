package java_20191127;

class Car{
	String modelNumber;
	String color;
	Car(String modelNumber, String color){
		this.modelNumber = modelNumber;
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + "]";
	}
	
}

public class EqualsDemo {
	public static void main(String[] args) {
		Car c1 = new Car("000001", "black");
		Car c2 = new Car("000001", "black");
		//Car c3 = new Car("000001", "black");
		//Car c2 = c1;
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		//System.out.println(c3.hashCode());
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1);
		System.out.println(c1.toString());
		String s = new String("hello");
		System.out.println(s); // 오버라이딩 되어있는거임. String(문자열)이면 폴더이름 말고 문자열이 출력됨
		
	//	int a = "10";
		int a = Integer.parseInt("10");
		Integer a1 = new Integer(10);
		int a4 = a1;
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a4);

		
	}
	
}
