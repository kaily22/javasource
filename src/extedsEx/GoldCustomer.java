package extedsEx;

public class GoldCustomer extends Customer {

	  protected double discount;
	  
	  //생성자
	  
	  public GoldCustomer(String customerID, String customerName) {
		  super.customerID = customerID;
	    this.customerGrade = "Gold";
	    this.bonusPointRatio = 0.02;
	    this.discount = 0.1;

	  }
	  
	  @Override
	  public int calcPrice(int price) {
	  
	     price = (int) (price - (discount * price));
	     bonusPoint += bonusPointRatio * price;
	  
	      return price;
	  } 
	  
	 
	  public String Info() {
	    return ("고객 ID : "+customerID+" 고객등급 : "+customerGrade + "보너스 포인트 : " +bonusPoint);
	  }
	  


}
