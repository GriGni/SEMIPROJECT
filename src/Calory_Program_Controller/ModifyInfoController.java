package Calory_Program_Controller;

import java.util.ArrayList;

import Calory_Program_Model.PeopleAndCaloryDto;

public class ModifyInfoController extends AdminController {
	
	public static void MICPath() {
		PeopleAndCaloryDto dto;
		ArrayList<PeopleAndCaloryDto> list;
		int num = (int) request.get("num");
		switch (num - 1) {
		case MODIFYNAME:
			list = dao.selectAll();
			request.put("list", list);
			ACVArr[PRINTMEMEBR].play();
			System.out.println();
			PIVArr[MODIFYNAME].play();
			dto = (PeopleAndCaloryDto) request.get("dto");
			ArrayList<PeopleAndCaloryDto> searchList = dao.select(dto);
			request.put("list", searchList);
			ACVArr[PRINTMEMEBR].play();			
			PIVArr[MODIFYNAME].add();
			System.out.println();
			dto = (PeopleAndCaloryDto) request.get("dto");
			dao.update(dto);
			break;
		case MODIFYPHONE:
			list = dao.selectAll();
			request.put("list", list);
			ACVArr[PRINTMEMEBR].play();
			System.out.println();
			PIVArr[MODIFYPHONE].play();
			dto = (PeopleAndCaloryDto) request.get("dto");
			ArrayList<PeopleAndCaloryDto> phoneList = dao.select2(dto);
			request.put("list", phoneList);
			ACVArr[PRINTMEMEBR].play();
			System.out.println();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
	}
}
