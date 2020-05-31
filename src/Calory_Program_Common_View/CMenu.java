package Calory_Program_Common_View;

public class CMenu extends CommonView {

	@Override
	protected void display() {
		System.out.println("1. ADMINISTRATOR  2. USER  3. END");
		System.out.print("Choice>>> ");
		getFuntion();
	}
	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("========================================= DAILY CALORY PROGRAM ===========================================");
		System.out.println("==========================================================================================================");
		System.out.println();		
	}

}
