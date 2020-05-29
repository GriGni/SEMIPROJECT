package Calory_Program_Controller;

import Calory_Program_Resource.Resource;

public class CommonController implements Resource {

	public static void path() {
		CVArr[MENU].play();
		int num = (int) request.get("num");
		switch (num) {
		case ADMINISTRATOR:
			CVArr[ADMINISTRATOR].play();
			AdminController path = new AdminController();
			path.AdminPath();
			break;
		case USER:
			CVArr[USER].play();
			break;
		case END:
			CVArr[END].play();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
		path();
	}
}
