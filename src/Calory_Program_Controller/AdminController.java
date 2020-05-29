package Calory_Program_Controller;

import Calory_Program_Resource.Resource;

public class AdminController implements Resource {

	public static void AdminPath() {
		int num = (int) request.get("num");
		switch (num-1) {
		case CONFIRM:
			AvArr[CONFIRM].play();
			break;
		case MEMBERSEARCH:
			AvArr[MEMBERSEARCH].play();
			break;
		case SENDINGMESSAGE:
			AvArr[SENDINGMESSAGE].play();
			break;
		case BACK:
			AvArr[BACK].play();
			break;
		case END1:
			AvArr[END1].play();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		AdminPath();
	}
}
