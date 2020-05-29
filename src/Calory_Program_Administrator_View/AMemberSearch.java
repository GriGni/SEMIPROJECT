package Calory_Program_Administrator_View;

public class AMemberSearch extends AdminView {

	@Override
	protected void display() {
		System.out.println("1. Search by name  2. Search by phone number  3. Back  4. End");
		System.out.print("Choice>> ");
		getFuntion();
	}

	@Override
	protected void showTitle() {
		System.out.println("======================================================================================");
		System.out.println("================================== MEMBER SEARCH =====================================");
		System.out.println("======================================================================================");
		System.out.println();	

	}

}
