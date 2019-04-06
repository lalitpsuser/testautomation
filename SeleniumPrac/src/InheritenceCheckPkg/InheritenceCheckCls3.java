package InheritenceCheckPkg;

public class InheritenceCheckCls3 extends ParentCls{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentCls cobj = new InheritenceCheckCls3();
		cobj.add();
		cobj.sub();
		//The below methods will not be accessible if we create an object of child class but reference of parent class
//		cobj.mul();
//		cobj.div();
			
	}


	////Methods -- > Child class
	public void mul() {
		System.out.println("MULTLIPLICATION");
	}
	
	public void div() {
		System.out.println("SUBSTRATION");
	}

}
