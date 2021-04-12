package ch4;

public class ReferenceEx1 {

	public static void main(String[] args) {
	   
	   //참조타입 - null 할당(힙 영역의 객체를 참조하지 않음)
//	   int intArr[] = null;
//	   System.out.println(intArr.length);
//	   
//	   String strArr[] =null;
//	   System.out.println(strArr.length); //Null pointer access
	   
	   String strArr[] = new String[3];
	   strArr[0] ="홍길동";
	   strArr[1] ="홍길동";
	   strArr[2] = new String("홍길동");
	   //String은 ==(x) 라고 물어볼 때, equals()
	   System.out.println(strArr[0]==strArr[1]);
	   System.out.println(strArr[0]==strArr[2]);
	   System.out.println(strArr[0].equals(strArr[2]));
	   	    
	}

}
