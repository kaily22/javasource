package ch2;

public class IncreaseDecreaseExe2 {

	public static void main(String[] args) {
      int x= 10;
      int y = 10;
      int z;
      
      
      System.out.println("----------------------");
      x++;
      ++x;
      System.out.println("x = " +x);
      
      System.out.println("----------------------");
      y--;
      --y;
      System.out.println("y = " +y);
      System.out.println("--------------------");
      
      z = x++; // =(대입 연산자), ++(증감 연산자)
      // z=x;
      // x = x+1;
      
      System.out.println("z = " +z);
      System.out.println("x = " +x);
      
      System.out.println("---------------------");
      z= ++x;
      // x = x+1;
      // z = x;
      
      System.out.println("z= " +z);
      System.out.println("x= " +x);
      
      System.out.println("---------------------");
      z = ++x + y++; //대입, 산술(+), 증감(앞, or 뒤 따져서 산술과 비교)
      
      //x = x+1;
      //z = x+y;
      //y = y+1;
      
      System.out.println("z=" +z);
      System.out.println("x=" +x);
      System.out.println("y=" +y);
     
      
      
      
	}

}
