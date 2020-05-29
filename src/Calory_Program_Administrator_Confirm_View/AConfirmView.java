package Calory_Program_Administrator_Confirm_View;

import Calory_Program_Administrator_View.AConfirm;
import Calory_Program_Resource.Resource;

public abstract class AConfirmView extends AConfirm implements Resource {
	
	protected abstract void display();
	protected abstract void showTitle();

	public void play() {
		showTitle();
		display();
	}
}
