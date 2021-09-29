package 입력받기;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class JuminNumber {
	public static void main(String[] args) {

		String juminNum;
		int[] weight = { 2, 3, 4, 5, 6, 7,0, 8, 9, 2, 3, 4, 5 };

		int sum = 0;
		int temp, result;
	
	    System.out.println("주민번호를 입력하세요");	
		Scanner sc = new Scanner(System.in);
		
		juminNum = sc.next();
	
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";

		boolean check = juminNum.matches(regex);

		if (check == false) {
			System.out.println("주민번호 부합x");
			return;
		} else {
			System.out.println("주민번호 부합");

		}
		
		for(int i =0; i<13; i++) {
		   // "-" 일때 기억해야함
		   if(juminNum.charAt(i) == '-') continue;
		  sum += (juminNum.charAt(i)-48) * weight[i];
		}
		
		temp = 11 -(sum%11);
		result = temp%10;
		
		int last = juminNum.charAt(13)-48;
		
		if(result==last) {
			System.out.println("정상");
		}else {
		  System.out.println("틀림");
		}
		
		//나이 추출
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		int year = cal.get(Calendar.YEAR);
		
		int yy = Integer.parseInt(juminNum.substring(0,2));
		
		if(juminNum.charAt(7)-48 <3 ) {
		   yy = yy + 1900;
		}else {
		  yy = yy+ 2000;
		}
		
		int age = year - yy+1;
		System.out.println(age);
		
		//성별 추출
		
		if((juminNum.charAt(7)-48 ) % 2 == 0) {
		   System.out.println("여자");
		}else {
		  System.out.println("남자");
		}
		
		//지역 추출
		
		String [][] locate = {
		
				{"서울", "00", "08" }, { "부산", "09", "12" },
	               { "인천", "13", "15" }, { "경기", "16", "25" },
	               { "강원", "26", "34" }, { "충북", "35", "39" },
	               { "대전", "40", "40" }, { "충남", "41", "43"},
	               { "충남", "45", "47" }, {"세종", "44", "44" },
	               { "세종", "96", "96" }, { "전북", "48", "54" },
	               { "전남", "55", "64" }, { "광주", "65", "66" },
	               { "대구", "67", "70" }, { "경북", "71", "80" },
	               {"경남", "81", "84"  },  { "경남", "86", "90" },
	               { "울산", "85", "85" }, { "제주", "91", "95" }
		};
		
		String localString = juminNum.substring(8,10);
		int locale = Integer.parseInt(localString);
		String birthPlace = null;
		
		for(int i=0; i<locate.length; i++) {
		   
		   if( locale >= Integer.parseInt(locate[i][1]) && locale <= Integer.parseInt(locate[i][2])) {
		      birthPlace = locate[i][0];
		   }
		   		
		}
		
		System.out.println("출신지역 : " +birthPlace);
		
		
		//생년월일
		
		System.out.println("생년월일 : " +yy+ "." +juminNum.substring(2,4)+"/"+juminNum.substring(4,6));
		juminNum.substring(0,7);
		
		
		//띠
		
		String ddi = null;
		String[] gangi = {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
		
		ddi = gangi[yy % 12];
		System.out.println(ddi);
		
		
		 

		
		
		
	}
}
