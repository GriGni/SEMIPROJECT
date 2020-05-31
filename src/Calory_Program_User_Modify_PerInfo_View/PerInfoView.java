package Calory_Program_User_Modify_PerInfo_View;

import Calory_Program_User_Modify_View.UMPersonalInformation;

public abstract class PerInfoView extends UMPersonalInformation {
	
	protected abstract void display();
	protected abstract void showTitle();
	protected abstract void addAct();
	public void play() {
		showTitle();
		display();
	}
	public void add() {
		addAct();
	}
}
