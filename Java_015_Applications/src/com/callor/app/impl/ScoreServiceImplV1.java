package com.callor.app.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.InputServiceV1;
import com.callor.app.service.ScoreService;

/*
 * 1. 메뉴를 보여주고
 * 2. 성적입력 : 학생수의 제한이 없다.
 * 		가. 학번
 * 		나. 학생이름 : inputName()
 * 		다. 과목별 성적 : inputScore()
 * 
 * 		가. 학생성적입력 : inputScore() 시작
 * 			- 학번입력
 * 			- 이름입력
 * 			- 점수입력
 * 
 * 		나. 학생의 이름을 입력하는 inputName() method는 return type String 형이기 때문에
 * 			학생이름을 입력받고 입력받은 학생이름을 return 한다
 * 			이 return 학생이름을 inputScore() 에서 변수에 담아 처리를 할수 있다
 */

public class ScoreServiceImplV1 implements ScoreService {
	// 학생의 이름을 입력받을때 사용할 객체
	protected Scanner scan;
	// 저장소
	protected List<ScoreVO> scoreList;
	// 학번, 점수를 입력받을때 사용할 객체
	protected InputServiceV1 inService;
	
	public ScoreServiceImplV1() {
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
		while(true) {
			System.out.println("학번을 입력해주세요");
			System.out.print(">> ");
			String num = scan.nextLine();
			if(num.equals("QUIT")) {
				continue;
			}
			System.out.println("학생 이름을 입력해주세요");
			System.out.print(">> ");
			String names = scan.nextLine();
			if(names.equals("QUIT")) {
				continue;
			}
			
			
			return null;
		}
		

	}
	/*
	 * 현재 클래스 내부에서만 호출되는 method private으로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할수 있도록 하려면
	 * private = > protected로 변경 해주는게 좋다
	 */
	protected String inputNum() {
		
		// 학번입력처리 : 001,002 형식으로 입력받자
				// 정수 1 이상을 입력하면 정수값이 intNum에 담길것이고, QUIT를 입력했으면 null 값이 intNum에 담길것이다
				Integer intNum = inService.inputValue("학번",1);
				// intNum에 null 값이 담겨있으면 종료하고 다시 메뉴로 돌아간다
				if(intNum == null) {
					return null;
				}
				// 정수를 입력했으면 입력받은 정수값을 학번의 문자열 형식(001,002)으로 변환을 하자
				// String.format("%3d", 1) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 만들기
				//		"  1"
				// String.format("%03d", 1 ) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하고 왼쪽의 빈칸에 0을 채워라
				//		"001"
				String strNum = String.format("2021%03d", intNum); // 2021001
		return strNum;
	}
	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가
		String strNum = this.inputNum();
		if(strNum == null) {
			return;
		}
		
		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if(strName == null) {
			return;
		}
		
		

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
			/*
			 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후 한 과목이라도 QUIT하면 종료되는 코드이다
			 * 만약 국어 과목에서 QUIT를 하여도 영어, 수학 점수를 입력받는 Prompt가 나타나고 3과목을 모두 통과한후 입력종료가 된다
			 * 
			 * if(intKor == null || intEng == null || intMath == null){
			 * 		return;
			 * }
			 */
			
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setName(strName);
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			
			// vo에 담긴 데이터를 List 저장소에 추가
			scoreList.add(scoreVO);
			
		}

	

	private String inputName(String strNum) {
		// TODO 학번을 보여주고 이름을 입력받는 method
		
		while(true) {
			System.out.println(strNum + " 학생의 이름 입력(QUIT : 입력취소)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				return null;
			}else if(strName.equals("")) { // 입력없이 Enter만
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}
			return strName;
		}// end while
	}

	@Override
	public void printScore() {
		// TODO 리스트 출력하기
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
			System.out.print(scoreVO.getMath() + "\t");
			System.out.print(scoreVO.getTotal() + "\t");
			System.out.print(scoreVO.getAvg() + "\n");

		}
		System.out.println("=".repeat(60));
	}

}
