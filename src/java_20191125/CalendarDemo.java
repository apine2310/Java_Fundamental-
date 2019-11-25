package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	int day;
	int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int totalcount;
	public void set(int y, int m, int d){
		year=y;
		month=m;
		day=d;
		
	}
	
	public void getTotalCount(){
		int yoonday = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		int mulyear = 0;
		int addmonth = 0;
		int totalday1 = 0;
		
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		if (isLeafYear) {
			monthArray[1] = 29;
		}

		mulyear = (year - 1) * 365;

		for (int i = 0; i < month - 1; i++) {
			addmonth += monthArray[i];
		}
		totalcount = yoonday + mulyear + addmonth + day;
		totalcount %= 7;
		System.out.printf("요일 구하는 숫자 %d\n\n", totalcount);
	}
	
	public void print(){
		String message = null;
		switch (totalcount % 7) {
		case 1:
			message = "월요일";
			break;
		case 2:
			message = "화요일";
			break;
		case 3:
			message = "수요일";
			break;
		case 4:
			message = "목요일";
			break;
		case 5:
			message = "금요일";
			break;
		case 6:
			message = "토요일";
			break;
		default:
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다.\n\n", year, month, day, message);
	}
	
	public static void main(String[] args){
		CalendarDemo c = new CalendarDemo();
		c.set(2019,12,25);
		c.getTotalCount();
		c.print();
	}
}
