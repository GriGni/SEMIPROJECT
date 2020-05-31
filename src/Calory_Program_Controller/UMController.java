package Calory_Program_Controller;


public class UMController extends UserContoroller {
	
	public static void UMPath() {
		
		int num = (int) request.get("num");
		switch (num - 1) {
		case PERSONALINFO:
			UMVArr[PERSONALINFO].play();
			ModifyInfoController.MICPath();
			break;
		case CALORY:
			UMVArr[CALORY].play();
			break;
		case BACK6:
			UMVArr[BACK6].play();
			break;
		case END6:
			UMVArr[END6].play();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
	}
}
