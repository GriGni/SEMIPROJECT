package Calory_Program_User_Modify_PerInfo_View;

import Calory_Program_Model.PeopleAndCaloryDto;

public class MSearchByPhone extends PerInfoView {
	@Override
	protected void display() {
		System.out.print("Please write your phone number to search.>> ");
		String phone = scan.next();
		request.put("dto", new PeopleAndCaloryDto(0, null, null, null, phone, null, null, 0, null, 0, null, 0, 0));
		
		
	}

	@Override
	protected void showTitle() {
		// TODO Auto-generated method stub

	}
	@Override
	protected void addAct() {
		// TODO Auto-generated method stub
		
	}
}
