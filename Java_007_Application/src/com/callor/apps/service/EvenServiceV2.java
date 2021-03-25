package com.callor.apps.service;

import java.util.Random;
/*
 * 자바 프로그래밍에서 상속
 * V2 클래스에서는 V1클래스를 상속했다
 * 
 * V1에 작성한(선언한) 변수, method 코드를 그대로 이어 받아서 사용하겠다
 * 
 * V1에 작성된 method 들의 코드를 그대로 사용하면서 
 * 		일부 method의 코드를 변경, 확장, 기능개선을하여 내 프로젝트에 적용하겠다
 */
public class EvenServiceV2 extends EvenServiceV1{


	public EvenServiceV2() {
		intNum = new int[100];
	}

	public void printNums() {
		int nCount = 0;
		int intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				System.out.printf("%4d", intNum[i]);
				intSum += intNum[i];
				nCount++;
				if(nCount % 5 == 0) {
				}
			}
			System.out.println();
			System.out.println("==========================");
			System.out.println("짝수들의 합 : " + intSum);
		}
	
	}

}