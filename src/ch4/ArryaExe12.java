package ch4;

public class ArryaExe12 {

	public static void main(String[] args) {
	   int oldArray[] = {10,20,30};
	   
	   int newArray[] = new int[5];
	   //배열은 추가로 바로 값을 입력 할 수 없기 때문에
	   //새로운 배열 복사해어 값을 넣는다.
	   
	   //old Array의 값을 newArray copy
	  System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
	    //oldarray의 0번부터 복제 시작, destination:new array -> new array의 위치 0부터 지정
	    //길이 지정
	    for(int i : newArray) {
	    System.out.print(i +"\t");
	    }
	}

}
