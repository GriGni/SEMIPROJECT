package Calory_Program_Controller;

import Calory_Program_Resource.Resource;

public class AConfirmController implements Resource {
	
	public static void AConPath() {
		
		int num = (int) request.get("num");
		switch(num) {
		case PRINTMEMEBR : ACVArr[PRINTMEMEBR].play(); break;
		}
	}
}
