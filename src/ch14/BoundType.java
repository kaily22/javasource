package ch14;

public class BoundType {
   public static <T extends Number> int compare(T t1, T t2) {
      double v1=t1.doubleValue();
      double v2=t1.doubleValue();
      
      return Double.compare(v1, v2);
   }
}