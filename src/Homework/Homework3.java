package Homework;

import java.util.Scanner;

public class Homework3 {
	private int year;
	private int month;
	private int day;
	int weekday;
	int yoonday;
	int yearday;
	int monthday;
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public void print(int num){
		num = yearday + monthday + yoonday + day;
		
		String message = null;
		switch (num % 7) {
		case 1: message = "월요일"; break;
		case 2:	message = "화요일"; break;
		case 3: message = "수요일"; break;
		case 4:	message = "목요일"; break;
		case 5:	message = "금요일"; break;
		case 6:	message = "토요일"; break;
		default: message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다.\n\n", getYear(), getMonth(), getDay(), message);
	}
	
	public void print(int year, int month){
		weekday = yearday + monthday + yoonday + 1;
		weekday %=7;
		int daynum = 1;
		//System.out.println(weekday);
		System.out.print("일요일    월요일    화요일    수요일    목요일    금요일    토요일\n");
		
		int j = 0;
		for (int i = 0; i < weekday; i++) {
			System.out.print("     ");
			j=i;
		}
		j++;
		outter:
		for (int i = 0; i < 6; i++) {
			for (; j<7; j++) {
				System.out.printf("%5d", daynum);
				if (daynum++ == monthArray[getMonth() - 1]){
					break outter;
				}
			}
			j=0;
			System.out.println();
		}
		//System.out.println(monthArray[getMonth() - 1]);
	}
	
	public void print(int year, int month, int day){
		weekday = yearday + yoonday + 1;
		weekday %=7;
		for (int i = 1; i <= 12; i++) {
			int daynum = 1;
			
			setMonth(i);
			System.out.print("일요일    월요일    화요일    수요일    목요일    금요일    토요일\n");
			
			int j = 0;
			for (int i1 = 0; i1 < weekday; i1++) {
				System.out.print("     ");
				j=i1;
			}
			j++;
			outter:
			for (int i1 = 0; i1 < 6; i1++) {
				for (; j<7; j++) {
					System.out.printf("%5d", daynum);
					if (daynum++ == monthArray[getMonth() - 1]){
						break outter;
					}
				}
				j=0;
				System.out.println();
			}
			weekday = yearday + yoonday + 1 + monthArray[i-1];
			weekday %=7;
			System.out.println();
		}
	}
	
	public void countMonthDay(){
		yearday = (getYear() - 1) * 365;

		for (int i = 0; i < getMonth() - 1; i++) {
			monthday += monthArray[i];
		}
	}
	
	public void thisYearYoon(){
		boolean isLeafYear = getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0;
		if (isLeafYear) {
			monthArray[1] = 29;
		}
	}
	
	public void countYoon(){
		yoonday = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
	}
	
	public void run(){
		countYoon(); //전년도까지의 윤년날짜 카운터
		thisYearYoon(); //올해가 윤년인가 체크 //윤년이면 배열의 2월값 29일로 변경
		countMonthDay();
		
		print(year);
		print(year, month);
		print(year, month, day);

	}
	
	public void inPut(){
		Scanner sc = new Scanner(System.in);
		setYear(sc.nextInt());
		setMonth(sc.nextInt());
		setDay(sc.nextInt());
		run();
	}
	
	public static void main(String[] args) {
		Homework3 hw = new Homework3();
		hw.inPut();
	
	}

	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
