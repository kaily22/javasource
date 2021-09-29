package extedsEx;

//상속을 받기 위해선 default 생성자가 무조건! (슈퍼 클래스에서)


public class VipCustomer extends Customer {

  protected String consultantID;
  protected double discount;
  
  //생성자
  
  public VipCustomer(String customerID, String customerName, String consultantID) {
	  super.customerID = customerID;
    this.customerGrade = "VIP";
    this.bonusPointRatio = 0.05;
    this.discount = 0.1;
  }
  
  @Override
  public int calcPrice(int price) {
  
     price = (int) (price - (discount * price));
     bonusPoint += bonusPointRatio * price;
  
      return price;
  } 
  
  public String getAgent() {
    return consultantID;
}
 
  public String Info() {
    return ("고객 ID : "+customerID+" 고객등급 : "+customerGrade + "보너스 포인트 : " +bonusPoint);
  }
  
  
}
