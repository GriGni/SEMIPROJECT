package Calory_Program_Administrator_SendingMessage_View;

import Calory_Program_Administrator_View.ASendingMessage;

public abstract class SendingMessageView extends ASendingMessage {
	protected abstract void display();
	protected abstract void showTitle();
	
	public void play() {
		showTitle();
		display();
	}
}
