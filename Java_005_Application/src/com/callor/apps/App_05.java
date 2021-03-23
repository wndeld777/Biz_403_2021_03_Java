package com.callor.apps;

import java.util.Random;

/*
 * 1. 5명 학생의 성적을 계산합니다
 * 2. 과목은 국어(intKor), 영어(intEng), 수학(intMath)이며
 * 3. 과목의 점수는 Random 클래스를 사용하여 50 ~ 100까지 생성하여 사용합니다
 * 4. 학생의 성적 리스트를 출력합니다
 */
public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intKor[] = new int[5];
		int intEng[] = new int[5];
		int intMath[] = new int[5];

		for (int i = 0; i < 5; i++) {
			int korScores = rnd.nextInt(51) + 50;
			int engScores = rnd.nextInt(51) + 50;
			int mathScores = rnd.nextInt(51) + 50;
			intKor[i] = korScores;
			intEng[i] = engScores;
			intMath[i] = mathScores;
		}
		System.out.println("==============================================");
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("----------------------------------------------");

		int intSum = 0;
		float floatAvg = 0;
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int scores = 0;
		float scoresAvg = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			
			intSum = intKor[i] + intEng[i] + intMath[i];
			floatAvg = (float) intSum / 3;
			System.out.print(intSum + "\t");
			System.out.printf("%3.2f\n", floatAvg);
			
			korSum += intKor[i];
			engSum += intEng[i];
			mathSum += intMath[i];
			scores += intSum;
			scoresAvg += floatAvg /5;
			
		}
		
		System.out.println("===============================================");
		for(int i = 0 ; i<1 ; i++)
			
			System.out.printf("총점\t%d\t%d\t%d\t%d\t%3.2f",korSum,engSum,mathSum,scores,scoresAvg);
	}
}
