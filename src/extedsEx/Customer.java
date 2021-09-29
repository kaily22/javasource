package extedsEx;

import java.text.DecimalFormat;

public class Customer {
   
   
	DecimalFormat df = new DecimalFormat("#,###");
	
	
   //속성 만들기(필드)
   protected String customerID; //고객id
   protected String customerName; 
   protected String customerGrade; //고객 등급
   protected int bonusPoint; //보너스 포인트 
   protected double bonusPointRatio; //보너스 포인트 적립률
   
   public Customer() {
   }

   //생성자 만들기
   public Customer(String customerID, String customerName) {
    this.customerID = customerID;
    this.customerGrade = "General";
    this.bonusPoint = 0;
    this.bonusPointRatio = 0.01;
   }
   
   //기능(함수.메소드 만들기)
   public int calcPrice(int price) {
   
    bonusPoint += price * bonusPointRatio;
    return price;
   
   }
   
   public String Info() {
     
     return ("고객 ID : "+customerID+" 고객등급 : "+customerGrade + "보너스 포인트 : " +bonusPoint);
     
   }
   
   
   
   
   
}
