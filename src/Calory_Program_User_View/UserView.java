package Calory_Program_User_View;

import Calory_Program_Common_View.CUser;

public abstract class UserView extends CUser {
	
	protected abstract void display();
	protected abstract void showTitle();
	
	public void play() {
		showTitle();
		display();
	}
}
