package com.callor.method.service;

public class NumberServiceV7 {

	protected InputService inService;
	String[] str;

	public NumberServiceV7() {
		inService = new InputService();
		str[0] = "국어";
		str[1] = "영어";
		str[2] = "수학";
		str[3] = "과학";
		str[4] = "국사";
	}

	public Integer inputScore() {
		
		while (true) {
			Integer retNum = null;
			for (int i = 0; i < str.length; i++) {
				str[i] = inService.inputValue("과목 점수");
				if (retNum == null) {
					return null;
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("점수는 0 ~ 100까지 입력");
					continue;
				}
				break;
			}
		}

	}
}
