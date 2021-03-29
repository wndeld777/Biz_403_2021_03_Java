package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// 클래스 영역에 Scanner 클래스를 사용하여
	// scan 객체를 선언
	Scanner scan;
	// 학생수만큼 과목점수를 저장할 배열 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	float floatAvg;
	String strName = "홍길동:이몽룡:성춘향:임꺽정:장보고";
	String[] strNames = strName.split(":");

	public ScoreServiceV1() {
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
			if(intKor[i]>100) {
				System.out.println("점수를 다시 적어주세요");
				i--;
		}
		}
		System.out.printf("영어점수\n");
		for (int i = 0; i < intKor.length; i++) {
			intEng[i] = scan.nextInt();
			if(intKor[i]>100) {
				System.out.println("점수를 다시 적어주세요");
				i--;
		}
		}
		System.out.printf("수학점수\n");
		for (int i = 0; i < intKor.length; i++) {
			intMath[i] = scan.nextInt();
			if(intKor[i]>100) {
				System.out.println("점수를 다시 적어주세요");
				i--;
		}
		}
		
	}

	public void makeSum() {

		for (int i = 0; i < intKor.length; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			
			floatAvg = (float) intSum[i] /3;
		}
	}

	public void printScores() {
		System.out.println("==================================================");
		System.out.printf("인원\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("==================================================");
		for (int i = 0; i < intKor.length; i++) {

			System.out.printf("%3s\t", strNames[i]);
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intSum[i]);
			System.out.printf("%3.2f\n", floatAvg);

		}
		System.out.println("==================================================");
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

