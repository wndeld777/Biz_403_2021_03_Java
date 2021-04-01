package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		System.out.println("정수 2개를 뺄셈합니다");
		Integer intNum1 = 0;
		Integer intNum2 = 0;
		while (true) {
			System.out.print("정수1 >> ");
			String strNum1 = scan.nextLine();
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println("숫자로만 입력");
				continue;
			}

			System.out.print("정수2 >> ");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println("숫자로만 입력");
				continue;
			}

			if (intNum1 < intNum2) {
				System.out.println("두번째 입력한 정수는 처음 값보다 작아야 합니다");
			} else {
				break;
			}
		}
		
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);
		
		numList.add(numberVO);
		
	}
	public void printNum() {
		System.out.print("정수1 - 정수2 = ");
		for(int i = 0; i < numList.size(); i++) {
			NumberVO numberVO = numList.get(i);
			System.out.println((numberVO.getNum1() - numberVO.getNum2()));
		}
	}

}
