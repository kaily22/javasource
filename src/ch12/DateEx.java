package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
//	   Date date = new Date();
//	   System.out.println(date); //Fri Apr 09 10:04:54 KST 2021
	   
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss"); //MM월 : 대문자
	  // System.out.println(sdf.format(date));
	   System.out.println(sdf.format(new Date()));
	   

	}

}
