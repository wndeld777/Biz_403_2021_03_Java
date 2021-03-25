package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_08 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.makeScores();
		ssV1.printScores();
		ssV1.makeSum();
	}
}
