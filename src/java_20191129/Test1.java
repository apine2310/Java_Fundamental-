package java_20191129;
	
import java.util.ArrayList;
	
public class Test1 {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 데이터(객체)의 중복을 허용한다.
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"terra",2500));
		list.add(new Product(2,"신라면",1000));
		list.add(new Product(3,"서울우유",3000));
		//ArrayList list2 = new ArrayList();
		
		/*
		for (int i = 0; i < list.size(); i++) {
			//Product temp = list.get(i); //제네릭<Product>을 이용하면 캐스팅을 안해도된다.
			//System.out.println(temp);
			System.out.println(list.get(i));
		}
		*/
		//모두 삭제 => list.remove(int index)
		/*
		for (int i = 0; i < list.size(); i++) {
			list.remove(i--);
		}
		*/
		//enhanced for loop 출력가능(제너릭으로 선언한 경우만 가능)
		for (Product temp : list) {
			System.out.println(temp.number);
			System.out.println(temp.name);
			System.out.println(temp.price);
		}
		
		/*for (Product temp : (Product) list2) {
			System.out.println(temp);
		}*/
	}
}	
	
	
class Product{
	int number;
	String name;
	double price;
	Product(int number, String name, double price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
	
}	