package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	public ScoreServiceV1() {
		intKor = new int[10];
		intEng = new int[10];
		intMath = new int[10];
	}
	public void makeScores() {
		Random rnd = new Random();
		for(int i = 0; i<10 ; i++) {
		intKor[i] = rnd.nextInt(100)+1;
		intEng[i] = rnd.nextInt(100)+1;
		intMath[i] = rnd.nextInt(100)+1;
		}
	}
	public void printScores() {
		int nCount = 0;
		System.out.println("===============================================");
		System.out.printf("번호\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-----------------------------------------------");
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%3d\t",++nCount);
			System.out.printf("%3d\t%3d\t%3d\t", intKor[i], intEng[i], intMath[i]);
			
		}
	}
	public void makeSum() {
		int intSum = 0;
		float floatAvg = 0;
		for(int i = 0; i < 10 ; i ++) {
			intSum = intKor[i] + intEng[i] + intMath[i];
			floatAvg = (float)intSum /3;
			System.out.printf("%3d\t%3.2f\n",intSum,floatAvg);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
