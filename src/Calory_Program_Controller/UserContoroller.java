package Calory_Program_Controller;

import Calory_Program_Model.PeopleAndCaloryDto;

public class UserContoroller extends CommonController {
		
	public static void UserPath() {
		CVArr[USER].play();
		int num = (int) request.get("num");
		switch (num - 1) {
		case INPUT:
			UMArr[INPUT].play();
			dao.insert((PeopleAndCaloryDto)request.get("dto"));
			break;
		case CONFIRMMYID:
			UMArr[CONFIRMMYID].play();
			break;
		case MAILBOX:
			UMArr[MAILBOX].play();
			break;
		case MODIFY:
			UMArr[MODIFY].play();
			UMController.UMPath();
			break;
		case DELETEMYID:
			UMArr[DELETEMYID].play();
			break;
		case BACK5:
			UMArr[BACK5].play();
			break;
		case END5:
			UMArr[END5].play();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		
	}
}
