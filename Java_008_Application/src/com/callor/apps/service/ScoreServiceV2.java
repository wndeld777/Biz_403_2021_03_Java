package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int intSum;
	float floatAvg;
	String strName = "홍길동:이몽룡:성춘향:임꺽정:장보고";
	String[] strNames = strName.split(":");
	Scanner scan;

	public ScoreServiceV2() {
		Scanner scan = new Scanner(System.in);
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
	}

	public void makeScores() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("국어점수\n");
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = scan.nextInt();
		}
		System.out.printf("영어점수\n");
		for (int i = 0; i < intKor.length; i++) {

			intEng[i] = scan.nextInt();
		}
		System.out.printf("수학점수\n");
		for (int i = 0; i < intKor.length; i++) {
			intMath[i] = scan.nextInt();
		}
	}

	public void makeSum() {

		for (int i = 0; i < intKor.length; i++) {
			intSum = intKor[i] + intEng[i] + intMath[i];
			floatAvg = (float) intSum /3;
		}
	}

	public void printScores() {
		System.out.println(LinesService.dLines(50));
		System.out.printf("인원\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println(LinesService.dLines(50));
		for (int i = 0; i < intKor.length; i++) {

			System.out.printf("%3s\t", strNames[i]);
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intSum);
			System.out.printf("%3.2f\n", floatAvg);

		}
		System.out.println(LinesService.dLines(50));
	}

}
