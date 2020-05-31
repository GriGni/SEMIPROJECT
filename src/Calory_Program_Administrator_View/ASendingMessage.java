package Calory_Program_Administrator_View;

public class ASendingMessage extends AdminView {

	@Override
	protected void display() {
		System.out.println("1. SEND MESSAGE  2. BACK  3.END");
		System.out.print("Choice>> ");
		getFuntion();
		
	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("============================================ SENDING MESSAGE =============================================");
		System.out.println("==========================================================================================================");
		System.out.println();
	}

}
