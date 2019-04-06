package ThisKeywordChk;

public class Account {

	int a;
	int b;

	void setdata(int a,int b) {
		this.a = a;
		this.b = b;
	}

	public void showdata() {
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		//Temo ap = new Temo();

		ac.setdata(60,5);
		ac.showdata();

	}

}
