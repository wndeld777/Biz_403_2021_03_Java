package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("정수 0 ~ 100까지 중 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
					if (intNum < 0 || intNum > 100) {
						System.out.println("숫자는 0 ~ 100 까지");
						// 다시 입력하는 곳으로 가라!!
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("입력오류");
					// 다시 입력하는 곳으로 가라!!
					continue;
				}
			}

		}
	}
}