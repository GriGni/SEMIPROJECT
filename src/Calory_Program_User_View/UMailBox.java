package Calory_Program_User_View;

public class UMailBox extends UserView {

	@Override
	protected void display() {
		System.out.println("1. CHECK MY EMAIL  2. BACK  3. END");
		System.out.print("Choice>> ");
		getFuntion();
	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("=============================================== MAIL BOX =================================================");
		System.out.println("==========================================================================================================");
		System.out.println();	

	}

}
