package ch3;
//continue; 반복문에서 사용, 블록 내부에서 continue 문이 실행되면 
//반복문의 조건식으로 이동하게 함
public class ContinueExe2 {

	public static void main(String[] args) {
	    for(int i =0; i<=10; i++) {
	        if(i%2!=0) {
	          continue; //다음 문장이 실행 되려나 안되려나-> continue만나면 실행 x 다시 올라감
	        }
	        
	        System.out.println(i);
	    }
	}

}
