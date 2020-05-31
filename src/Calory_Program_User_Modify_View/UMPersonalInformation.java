package Calory_Program_User_Modify_View;

public class UMPersonalInformation extends UModifyview {

	@Override
	protected void display() {
		System.out.println("HOW DO YOU SEARCH?");
		System.out.println("1. NAME  2. PHONE NUMBER");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println(
				"==========================================================================================================");
		System.out.println(
				"===================================== MODIFY PERSONAL INFORMATION ========================================");
		System.out.println(
				"==========================================================================================================");
		System.out.println();

	}

}
