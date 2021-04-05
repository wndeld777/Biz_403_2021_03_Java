package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("정수 0 ~ 100까지 중 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			Integer intNum = null;
			if (strNum.equals("QUIT")) {
				return null;
			} else {
				
				// 1. 입력된값이 QUIT가 아니면 일단 정수로 바꿔보자
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("입력오류");
					// 다시 입력하는 곳으로 가라!!
					continue;
				}
			}
			
			// 2. 정수이면 0 ~ 100까지 인지 알아보자
			if (intNum < 0 || intNum > 100) {
				System.out.println("숫자는 0 ~ 100 까지");
				// 다시 입력하는 곳으로 가라!!
				continue;
			}
			return intNum;
		}
	}
}