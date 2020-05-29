package Calory_Program_Common_View;

public class CUser extends CMenu {

	@Override
	protected void display() {
		System.out.println("1. LOGIN 2. SIGN-UP 3. BACK");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println("======================================================================================");
		System.out.println("==================================== USER MODE =======================================");
		System.out.println("======================================================================================");
		System.out.println();

	}

}
