package ch1;

/* byte 타입
 * 메모리 사용 1byte만 사용
 * byte = 8bit(-2의 7승~ +2의 7승 -1) : -128 ~ 127까지 표현 가능
 */


public class ByteVariable2 {
  public static void main(String[] args) {
//  변수 : 하나의 값을 저장 할 수 있는 메모리 공간
// 상수 : 값이 변하지 않는
// 타입 변수명; 변수 선언 (쓸 수 있는거 지정)
// 기본타입 : boolean, byte, char, int, short, long, float 

     // 변수 선언과 값 할당
//     byte age=10;
//     byte maxSpeed = 20;

     byte age = 10, maxSpeed = 20;

     //사용
     System.out.println("age= " +age);  
     System.out.println("maxSpeed= " +maxSpeed);
//   화면 출력
  }

}

