package Calory_Program_Controller;

public class AdminController extends CommonController {

	public static void AdminPath() {

		CVArr[ADMINISTRATOR].play();
		int num = (int) request.get("num");
		switch (num-1) {
		case CONFIRM:
			AvArr[CONFIRM].play();
			AConfirmController.AConPath();
			break;
		case MEMBERSEARCH:
			AvArr[MEMBERSEARCH].play();
			MemberSearchController.AMSPath();
			break;
		case SENDINGMESSAGE:
			AvArr[SENDINGMESSAGE].play();
			SendingMessageCotroller.SMPath();
			break;
		case BACK1:
			AvArr[BACK1].play();
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
