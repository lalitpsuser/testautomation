package FinalKeywordChk;

public class FinalKeywordChkCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeywordChkCls fin = new FinalKeywordChkCls();
		fin.run();
	}	
	
	//Final variable
	int Speed = 90;
	
	public void run() {
		Speed = 100;  // ======> THIS CHANGING VALUE IS NOT ALLOWED
	}
	

}
