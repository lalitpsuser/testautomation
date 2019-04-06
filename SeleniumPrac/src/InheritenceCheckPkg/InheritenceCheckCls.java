package InheritenceCheckPkg;

public class InheritenceCheckCls extends ParentCls{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceCheckCls cobj = new InheritenceCheckCls();
		cobj.add();
		cobj.sub();
		cobj.mul();
		cobj.div();
	}

	
	////Methods -- > Child class
	public void mul() {
		System.out.println("MULTLIPLICATION");
	}
	
	public void div() {
		System.out.println("SUBSTRATION");
	}
	
	

}
