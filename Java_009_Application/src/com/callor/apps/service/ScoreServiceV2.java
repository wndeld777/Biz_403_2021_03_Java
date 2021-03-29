package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	
	/*
	 * this(현재객체, 현재클래스)
	 *  같은 클래스내에 있는 코드
	 */
	public void makeScores() {
		System.out.println("국어점수 입력");
		/*
		 * method return type 이 void가 아닌경우에는
		 * method 가 return한 값을 변수에 저장(받기)할수 있다
		 * 이때 변수는 method의 return type과 같은 type(형) 이어야 한다
		 */
		Integer intKor = this.inputScore();
		
		System.out.println("영어점수 입력");
		Integer intEng = this.inputScore();
		
		System.out.println("수학점수 입력");
		Integer intMath = this.inputScore();
		
		System.out.println("===================");
		System.out.printf("국어점수 : %d\n",intKor);
		System.out.printf("영어점수 : %d\n",intEng);
		System.out.printf("수학점수 : %d\n",intMath);
		System.out.println("===================");
	}
	private Integer inputScore() {
		
		Integer score = 0;
		while(true) {
			System.out.println("점수를 입력하세요( 0 ~ 100 )");
			score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100 까지만 입력해야 합니다");
				continue; // 범위를 벗어나면 while문으로 돌아간다
			}
			break; // 범위에 들어오면 끝낸다
		}
		// score 변수에 저장된 값을 호출한 곳으로
		// 되돌려 주어라
		return score;
	}
	
	
	
	
	
	
	
}
