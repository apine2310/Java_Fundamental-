package Java_20191121;

public class DayofWeek {

	public static void main(String[] args) {
		// 블록 씌우고 ctrl + shift + / 주석처리

		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 1년 365일, 윤년 366일 (2월29일) 3. 윤년은 4년마다 발생하고
		 * 그 중에서 100의 배수는 제외하고 400의 배수는 제외하지 않는다. 4. 2019년 12월 25일은 무슨 요일일까?
		 */

		int year = 2020; //2018
		int month = 2;  //2
		int day = 25;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int yoonday = (year-1)/4 - (year-1)/100 + (year-1)/400;
		int mulyear = 0;
		int addmonth = 0;
		int totalday = 0;
		String message = null;
		
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		
		mulyear = (year - 1) * 365;

		for (int i = 0; i < month - 1; i++) {
			addmonth += monthArray[i];
		}
		//totalday = yoonday + mulyear + addmonth + day;
		totalday = yoonday + mulyear + addmonth + 1;
		totalday %= 7;
		System.out.printf("%d\n\n", totalday);

		
		/*
		 * switch (totalday % 7) { case 1: message = "월요일"; break; case 2:
		 * message = "화요일"; break; case 3: message = "수요일"; break; case 4:
		 * message = "목요일"; break; case 5: message = "금요일"; break; case 6:
		 * message = "토요일"; break; default: message = "일요일"; }
		 * Sys tem.out.printf("%d년 %d월 %d일은 %s 입니다.", year, month, day, message);
		 */
		int daynum = 1;
		System.out.print("일요일    월요일    화요일    수요일    목요일    금요일    토요일\n");
		outter:
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++){
				if(i==0 && j<totalday){
					System.out.printf("     ");
				}else{
					System.out.printf("%5d", daynum);
					if(daynum++==monthArray[month-1]) break outter;
				}
			}
			System.out.println();
		}
	}

}
