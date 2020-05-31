package Calory_Program_Administrator_MemberSearch_View;

import Calory_Program_Administrator_View.AMemberSearch;

public abstract class MemberSearchView extends AMemberSearch {
	protected abstract void display();
	protected abstract void showTitle();
	
	public void play() {
		showTitle();
		display();
	}
}
