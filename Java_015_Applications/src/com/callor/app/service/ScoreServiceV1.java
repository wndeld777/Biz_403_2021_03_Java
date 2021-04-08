package com.callor.app.service;

import com.wndeld777.stnadard.InputService;

public class ScoreServiceV1 {
	
	InputService inService;

	public void inputScore() {
		Integer intKor = inService.inputValue("국어",0,100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inService.inputValue("영어",0,100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inService.inputValue("수학",0,100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		Integer sum = intKor + intEng + intMath;
		float avg = sum / 3;
		System.out.println("=".repeat(50));
		System.out.println("국어점수 : " + intKor);
		System.out.println("영어점수 : " + intEng);
		System.out.println("수학점수 : " + intMath);
		System.out.println("-".repeat(50));
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("=".repeat(50));
	}

}
