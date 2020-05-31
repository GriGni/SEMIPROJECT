package Calory_Program_Resource;

import java.util.ArrayList;
import java.util.Hashtable;

import Calory_Program_Administrator_Confirm_View.AConfirmView;
import Calory_Program_Administrator_Confirm_View.PBack;
import Calory_Program_Administrator_Confirm_View.PEnd;
import Calory_Program_Administrator_Confirm_View.PrintPeopleAteALot;
import Calory_Program_Administrator_Confirm_View.Print_Member_list;
import Calory_Program_Administrator_MemberSearch_View.MSBack;
import Calory_Program_Administrator_MemberSearch_View.MSEnd;
import Calory_Program_Administrator_MemberSearch_View.MemberSearchView;
import Calory_Program_Administrator_MemberSearch_View.SearchByName;
import Calory_Program_Administrator_MemberSearch_View.SearchByPhone;
import Calory_Program_Administrator_SendingMessage_View.SMBack;
import Calory_Program_Administrator_SendingMessage_View.SMEnd;
import Calory_Program_Administrator_SendingMessage_View.SendingMessage;
import Calory_Program_Administrator_SendingMessage_View.SendingMessageView;
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
import Calory_Program_Model.PeopleAndCaloryDao;
import Calory_Program_Model.PeopleAndCaloryDto;
import Calory_Program_User_Modify_PerInfo_View.MSearchByName;
import Calory_Program_User_Modify_PerInfo_View.MSearchByPhone;
import Calory_Program_User_Modify_PerInfo_View.PerInfoView;
import Calory_Program_User_Modify_View.UMBack;
import Calory_Program_User_Modify_View.UMCalory;
import Calory_Program_User_Modify_View.UMPersonalInformation;
import Calory_Program_User_Modify_View.UMend;
import Calory_Program_User_Modify_View.UModifyview;
import Calory_Program_User_View.UBack;
import Calory_Program_User_View.UConfirmMyInformation;
import Calory_Program_User_View.UDeleteMyAccount;
import Calory_Program_User_View.UEnd;
import Calory_Program_User_View.UInput;
import Calory_Program_User_View.UMailBox;
import Calory_Program_User_View.UModify;
import Calory_Program_User_View.UserView;

public interface Resource {
	public static final int i = 0;
	public static final int MENU = 0, ADMINISTRATOR = 1, USER = 2, END = 3;
	public static final int CONFIRM = i, MEMBERSEARCH = i+1, SENDINGMESSAGE = i+2, BACK1 = i+3, END1 = i+4; 
	public static final int PRINTMEMEBR = i, PRINTPEOPLE=i+1, BACK2 = i+2, END2 = i+3;
	public static final int SEARCHBYNAME =i, SEARCHBYPHONE = i+1, BACK3 = i+2, END3 = i+3;
	public static final int SENDINGMESSAGE1 =i, BACK4 = i+1, END4 = i+2;
	public static final int INPUT =i, CONFIRMMYID = i+1, MAILBOX = i+2, MODIFY = i+3, DELETEMYID = i+4, BACK5 = i+5, END5 = i+6;
	public static final int PERSONALINFO =i, CALORY = i+1, BACK6 = i+2, END6 = i+3;
	public static final int MODIFYNAME =i, MODIFYPHONE = i+1;
	
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	CommonView[] CVArr = {new CMenu(), new CAdmin(), new CUser(), new CEnd()};  
	AdminView[] AvArr = {new AConfirm(), new AMemberSearch(), new ASendingMessage(), new ABack(), new AEnd()};
	AConfirmView[] ACVArr = {new Print_Member_list(), new PrintPeopleAteALot(), new PBack(), new PEnd()};
	MemberSearchView[] MSVArr = {new SearchByName(), new SearchByPhone(), new MSBack(), new MSEnd()};
	SendingMessageView[] SMVArr = {new SendingMessage(), new SMBack(), new SMEnd()};
	UserView[] UMArr = {new UInput(), new UConfirmMyInformation(), new UMailBox(), new UModify(), new UDeleteMyAccount(), new UBack(), new UEnd()};
	UModifyview[]UMVArr = {new UMPersonalInformation(), new UMCalory(), new UMBack(), new UMend()};
	PerInfoView[] PIVArr = {new MSearchByName(), new MSearchByPhone()};
	
	ArrayList<PeopleAndCaloryDto> dtoList = new ArrayList<PeopleAndCaloryDto>();
	PeopleAndCaloryDao dao = new PeopleAndCaloryDao(dtoList);
	
}
