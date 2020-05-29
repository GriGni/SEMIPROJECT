package Calory_Program_Administrator_View;

public class AConfirm extends AdminView {

	@Override
	protected void display() {
		System.out.println("1. Print Member List  2. People who eat a lot more than standard  3. Back  4. End");
		System.out.print("Choice>> ");
		getFuntion();
	}

	@Override
	protected void showTitle() {
		System.out.println("======================================================================================");
		System.out.println("===================================== CONFIRM ========================================");
		System.out.println("======================================================================================");
		System.out.println();
	}

}
