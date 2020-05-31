package Calory_Program_Common_View;

public class CUser extends CMenu {

	@Override
	protected void display() {
		System.out.println("1. INPUT  2. CONFIRM MY INFORMATION 3. MAIL BOX  4. MODIFY   5. DELETE MY ACCOUNT  6. BACK  7. END ");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("=============================================== USER MODE ================================================");
		System.out.println("==========================================================================================================");
		System.out.println();

	}

}
