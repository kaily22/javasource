package ch4;

public class ArryaExe14 {

	public static void main(String[] args) {
	    String data[] = {"abc","def","hijkl"};
	    
	    for(int i=0; i<data.length; i++) {
	         char[] chArr = data[i].toCharArray(); // "abc" ->chArr[] ={ 'a','b','c'};
	         //캐릭터 배열로 변경 시켜줘
	         for(int j =0; j<chArr.length; j++) {
	             System.out.print(chArr[j]+" ");
	         }
	         System.out.println();
	    }
	}

}
