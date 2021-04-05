package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(title + "의 값을 입력하세요");
			System.out.println("끝내려면 QUIT를 입력하세요");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			Integer intNum = null;
			if (strNum.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("입력오류");
					continue;
				}
			}
			if (intNum < 0 ) {
				System.out.println("값은 0 이상");
				continue;
			}
			return intNum;
		}
	}
}
