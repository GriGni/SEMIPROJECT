package Calory_Program_User_View;

public class UModify extends UserView {

	@Override
	protected void display() {
		System.out.println("1. MODIFY PERSONAL INFORMATION  2. MODIFY MY CALORY  3. BACK  4.  END");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("========================================= MODIFY MY INFORMATION ==========================================");
		System.out.println("==========================================================================================================");
		System.out.println();	

	}

}
