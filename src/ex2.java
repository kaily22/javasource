import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	
	
	   System.out.println("금액을 입력하세요 : ");
	   
	   Scanner sc = new Scanner(System.in);
	   int money = sc.nextInt();
	   
//	   String[] bill_kor = {"오만원","만원","오천원","천원","오백원","백원","오십원","십원"};
	   int[] bill = {50000,10000,5000,1000,500,100,50,10} ;
	   
	   
	   for(int i=0; i<bill.length; i++) {
	   
	   if(money / bill[i] > 0) {
	     
	     System.out.println(bill[i]+"원 "+money/bill[i]+"개");
	   }
	   money %= bill[i];
	 }
	   
	
	}
	
	}

