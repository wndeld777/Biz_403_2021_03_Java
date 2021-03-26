package com.callor.apps;

import com.callor.apps.service.ScoreServiceV2;

public class App_3 {

	public static void main(String[] args) {
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2();
		
		ssV2.makeScores();
		ssV2.makeSum();
		ssV2.printScores();
	}
}
