package com.callor.method.service;

public class ScoreServiceV1 {

	InputServiceV1 isV1;
	public Integer inputValue() {
		InputServiceV1 isV1 = new InputServiceV1();
		isV1.inputValue("국어", 0, 100);
		Integer retNum = this.inputValue();
		if(retNum == null) {
			System.out.println("종료");
			return null;
		}else {
			System.out.println(" 점수 : " + retNum);
		}
		
		
		return null;
		
		
		
		
		
	}
}
