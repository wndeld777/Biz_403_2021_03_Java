package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		Random rndKor = new Random();
		Random rndEng = new Random();
		Random rndMath = new Random();
		
		int num1 = rndKor.nextInt(100) + 1;
		int num2 = rndEng.nextInt(100) + 1;
		int num3 = rndMath.nextInt(100) + 1;
	
		int intSum = num1 + num2 + num3 ;
		float floatAvg = intSum / 3 ;
		
		System.out.println("========================");
		System.out.println("국어 : " + num1);
		System.out.println("영어 : " + num2);
		System.out.println("수학 : " + num3);
		System.out.println("------------------------");
		System.out.printf("총점 : %d, 평균 : %3.2f\n",intSum,floatAvg);
	}
}
