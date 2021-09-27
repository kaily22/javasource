package 입력받기;

import java.text.DecimalFormat;

public class Utils {


  public static String toNumberFormat(long totalAmount) {
  //객체 생성
  DecimalFormat df = new DecimalFormat("#,###");
  return df.format(totalAmount);
  }
}
