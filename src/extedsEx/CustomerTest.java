package extedsEx;


public class CustomerTest {

	public static void main(String[] args) {
	
	  
	  Customer cs = new Customer("g12345","이승현");
	  VipCustomer vip = new VipCustomer("g12343","이태영","상당원");
	  GoldCustomer gold = new GoldCustomer("g1111","마미");
	  
	  System.out.println("가격 얼마? : " +cs.calcPrice(3000));
	  System.out.println(cs.Info());
	  
	  System.out.println("가격 얼마 : " +vip.calcPrice(12000));
	  System.out.println(vip.Info());
	  
	  System.out.println("가격 얼마 : " +gold.calcPrice(34000));
	  System.out.println(gold.Info());
	
	}

}
