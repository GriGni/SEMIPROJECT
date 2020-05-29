package Calory_Program_Resource;

import java.util.Hashtable;

import Calory_Program_Administrator_Confirm_View.AConfirmView;
import Calory_Program_Administrator_Confirm_View.PBack;
import Calory_Program_Administrator_Confirm_View.PEnd;
import Calory_Program_Administrator_Confirm_View.PrintPeopleAteALot;
import Calory_Program_Administrator_Confirm_View.Print_Member_list;
import Calory_Program_Administrator_View.ABack;
import Calory_Program_Administrator_View.AConfirm;
import Calory_Program_Administrator_View.AEnd;
import Calory_Program_Administrator_View.AMemberSearch;
import Calory_Program_Administrator_View.ASendingMessage;
import Calory_Program_Administrator_View.AdminView;
import Calory_Program_Common_View.CAdmin;
import Calory_Program_Common_View.CEnd;
import Calory_Program_Common_View.CMenu;
import Calory_Program_Common_View.CUser;
import Calory_Program_Common_View.CommonView;

public interface Resource {
	public static final int i = 0;
	public static final int MENU = 0, ADMINISTRATOR = 1, USER = 2, END = 3;
	public static final int CONFIRM = i, MEMBERSEARCH = i+1, SENDINGMESSAGE = i+2, BACK = i+3, END1 = i+4; 
	public static final int PRINTMEMEBR = i, PRINTPEOPLE=i+1, BACK1 = i+2, END2 = i+3;
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	CommonView[] CVArr = {new CMenu(), new CAdmin(), new CUser(), new CEnd()};  
	AdminView[] AvArr = {new AConfirm(), new AMemberSearch(), new ASendingMessage(), new ABack(), new AEnd()};
	AConfirmView[] ACVArr = {new Print_Member_list(), new PrintPeopleAteALot(), new PBack(), new PEnd()};
}
