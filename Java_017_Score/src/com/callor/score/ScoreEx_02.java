package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV2;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		ScoreService ssV2 = new ScoreServiceImplV2();
		ssV2.selectMenu();
	}
}
