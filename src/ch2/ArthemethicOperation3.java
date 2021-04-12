package ch2;

public class ArthemethicOperation3 {

	public static void main(String[] args) {
	
	    long x = 1000000;
	    int y = 1000000;
	    
	    long z = x * y; //1000000 * 1000000 -> 담을 공간이 부족해서 쓰레기값
	    
	    System.out.println("z = " +z);
	}

}
