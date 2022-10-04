package oct3_2022_session;

public class Test {

	public static void main(String[] args) {
		Child child = new Child();
		child.bar();
		child.bike();
		child.bankbalance();
		child.property();
		child.farmhouse();
		
		Parent parent = new Parent();
	//	parent.bike(); //this is not allowed. A parent class cannot inherit anything of it's child Class
		parent.bankbalance();
		parent.property();
		parent.farmhouse();
		
		GrandParent gp = new GrandParent();
		gp.farmhouse();
	}

}
