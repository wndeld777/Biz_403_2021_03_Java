package com.callor.app.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.InputServiceV1;
import com.callor.app.service.ScoreService;

public class ScoreServiceimplV1 implements ScoreService {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputServiceV1 inService;

	public ScoreServiceimplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV1();
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("=".repeat(60));
			System.out.println("메뉴 선택");
			System.out.println("-".repeat(60));
			System.out.println("1. 성적 추가");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT : 종료");
			System.out.println("-".repeat(60));
			System.out.print(">> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				return;
			}
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("입력오류");
				continue;
			}

			if (intMenu == 1) {
				this.inputScore();
			} else if (intMenu == 2) {
				this.printScore();
			}
		}

	}

	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		Integer num = 0;
		while(true) {
			System.out.println(num++ + "번 학생 이름을 입력해주세요");
			System.out.print(">> ");
			String names = scan.nextLine();
			if(names.equals("QUIT")) {
				continue;
			}
			String nums = String.valueOf(num);
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum(nums);
			scoreVO.setName(names);
			scoreList.add(scoreVO);
			
			return null;
		}
		

	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		while (true) {
			this.inputName();

			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}

			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			scoreList.add(scoreVO);

		}

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("=".repeat(60));
		System.out.println("성적 리스트");
		System.out.println("=".repeat(60));
		System.out.printf("학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(60));
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scoreVO = scoreList.get(i);
			System.out.print(scoreVO.getNum() + "\t");
			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.println(scoreVO.getMath() + "\t");

		}
	}

}
