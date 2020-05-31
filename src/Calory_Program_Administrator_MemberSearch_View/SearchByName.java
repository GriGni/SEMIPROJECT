package Calory_Program_Administrator_MemberSearch_View;

import Calory_Program_Model.PeopleAndCaloryDto;

public class SearchByName extends MemberSearchView {

	@Override
	protected void display() {
		System.out.print("Please write your name to search.>> ");
		String name = scan.next();
		request.put("dto", new PeopleAndCaloryDto(0, name, null, null, null, null, null, 0, null, 0, null, 0, 0));

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("============================================= SEARCH BY NAME =============================================");
		System.out.println("==========================================================================================================");
		System.out.println();

	}

}
