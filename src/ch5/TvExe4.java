package ch5;

public class TvExe4 {

	public static void main(String[] args) {
	
	//배열 타입 배열명[] = new 타입[5]; -> 배열 선언, 생성
	//초기화 : 배열명[0] = 78
	int arr[] = new int[5];
	arr[0] = 78;
	
	int arr2[] = {78,88,98};
	//클래스 이름으로 바꿔준다.
	TV tvArr[] = new TV[5];
	
//초기화	//tv타입을 담아야한다. TV는 객체 생성하면서 의미/초기화 해줄때 객체 생성해줄 때 들어감
//	tvArr[0] = new TV();
//	tvArr[1] = new TV();
//	tvArr[2] = new TV();
//	tvArr[3] = new TV();
//	tvArr[4] = new TV();
//	
	for(int i =0; i<tvArr.length;i++) {
	     tvArr[i] = new TV();
	     tvArr[i].channel = i+10;
	     
	  }
	  
	  for(int i=0; i<tvArr.length; i++) {
	     System.out.printf("tvArr[%d].channel = %d\n" ,i,tvArr[i].channel);
	}
 }
}
