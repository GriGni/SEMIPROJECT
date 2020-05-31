package Calory_Program_Common_View;

import Calory_Program_Model.PeopleAndCaloryDto;

public class CInput extends CommonView {

	@Override
	protected void display() {
		System.out.println("<< INPUT YOUR INFORMATION >>");
		System.out.print("INPUT YOUR NAME>> ");
		String name = scan.next();
		System.out.print("INPUT YOUR SEX>> ");
		String sex = scan.next();
		System.out.print("INPUT YOUR AGE>> ");
		String age = scan.next();
		System.out.print("INPUT YOUR PHONE NUMBER>> ");
		String phone = scan.next();
		System.out.print("INPUT YOUR ADDRESS>> ");
		String address = scan.next();
		System.out.println();

		String breakfast = null, lunch = null, dinner = null;
		int bkcal = 0, lkcal = 0, dkcal = 0;
		;
		int sumkcal = 0;
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

		}
		System.out.println(sumkcal + "kcal");

		PeopleAndCaloryDto dto = new PeopleAndCaloryDto(1, name, sex, age, phone, address, breakfast, bkcal, lunch,
				lkcal, dinner, dkcal, sumkcal);
		request.put("dto", dto);
	}

	@Override
	protected void showTitle() {
		System.out.println(
				"==========================================================================================================");
		System.out.println(
				"============================================== INPUT MEMBER ==============================================");
		System.out.println(
				"==========================================================================================================");
		System.out.println();

	}
}