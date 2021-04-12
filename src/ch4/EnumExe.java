package ch4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumExe {

	public static void main(String[] args) {
		Week today = null;

		// 오늘 날짜
		LocalDate now = LocalDate.now();
		// System.out.println(now);

		// 오늘에 해당하는 숫자 확인하기
		DayOfWeek week = now.getDayOfWeek();
		// System.out.println(week.getValue()); (1~7)

		switch (week.getValue()) {
		case 1:
			today = Week.MONDAY; // enu 타입으로 변환
			break;
		case 2:
			today = Week.TUESDAY;
			break;
		case 3:
			today = Week.WEDNESDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		default:
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);

	}

}
