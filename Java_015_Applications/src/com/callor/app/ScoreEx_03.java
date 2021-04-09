package com.callor.app;

import com.callor.app.impl.ScoreSeriveImplV2;
import com.callor.app.service.ScoreService;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreService sService = new ScoreSeriveImplV2();
		sService.selectMenu();
	}
}
