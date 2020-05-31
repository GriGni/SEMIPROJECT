package Calory_Program_Administrator_MemberSearch_View;

import Calory_Program_Model.PeopleAndCaloryDto;

public class SearchByPhone extends MemberSearchView {

	@Override
	protected void display() {
		System.out.print("Please write your phone number to search.>> ");
		String phone = scan.next();
		request.put("dto", new PeopleAndCaloryDto(0, null, null, null, phone, null, null, 0, null, 0, null, 0, 0));

	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("============================================ SEARCH BY PHONE =============================================");
		System.out.println("==========================================================================================================");
		System.out.println();
	}

}
