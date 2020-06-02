package Calory_Program_Administrator_Confirm_View;

import java.util.ArrayList;

import Calory_Program_Model.PeopleAndCaloryDto;

public class PrintPeopleAteALot extends AConfirmView {

	@Override
	protected void display() {
		ArrayList<PeopleAndCaloryDto> list = (ArrayList<PeopleAndCaloryDto>) request.get("list");
		for(PeopleAndCaloryDto dto : list) {
			System.out.println(dto);
		}
	}

	@Override
	protected void showTitle() {
		System.out.println("==========================================================================================================");
		System.out.println("========================================= PEOPLE WHO ATE A LOT ===========================================");
		System.out.println("==========================================================================================================");
		System.out.println();

	}

}
