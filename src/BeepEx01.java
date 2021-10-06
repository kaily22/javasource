import java.awt.Toolkit;

public class BeepEx01 {

	public static void main(String[] args) {
	
	 Toolkit toolkit = Toolkit.getDefaultToolkit();
	 
	 
	for(int i=0; i<5; i++) {
	
	  toolkit.beep();
	  
	  try {
		Thread.sleep(1000);
	} catch (Exception e) {
	}
	
	}
	
	

	}

}
