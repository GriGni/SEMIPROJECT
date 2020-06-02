package Calory_Program_Controller;

import java.util.ArrayList;

import Calory_Program_Model.PeopleAndCaloryDto;

public class AConfirmController extends AdminController {

	public static void AConPath() {
		ArrayList<PeopleAndCaloryDto> list;
		int num = (int) request.get("num");
		switch (num - 1) {
		case PRINTMEMEBR:
			list = dao.selectAll();
			request.put("list", list);
			ACVArr[PRINTMEMEBR].play();
			break;
		case PRINTPEOPLE:
			list = dao.selectFullPeople("num");// num 아님  다시 구현
			request.put("list", list);
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
