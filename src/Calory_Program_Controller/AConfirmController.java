package Calory_Program_Controller;

import java.util.ArrayList;

import Calory_Program_Model.PeopleAndCaloryDto;

public class AConfirmController extends AdminController {

	public static void AConPath() {

		int num = (int) request.get("num");
		switch (num - 1) {
		case PRINTMEMEBR:
			ArrayList<PeopleAndCaloryDto> list = dao.selectAll();
			request.put("list", list);
			ACVArr[PRINTMEMEBR].play();
			break;
		case PRINTPEOPLE:
			ACVArr[PRINTPEOPLE].play();
			break;
		case BACK2:
			ACVArr[BACK2].play();
			break;
		case END2:
			ACVArr[END2].play();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}

	}
}
