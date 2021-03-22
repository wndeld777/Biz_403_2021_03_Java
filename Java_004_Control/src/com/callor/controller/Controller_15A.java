package com.callor.controller;

import java.util.Random;

public class Controller_15A {

	public static void main(String[] args) {
		
		Random rndKor = new Random();
		
		int num1 = rndKor.nextInt(100) + 1;
		int num2 = rndKor.nextInt(100) + 1;
		int num3 = rndKor.nextInt(100) + 1;
		int num4 = rndKor.nextInt(100) + 1;
		int num5 = rndKor.nextInt(100) + 1;
		int num6 = rndKor.nextInt(100) + 1;
		int num7 = rndKor.nextInt(100) + 1;
		int num8 = rndKor.nextInt(100) + 1;
		int num9 = rndKor.nextInt(100) + 1;
		int num10 = rndKor.nextInt(100) + 1;
		
		int intSum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		float floatAvg = intSum / 10;
		
		System.out.println("===========================");
		System.out.println("학생1 : " + num1);
		System.out.println("학생2 : " + num2);
		System.out.println("학생3 : " + num3);
		System.out.println("학생4 : " + num4);
		System.out.println("학생5 : " + num5);
		System.out.println("학생6 : " + num6);
		System.out.println("학생7 : " + num7);
		System.out.println("학생8 : " + num8);
		System.out.println("학생9 : " + num9);
		System.out.println("학생10 : " + num10);
		System.out.println("----------------------------");
		System.out.printf("총점 : %d, 평균 : %3.2f\n",intSum,floatAvg);
		System.out.println("============================");
	}
}
