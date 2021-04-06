package com.callor.method;

import com.callor.method.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.inputValue();
		Integer retNum = ssV1.inputValue();
		System.out.println(" 점수 : " + retNum);
	}
}
