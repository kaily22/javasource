package ch5;

public class CardEx {

	public static void main(String[] args) {
	
	Card card1 = new Card(7, "heart");
	print(card1);
	System.out.println();
	
	Card card2 = new Card(6, "spade");
	print(card2);
	
	} static void print(Card card) {
	   System.out.println("card number : " +card.num);
	   System.out.println("card  종류: " +card.kind);
	   System.out.println("card 가로길이 : " +card.width);
	   System.out.println("card 세로길이 : " +card.height);
	}
}
