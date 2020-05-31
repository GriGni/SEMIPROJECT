package Calory_Program_Controller;

public class SendingMessageCotroller extends AdminController{
	public static void SMPath() {
		
		int num = (int) request.get("num");
		switch(num-1) {
		case SENDINGMESSAGE1 : SMVArr[SENDINGMESSAGE1].play(); break;
		case BACK4 : SMVArr[BACK4].play(); break;
		case END4 : SMVArr[END4].play(); break;
		default: System.out.println("다시 입력해주세요.");
		}
		
	}
}
