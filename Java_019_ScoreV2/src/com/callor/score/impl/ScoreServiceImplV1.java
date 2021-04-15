package com.callor.score.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.ScoreService;
import com.callor.score.StudentService;
import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.wndeld777.stnadard.InputService;
import com.wndeld777.stnadard.impl.InputServiceimplV1;

public class ScoreServiceImplV1 implements ScoreService {
	protected List<StudentVO> studentList;
	protected InputService inService;
	protected StudentService stService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;

	public ScoreServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		inService = new InputServiceimplV1();
		stService = new StudentServiceImplV1A();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);

	}

	@Override
	public void insertScore() {
		String strNum = null;
		
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}
			strNum = String.format("%05d", intNum);

			ScoreVO scoreVO = this.numCheck(strNum);
			if (scoreVO != null) {
				continue;
			}

			StudentVO stVO = stService.getStudent(strNum);
			if (stVO == null) {
				System.out.println("학적부에 없는 학생입니다!!");
				System.out.println("학번을 다시 입력해 주세요");
				continue;
			}

			System.out.println("=".repeat(30));
			System.out.printf("학번 : %s\n", stVO.getNum());
			System.out.printf("이름 : %s\n", stVO.getName());
			System.out.printf("학과 : %s\n", stVO.getDept());
			System.out.printf("학년 : %s\n", stVO.getGrade());
			System.out.printf("주소 : %s\n", stVO.getAddress());
			System.out.println("=".repeat(30));
			System.out.println("학생정보가 맞습니까 ?");
			System.out.println("맞으면 :Enter, 틀리면 : NO");
			System.out.print(">> ");
			String yesNo = scan.nextLine();
			if (yesNo.equals("NO")) {
				continue;
				
				
			}
			break;

		} // 학번입력 끝

		Integer intKor = null;
		intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = null;
		intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = null;
		intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}

		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);
	} // end insertScore()

	protected ScoreVO numCheck(String num) {
		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

		System.out.println("=".repeat(80));
		System.out.print("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(80));
		for (int i = 0; i < studentList.size(); i++) {
			StudentVO stVO = studentList.get(i);
			System.out.printf("%s\t%s\t%s\t%s\t",
					stVO.getNum(),stVO.getName(),stVO.getDept(),stVO.getGrade());
		}
		for(int index = 0 ; index < scoreList.size(); index++) {
			ScoreVO srVO = scoreList.get(index);
			System.out.printf("%s\t%s\t%s\t%s\t%s\n",srVO.getKor(),srVO.getEng(),srVO.getMath(),srVO.getTotal(),srVO.getAvg());
		}
	}

}
