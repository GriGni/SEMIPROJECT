package Calory_Program_Controller;

import java.util.ArrayList;

import Calory_Program_Model.PeopleAndCaloryDto;

public class MemberSearchController extends AdminController {

	public static void AMSPath() {
		PeopleAndCaloryDto dto;
		int num = (int) request.get("num");
		switch (num - 1) {
		case SEARCHBYNAME:
			MSVArr[SEARCHBYNAME].play();
			dto = (PeopleAndCaloryDto) request.get("dto");
			ArrayList<PeopleAndCaloryDto> searchList = dao.select(dto);
			request.put("list", searchList);
			ACVArr[PRINTMEMEBR].play();
			System.out.println();
			break;
		case SEARCHBYPHONE:
			MSVArr[SEARCHBYPHONE].play();
			dto = (PeopleAndCaloryDto) request.get("dto");
			ArrayList<PeopleAndCaloryDto> phoneList = dao.select2(dto);
			request.put("list", phoneList);
			ACVArr[PRINTMEMEBR].play();
			System.out.println();
			break;
		case BACK3:
			MSVArr[BACK3].play();
			break;
		case END3:
			MSVArr[END3].play();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}

	}
}
