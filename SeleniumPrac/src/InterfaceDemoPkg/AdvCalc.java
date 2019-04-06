package InterfaceDemoPkg;

public class AdvCalc implements Calc_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvCalc obj1 = new AdvCalc();
		obj1.add();
		obj1.sub();
		obj1.calculateSin();
		obj1.calculateCos();
	}

	public void calculateSin() {
		System.out.println("Sin-thitta");
	}

	public void calculateCos() {
		System.out.println("Cos-thitta");
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Substration");

	}

}
