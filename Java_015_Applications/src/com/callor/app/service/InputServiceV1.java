package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;
	
	public InputServiceV1() {
		scan = new Scanner(System.in);
	}
	public Integer inputValue(String title) {
		while(true) {
			System.out.println(title +" 값을 입력하세요(종료 : QUIT)");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			if(strInput.equals("QUIT")) {
				return null;
			}
			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("입력 오류");
				System.out.println("정수, QUIT 만 입력해주세요");
				continue;
			}
			return intNum;
		}
		
	}
	
	public Integer inputValue(String title, int start) {
		String masgTitle = String.format("%s(%d 이상의)",title, start);
		while(true) {
			Integer intNum = this.inputValue(masgTitle);
			if(intNum != null) {
				if(intNum < start) {
					System.out.printf("입력값은 %d 이상으로 입력해주세요\n",start);
					continue;
				}
			}
			return intNum;
		}
		
	}
	
	public Integer inputValue(String title, int start, int end) {
		String msgTitle = String.format("%s ( %d 이상 %d 이하 )",title,start,end);
		while(true) {
			Integer intNum = this.inputValue(msgTitle);
			if(intNum != null) {
				if(intNum < start || intNum > end) {
					System.out.printf("입력값은 %d 이상 %d 이하로 입력해주세요",start,end);
					continue;
				}
			}
			return intNum;
		}
		
	}
}

