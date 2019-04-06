package AbstractPkg;

public abstract class GameObject {	
	
	private static final String[] GameObject = null;

	public abstract void draw();
	
	public static void main(String[] args) {
					
//		Players pl = new Players();
//		pl.draw();
//		
//		Menu mn = new Menu();
//		mn.draw();
//		//GameObject go = new GameObject();
		
		
		Players pl = new Players();
		pl.somemethod();
		//pl.draw();
		
		Menu mn = new Menu();
		//mn.draw();
		
		
		//Create array
		GameObject[] arrgo =  new GameObject[2];
		//GameObject player;
		arrgo[0] = pl;
		//GameObject menu;
		arrgo[1] = mn;
		//Iterate
		for(GameObject obj : arrgo) {
			obj.draw();
		}
	}

	
}