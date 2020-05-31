package Calory_Program_User_View;

public class UConfirmMyInformation extends UserView {
	@Override
	protected void display() {
		System.out.println(" <<PLEASE SELECT THE ONE THAT YOU WANT ENTER>>");
		System.out.println();
		System.out.println("1. PERSONAL INFORMATION  2. CALORY");
		System.out.print("Choice>> ");
		getFuntion();

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("======================================== CONFIRM MY INFORMAION ===========================================");
		System.out.println("==========================================================================================================");
		System.out.println();	
	}

}
