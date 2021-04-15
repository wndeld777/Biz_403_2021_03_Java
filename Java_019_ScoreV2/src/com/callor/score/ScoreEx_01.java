package com.callor.score;

import com.callor.score.impl.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV1();
		sService.insertScore();
		sService.printScore();
	}
}
