package Calory_Program_Administrator_View;

import Calory_Program_Common_View.CAdmin;
import Calory_Program_Resource.Resource;

public abstract class AdminView extends CAdmin implements Resource {
	protected abstract void display();
	protected abstract void showTitle();
	
	public void play() {
		showTitle();
		display();
	}
}
