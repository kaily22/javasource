package ch5;

import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
	// 객체 배열

		Student stuArr[] = new Student[3]; // 공간만 마련
		
		for(int i =0; i<stuArr.length; i++) {
		    stuArr[i] = new Student();
		}	
		
//		stuArr[0].id = "1234";
//		stuArr[0].id = "1234";
//		stuArr[0].id = "1234";
//		stuArr[0].id = "1234";
//		stuArr[0].id = "1234";
//		
       Scanner sc = new Scanner(System.in);
       int i= 1; 
       for(Student stu :stuArr) {
           System.out.printf("[%d] 학생 정보 입력\n" , i++);
           System.out.print("id: ");
           stu.id = sc.nextLine();
           System.out.print("addr: ");
           stu.addr = sc.nextLine();
           System.out.print("mobile : ");
           stu.mobile = sc.nextLine();
           System.out.print("name : ");
           stu.name = sc.nextLine();
           System.out.println();
           System.out.println();
       }
        //정보 확인
        i=1;
        for(Student stu : stuArr) {
        	 System.out.printf("[%d] 학생 정보 입력\n" , i++);
             System.out.println("아이디: " +stu.id); 
             System.out.println("주소: " +stu.addr);
             System.out.println("전화번호 : " +stu.mobile);
             System.out.println("이름 : " +stu.name);
         }
          
       }

	}


