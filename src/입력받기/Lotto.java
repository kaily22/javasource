package 입력받기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto { 

   public static void main(String[] args) {
   
//   //중복 제거해주는 set사용
//   Set set = new HashSet<Integer>();
//   
//   //반복으로 랜덤
//   for(int i=0; set.size()<6; i++) {
//     Random rd = new Random();
//
//     //랜덤 범위
//     int number = rd.nextInt(45)+1;
//     set.add(new Integer(number));
//   }
//   
//   List list = new ArrayList(set);
//   Collections.sort(list);
//      
//   System.out.println("로또번호 보여주기");
//   System.out.println(list);
//   
//     
//   }
   
   //TreeSet사용 -> binary로
   
   Set ts = new TreeSet();
   
   for(int i=0; ts.size()<6; i++) {
    Random rd = new Random();
    int num = rd.nextInt(45)+1;
    ts.add(new Integer(num));
    
   }
   
   
   System.out.println("로또번호");
   System.out.println(ts);
   
   }
}
