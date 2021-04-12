package ch2;
//화씨 온도를 섭씨 온도로 바꾸는 프로그램 작성
//임의의 화씨 온도를 변수로 선언하고 변경
public class Degrees {

	public static void main(String[] args) {
	    int f = 70;
	    double temp = (f -32) * 5 / (double) 9;
	    System.out.println("섭씨 온도는? : " +temp);
	    
	}

}
