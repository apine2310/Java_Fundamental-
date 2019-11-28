package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//자바 1.4이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에
		//primitive data type을 객체화 할 수 있는 Wrapper class로 변환하여 저장해야 한다.
		list.add(new Integer(1));
		list.add(new Integer(2));
		
		Integer i1 = (Integer)list.get(0);
		Integer i2 = (Integer)list.get(1);
		
		int a = i1.intValue() + i2.intValue();
		System.out.println();
		
		//java 1.5 or java5.0 이후
		ArrayList list1 = new ArrayList();
		list1.add(1); //auto-boxing
		list1.add(2); //auto-boxing
		
		Integer i3 = (Integer)list1.get(0);
		Integer i4 = (Integer)list1.get(1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.add(1); //auto-boxing
		list1.add(2); //auto-boxing
		
		Integer i5 = list2.get(0);
		Integer i6 = list2.get(1);
		
		int b = i3 + i4;
		
		String str = 10 + "";
		//String str = String.valueOf(10);
		
		//문자열을 int로 바꿀때
		int d = Integer.parseInt("100");
	}

}
