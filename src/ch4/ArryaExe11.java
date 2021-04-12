package ch4;

public class ArryaExe11 {

	public static void main(String[] args) {
	   int oldArray[] = {10,20,30};
	   
	   int newArray[] = new int[oldArray.length];
	   
	   //old Array의 값을 newArray copy
	   for(int i=0; i<oldArray.length; i++) {
	       newArray[i]=oldArray[i];	 
	    }
	    
	    
	    for(int i : newArray) {
	    System.out.print(i +"\t");
	    }
	}

}
