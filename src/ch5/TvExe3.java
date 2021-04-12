package ch5;

public class TvExe3 {

	public static void main(String[] args) {
	
	//  기본타입
		int a = 10;
		int b = 20;
		System.out.printf("a = %d, b = %d\n",a,b);
		a=b; //b에 있는 값을 a에 담아둠
		System.out.printf("a = %d, b = %d\n",a,b);


        //참조타입
		// 객체 생성
		TV tv1 = new TV();
		TV tv2 = new TV();

		System.out.println("tv1= " + tv1);
		System.out.println("tv2= " + tv2);
		System.out.println("tv1 channel = " + tv1.channel);
		System.out.println("tv2 channe2 = " + tv2.channel);

		System.out.println();
		
		tv2 = tv1; //tv1을 tv2로 담아버림 -> 다 동일한 값으로
		tv1.channel = 7;
		System.out.println("tv1 = "+tv1);
		System.out.println("tv2 = "+tv2);
		System.out.println("tv1 channel = " + tv1.channel);
		System.out.println("tv2 channe2 = " + tv2.channel);
	}
}