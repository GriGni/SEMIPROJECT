package Calory_Program_Util;

import java.io.IOException;
import java.util.Scanner;

public class MyUtil {
	public static final Scanner scan = new Scanner(System.in);
	
	
	
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
