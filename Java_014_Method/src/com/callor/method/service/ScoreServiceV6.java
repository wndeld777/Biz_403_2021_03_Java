package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 데이터를 입력(키보드, Random, 파일, 인터넷)
 * 		데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 연산을 수행
 * 다시 List저장
 * 데이터를 읽어 List에서 추출하여 VO에 담고 
 * 출력
 */
public class ScoreServiceV6 {
	
	// 3x + a
	// final 키워드를 부착한 변수 = 상수
	// 한번 저장된 값을 변경할수 없는 특별한 변수
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	protected InputServiceV2 inService;
	protected List<ScoreVO> scoreList;
	protected String[] subject;

	public ScoreServiceV6() {
		inService = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();
		subject = new String[] { "국어", "영어", "수학" };
	}

	public void inputScore() {
		ScoreVO scoreVO = new ScoreVO();
		for (int j = 0; j < 5; j++) {
			Integer[] scores = new Integer[subject.length];
			for (int i = 0; i < subject.length; i++) {
				scores[i] = inService.inputValue(subject[i], 0, 100);
				if (scores[i] == null) {
					return;
				}
			}
			scoreVO = new ScoreVO();
			int sbIndex = 0;
			scoreVO.setKor(scores[this.국어]);
			scoreVO.setEng(scores[this.영어]);
			scoreVO.setMath(scores[수학]);
			scoreList.add(scoreVO);
		}

	}

	public void inputScore1() {

		for (int st = 0; st < 5; st++) {
			Integer intKor = inService.inputValue("국어",0,100);
			if(intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어",0,100);
			if(intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학",0,100);
			if(intMath == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			scoreList.add(scoreVO);
			
		}
	}

	public void printScore() {
		
		int nSize = scoreList.size();
		System.out.println("=".repeat(50));
		System.out.println("성적 리스트");
		System.out.println("=".repeat(50));
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(50));

		for (int index = 0; index < nSize ; index++) {
			ScoreVO scoreVO = scoreList.get(index);
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\n");
		}
		System.out.println("=".repeat(50));
	}

}
