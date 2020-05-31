package Calory_Program_Common_View;

public class CAdmin extends CMenu {

	@Override
	protected void display() {
		System.out.println("1. CONFIRM 2. MEMEBER SEARCH 3. SENDING_MESSAGE 4. BACK 5. END");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("=========================================== ADMINISTRATOR MODE ===========================================");
		System.out.println("==========================================================================================================");
		System.out.println();

	}

}
