package Calory_Program_Common_View;
import java.io.IOException;
import java.util.Scanner;

import Calory_Program_Resource.Resource;
import Calory_Program_Util.MyUtil;

public abstract class CommonView implements Resource{
	protected static Scanner scan = MyUtil.scan;
	protected abstract void display();
	protected abstract void showTitle();
	
	public void play() {
		showTitle();
		display();
	}
	protected void getFuntion() {
		int num = getNo();
		request.put("num", num);		
		System.out.println();
	}
	
	protected void getString() {
		String letter = scan.next();
		System.out.println();
	}
	
	public static int getNo() {
		int num = 0;
		int ch = 0;

		try {
			while ((ch = System.in.read()) != '\n') {
				if ('0' <= ch && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}
	
}
