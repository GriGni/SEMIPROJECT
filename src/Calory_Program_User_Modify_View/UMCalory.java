package Calory_Program_User_Modify_View;

public class UMCalory extends UModifyview {

	@Override
	protected void display() {
		System.out.println("SELECT THE ONE THAT YOU WANT TO CHAGE THE CLAORY");
		System.out.println("1. BREAKFAST  2. LUNCH  3. DINNER");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("======================================== MODIFY DAILY CALORY =============================================");
		System.out.println("==========================================================================================================");
		System.out.println();	


	}

}
