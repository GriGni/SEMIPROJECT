package Calory_Program_User_Modify_PerInfo_View;

import Calory_Program_Model.PeopleAndCaloryDto;
import Calory_Program_Model.PeopleDto;
import Calory_Program_User_View.UInput;

public class MSearchByName extends PerInfoView {
	
	@Override
	protected void display() {
		System.out.print("Please write your name to search.>> ");
		String name = scan.next();
		request.put("dto", new PeopleAndCaloryDto(0, name, null, null, null, null, null, 0, null, 0, null, 0, 0));

	}

	@Override
	protected void showTitle() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addAct() {
		String breakfast = null, lunch = null, dinner = null;
		int bkcal = 0, lkcal = 0, dkcal = 0;
		int sumkcal = 0;
		
		System.out.print("Please write your idx to change.>> ");
		int idx  = scan.nextInt();
		System.out.print("Please write your name to change.>> ");
		String name  = scan.next();
		System.out.print("Please write your sex to change.>> ");
		String sex  = scan.next();
		System.out.print("Please write your age to change.>> ");
		String age  = scan.next();
		System.out.print("Please write your phone to change.>> ");
		String phone  = scan.next();
		System.out.print("Please write your address to change.>> ");
		String address  = scan.next();
		System.out.println("<<INPUT YOUR DAILY CALORY>>");
		System.out.println();

		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				System.out.println("<<THE BREAKFAST>> ");
				System.out.print("INPUT THE FOOD>> ");
				breakfast = scan.next();
				System.out.print("INPUT THE CALORY>> ");
				bkcal = scan.nextInt();
				System.out.println();
				sumkcal += bkcal;

			} else if (i == 2) {
				System.out.println("<<THE LUNCH>>");
				System.out.print("INPUT THE FOOD>> ");
				lunch = scan.next();
				System.out.print("INPUT THE CALORY>> ");
				lkcal = scan.nextInt();
				System.out.println();
				sumkcal += lkcal;
			} else {
				System.out.println("<<THE DINNER>>");
				System.out.print("INPUT THE FOOD>> ");
				dinner = scan.next();
				System.out.print("INPUT THE CALORY>>  ");
				dkcal = scan.nextInt();
				System.out.println();
				sumkcal += dkcal;
		}
		System.out.println(sumkcal + "kcal");
		request.put("dto", new PeopleAndCaloryDto(idx, name, sex, age, phone, address, breakfast, bkcal, lunch, lkcal, dinner, dkcal, sumkcal));
		}
	}
}
