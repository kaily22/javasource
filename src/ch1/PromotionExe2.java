package ch1;
//자동 타입 변환(Promotion)
//byte 끼리 연산 -> int로 자동 변환
public class PromotionExe2 {
    public static void main(String[] args) {
    
    byte byteValue1 = 10, byteValue2 = 20;
    
    //큰 타입(4byte) = 작은 타입(1byte)
    int intValue = byteValue1 + byteValue2;
    System.out.println(intValue);
    
 
    double doubleValue = 5.5;
    double result = intValue + doubleValue;
 
    // byte  byteResult = byteValue1 + byteValue2;
    
    
    int byteResult = byteValue1 + byteValue2;
    System.out.println(byteResult);
    
    
    
    char charValue1 = 'A'; //65
    char charValue2 = '1';
    int resultValue = charValue1 + charValue2;
    System.out.println(resultValue); //66
    
 
    }
       
}
