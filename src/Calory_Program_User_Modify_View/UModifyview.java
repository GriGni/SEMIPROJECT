package Calory_Program_User_Modify_View;

import Calory_Program_User_View.UModify;

public abstract class UModifyview extends UModify {
	protected abstract void display();
	protected abstract void showTitle();
	
	public void play() {
		showTitle();
		display();
	}
}
