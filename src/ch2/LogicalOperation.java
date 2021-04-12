package ch2;

//논리 연산자 &&(AND), ||(OR), ^(XOR), !(NOT)
// 하나인것도 같은 의미
// true && true => true, true || false => false
// true || false => true
// true ^ false => true , true ^ true => false
public class LogicalOperation {

	public static void main(String[] args) {
	    
	    int charCode = 'A';
	    if ((charCode>=65) && (charCode <= 90)) {
	        System.out.println("대문자");
	        
	    }
	    
	    if (!(charCode<48) && !(charCode >57)) {
	        System.out.println("0~9 숫자");
	    }
	    
	    int value = 6;
	    if ((value%2 == 0) || (value%3 == 90)) {
	        System.out.println("3의 배수");
	    }
	    
	}
}
