package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	InputServiceV2 inService;
	String[] subject;
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;

	public ScoreServiceV5() {
		inService = new InputServiceV2();
		subject = new String[] { "국어", "영어", "수학" };
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
	}

	public void inputValue() {

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < subject.length; i++) {
				Integer score = inService.inputValue(subject[i], 0, 100);
				if (score == null) {
					System.out.println("종료");
					return;
				} else {
					if( i == 0) {
						kors.add(score);
					}else if(i==1) {
						engs.add(score);
					}else if(i==2) {
						maths.add(score);
					}
				}
			}

		}

	}
	public void inputScore() {
		for(int st = 0 ; st < 5 ; st++) {
			Integer[] scores = new Integer[subject.length];
			for(int sb = 0 ;sb < subject.length; sb++) {
				scores[sb] = inService.inputValue(subject[sb], 0, 100);
			}
			// scores에는 한 학생의 국어, 영어, 수학 점수가 저장되어 있다
			kors.add(scores[0]);
			engs.add(scores[1]);
			maths.add(scores[2]);
		}
	}
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("성적 리스트");
		System.out.println("=".repeat(50));
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-".repeat(50));
		
		for(int index = 0 ; index < kors.size(); index++) {
			System.out.print(kors.get(index)+"\t");
			System.out.print(engs.get(index)+"\t");
			System.out.print(maths.get(index)+"\n");
		}
	System.out.println("=".repeat(50));
	}
	
	public void inputScore1() {
		for(int i = 0; i< 5 ; i++) {
			Integer score = inService.inputValue(subject[i],0,100);
			if(score == null) {
				return;
			}else if(subject[i].equals("국어")) {
				kors.add(score);
			}else if(subject[i].equals("영어")) {
				engs.add(score);
			}else if(subject[i].equals("수학")) {
				maths.add(score);
			}
		}
	}

	
}
