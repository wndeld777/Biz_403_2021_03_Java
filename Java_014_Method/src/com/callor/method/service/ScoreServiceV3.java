package com.callor.method.service;

public class ScoreServiceV3 {

	protected InputServiceV2 inService;
	
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
	public void inputScore() {
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		int intSum = intKor + intEng + intMath;
		float floatAvg = (float)intSum / 3 ;
		System.out.println("=".repeat(50));
		System.out.println("국어 점수 : " + intKor);
		System.out.println("영어 점수 : " + intEng);
		System.out.println("수학 점수 : " + intMath);
		System.out.println("=".repeat(50));
		System.out.println(" 총점 : " + intSum);
		System.out.printf(" 평균 : %3.2f\n" , floatAvg);
		
	}
}
